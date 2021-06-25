package PRAC3;
import InterfazGrafica.InterfazLogin;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        CargaDeDatos uwu = new CargaDeDatos();
        uwu.CargaAsignaciones();
        uwu.CargaAlumnos();
        uwu.CargaCursos();
        //Espacio de la interfaz de inicio de sesión

        InterfazLogin inter = new InterfazLogin();
        inter.setVisible(true);

    }
}
