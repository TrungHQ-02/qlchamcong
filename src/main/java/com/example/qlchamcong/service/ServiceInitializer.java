package com.example.qlchamcong.service;

import com.example.qlchamcong.repository.RepositoryInitializer;

public class ServiceInitializer {
    private static IDangNhapService dangNhapService;
    private static IImportDLCCService importDLCCService;
    private static IQLNSHomeService qlnsHomeService;
    private static IViewAttendanceRecordsService viewAttendanceRecordsService;
    private static IHomeScreenService homeScreenService;

    public ServiceInitializer() {
        dangNhapService = new DangNhapService(RepositoryInitializer.getNguoiDungRepository());
        importDLCCService = new ImportDLCCService(RepositoryInitializer.getTimekeeperRepository(), RepositoryInitializer.getWorkerAttendanceDataRepository(), RepositoryInitializer.getOfficerAttendanceDataRepository());
        qlnsHomeService = new QLNSHomeService();
        homeScreenService = new HomeScreenService();
        viewAttendanceRecordsService = new ViewAttendanceRecordsService();
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
}
