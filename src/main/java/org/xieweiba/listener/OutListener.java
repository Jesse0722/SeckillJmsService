package org.xieweiba.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.xieweiba.service.RegisterService;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
public class OutListener {

    private final RegisterService registerService;

    @Autowired
    public OutListener(RegisterService registerService){
        this.registerService = registerService;
    }

    @JmsListener(destination = "out.queue")
    public void getLastOrderId(String orderId){
        registerService.registerOrderId(orderId);
    }
}
