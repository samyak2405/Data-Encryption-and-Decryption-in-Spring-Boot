package com.samyak.controller;

import com.samyak.entity.EncryptedData;
import com.samyak.service.EncryptedDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EncryptedDataController {

    @Autowired
    private EncryptedDataService encryptedDataService;
    @PostMapping("/save")
    public ResponseEntity<EncryptedData> saveData(@RequestBody EncryptedData encryptedData){
        EncryptedData savedEncryptedData = encryptedDataService.saveData(encryptedData);
        return new ResponseEntity<EncryptedData>(savedEncryptedData, HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<EncryptedData>> getAllData(){
        List<EncryptedData> savedData = encryptedDataService.getAllData();
        return new ResponseEntity<List<EncryptedData>>(savedData,HttpStatus.OK);
    }
}
