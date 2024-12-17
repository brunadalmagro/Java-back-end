package br.com.ebac.ebac_filas.produtor;

import br.com.ebac.ebac_filas.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagens")
public class Produtor {
    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void enviarMensagem(@RequestBody String mensagem){
        System.out.println("====================== Eviando mensagem " + mensagem);

        serviceRabbitMQ.enviaMensagem(mensagem);
    }

}
