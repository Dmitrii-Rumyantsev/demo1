package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmployeeController {
    private EmployeeView employeeView = new EmployeeView();
    @FXML
    private ListView<String> Show = new ListView<>();
    @FXML
    private TextField Name;
    @FXML
    private TextField Coast;
    @FXML
    private TextField YearWork;
    private Employee model;
    private EmployeeView view;
    @FXML
    private void handleAddButton() {
        Employee employee1 = new Employee();
        employee1.setFIO(Name.getText());
        employee1.setMoney(Integer.parseInt(Coast.getText()));
        employee1.setYearWork(Integer.parseInt(YearWork.getText()));
        Show.getItems().add(employeeView.printEmployeeDetails(Name.getText(),Integer.parseInt(Coast.getText()),Integer.parseInt(YearWork.getText())));
        Name.clear();
        Coast.clear();
        YearWork.clear();
    }
    public EmployeeController(){}
    EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
}