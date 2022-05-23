package com.zensar.service;
	import java.util.List;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;



	import com.zensar.model.Attendance;



	import com.zensar.repository.AttendanceRepository;

	@Service
	public class AttendanceService {
	@Autowired
	private AttendanceRepository repository;


	public Attendance saveAttendance(Attendance attend)
	{
	return repository.save(attend);
	}
	public List<Attendance> getAllAttendance(){
	return repository.findAll();
	}



	}


