package org.xieweiba.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.xieweiba.JmsJavaConfigApplication;
import org.xieweiba.model.Order;

import static org.junit.Assert.*;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ClientServiceTest {
    @Autowired
    JmsTemplate template;

    @Test
    public void addOrder() throws Exception {
        ClientServiceImpl clientService = new ClientServiceImpl(template);
        clientService.addOrder(new Order("123124"));
    }

    @Test
    public void registerOrder() throws Exception {
        ClientServiceImpl clientService = new ClientServiceImpl(template);
        clientService.registerOrder(new Order("123123"));
    }

}