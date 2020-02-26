package com.org.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.register.dto.RegisterDTO;
import com.org.register.service.RegisterService;

@Controller
@RequestMapping
public class RegisterController {

	@Autowired
	private RegisterService ser;

	public RegisterController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/reg.do")
	public String onRegister(RegisterDTO dto, ModelMap map) {

		try {
			System.out.println("Invoked onRegister method");
			System.out.println(dto);

			boolean check = this.ser.ValidateAndSave(dto);
			
			

			if (check) {
				//String s = dto.getUserName();
				ModelMap x = map.addAttribute("name",dto.getUserName());
				ModelMap suc = map.addAttribute("successMessage", " You data is saved !!!");
			} else {
				ModelMap fail = map.addAttribute("failureMessage", "Failure:Data not Saved");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}

		return "reg";

	}

}
