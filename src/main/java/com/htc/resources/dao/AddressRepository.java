package com.htc.resources.dao;


import com.htc.resources.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 27/1/20.
 */
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
