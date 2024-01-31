package com.Project.SamplecrudOperation.ProductController;


import com.Project.SamplecrudOperation.DTO.CustomerDTO;
import com.Project.SamplecrudOperation.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class ProductController {

    @Autowired
    private CustomerService  customerService;

    @PostMapping(path = "/add")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
       return customerService.addCustomer(customerDTO);
}

    @GetMapping(path = "/get", produces = "application/json")
    public Object get(@RequestParam(name = "name") final String name) {
        return customerService.getCustomer(name);
    }

    @PostMapping(path = "/delete")
    public CustomerDTO deleteCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.deleteCustomer(customerDTO);
    }

    @PostMapping(path = "/update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO);
    }

}
