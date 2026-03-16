package com.uade.tpo.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Joya {
    private int id;
    private String name;
    private String description;
    private double price;
    
}
