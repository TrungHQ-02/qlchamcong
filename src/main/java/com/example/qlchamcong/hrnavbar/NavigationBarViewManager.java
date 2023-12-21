package com.example.qlchamcong.hrnavbar;

import com.example.qlchamcong.changeGUIUtility.IActionChangeGUI;
import com.example.qlchamcong.changeGUIUtility.NavigationManager;
import com.example.qlchamcong.changeGUIUtility.NavigationUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NavigationBarViewManager implements Initializable {

    @FXML
    public Pane contentPane;
    @FXML
    public Button homePage;
    @FXML
    public Button importDLCC;
    @FXML
    public Button dangXuat;
    @FXML
    public Button departmentList;
    @FXML
    public ImageView logoImage;
    @FXML
    public ImageView hrImage;
    private NavigationBarController navigationBarController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NavigationManager.getInstance().setContentPane(contentPane);
        IActionChangeGUI navigationUtil = new NavigationUtil();
        navigationBarController = new NavigationBarController(navigationUtil);
        try {
            this.setHomeScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setHomeScreen() throws IOException {
        navigationBarController.setHomeScreen();
    }

    @FXML
    public void handleImportDLCCButtonAction() throws IOException {
        navigationBarController.toAttendanceTrackingImportScreen();
    }

    @FXML
    public void handleHomeButtonAction() throws IOException {
        navigationBarController.toHomeScreen();
    }
    @FXML
    public void handleDepartmentListButtonAction() throws IOException {
        navigationBarController.toDepartmentListScreen();
    }

    @FXML
    public void handleLogoutBtnAction() throws IOException {
        Stage stage = (Stage) dangXuat.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qlchamcong/dangnhap/dang-nhap.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.centerOnScreen();
        System.out.println("Dang xuat thanh cong");
    }
}
