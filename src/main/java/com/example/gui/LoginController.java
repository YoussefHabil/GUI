package com.example.gui;

import javafx.scene.control.TextField;

import javax.swing.*;

public class LoginController {
    private TextField  EmailField;
    private TextField  PasswordField;
    private String Email;
    private String Password;
    public void login(){
     Email = EmailField.getText();
     Password = PasswordField.getText();

    }
}
