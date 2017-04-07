package org.xieweiba.service;

import org.xieweiba.model.Order;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
public interface ClientService {
    void addOrder(Order order);

    void registerOrder(Order order);
}
