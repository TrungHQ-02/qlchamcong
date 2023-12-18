package com.example.qlchamcong.service;

import com.example.qlchamcong.entity.AttendanceRecord;
import com.example.qlchamcong.repository.IAttendanceRecordRepository;
import com.example.qlchamcong.repository.RepositoryInitializer;

import java.util.Date;
import java.util.List;

public class ViewAttendanceRecordsService implements IViewAttendanceRecordsService {
    private final IAttendanceRecordRepository attendanceRecordRepository;

    public ViewAttendanceRecordsService() {
        this.attendanceRecordRepository = RepositoryInitializer.getAttendanceRecordRepository();
    }

    @Override
    public List<AttendanceRecord> getRecordsOfAnEmployeeInADay(int employeeId, Date date) {
        return attendanceRecordRepository.getAllAttendanceRecord();
    }
}
