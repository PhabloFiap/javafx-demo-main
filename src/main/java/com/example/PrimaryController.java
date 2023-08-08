package com.example;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML Label txtNumero1;
    @FXML TextField txtNumero2;
    @FXML Label lblResultado;
    Random numeroRandom = new Random();
   public void somar(){
    var numero1 = numeroRandom.nextInt(4);
    var numero2 = Integer.parseInt( txtNumero2.getText());
       
   var resultado = numero1 == numero2;

    lblResultado.setText(String.valueOf (resultado));
   }
}
