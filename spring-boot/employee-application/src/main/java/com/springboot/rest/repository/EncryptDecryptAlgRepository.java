package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.model.EncryptionModel;

@Repository
public interface EncryptDecryptAlgRepository extends JpaRepository<EncryptionModel, Long> {

}
