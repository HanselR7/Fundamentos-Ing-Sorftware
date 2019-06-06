package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import sample.Modelos.Producto;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class ControllerServicios implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML JFXButton btnCine, btnAlameda, btnFeria, btnGalex, btnComprar;
    Main m=new Main();
    LinkedList<Producto> productos=new LinkedList<>();
    int cantidad=1, pos=0;
    boolean existe=false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblCerrar.setOnMouseClicked(event ->{
            System.exit(0);
        });

        lblRegresar.setOnMouseClicked(event -> {
            ControllerTiendita controllerTiendita=new ControllerTiendita();
            m.abrirEscena1(event,"tiendita.fxml",controllerTiendita,"Ahorro Virtual");
        });

        btnComprar.setOnAction(event -> {
            String data="";
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            for (int i = 0; i < productos.size(); i++)
                data+="Producto: "+productos.get(i).getNombre()+"\n"+"Cantidad: "+productos.get(i).getCantidad()+"\nTotal: "+productos.get(i).getTotal()+"\n";
            alert.setContentText(data);
            alert.showAndWait();
        });

        btnCine.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Cine")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Cine",150,1, 150));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnAlameda.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Salida a Alameda")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Salida a Alameda",100,1, 100));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnFeria.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Salida a la Feria")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Salida a la Feria",300,1, 300));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnGalex.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Visitar Galex")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Visitar Galex",300,1, 300));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });
    }
}
