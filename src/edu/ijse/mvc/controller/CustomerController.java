/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.util.List;

/**
 *
 * @author anjan
 */
public class CustomerController {

    private CustomerModel customerModel = new CustomerModel();

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        String resp = customerModel.saveCustomer(customerDto);
        return resp;
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        String resp = customerModel.updateCustomer(customerDto);
        return resp;
    }

    public String deleteCustomer(String customerId) throws Exception {
        String resp = customerModel.deleteCustomer(customerId);
        return resp;
    }
    
    public CustomerDto searchCustomer(String customerId) throws Exception{
        CustomerDto dto = customerModel.searchCustomer(customerId);
        return dto;
    }
    
    public List<CustomerDto> getAllCustomer() throws Exception{
        List<CustomerDto> dtos = customerModel.getAllCustomer();
        return dtos;
    }

}
