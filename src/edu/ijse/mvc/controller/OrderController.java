/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;

/**
 *
 * @author anjan
 */
public class OrderController {
    
    private OrderModel orderModel = new OrderModel();
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        String resp = orderModel.placeOrder(orderDto);
        return resp;
    }
    
}
