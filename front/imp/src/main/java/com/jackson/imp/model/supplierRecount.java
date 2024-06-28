/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jackson.imp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
@NoArgsConstructor
public class supplierRecount {
    private String name;
    private int value;

    public supplierRecount(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
}
