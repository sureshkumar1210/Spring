package com.example.java.springBoot.controller;

import com.example.java.springBoot.model.vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class restapi {

    vendor vendor;

    @GetMapping("{empId}")
    public vendor getVendorDetails(String empId)
    {
        return  vendor;
       // return new vendor("s1","suresh", "8870244706");
    }

    @PostMapping
    public String createVendorDetails(@RequestBody vendor vendor)
    {
        this.vendor = vendor;
        return "vendor details created successfully ";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody vendor vendor)
    {
        this.vendor = vendor;
        return "vendor details successfully updated";
    }

    @DeleteMapping("{empId}")
    public String deleteVendorDetails(String empId)
    {
        this.vendor=null;
        return "vendor details deleted successfully";
    }
}
