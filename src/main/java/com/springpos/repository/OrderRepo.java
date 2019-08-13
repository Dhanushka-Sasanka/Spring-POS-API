/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.repository;

import com.springpos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity,String> {
}
