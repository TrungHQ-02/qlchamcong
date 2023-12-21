package com.example.qlchamcong.viewreportofficeattendance;

import com.example.qlchamcong.HRSystem.entity.Department;
import com.example.qlchamcong.changeGUIUtility.IActionChangeGUI;
import com.example.qlchamcong.changeGUIUtility.IPassArgument;
import com.example.qlchamcong.entity.OfficerReportAttendanceRow;
import com.example.qlchamcong.service.IReportAttendanceService;
import com.example.qlchamcong.service.ServiceInitializer;

import java.util.Date;
import java.util.List;

public class ReportOfficeAttendanceController {
    private final IActionChangeGUI navUtil;
    private final IPassArgument argumentUtil;
    private final IReportAttendanceService reportAttendanceService;
    public ReportOfficeAttendanceController(IActionChangeGUI navUtil, IPassArgument argumentUtil) {
        this.argumentUtil = argumentUtil;
        this.navUtil = navUtil;
        this.reportAttendanceService= ServiceInitializer.getReportAttendanceService();
//        List<OfficerReportAttendanceRow> officerReportAttendanceRows= fetchListOfOfficerReportAttendance();
    }
    public List<OfficerReportAttendanceRow> fetchListOfOfficerReportAttendance(int id, Date date) {
        System.out.println(321);
        return reportAttendanceService.getOfficerReportAttendanceList(id,date);
    }
    public Department getInitialData() {
        return (Department) argumentUtil.getSharedData("fromDepartmentToReportAttendance");
    }
}