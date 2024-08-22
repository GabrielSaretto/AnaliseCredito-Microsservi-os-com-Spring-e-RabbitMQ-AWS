package com.pieropan.analisecredito.listener;

import com.pieropan.analisecredito.domain.Proposta;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropostaEmAnaliseListener {

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente")
    public void propostaEmAnalise(Proposta proposta){

    }
}
