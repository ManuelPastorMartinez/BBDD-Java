package org.example.demo;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class HelloController {

    public TableView<Estudiante> estudiantesTableView;
    public TableColumn<Estudiante,Integer> niaTableColumn;
    public TableColumn<Estudiante,String> nombreTableColumn;
    public TableColumn<Estudiante,LocalDate> fechaNacimientoTableColumn;
    public Label TextoLabel;
    public TextField niaTextField;
    public TextField nameTextField;
    public DatePicker fechaPicker;
    public Button insertarButtonId;
    public Button guardarButtonId;

    @FXML
    public void initialize(){

        niaTableColumn.setCellValueFactory(datos-> new SimpleIntegerProperty(datos.getValue().getNia()).asObject());
        nombreTableColumn.setCellValueFactory(datos-> new SimpleStringProperty(datos.getValue().getNombre()));
        fechaNacimientoTableColumn.setCellValueFactory(datos-> new ReadOnlyObjectWrapper<>(datos.getValue().getFecha_nacimiento()));

        //estudiantesTableView.setItems();
    }

    public void editarButton() {

    }

    public void borrarButton() {

    }

    public void insertarButton() {
        Integer nia = Integer.parseInt(niaTableColumn.getText());
        String nombre = nombreTableColumn.getText();
        LocalDate fecha = fechaPicker.getValue();

        Estudiante estudiante = new Estudiante(nia,nombre,fecha);
        DatosPersonas.insertarEstudiante(estudiante);
        niaTextField.clear();
        nameTextField.clear();
    }

    public void guardarButton() {

    }
}
