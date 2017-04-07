package org.xieweiba.service;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
public interface RegisterService {

    void registerOrderId(String orderId);

    String getLastReceivedOrderId();
}
