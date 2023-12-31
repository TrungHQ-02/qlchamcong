package com.example.qlchamcong.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class AttendanceRecord {
    private int id;

    private int employeeId;

    private String employeeCode;

    private int timeKeeperId;

    private Timestamp timestamp;

    private String type; // checkin or checkout

    public AttendanceRecord(int id, int employeeId, int timeKeeperId, Timestamp timestamp, String type) {
        this.id = id;
        this.employeeId = employeeId;
        this.timeKeeperId = timeKeeperId;
        this.timestamp = timestamp;
        this.type = type;
    }

    public AttendanceRecord() {

    }

    public AttendanceRecord(int employeeId, Timestamp timestamp, int timeKeeperId, String type) {
        this.employeeId = employeeId;
        this.timestamp = timestamp;
        this.timeKeeperId = timeKeeperId;
        this.type = type;
        this.id = 0; // new record without id queried from the db
    }

    public AttendanceRecord(int id, int employeeId, Timestamp timestamp, int timeKeeperId, String type) {
        this.employeeId = employeeId;
        this.timestamp = timestamp;
        this.timeKeeperId = timeKeeperId;
        this.type = type;
        this.id = id; // new record without id queried from the db
    }

    public AttendanceRecord(String employeeCode, Timestamp timestamp) {
        this.employeeCode = employeeCode;
        this.timestamp = timestamp;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "AttendanceRecord{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", timeKeeperId=" + timeKeeperId +
                ", timestamp=" + timestamp +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTimeKeeperId() {
        return timeKeeperId;
    }

    public void setTimeKeeperId(int timeKeeperId) {
        this.timeKeeperId = timeKeeperId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormattedDate() {
        LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        return day + "/" + month + "/" + year;
    }

    public String getFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(this.timestamp);
    }

    public Date getDateFromTimestamp() {
        Date date = new Date(timestamp.getTime());
        return date;
    }
}
