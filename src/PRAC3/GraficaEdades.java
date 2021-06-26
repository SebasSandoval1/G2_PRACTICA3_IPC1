package PRAC3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaEdades {
   public static int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;

    public void Datos(){
        n1=0;
        n2=0;
        n3=0;
        n4=0;
        n5=0;
        n6=0;
        n7=0;
        n8=0;
        n9=0;
        n10=0;
        String fech;
        int anio;
        int edad;
        //recorre arreglo asignaciones
        for (int i = 0; i < CargaDeDatos.ArrayAsignaciones.length; i++) {
            //busca personas con el codigo del curso
            if (Integer.parseInt(InterfazLogin.datoCodigo)==CargaDeDatos.ArrayAsignaciones[i].CodigoCursoAsig){
                //recorre arreglo alumnos
                for (int j = 0; j <CargaDeDatos.ArrayAlumnos.length ; j++) {
                    //busqueda de alumnos con el codigo del curso
                    if (CargaDeDatos.ArrayAsignaciones[i].idAlumnoAsig==CargaDeDatos.ArrayAlumnos[j].idAlumnos){
                        //guardado de la fecha de naciemiento
                        fech=CargaDeDatos.ArrayAlumnos[j].FDNAlumnos;
                        //separacion de la fecha por dia/mes/anio
                        String [] fechita = fech.split("/");
                        //obtencion del año de nacimiento
                        anio=Integer.parseInt(fechita[2]);
                        //obtencion de la edad del alumno
                        edad= 2021-anio;
                        //separacion de edades de alumnos en el curso
                        if (edad>0 && edad<=10){n1++;}
                        if (10<edad && edad<=20){n2++;}
                        if (20<edad && edad<=30){n3++;}
                        if (30<edad && edad<=40){n4++;}
                        if (40<edad && edad<=50){n5++;}
                        if (50<edad && edad<=60){n6++;}
                        if (60<edad && edad<=70){n7++;}
                        if (70<edad && edad<=80){n8++;}
                        if (80<edad && edad<=90){n9++;}
                        if (90<edad && edad<=100){n10++;}

                    }

                }


            }


        }



    }


    public void Grafica(){

        //datos de la grafica
        //cantidad,nombre de la categoria, nombre de la barra
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setValue(n1,"edad","1-10");
        data.setValue(n2,"edad","11-20");
        data.setValue(n3,"edad","21-30");
        data.setValue(n4,"edad","31-40");
        data.setValue(n5,"edad","41-50");
        data.setValue(n6,"edad","51-60");
        data.setValue(n7,"edad","61-70");
        data.setValue(n8,"edad","71-80");
        data.setValue(n9,"edad","81-90");
        data.setValue(n10,"edad","91-100");
        //creacion grafico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Grafica de Edades","Edad","Cantidad Alumnos",data, PlotOrientation.VERTICAL,true,true,false);
        ChartFrame ventanagrafbarras = new ChartFrame("Grafica de Edades Alumnos",grafico_barras);
        ventanagrafbarras.pack();
        ventanagrafbarras.setVisible(true);
        ventanagrafbarras.setLocationRelativeTo(null);



    }


}
