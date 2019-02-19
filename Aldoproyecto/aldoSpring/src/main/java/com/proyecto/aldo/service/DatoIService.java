package com.proyecto.aldo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aldo.DAO.DatoIDao;
import com.proyecto.aldo.entity.dato;

@Service
public class DatoIService  {

	@Autowired
	DatoIDao d;
	
	public List<dato> findAll() {
		return d.findALL();
	}

}
