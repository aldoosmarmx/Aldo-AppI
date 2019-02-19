package com.proyecto.aldo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.aldo.DAO.DatoIDao;
import com.proyecto.aldo.entity.dato;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class controller {

	@Autowired
	DatoIDao dd;
	
	
	@RequestMapping(value="/datos",method = RequestMethod.GET)
	public List<dato> getDatos()  {
		return dd.findALL();
	}
	
}
