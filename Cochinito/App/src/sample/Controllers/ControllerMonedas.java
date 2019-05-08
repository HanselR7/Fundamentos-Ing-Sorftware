package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMonedas implements Initializable {
    @FXML JFXButton btnRegresar, btnSalir, btnMonedas, btnBilletes;
    @FXML ImageView imv1, imv2, imv3, imv4;

    Main m=new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnRegresar.setOnAction(event -> {
            m.primaryStage.show();
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).hide();
        });
        btnSalir.setOnAction(event -> {
            System.exit(0);
        });
        btnMonedas.setOnAction(event -> {
            monedas();
        });
        btnBilletes.setOnAction(event -> {
            billetes();
        });
    }

    public void monedas(){
        try {
            Image img=new Image("/sample/Imagenes/Dinero/1.png");
            imv1.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/2.png");
            imv2.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/5.png");
            imv3.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/10.png");
            imv4.setImage(img);
        }catch (Exception e){
        }
    }
    public void billetes(){
        try {
            Image img=new Image("/sample/Imagenes/Dinero/20.jpg");
            imv1.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/50.jpg");
            imv2.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/100.jpg");
            imv3.setImage(img);
            img=new Image("/sample/Imagenes/Dinero/200.jpg");
            imv4.setImage(img);
        }catch (Exception e){
        }
    }
}
