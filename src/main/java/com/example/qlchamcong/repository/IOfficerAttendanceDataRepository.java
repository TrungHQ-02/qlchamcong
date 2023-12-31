package com.example.qlchamcong.repository;

import com.example.qlchamcong.entity.OfficerAttendanceData;

import java.util.Date;

public interface IOfficerAttendanceDataRepository {
    OfficerAttendanceData getOfficerAttendanceDataByEmployeeAndDate(int employeeId, Date date);

    void updateOfficerAttendanceData(int id, boolean morningSession, boolean afternoonSession, double lateHours, double earlyLeaveHours);
}
