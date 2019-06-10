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

public class ControllerBebidas implements Initializable {
    @FXML ImageView lblCerrar, lblRegresar;
    @FXML JFXButton btnHersheys, btnJumex, btnYakult, btnDanonino, btnComprar;

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

            ControllerCompra controllerCompra = new ControllerCompra();
            m.abrirEscena(event,"compra.fxml",controllerCompra,"Ticket de compra");
            /*
            String data="";
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            for (int i = 0; i < productos.size(); i++)
                data+="Producto: "+productos.get(i).getNombre()+"\n"+"Cantidad: "+productos.get(i).getCantidad()+"\nTotal: "+productos.get(i).getTotal()+"\n";
            alert.setContentText(data);
            alert.showAndWait();
            int size=productos.size();
            for (int i = 0; i < size; i++)
                productos.get(i).setCantidad(0);
            for (int i = size-1; i > 0; i--)
                productos.remove(i);
        */});

        btnHersheys.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Hersheys")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Hersheys",8,1, 8));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnYakult.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Yakult")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Yakult",6,1, 6));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnDanonino.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Danonino")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Danonio",10,1, 10));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });

        btnJumex.setOnAction(event -> {
            existe=false;
            int size=productos.size();
            for (int i = 0; i < size; i++) {
                if (productos.get(i).getNombre().equals("Jugo Jumex")){
                    existe=true;
                    pos=i;
                }
            }
            if (!existe)
                productos.add(new Producto("Jugo Jumex",5,1, 5));
            else {
                cantidad=productos.get(pos).getCantidad()+1;;
                int total=productos.get(pos).getPrecio()*cantidad;
                productos.get(pos).setCantidad(cantidad);
                productos.get(pos).setTotal(total);
            }
        });
    }
}
