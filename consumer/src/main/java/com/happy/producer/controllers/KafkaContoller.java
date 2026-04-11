package com.happy.producer.controllers;

import com.happy.producer.model.Course;
import com.happy.producer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaContoller {

    @Autowired
    private KafkaService service;

    @GetMapping("/get-course")
    public ResponseEntity<String> getCourse(){
        String response = service.getMessage();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
