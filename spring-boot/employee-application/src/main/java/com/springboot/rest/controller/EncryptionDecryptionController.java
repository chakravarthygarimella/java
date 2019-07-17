package com.springboot.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.exception.ResourceNotFoundException;
import com.springboot.rest.model.EncryptionModel;
import com.springboot.rest.repository.EncryptDecryptAlgRepository;
import com.springboot.rest.service.AES;
import com.springboot.rest.service.EncryptionService;

@RestController
@RequestMapping("/api/v1")
public class EncryptionDecryptionController {

    private static final String KEY = "chexkey";
    @Autowired
    private EncryptDecryptAlgRepository encryptDecryptAlgRepository;

    @Autowired
    private EncryptionService encryptionService;

    @SuppressWarnings("unlikely-arg-type")
    @PostMapping("/encryption")
    public @Valid ResponseEntity<@Valid EncryptionModel> createSecret(@Valid @RequestBody EncryptionModel encryptionModel) {
        if (!StringUtils.isEmpty(encryptionModel.getId())) {
            if (!encryptionModel.getOriginalText().equals(encryptDecryptAlgRepository.findById(encryptionModel.getId()))) {
                return encryptionService.populateSecrets(encryptionModel);
            }
        } else {
            return encryptionService.populateSecrets(encryptionModel);
        }
        return null;
    }

    @GetMapping("/encryption")
    public List<EncryptionModel> getAllEmployees() {
        return encryptDecryptAlgRepository.findAll();
    }

    @GetMapping("/encryption/{id}")
    public ResponseEntity<EncryptionModel> getSecretById(@PathVariable(value = "id") Long secretId)
            throws ResourceNotFoundException {
        EncryptionModel encryptionModel = encryptDecryptAlgRepository.findById(secretId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + secretId));
        return ResponseEntity.ok().body(encryptionModel);
    }

    @GetMapping("/decryption/{textToDecrypt}")
    public ResponseEntity<String> getDecryptedText(@PathVariable(value = "textToDecrypt") String textToDecrypt) {
        return ResponseEntity.ok().body(AES.decrypt(textToDecrypt, KEY));
    }
}
