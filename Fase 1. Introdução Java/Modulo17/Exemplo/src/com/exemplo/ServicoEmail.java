package com.exemplo;

@Component
public class ServicoEmail {
    public void enviarEmail(String destinatario, String mensagem) {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}
