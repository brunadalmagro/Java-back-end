package br.com.ebac.ebac_filas.service;

import br.com.ebac.ebac_filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServiceRabbitMQ {

    private final RabbitTemplate rabbitTemplate;

    public ServiceRabbitMQ(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviaMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(
                ConfiguracaoRabbitMQ.NOME_EXCHANGE,
                "ebac.rota.mensagem",
                mensagem
        );
    }
}
