package com.exavalu.aadhar.service;

import java.util.List;

import com.exavalu.aadhar.entity.Aadhar;

public interface AadharService {
	
	Aadhar addAadhar(Aadhar aadhar);
	Aadhar getAadharByNo(long aadharNo);
	Aadhar updateAadhar(Aadhar aadhar);
	List<Aadhar> getAllAadhar();
	void deleteAadhar(long aadharNo);

}
