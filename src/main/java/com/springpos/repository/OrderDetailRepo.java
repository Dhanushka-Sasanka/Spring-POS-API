/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.repository;

import com.springpos.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetailEntity,String> {
}
