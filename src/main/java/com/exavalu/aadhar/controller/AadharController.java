package com.exavalu.aadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("id")
	public ResponseEntity<Aadhar> getAadharByNo(@PathVariable ("id") Long aadharNo){
		Aadhar aadhar = aadharService.getAadharByNo(aadharNo);
		return new ResponseEntity<>(aadhar, HttpStatus.OK);
	}
	
	@GetMapping
    public ResponseEntity<List<Aadhar>> getAllAadhar(){
        List<Aadhar> aadhars = aadharService.getAllAadhar();
        return new ResponseEntity<>(aadhars, HttpStatus.OK);
    }
	
	@PutMapping("{id}")
    // http://localhost:8080/api/aadhar/1
    public ResponseEntity<Aadhar> updateAadhar(@PathVariable("id") Long aadharNo,@RequestBody Aadhar aadhar){
    	aadhar.setAadharNo(aadharNo);
    	Aadhar updatedAadhar = aadharService.updateAadhar(aadhar);
        return new ResponseEntity<>(updatedAadhar, HttpStatus.OK);
    }
	
	@DeleteMapping("{aadharNo}")
    public ResponseEntity<String> deleteAadhar(@PathVariable("aadharNo") Long aadharNo){
    	aadharService.deleteAadhar(aadharNo);
        return new ResponseEntity<>("Aadhar successfully deleted!", HttpStatus.OK);
    }
}
