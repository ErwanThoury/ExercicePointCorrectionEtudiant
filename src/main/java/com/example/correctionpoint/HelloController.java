package com.example.correctionpoint;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private TextField txtX1;
    @FXML
    private TextField txtX2;
    @FXML
    private TextField txtY1;
    @FXML
    private TextField txtY2;
    @FXML
    private Label coord1;
    @FXML
    private TextField txtDist;
    @FXML
    private Label coord2;

    @FXML
    public void btnAfficher(Event event) {
        txtX1.setText(Double.toString(n1.getX()));
        txtX2.setText(Double.toString(n2.getX()));
        txtY1.setText(Double.toString(n1.getY()));
        txtY2.setText(Double.toString(n2.getY()));
        coord1.setText(n1.affiche());
        coord2.setText(n2.affiche());
    }

    @FXML
    public void onmajclicked() {
        n1.setX(Double.parseDouble(txtX1.getText()));
        n1.setY(Double.parseDouble(txtY1.getText()));
        n2.setX(Double.parseDouble(txtX2.getText()));
        n2.setY(Double.parseDouble(txtY2.getText()));

    }

    @FXML
    public void btnAlea(){
        n1.setX(Point.alea(-5, 6));
        n1.setY(Point.alea(-10 , 20));
        n2.setX(Point.alea(-5 , 6));
        n2.setY(Point.alea(-10 , 20));
        coord1.setText(n1.affiche());
        coord2.setText(n2.affiche());
    }
    @FXML
    public void btnDistance(Event event){
        txtDist.setText(Double.toString((n1.affiche(n2))));
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println(n1);
        System.out.println(n2);
    }

    Point n1 = new Point(Point.alea(-5,6),Point.alea(-11, 20));
    Point n2 = new Point(Point.alea(-5,6),Point.alea(-11, 20));


}