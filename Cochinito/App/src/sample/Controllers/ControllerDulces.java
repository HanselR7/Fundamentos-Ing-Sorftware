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

public class ControllerDulces implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML JFXButton btnPaleta, btnPika, btnMiguelito, btnSabritas, btnOreo, btnPanditas, btnHuevos, btnComprar;

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

        btnPaleta.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Paleta")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Paleta",5,1, 5));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnHuevos.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Huevito Kinder")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Huevito Kinder",20,1, 20));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnOreo.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Galletas Oreo")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Galletas Oreo",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnPika.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Pica Fresa")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Pica Fresa",2,1, 2));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnMiguelito.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Miguelito")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Miguelito",1,1, 1));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnSabritas.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Sabritas")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Sabritas",12,1, 12));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnPanditas.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Panditas")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Panditas",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });
    }
}
