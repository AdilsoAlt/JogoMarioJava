package controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.File;
import java.util.Random;



public class ControllerJanelaMarioGame {

    @FXML public TableView<Mario> tableView;
    @FXML public TableColumn<Mario, String> cEstadoAnterior;
    @FXML public TableColumn<Mario, String> cEventoOcorrido;
    @FXML public TableColumn<Mario, String> cEstadoAtual;
    @FXML public TableColumn<Mario, Integer> cPontos;
    @FXML public Button btnPegarCogumelo;
    @FXML public Button btnPegarFlor;
    @FXML public Button btnPegarPena;
    @FXML public Button btnLevarDano;
    @FXML public Button btnRandom;
    @FXML public Button btnRestartGame;
    @FXML public ImageView imageView;

    Mario mario = new Mario();

    ObservableList<Mario> observableList = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        bindTableToEntity();
        fill();
    }


    public void fill(){
        tableView.setItems(observableList);
        setImage(mario);
    }


    public void bindTableToEntity() {
        cEstadoAtual.setCellValueFactory(new PropertyValueFactory<>("estadoMario"));
        cEstadoAnterior.setCellValueFactory(new PropertyValueFactory<>("estadoAnterior"));
        cEventoOcorrido.setCellValueFactory(new PropertyValueFactory<>("eventoOcorrido"));
        cPontos.setCellValueFactory(new PropertyValueFactory<>("pontos"));
    }

    public void pegarCogumelo(ActionEvent actionEvent) {
        mario.pegarCogumelo();
        observableList.add(copyMarioObject(mario));
        setImage(mario);

    }

    public void pegarFlor(ActionEvent actionEvent) {
        mario.pegarFlor();
        observableList.add(copyMarioObject(mario));
        setImage(mario);
    }

    public void levarDano(ActionEvent actionEvent) {
        mario.levarDano();
        observableList.add(copyMarioObject(mario));
        setImage(mario);
    }

    public void pegarPena(ActionEvent actionEvent) {
        mario.pegarPena();
        observableList.add(copyMarioObject(mario));
        setImage(mario);
    }


    public void eventoSurpresa(ActionEvent actionEvent) {
        int aleatorio = new Random().nextInt(4);
        System.out.println(aleatorio);
        if (aleatorio == 0){
            mario.pegarPena();
            observableList.add(copyMarioObject(mario));
            setImage(mario);
        }
        else if (aleatorio == 1){
            mario.levarDano();
            observableList.add(copyMarioObject(mario));
            setImage(mario);
        }
        else if (aleatorio == 2){
            mario.pegarCogumelo();
            observableList.add(copyMarioObject(mario));
            setImage(mario);
        }
        else if (aleatorio == 3){
            mario.pegarFlor();
            observableList.add(copyMarioObject(mario));
            setImage(mario);
        }

    }


    public void restartGame(ActionEvent actionEvent) {

        mario = new Mario();
        tableView.getItems().clear();
        System.out.println(observableList);
        setImage(mario);

    }

    public void setImage(Mario mario){

        File file;
        Image image;

        if (mario.getEstadoMario() instanceof MarioPequeno) {
            file = new File("src/mario_pequeno.jpg");
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
        else if (mario.getEstadoMario() instanceof MarioGrande) {

            file = new File("src/mario_grande.jpg");
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
        else if (mario.getEstadoMario() instanceof MarioCapa) {
            file = new File("src/mario_capa.jpg");
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
        else if (mario.getEstadoMario() instanceof MarioFogo) {
            file = new File("src/mario_fogo.jpg");
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
        else if (mario.getEstadoMario() instanceof MarioMorto) {
            file = new File("src/gameover.jpg");
            image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }

    }

    public Mario copyMarioObject (Mario mario){
        Mario m = new Mario();
        m.setEstadoAnterior(mario.getEstadoAnterior());
        m.setPontos(mario.getPontos());
        m.setEventoOcorrido(mario.getEventoOcorrido());
        m.setEstadoMario(mario.getEstadoMario());
        return m;
    }

}
