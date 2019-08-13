/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.service.impl;

import com.springpos.dto.CustomerDTO;
import com.springpos.entity.CustomerEntity;
import com.springpos.repository.CustomerRepo;
import com.springpos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Transactional
    @Override
    public List<CustomerDTO> getAllCustomers()  {
        List<CustomerEntity> customerList = customerRepo.findAll();
        System.out.println("customerList = " + customerList);
        ArrayList<CustomerDTO> dto = new ArrayList<>();
        for (CustomerEntity cus : customerList) {

            dto.add(new CustomerDTO(cus.getCustomerId(),
                    cus.getCustomerName(),
                    cus.getCustomerAddress(),
                    cus.getCustomerTele(),
                    cus.getCustomerEmail()
            ));
        }
        return dto;
    }
    @Override
    public CustomerDTO addCustomer(CustomerDTO customerDTO)  {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(String id, CustomerDTO customerDTO)  {
        return null;
    }

    @Override
    public CustomerDTO deleteCustomer(String id)  {
        return null;
    }

    @Override
    public CustomerDTO searchCustomer(String id)  {
        return null;
    }


}
