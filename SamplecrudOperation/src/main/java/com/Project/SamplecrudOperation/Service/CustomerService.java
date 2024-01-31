package com.Project.SamplecrudOperation.Service;


import com.Project.SamplecrudOperation.DTO.CustomerDTO;

public interface CustomerService {


    CustomerDTO addCustomer(CustomerDTO customerSaveDTO) ;

    Object getCustomer(String name) ;


    CustomerDTO updateCustomer(CustomerDTO customerSaveDTO);

    CustomerDTO deleteCustomer(CustomerDTO customerSaveDto);

}
