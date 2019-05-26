package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTiendita implements Initializable {
    @FXML JFXButton btnBebidas, btnJuguetes, btnUtiles, btnAlimentos, btnServicios, btnDulces;
    @FXML ImageView lblCerrar, lblRegresar;


    Main m=new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblCerrar.setOnMouseClicked(event ->{
            System.exit(0);
        });

        lblRegresar.setOnMouseClicked(event -> {
            m.primaryStage.show();
            ((Stage) (((ImageView) event.getSource()).getScene().getWindow())).hide();
        });

        btnBebidas.setOnAction(event -> {
            ControllerBebidas controllerBebidas=new ControllerBebidas();
            m.abrirEscena(event, "bebidas.fxml", controllerBebidas, "Bebidas");
        });

        btnJuguetes.setOnAction(event -> {
            ControllerJuguetes controllerJuguetes=new ControllerJuguetes();
            m.abrirEscena(event,"juguetes.fxml", controllerJuguetes, "Jueguetes");
        });

        btnUtiles.setOnAction(event -> {
            ControllerUtiles controllerUtiles=new ControllerUtiles();
            m.abrirEscena(event,"utiles.fxml",controllerUtiles,"Útiles Escolares");
        });

        btnDulces.setOnAction(event -> {
            ControllerDulces controllerDulces=new ControllerDulces();
            m.abrirEscena(event,"dulces.fxml",controllerDulces,"Dulces y golosinas");
        });

        btnAlimentos.setOnAction(event -> {
            ControllerAlimentos controllerAlimentos=new ControllerAlimentos();
            m.abrirEscena(event,"alimentos.fxml",controllerAlimentos,"Alimentos saludables");
        });

        btnServicios.setOnAction(event -> {
            ControllerServicios controllerServicios=new ControllerServicios();
            m.abrirEscena(event,"servicios.fxml",controllerServicios,"Servicios");
        });
    }
}
