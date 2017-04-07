package org.xieweiba.service;

import org.xieweiba.model.Order;

import java.util.Optional;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
public interface StoreService {
    void registerOrder(Order order);

    Optional<Order> getReceivedOrder(String id);
}
