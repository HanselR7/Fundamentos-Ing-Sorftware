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

public class ControllerAlimentos implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML JFXButton btnManzana, btnMango, btnBanana, btnNaranja, btnFresa, btnComprar;

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
        
        btnManzana.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Manzana")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Manzana",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnMango.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Mango")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Mango",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnBanana.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Banana")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Banana",5,1, 5));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnNaranja.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Naranja")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Naranja",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnFresa.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Fresa")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Fresa",5,1, 5));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });
    }
}
