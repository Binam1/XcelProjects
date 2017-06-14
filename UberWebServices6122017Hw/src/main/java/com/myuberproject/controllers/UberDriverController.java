package com.myuberproject.controllers;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myuberproject.entities.UberDriver;
import com.myuberproject.repositories.UberDriverRepository;

import com.myuberproject.entities.UberDriver;
import com.myuberproject.repositories.UberDriverRepository;

@RestController
public class UberDriverController 
	{
	@Autowired
	UberDriverRepository uberDriverRepository;
	
	@RequestMapping(value= "/search", method = RequestMethod.POST)
	public void findByName(HttpServletRequest request)
		{
			String name = request.getParameter("firstName");
			List<UberDriver> uberDrivers = (List<UberDriver>) uberDriverRepository.findByName(name);
			
			
			for(UberDriver d : uberDrivers)
				{
					System.out.println("FirstName : " + d.getFirstName() + " LastName : " + d.getLastname() + " Email : " + d.getEmail());
				}
	
			}
	
		}

