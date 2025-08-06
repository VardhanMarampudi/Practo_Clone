package com.vardhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vardhan.entity.DoctorData;
import com.vardhan.entity.PatientData;
import com.vardhan.service.DoctorService;
import com.vardhan.service.PatientService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PractoController {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping("/")
	public String landingPageHandler() {
		return "index";
	}

	@RequestMapping("/home")
	public String homePageHandler() {
		return "index";
	}

	@RequestMapping("/aboutus")
	public String aboutPageHandler() {
		return "aboutUs";
	}

	@RequestMapping("/Contact")
	public String contactPageHandler() {
		return "contact";
	}

	@RequestMapping("/PatientReg")
	public String patientRegPageHandler() {
		return "patientReg";
	}

	@RequestMapping("/patientSignup")
	public ModelAndView patientDetailsPageHandler(HttpServletRequest request) {
		String name = request.getParameter("n1");
		String phone = request.getParameter("n2");
		String password = request.getParameter("n3");
		String gender = request.getParameter("n5");
		String age = request.getParameter("n6");
		String AppointmentDate = request.getParameter("n7");
		String Specialist = request.getParameter("n8");
		ModelAndView mav = new ModelAndView();
		mav.addObject("key1", name);
		mav.addObject("key2", phone);
		mav.addObject("key3", gender);
		mav.addObject("key4", age);
		mav.addObject("key5", AppointmentDate);
		mav.addObject("key6", Specialist);
		
		//DB operation
		PatientData patient=new PatientData();
		patient.setName(name);
		patient.setPassword(password);
		patient.setGender(gender);
		patient.setAge(Integer.parseInt(age));
		patient.setAppointmentDate(AppointmentDate);
		patient.setSpecialist(Specialist);
		patientService.savePatient(patient);
		
		return mav;
	}

	@RequestMapping("/Patientlogin")
	public String patientLoginPageHandler() {
		return "patientLogin";
	}

	@RequestMapping("/DoctorReg")
	public String doctorRegPageHandler() {
		return "doctorReg";
	}

	@RequestMapping("/doctorSignup")
	public ModelAndView doctorDetailsPageHandler(HttpServletRequest request) {
		String name = request.getParameter("n1");
		String phone = request.getParameter("n2");
		String password = request.getParameter("n3");
		String gender = request.getParameter("n5");
		String age = request.getParameter("n6");
		String Specialist = request.getParameter("n7");
		ModelAndView mav = new ModelAndView();
		mav.addObject("key1", name);
		mav.addObject("key2", phone);
		mav.addObject("key3", gender);
		mav.addObject("key4", age);
		mav.addObject("key5", Specialist);
		
		//DB operation
		DoctorData doctor=new DoctorData();
		doctor.setName(name);
		doctor.setPhoneNumber(Long.parseLong(phone));
		doctor.setPassword(password);
		doctor.setGender(gender);
		doctor.setAge(Integer.parseInt(age));
		doctor.setSpecialist(Specialist);
		doctorService.saveDoctor(doctor);
		return mav;

	}

	@RequestMapping("/doctorlogin")
	public String doctorLoginPageHandler() {
		return "doctorLogin";
	}
}
