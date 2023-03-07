package com.exavalu.aadhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exavalu.aadhar.entity.Aadhar;
import com.exavalu.aadhar.service.AadharService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/aadhar")

public class AadharController {
	@Autowired
	private AadharService aadharService;

	@PostMapping
	public ResponseEntity<Aadhar> addAadhar(@RequestBody Aadhar aadhar) {
		Aadhar savedAadhar = aadharService.addAadhar(aadhar);
		return new ResponseEntity<>(savedAadhar, HttpStatus.CREATED);
	}
	
	@GetMapping
}
