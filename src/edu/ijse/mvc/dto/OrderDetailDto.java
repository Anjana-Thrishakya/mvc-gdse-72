/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author anjan
 */
public class OrderDetailDto {
    
    private String itemCode;
    private double discount;
    private int qty;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemCode, double discount, int qty) {
        this.itemCode = itemCode;
        this.discount = discount;
        this.qty = qty;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "itemCode=" + itemCode + ", discount=" + discount + ", qty=" + qty + '}';
    }
    
    
    
}
