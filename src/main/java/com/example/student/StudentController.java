package com.example.student;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@Inject
	StudentDAO dao;

	@RequestMapping("list.do")
	public String list(Model model) {
		
		List<StudentDTO> list= dao.list();
		model.addAttribute("list",list);
		
		return "list";
	}
}
