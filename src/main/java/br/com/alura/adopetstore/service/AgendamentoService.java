package br.com.alura.adopetstore.service;

import br.com.alura.adopetstore.email.EmailDeRelatorioGerado;
import br.com.alura.adopetstore.email.EnviadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class AgendamentoService {

    @Autowired
    private RelatorioService relatorioService;

    @Autowired
    private EmailDeRelatorioGerado enviador;

    @Scheduled(cron = "10 12 1 * * *")
    public void envioDeEmailsAgendado(){
        var estoqueZerado = relatorioService.infoEstoque();
        var faturamentoObtido = relatorioService.faturamentoObtido();

        CompletableFuture.allOf(estoqueZerado,faturamentoObtido).join();

        try {
            enviador.enviar(estoqueZerado.get(), faturamentoObtido.get());
        } catch (InterruptedException  | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread do email: " + Thread.currentThread().getName());
    }

}
