package com.example.qlchamcong.service;

import com.example.qlchamcong.entity.AttendanceRecord;

import java.util.Date;
import java.util.List;

public interface IViewAttendanceRecordsService {
    List<AttendanceRecord> getRecordsOfAnEmployeeInADay(int employeeId, Date date);
}