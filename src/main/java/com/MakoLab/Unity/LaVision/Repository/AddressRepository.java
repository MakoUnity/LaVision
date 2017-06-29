package com.MakoLab.Unity.LaVision.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MakoLab.Unity.LaVision.Models.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String>{

}
