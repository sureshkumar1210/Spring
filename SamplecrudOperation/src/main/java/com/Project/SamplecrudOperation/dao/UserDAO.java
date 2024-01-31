package com.Project.SamplecrudOperation.dao;

import com.Project.SamplecrudOperation.DTO.CustomerDTO;

public interface UserDAO {



    CustomerDTO  addCustomer(CustomerDTO customerSaveDTO) ;

    Object getCustomer(String name) ;

    CustomerDTO updateCustomer(CustomerDTO customerSaveDTO);

    CustomerDTO deleteCustomer(CustomerDTO customerDTO);
}