/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko10;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

/**
 *
 * @author Qnaerhi
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button refButton;
    @FXML
    private TextField urlField;
    @FXML
    private Button backButton;
    @FXML
    private Button fwdButton;
    @FXML
    private WebView web;
    @FXML
    private Button goBtn;
    @FXML
    private Button shoutbtn;
    @FXML
    private Button initialize;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pages pg = new pages();
    }    

    @FXML
    private void refresh(ActionEvent event) {
        web.getEngine().load(web.getEngine().getLocation());
    }


    @FXML
    private void back(ActionEvent event) {
        //web.getEngine().load();
    }

    @FXML
    private void forward(ActionEvent event) {
    }

    @FXML
    private void go(ActionEvent event) {
        if(urlField.getText().equals("index.html")) {
            web.getEngine().load(getClass().getResource("index.html").toExternalForm());
        } else {
        web.getEngine().load("http://" + urlField.getText());
        }
    } 

    @FXML
    private void shoutOut(ActionEvent event) {
            web.getEngine().executeScript("document.shoutOut()");
    }

    @FXML
    private void initialize(ActionEvent event) {
        web.getEngine().executeScript("initialize()");
    }
    
    
    
    
    
}
