package org.xieweiba.service;

import org.springframework.stereotype.Service;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@Service
public class RegisterServiceImpl implements RegisterService{
    private String lastReceivedOrder;

    @Override
    public void registerOrderId(String orderId) {
        this.lastReceivedOrder = orderId;
    }

    @Override
    public String getLastReceivedOrderId() {
        return lastReceivedOrder;
    }
}
