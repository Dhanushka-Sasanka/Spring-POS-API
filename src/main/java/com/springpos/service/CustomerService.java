/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.service;

import com.springpos.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {

    public CustomerDTO addCustomer(CustomerDTO customerDTO);

    public CustomerDTO updateCustomer(String id, CustomerDTO customerDTO);

    public CustomerDTO deleteCustomer(String id);

    public CustomerDTO searchCustomer(String id);

    public List<CustomerDTO> getAllCustomers();
}
