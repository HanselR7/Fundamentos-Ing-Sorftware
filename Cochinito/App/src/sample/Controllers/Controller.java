package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML JFXButton btnConoDinero;
    @FXML JFXButton btnSalir, btnTiendita;

    Main m=new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnConoDinero.setOnAction(event -> {
            ControllerMonedas controllerMonedas=new ControllerMonedas();
            m.abrirEscena(event, "Monedas.fxml", controllerMonedas, "Conocer Monedas");
        });

        btnSalir.setOnAction(event -> {System.exit(0);});

        btnTiendita.setOnAction(event -> {
            ControllerTiendita controllerTiendita=new ControllerTiendita();
            m.abrirEscena(event,"tiendita.fxml", controllerTiendita, "Tiendita");
        });
    }
}
