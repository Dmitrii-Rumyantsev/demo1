package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class EmployeeView {
    public String printEmployeeDetails(String FIO, int money,int yearWork){
        return ("Фамилия " + FIO + " ЗП " + money + " Стаж " + yearWork);
    }
}