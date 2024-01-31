package com.Project.SamplecrudOperation.Service.impl;

import com.Project.SamplecrudOperation.DTO.CustomerDTO;
import com.Project.SamplecrudOperation.Service.CustomerService;
import com.Project.SamplecrudOperation.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private UserDAO userDAO;


    @Override
    public CustomerDTO addCustomer(CustomerDTO customerSaveDTO) {

        return userDAO.addCustomer(customerSaveDTO);
    }

    @Override
    public Object getCustomer(String name) {

        return userDAO.getCustomer(name);
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {

        return userDAO.updateCustomer(customerDTO);
    }
    @Override
    public CustomerDTO deleteCustomer(CustomerDTO customerDTO){
        return userDAO.deleteCustomer(customerDTO);
    }



}