package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCompra implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML TableView tablaCompra;
    @FXML TableColumn Producto,Cantidad,Precio;
    Main m=new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblRegresar.setOnMouseClicked(event -> {
            ControllerTiendita controllerTiendita=new ControllerTiendita();
            m.abrirEscena1(event,"tiendita.fxml",controllerTiendita,"Ahorro Virtual");
        });
    }
}
