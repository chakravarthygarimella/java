package com.springboot.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encryption")
public class EncryptionModel {

    private long id;
    private String originalText;
    private String encryptedText;

    public EncryptionModel() {

    }

    public EncryptionModel(String originalText, String encryptedText) {
        super();
        this.originalText = originalText;
        this.encryptedText = encryptedText;
    }

    @Column(name = "original_text", nullable = false)
    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    @Column(name = "encrypted_text", nullable = false)
    public String getEncryptedText() {
        return encryptedText;
    }

    public void setEncryptedText(String encryptedText) {
        this.encryptedText = encryptedText;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CyperModel [id=" + id + ", originalText=" + originalText + ", encryptedText=" + encryptedText + "]";
    }


}
