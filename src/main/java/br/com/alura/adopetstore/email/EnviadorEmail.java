package br.com.alura.adopetstore.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EnviadorEmail {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail(String assunto, String destinatario, String textoEmail) {
        try {
            System.out.println("Enviando email!");
            System.out.println(textoEmail);

            //Simulando demora de 3 segundos para enviar email
            Thread.sleep(3000);

        } catch (Exception e) {

            throw new RuntimeException("Erro ao enviar email!", e);
        }
    }

}
