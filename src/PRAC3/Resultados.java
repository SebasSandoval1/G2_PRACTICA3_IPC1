package PRAC3;

import javax.swing.*;
import java.awt.*;

public class Resultados extends JFrame {


    public void Ventana(){

        this.setTitle("Gráfica de Notas");
        this.getContentPane().setBackground(new Color(118, 87, 168));
        this.setBounds(20,20,900,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        JLabel titu = new JLabel();
        titu.setText("Tiemop de ejecucion Quick Ascendente: "+OrdenamientoQ.tiempi);
        titu.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 20));
        titu.setBounds(10, 10, 700, 100);


        JLabel titu2 = new JLabel();
        titu2.setText("Tiemop de ejecucion Quick Descendente: "+OrdenamientoQD.tiempi);
        titu2.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 20));
        titu2.setBounds(10, 60, 700, 100);

        JLabel titu3 = new JLabel();
        titu3.setText("Tiemop de ejecucion Quick Ascendente: "+Ordenamientos.tiempi);
        titu3.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 20));
        titu3.setBounds(10, 120, 700, 100);

        JLabel titu4 = new JLabel();
        titu4.setText("Tiemop de ejecucion Quick Descendente: "+OrdenamientoD.tiempi);
        titu4.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 20));
        titu4.setBounds(10, 180, 700, 100);

        this.add(titu);
        this.add(titu2);
        this.add(titu3);
        this.add(titu4);





    }



}
