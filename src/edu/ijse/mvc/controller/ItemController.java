/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemController {
    
    private final ItemModel ITEM_MODEL;

    public ItemController() {
        this.ITEM_MODEL = new ItemModel();
    }
    
    public ArrayList<ItemDto> getAllItem() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> itemList = ITEM_MODEL.getAll();
        return itemList;
    }
    
    public String saveItem(ItemDto itemDto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.saveItem(itemDto);
        return resp;
    }
    
    public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException{
        return ITEM_MODEL.saerchItem(itemCode);
    }
}
