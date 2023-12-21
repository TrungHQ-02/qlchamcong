package com.example.qlchamcong.repository;

import com.example.qlchamcong.database.DatabaseType;

import java.sql.Connection;

public class RepositoryInitializer {
    private static IEmployeeRepository employeeRepository;
    private static IWorkerAttendanceDataRepository workerAttendanceDataRepository;
    private static IAttendanceRecordRepository attendanceRecordRepository;
    private static ITimekeeperRepository timekeeperRepository;
    private static IOfficerAttendanceDataRepository officerAttendanceDataRepository;
    private static IOfficerReportAttendanceRepository officerReportAttendanceRepository;
    private static IWorkerReportAttendanceRepository workerReportAttendanceRepository;
    public RepositoryInitializer(Connection connection, DatabaseType databaseType) {
        switch (databaseType) {
            case MYSQL:
                employeeRepository = new MySQLEmployeeRepository(connection);
                workerAttendanceDataRepository = new MySQLWorkerAttendanceDataRepository(connection);
                attendanceRecordRepository = new MySQLAttendanceRecordRepository(connection);
                timekeeperRepository = new MySQLTimekeeperRepository(connection);
                officerAttendanceDataRepository = new MySQLOfficerAttendanceDataRepository(connection);
                officerReportAttendanceRepository=new MySQLOfficerReportAttendanceRepository(connection);
                workerReportAttendanceRepository=new MySQLWorkerReportAttendanceRepository(connection);
        }
    }

    public static IEmployeeRepository getNguoiDungRepository() {
        return employeeRepository;
    }
    public static IWorkerAttendanceDataRepository getWorkerAttendanceDataRepository() {
        return workerAttendanceDataRepository;
    }

    public static IEmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public static ITimekeeperRepository getTimekeeperRepository() {
        return timekeeperRepository;
    }

    public static IOfficerAttendanceDataRepository getOfficerAttendanceDataRepository() {
        return officerAttendanceDataRepository;
    }

    public static IAttendanceRecordRepository getAttendanceRecordRepository() {
        return attendanceRecordRepository;
    }

    public static IOfficerReportAttendanceRepository getOfficerReportAttendanceRepository() {
        return officerReportAttendanceRepository;
    }
    public static IWorkerReportAttendanceRepository getWorkerReportAttendanceRepository() {
        return workerReportAttendanceRepository;
    }
}
