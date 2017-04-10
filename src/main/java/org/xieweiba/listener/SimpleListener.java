package org.xieweiba.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.xieweiba.model.Order;
import org.xieweiba.service.StoreService;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@Component
public class SimpleListener {


    private final StoreService storeService;

    @Autowired
    public SimpleListener(StoreService storeService){
        this.storeService = storeService;
    }
    /**
     * 接受simple.queue消息
     * @param order
     */
    @JmsListener(destination = "simple.queue")
    public void receiveOrder(Order order){//这里的参数类型是否代表接受队列中的对象类型

        if(order==null){
            System.out.println("OrderID:null");
        }
        System.out.println("OrderID:"+order.getId());
        storeService.registerOrder(order);
    }
}
