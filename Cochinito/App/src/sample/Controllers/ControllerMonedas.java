package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMonedas implements Initializable {
    @FXML JFXButton btnRegresar, btnSalir, btnMonedas, btnBilletes,Moneda1,Moneda2,Moneda5,Moneda10,Billete20,Billete50,Billete100,Billete200;
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
            Moneda1.setVisible(true);
            Moneda2.setVisible(true);
            Moneda5.setVisible(true);
            Moneda10.setVisible(true);
            Billete20.setVisible(false);
            Billete50.setVisible(false);
            Billete100.setVisible(false);
            Billete200.setVisible(false);
        });
        btnBilletes.setOnAction(event -> {
            billetes();
            Moneda1.setVisible(false);
            Moneda2.setVisible(false);
            Moneda5.setVisible(false);
            Moneda10.setVisible(false);
            Billete20.setVisible(true);
            Billete50.setVisible(true);
            Billete100.setVisible(true);
            Billete200.setVisible(true);
        });

        Moneda1.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\1peso.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Moneda2.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\2pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Moneda5.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\5pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Moneda10.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\10pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Billete20.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\20pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Billete50.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\50pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Billete100.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\100pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
        });

        Billete200.setOnAction(event -> {
            File f = new File("C:\\Users\\hanse\\Documents\\Hansel\\Escuela\\ITC\\Semestre 5\\Fundamentos de ingenieria de software\\Repositorios\\Fundamentos-Ing-Sorftware\\Cochinito\\App\\src\\sample\\Sonido\\200pesos.mp3");
            URI u = f.toURI();
            AudioClip sonido = new AudioClip(""+u);
            sonido.play();
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
