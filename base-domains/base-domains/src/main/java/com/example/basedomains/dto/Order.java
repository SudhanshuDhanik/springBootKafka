package com.example.basedomains.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int qty;
    private double price;

    @JsonCreator
    public Order(@JsonProperty("orderId") String orderId,
                 @JsonProperty("name") String name,
                 @JsonProperty("qty") int qty,
                 @JsonProperty("price") double price) {
        this.orderId = orderId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
