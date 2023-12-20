package com.example.qlchamcong.importdlcc;

import com.example.qlchamcong.changeGUIUtility.IActionChangeGUI;
import com.example.qlchamcong.changeGUIUtility.IPassArgument;
import com.example.qlchamcong.entity.AttendanceRecord;
import com.example.qlchamcong.entity.OfficerAttendanceData;
import com.example.qlchamcong.entity.Tuple2;
import com.example.qlchamcong.entity.WorkerAttendanceData;
import com.example.qlchamcong.exception.InvalidFileFormatException;
import com.example.qlchamcong.service.IImportDLCCService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImportDLCCController {

    private IImportDLCCService importDLCCService;

    public ImportDLCCController(IImportDLCCService importDLCCService) {
        this.importDLCCService = importDLCCService;
    }

    public List<AttendanceRecord> getAttendanceRecord(File attedanceRecordFile) throws InvalidFileFormatException {
        return importDLCCService.getAttendanceRecord(attedanceRecordFile);
    }

    public Tuple2<OfficerAttendanceData, WorkerAttendanceData> getTransformedData(List<AttendanceRecord> attendanceRecordList) {
        return importDLCCService.getTransformedData(attendanceRecordList);
    }

    public List<String> getAllTimekeeperCode() {
        return importDLCCService.getAllTimekeeperCode();
    }
}
