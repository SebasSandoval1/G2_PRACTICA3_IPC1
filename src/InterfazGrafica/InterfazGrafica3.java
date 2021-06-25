package InterfazGrafica;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfazGrafica3 extends JFrame {

    public InterfazGrafica3(){

        this.setTitle("Gráfica de Notas");
        this.getContentPane().setBackground(new Color(159, 161, 41));
        this.setBounds(20,20,1320,610);

        //espacio para pedirle al usuario el tipo de ordenamiento que quiere

        JLabel tituOrden = new JLabel();
        tituOrden.setText("ORDENAMIENTO GRAFICA DE NOTAS");
        tituOrden.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 30));
        tituOrden.setBounds(350,7, 800, 85);

        JLabel tipo = new JLabel();
        tipo.setText("Tipo");
        tipo.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        tipo.setBounds(200,185,250,85);

        JLabel Velo = new JLabel();
        Velo.setText("Velocidad");
        Velo.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        Velo.setBounds(415,185,250,85);

        JLabel Algoritmo = new JLabel();
        Algoritmo.setText("Algoritmo");
        Algoritmo.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        Algoritmo.setBounds(675,185,250,85);

        //tipo de ordenamiento descendente o ascendente

        JComboBox opciones = new JComboBox();
        opciones.addItem("Elija...");
        opciones.addItem("Ascendente");
        opciones.addItem("Descendente");
        opciones.setBounds(160,300,170,40);
        opciones.setFont(new Font("Eras Medium ITC", Font.PLAIN, 20));

        opciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OP = opciones.getSelectedItem().toString();
                System.out.println(OP);

                if (OP.equals("Ascendente")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Ascendente...");

                }

                if (OP.equals("Descendente")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Descendente...");

                }
            }
        });

        //combobox para opciones de velocidad

        JComboBox opcVelocity = new JComboBox();
        opcVelocity.addItem("Elija...");
        opcVelocity.addItem("Baja");
        opcVelocity.addItem("Media");
        opcVelocity.addItem("Alta");
        opcVelocity.setBounds(400,300,170,40);
        opcVelocity.setFont(new Font("Eras Medium ITC", Font.PLAIN, 20));

        opcVelocity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OPE = opcVelocity.getSelectedItem().toString();
                System.out.println(OPE);

                if (OPE.equals("Baja")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Ascendente...");

                }

                if (OPE.equals("Media")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Descendente...");

                }

                if (OPE.equals("Alta")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Descendente...");

                }
            }
        });

        //combobox para opciones de algoritmo

        JComboBox opcAlgoritmo = new JComboBox();
        opcAlgoritmo.addItem("Elija...");
        opcAlgoritmo.addItem("Bubble");
        opcAlgoritmo.addItem("Quick");
        opcAlgoritmo.setBounds(669,300,170,40);
        opcAlgoritmo.setFont(new Font("Eras Medium ITC", Font.PLAIN, 20));

        opcAlgoritmo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String OPEC = opciones.getSelectedItem().toString();
                System.out.println(OPEC);

                if (OPEC.equals("Bubble")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Ascendente...");

                }

                if (OPEC.equals("Quick")){

                    //espacio para que almacene la opcion deseada

                    System.out.println("Orden Descendente...");

                }
            }
        });

        JLabel ascendent = new JLabel();
        ascendent.setText("Seleccione su tipo de ordenamiento: ");
        ascendent.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        ascendent.setBounds(75,75,450,85);


        //para ser visualizado en pantalla

        this.add(tituOrden);
        this.add(Algoritmo);
        this.add(Velo);
        this.add(ascendent);
        this.add(tipo);
        this.add(opciones);
        this.add(opcVelocity);
        this.add(opcAlgoritmo);
        this.setLayout(null);

    }

}