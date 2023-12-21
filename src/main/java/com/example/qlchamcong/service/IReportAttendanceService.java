package com.example.qlchamcong.service;

import com.example.qlchamcong.HRSystem.entity.Department;
import com.example.qlchamcong.entity.OfficerReportAttendance;
import com.example.qlchamcong.entity.WorkerReportAttendance;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface IReportAttendanceService {
    List<Department> getDepartmentList();
    List<OfficerReportAttendance> getOfficerReportAttendanceList(int id, Date date);
    List<WorkerReportAttendance> getWorkerReportAttendanceList(int id, Date date);
}
