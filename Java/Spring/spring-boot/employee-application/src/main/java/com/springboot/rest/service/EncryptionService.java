package com.springboot.rest.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.rest.model.EncryptionModel;
import com.springboot.rest.repository.EncryptDecryptAlgRepository;

@Service
public class EncryptionService {
    private static final String KEY = "chexkey";

    @Autowired
    private EncryptDecryptAlgRepository encryptDecryptAlgRepository;

    public ResponseEntity<@Valid EncryptionModel> populateSecrets(EncryptionModel encryptionModel) {
        encryptionModel.setEncryptedText(AES.encrypt(encryptionModel.getOriginalText(), KEY));
        return ResponseEntity.ok(encryptDecryptAlgRepository.save(encryptionModel));
    }

}
