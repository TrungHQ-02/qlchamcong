package com.example.qlchamcong.viewattendancerecord.addrecord;

import com.example.qlchamcong.changeGUIUtility.IActionChangeGUI;
import com.example.qlchamcong.changeGUIUtility.IPassArgument;
import com.example.qlchamcong.service.IViewAttendanceRecordsService;
import com.example.qlchamcong.service.ServiceInitializer;

import java.io.IOException;

public class AddRecordController {

    private final IActionChangeGUI navUtil;
    private final IPassArgument argumentUtil;

    private final IViewAttendanceRecordsService viewAttendanceRecordsService;


    public AddRecordController(IActionChangeGUI navUtil, IPassArgument argumentUtil) {
        this.navUtil = navUtil;
        this.argumentUtil = argumentUtil;
        this.viewAttendanceRecordsService = ServiceInitializer.getViewAttendanceRecordsService();
    }

    public Object getInitialData() {
        return argumentUtil.getSharedData("fromAttendanceRecordToNewRecord");
    }

    public void returnToAttendanceRecordListView() throws IOException {
        navUtil.changeGUI("/com/example/qlchamcong/viewattendancerecord/view-attendance-record.fxml");
    }
}