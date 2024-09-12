/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class OrderDto {
    private String orderId;
    private String custId;
    private String orderDate;
    private ArrayList<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String orderId, String custId, String orderDate, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderId = orderId;
        this.custId = custId;
        this.orderDate = orderDate;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the orderDetailDtos
     */
    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", custId=" + custId + ", orderDate=" + orderDate + ", orderDetailDtos=" + orderDetailDtos + '}';
    }
    
    
}
