package com.zensar.controller;
	import java.util.List;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;



	import com.zensar.service.AttendanceService;
	import com.zensar.model.Attendance;

	@RestController
	@RequestMapping("/Admin")
	public class AttendanceController {
	@Autowired
	private AttendanceService service;
	@PostMapping("/attendance")
	public Attendance attendanceService(@RequestBody Attendance attend)
	{
	return service.saveAttendance(attend);
	}

	@GetMapping("/attendance")
	public List<Attendance> getAllAttendance(){
	return service.getAllAttendance();
	}



	}


