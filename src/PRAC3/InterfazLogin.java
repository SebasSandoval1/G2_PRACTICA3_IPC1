package PRAC3;




import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterfazLogin extends JFrame {

    public static String datoruta,datoCodigo;
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


        this.setTitle("Interfaz Usuario");
        this.getContentPane().setBackground(new Color(69, 133, 186));
        this.setBounds(20, 20, 1326, 616);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //etiquetas

        JLabel rutaarcAlumnos = new JLabel();
        rutaarcAlumnos.setText("Ingrese la ruta de los Archivos: ");
        rutaarcAlumnos.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        rutaarcAlumnos.setBounds(220, 80, 450, 85);



        JLabel titu = new JLabel();
        titu.setText("MENU DE APLICACION");
        titu.setFont(new Font("Bookman Old Style", Font.CENTER_BASELINE, 30));
        titu.setBounds(460, 7, 380, 85);

        JLabel graficas = new JLabel();
        graficas.setText("Generador Gráficas");
        graficas.setFont(new Font("Cooper Black", Font.PLAIN, 28));
        graficas.setBounds(500, 220, 300, 85);

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
        CargaDatosAlumnos.setBounds(990, 110, 180, 30);
        //boton para recibir el id del curso a graficar
        CargaCodigoCurso = new JButton("Aceptar");
        CargaCodigoCurso.setBounds(280, 290, 130, 30);

        //codigo del curso
        CargaCodigoCurso.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                datoCodigo = codigoCurso.getText();

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

        CargaDatosAlumnos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                datoruta = rutaAlumnosJT.getText();

                CargaDeDatos uwu = new CargaDeDatos();
                uwu.CargaAlumnos(datoruta+"\\Alumnos.csv");

                CargaDeDatos uwu2 = new CargaDeDatos();
                uwu2.CargaCursos(datoruta+"\\Cursos.csv");

                CargaDeDatos uwu3 = new CargaDeDatos();
                uwu3.CargaAsignaciones(datoruta+"\\Asignaciones.csv");

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
                //grafico de Pie sexos
                GraficaPie owo = new GraficaPie();
                owo.DatosObtenidos();
                owo.Grafica();
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
               //generar grafica de edades
            GraficaEdades owo = new GraficaEdades();
            owo.Datos();
            owo.Grafica();


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

