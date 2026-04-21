package org.example.demo;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.Date;

public class HelloController {
    public TableColumn fechaNacimientoTableColumn;
    public Button button1;
    public Button button2;
    public Label TextoLabel;
    public TextField niaLabel;
    public TextField nameLabel;
    public DatePicker fechaPicker;
    public Button button3;
    public Button button4;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TableView<Persona> datosTableView;

    @FXML
    private TableColumn<Persona,Integer> niaTableColumn;

    @FXML
    private TableColumn<Persona,String > nombreTableColumn;

    @FXML
    private TableColumn<Persona, LocalDate> fechaTableColumn;

    @FXML
    private void inicialize(){
        niaTableColumn.setCellValueFactory(datos-> new SimpleIntegerProperty(datos.getValue().getNia()).asObject());
        nombreTableColumn.setCellValueFactory(datos->new SimpleStringProperty(datos.getValue().getNombre()));
        fechaTableColumn.setCellValueFactory(data -> new ReadOnlyObjectWrapper<>(data.getValue().getFecha_nacimiento()));
    }


    public void editButton(){

    }

    public void deleteButton(){

    }

    public void insertButton(){
        Integer nia = Integer.parseInt(niaTableColumn.getText());
        String nombre = nombreTableColumn.getText();
        LocalDate fecha = fechaPicker.getValue();

        Persona persona = new Persona(nia,nombre,fecha);
        DatosPersonas.insertarPersona(persona);
        niaLabel.clear();
        nameLabel.clear();

    }

    public void keepButton(){

    }
}
