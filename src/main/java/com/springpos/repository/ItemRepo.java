/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.repository;

import com.springpos.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<ItemEntity,String>{

}
