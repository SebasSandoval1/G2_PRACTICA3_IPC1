package InterfazGrafica;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfazLogin extends JFrame {

    JButton CargaDatosGlobal;
    JButton graficaPorSexo;
    JButton graficaPorEdad;
    JButton graficaNotas; //al presionar este botón desplegará una ventana con tres opciones, luego muestra su ventana respectiva
    JTextField rutaDatosGlobal;


    public InterfazLogin(){


        this.setTitle("InterfazUsuario");
        this.getContentPane().setBackground(new Color(69, 133, 186));
        this.setBounds(20,20,1326,616);

        //etiquetas

        JLabel rutaarc = new JLabel();
        rutaarc.setText("Ingrese la ruta del archivo .CSV: ");
        rutaarc.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        rutaarc.setBounds(75,75,335,85);

        JLabel titu = new JLabel();
        titu.setText("MENU DE APLICACION");
        titu.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 30));
        titu.setBounds(460,7, 380, 85);

        JLabel graficas = new JLabel();
        graficas.setText("Gráficas");
        graficas.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        graficas.setBounds(400,185,250,85);

        JLabel elegir = new JLabel();
        elegir.setText("Elija una opción: ");
        elegir.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        elegir.setBounds(75,290,250,85);

        //cuadro de texto para ingreso de ruta de archivo .CSV

        rutaDatosGlobal = new JTextField();
        rutaDatosGlobal.setBounds(420,100,450,30);

        //botón para recibir la ruta de archivo .CSV

        CargaDatosGlobal = new JButton("Enviar Ruta");
        CargaDatosGlobal.setBounds(898,90,150,50);

        CargaDatosGlobal.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String datoruta = rutaDatosGlobal.getText();
                System.out.println(datoruta);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Enviando ruta de archivo...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //boton para crear grafica por sexo

        graficaPorSexo = new JButton("Gráfica por Sexo");
        graficaPorSexo.setBounds(250,300,150,50);

        graficaPorSexo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                InterfazGrafica1 graficauno = new InterfazGrafica1();
                graficauno.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Creando gráfica por sexo....");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //boton para crear gráfica por edad

        graficaPorEdad = new JButton("Gráfica por Edad");
        graficaPorEdad.setBounds(450,300,150,50);

        graficaPorEdad.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                InterfazGrafica2 graficados = new InterfazGrafica2();
                graficados.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Creando gráfica por edades....");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //boton para crear gráfica de ordenamiento de notas

        graficaNotas = new JButton("Gráfica de Notas");
        graficaNotas.setBounds(650,300,150,50);

        graficaNotas.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                InterfazGrafica3 graficatres = new InterfazGrafica3();
                graficatres.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Creando gráfica de notas....");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.add(CargaDatosGlobal);
        this.add(rutaDatosGlobal);
        this.add(graficaPorSexo);
        this.add(graficaPorEdad);
        this.add(graficaNotas);
        this.add(rutaarc);
        this.add(graficas);
        this.add(titu);
        this.add(elegir);
        this.setLayout(null);



    }

}