package PRAC3;




import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfazLogin extends JFrame {

    public static String datoruta;
    public static String datorutaAlumno;
    public static String datorutaCurso;
    public static String datorutaAsig;


    JButton CargaDatosAlumnos;
    JButton CargaCodigoCurso;
    JButton CargaDatosCursos;
    JButton CargaDatosAsignaciones;
    JButton graficaPorSexo;
    JButton graficaPorEdad;
    JButton graficaNotas; //al presionar este botón desplegará una ventana con tres opciones, luego muestra su ventana respectiva
    JTextField rutaAlumnosJT;
    JTextField codigoCurso;
    JTextField rutaCursosJT;
    JTextField rutaAsignacionesJT;

    public InterfazLogin() {


        this.setTitle("InterfazUsuario");
        this.getContentPane().setBackground(new Color(69, 133, 186));
        this.setBounds(20, 20, 1326, 616);

        //etiquetas

        JLabel rutaarcAlumnos = new JLabel();
        rutaarcAlumnos.setText("Ingrese la ruta de loa Archivos: ");
        rutaarcAlumnos.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        rutaarcAlumnos.setBounds(75, 75, 450, 85);



        JLabel titu = new JLabel();
        titu.setText("MENU DE APLICACION");
        titu.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 30));
        titu.setBounds(460, 7, 380, 85);

        JLabel graficas = new JLabel();
        graficas.setText("Generador Gráficas");
        graficas.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        graficas.setBounds(500, 220, 250, 85);

        JLabel elegir = new JLabel();
        elegir.setText("Elija una opción: ");
        elegir.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        elegir.setBounds(75, 330, 250, 85);

        JLabel CursoCodigo = new JLabel();
        CursoCodigo.setText("Codigo de Curso:");
        CursoCodigo.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        CursoCodigo.setBounds(75, 260, 250, 85);

        //cuadro de texto para ingreso de ruta de archivo .CSV

        rutaAlumnosJT = new JTextField();
        rutaAlumnosJT.setBounds(530, 110, 450, 30);

        codigoCurso = new JTextField();
        codigoCurso.setBounds(430, 290, 450, 30);

        //botón para recibir la ruta de archivo .CSV

        CargaDatosAlumnos = new JButton("Enviar Ruta Alumnos");
        CargaDatosAlumnos.setBounds(980, 100, 180, 50);

        CargaCodigoCurso = new JButton("Aceptar");
        CargaCodigoCurso.setBounds(280, 280, 150, 50);


        CargaDatosAlumnos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                datoruta = rutaAlumnosJT.getText();
                System.out.println(datoruta+"\\Alumnos.csv");
                CargaDeDatos uwu = new CargaDeDatos();
                uwu.CargaAlumnos(datoruta);

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
        graficaPorSexo.setBounds(280, 350, 150, 50);

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
        graficaPorEdad.setBounds(480, 350, 150, 50);

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
        graficaNotas.setBounds(680, 350, 150, 50);

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

        this.add(CargaDatosAlumnos);
        this.add(CargaCodigoCurso);
        this.add(rutaAlumnosJT);


        this.add(graficaPorSexo);
        this.add(graficaPorEdad);
        this.add(graficaNotas);
        this.add(rutaarcAlumnos);

        this.add(graficas);
        this.add(titu);
        this.add(elegir);
        this.add(CursoCodigo);
        this.add(codigoCurso);

        this.setLayout(null);

    }
    public void TextoJT(){
        datorutaAlumno=rutaAlumnosJT.getText();
        datorutaCurso=rutaAlumnosJT.getText();
        datorutaAsig=rutaAlumnosJT.getText();

    }
    }

