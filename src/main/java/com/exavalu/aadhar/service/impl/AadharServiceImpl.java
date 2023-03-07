package com.exavalu.aadhar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exavalu.aadhar.entity.Aadhar;
import com.exavalu.aadhar.repository.AadharRepository;
import com.exavalu.aadhar.service.AadharService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class AadharServiceImpl implements AadharService{
	
	private AadharRepository aadharRepository;

	@Override
	public Aadhar addAadhar(Aadhar aadhar) {
		// TODO Auto-generated method stub
		return aadharRepository.save(aadhar);
	}

	@Override
	public Aadhar getAadharByNo(long aadharNo) {
		// TODO Auto-generated method stub
		Optional <Aadhar> optionalAadhar = aadharRepository.findById(aadharNo);
		return optionalAadhar.get();
	}

	@Override
	public Aadhar updateAadhar(Aadhar aadhar) {
		// TODO Auto-generated method stub
		Aadhar existingAadhar = aadharRepository.findById(aadhar.getAadharNo()).get();
		existingAadhar.setName(aadhar.getName());
		existingAadhar.setGuardianName(aadhar.getGuardianName());
		existingAadhar.setGender(aadhar.getGender());
		existingAadhar.setDob(aadhar.getDob());
		existingAadhar.setVillage(aadhar.getVillage());
		existingAadhar.setPostOffice(aadhar.getPostOffice());
		existingAadhar.setDistrict(aadhar.getDistrict());
		existingAadhar.setState(aadhar.getState());
		existingAadhar.setPinCode(aadhar.getPinCode());
        Aadhar updatedAadhar = aadharRepository.save(existingAadhar);
        return updatedAadhar;
	}

	@Override
	public List<Aadhar> getAllAadhar() {
		// TODO Auto-generated method stub
		return aadharRepository.findAll();
	}

	@Override
	public void deleteAadhar(long aadharNo) {
		// TODO Auto-generated method stub
		aadharRepository.deleteById(aadharNo);
	}

}
