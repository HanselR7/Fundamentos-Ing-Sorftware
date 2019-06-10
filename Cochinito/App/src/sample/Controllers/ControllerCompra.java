package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import sample.Modelos.Producto;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class ControllerCompra implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML TableView<Producto> tablaCompra;
    @FXML TableColumn Producto,Cantidad,Precio, Total;
    Main m=new Main();
    ObservableList<Producto> productos= FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblRegresar.setOnMouseClicked(event -> {
            ControllerTiendita controllerTiendita=new ControllerTiendita();
            m.abrirEscena1(event,"tiendita.fxml",controllerTiendita,"Ahorro Virtual");
        });
        Producto.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombre"));
        Cantidad.setCellValueFactory(new PropertyValueFactory<Producto, String>("cantidad"));
        Precio.setCellValueFactory(new PropertyValueFactory<Producto, String>("precio"));
        Total.setCellValueFactory(new PropertyValueFactory<Producto, String>("total"));
        tablaCompra.setItems(this.productos);
    }

    public ControllerCompra(LinkedList<sample.Modelos.Producto> productos){
        for (int i = 0; i < productos.size(); i++) {
            this.productos.add(productos.get(i));
        }
    }
}
