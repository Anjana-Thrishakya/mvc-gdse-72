/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDto;

/**
 *
 * @author anjan
 */
public class OrderController {
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        System.out.println(orderDto);
        return null;
    }
    
}
