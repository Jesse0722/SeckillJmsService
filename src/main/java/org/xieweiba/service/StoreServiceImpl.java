package org.xieweiba.service;

import org.springframework.stereotype.Service;
import org.xieweiba.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
@Service
public class StoreServiceImpl implements StoreService {

    private final List<Order> receivedOrders = new ArrayList<>();

    @Override
    public void registerOrder(Order order) {
        this.receivedOrders.add(order);
    }

    @Override
    public Optional<Order> getReceivedOrder(String id) {
        return receivedOrders.stream().filter(order -> order.equals(id)).findFirst();
    }
}
