package com.example.qlchamcong.repository;

import com.example.qlchamcong.entity.AttendanceRecord;

import java.sql.Date;
import java.util.List;

public interface IAttendanceRecordRepository {
    List<AttendanceRecord> getAttendanceRecordsByEmployeeAndDate(int employeeId, Date date);

    void deleteRecordById(int id);

    void createANewRecord(AttendanceRecord newRecord);

    void updateRecordById(AttendanceRecord newRecord);

    int getNumberOfRecordsInADayByDateAndEmployee(int employeeId, Date date);
}
