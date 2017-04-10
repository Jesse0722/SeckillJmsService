package org.xieweiba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;
import org.xieweiba.model.Order;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@SpringBootApplication
public class JmsJavaConfigApplication implements CommandLineRunner {
    public static void main(String[] args){
        SpringApplication.run(JmsJavaConfigApplication.class,args);
    }

    @Autowired
    JmsTemplate jmsTemplate;
    @Override
    public void run(String... strings) throws Exception {
        jmsTemplate.convertAndSend("simple.queue",new Order("123"));
        jmsTemplate.convertAndSend("in.queue",new Order("1111"));
    }
}
