package org.xieweiba.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.xieweiba.model.Order;
import org.xieweiba.service.StoreService;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@Component
public class InListener {

    private final StoreService storeService;
    @Autowired
    public InListener (StoreService storeService){
        this.storeService=storeService;
    }

    @JmsListener(destination = "in.queue")
    @SendTo("out.queue")
    public String receiveOrder(Order order){//这里的参数类型是否代表接受队列中的对象类型
        System.out.println("Inlistener_OrderID:"+order.getId());
        storeService.registerOrder(order);
        return order.getId();//发送消息到out.queue
    }

}
