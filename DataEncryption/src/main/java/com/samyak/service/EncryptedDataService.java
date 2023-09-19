package com.samyak.service;

import com.samyak.entity.EncryptedData;
import com.samyak.repository.EncryptedDataRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class EncryptedDataService {

    @Autowired
    private EncryptedDataRepository encryptedDataRepository;

    public EncryptedData saveData(EncryptedData encryptedData) {
        return encryptedDataRepository.save(encryptedData);
    }

    public List<EncryptedData> getAllData(){
        return encryptedDataRepository.findAll();
    }
}
