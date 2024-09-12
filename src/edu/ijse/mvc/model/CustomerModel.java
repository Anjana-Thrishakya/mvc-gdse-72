/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anjan
 */
public class CustomerModel {
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getId());
        statement.setString(2, customerDto.getTitle());
        statement.setString(3, customerDto.getName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getPostalCode());
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Saved" : "Fail";
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, "
                + "CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, customerDto.getTitle());
        statement.setString(2, customerDto.getName());
        statement.setString(3, customerDto.getDob());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setString(8, customerDto.getPostalCode());
        statement.setString(9, customerDto.getId());
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Updated" : "Fail";
    }
    
    public String deleteCustomer(String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, id);
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Fail";
    }
    
    public CustomerDto searchCustomer(String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getString(9));
            
            return  dto;
        }
        
        return null;
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        List<CustomerDto> customerDtos = new ArrayList<>();
        
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getDouble(5),
                    rst.getString(6), rst.getString(7),
                    rst.getString(8), rst.getString(9));
            customerDtos.add(dto);
        }
        
        return customerDtos;
    }
}
