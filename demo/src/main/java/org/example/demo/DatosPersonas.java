package org.example.demo;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatosPersonas {

    private static ObservableList<Persona>listaPersonas = FXCollections.observableArrayList();

    public static void insertarPersona(Persona persona){

        listaPersonas.add(persona);
    }
}
