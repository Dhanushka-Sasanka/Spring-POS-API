/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.repository;

import com.springpos.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity ,String> {

}
