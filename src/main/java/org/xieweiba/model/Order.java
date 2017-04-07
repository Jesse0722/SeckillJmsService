package org.xieweiba.model;

import java.io.Serializable;

/**
 * Created by lijiajun1-sal on 2017/4/7.
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -797586847427389162L;

    private final String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
