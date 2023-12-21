package com.example.qlchamcong.service;

import com.example.qlchamcong.HRSystem.HRSystemInitializer;
import com.example.qlchamcong.repository.RepositoryInitializer;
import com.example.qlchamcong.service.homescreen.HomeScreenService;
import com.example.qlchamcong.service.homescreen.IHomeScreenService;
import com.example.qlchamcong.service.importdata.IImportDLCCService;
import com.example.qlchamcong.service.importdata.ImportDLCCService;
import com.example.qlchamcong.service.login.DangNhapService;
import com.example.qlchamcong.service.login.IDangNhapService;
import com.example.qlchamcong.service.report.IReportAttendanceService;
import com.example.qlchamcong.service.report.ReportAttendanceService;
import com.example.qlchamcong.service.viewattendancerecord.IViewAttendanceRecordsService;
import com.example.qlchamcong.service.viewattendancerecord.ViewAttendanceRecordsService;

public class ServiceInitializer {
    private static IDangNhapService dangNhapService;
    private static IImportDLCCService importDLCCService;
    private static IQLNSHomeService qlnsHomeService;
    private static IViewAttendanceRecordsService viewAttendanceRecordsService;
    private static IHomeScreenService homeScreenService;
    private static IReportAttendanceService reportAttendanceService;

    public ServiceInitializer() {
        dangNhapService = new DangNhapService(RepositoryInitializer.getNguoiDungRepository());
        importDLCCService = new ImportDLCCService(RepositoryInitializer.getTimekeeperRepository(), RepositoryInitializer.getWorkerAttendanceDataRepository(), RepositoryInitializer.getOfficerAttendanceDataRepository(), HRSystemInitializer.getIhrSystemAPIService());
        qlnsHomeService = new QLNSHomeService();
        homeScreenService = new HomeScreenService();
        viewAttendanceRecordsService = new ViewAttendanceRecordsService();
        reportAttendanceService=new ReportAttendanceService();
    }

    public static IDangNhapService getDangNhapService() {
        return dangNhapService;
    }

    public static IImportDLCCService getImportDLCCService() {
        return importDLCCService;
    }

    public static IQLNSHomeService getQlnsHomeService() {
        return qlnsHomeService;
    }

    public static IHomeScreenService getHomeScreenService() {
        return homeScreenService;
    }

    public static IViewAttendanceRecordsService getViewAttendanceRecordsService() {return viewAttendanceRecordsService;}
    public static IReportAttendanceService getReportAttendanceService() {return reportAttendanceService;}
}