/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.controller;

import com.springpos.dto.CustomerDTO;
import com.springpos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    public ResponseEntity getAllCustomers()  {
        List<CustomerDTO> allCustomers = null;
        try {
            allCustomers = customerService.getAllCustomers();
        } catch (Exception e) {
            System.out.println("exception = " + e);
            e.printStackTrace();
        }
        return new ResponseEntity(allCustomers, HttpStatus.OK);

    }
}
