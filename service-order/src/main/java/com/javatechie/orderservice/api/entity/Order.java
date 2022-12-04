package com.javatechie.orderservice.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ORDER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private int Id;
    private String name;
    private int qty;
    private double price;
}
