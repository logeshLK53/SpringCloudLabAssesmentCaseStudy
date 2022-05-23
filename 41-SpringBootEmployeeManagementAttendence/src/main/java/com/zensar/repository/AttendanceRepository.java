package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
