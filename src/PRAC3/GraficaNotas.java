package PRAC3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaNotas {
    public static int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;


    public void DatosNotas(){
        //recorrer el arreglo de asignaciones
        for (int i = 0; i <CargaDeDatos.ArrayAsignaciones.length ; i++) {
            //buscamos los id que coincidan con el curso
            if (Integer.parseInt(InterfazLogin.datoCodigo)==CargaDeDatos.ArrayAsignaciones[i].CodigoCursoAsig){
                //Evaluamos las notas
                if (CargaDeDatos.ArrayAsignaciones[i].Nota>0 && CargaDeDatos.ArrayAsignaciones[i].Nota<=10){n1++;}
                if (10<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=20){n2++;}
                if (20<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=30){n3++;}
                if (30<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=40){n4++;}
                if (40<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=50){n5++;}
                if (50<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=60){n6++;}
                if (60<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=70){n7++;}
                if (70<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=80){n8++;}
                if (80<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=90){n9++;}
                if (90<CargaDeDatos.ArrayAsignaciones[i].Nota && CargaDeDatos.ArrayAsignaciones[i].Nota<=100){n10++;}


            }


        }


    }

    public void GragicaNotas(){
        //datos de la grafica
        //cantidad,nombre de la categoria, nombre de la barra
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setValue(n1,"Notas","1-10");
        data.setValue(n2,"Notas","11-20");
        data.setValue(n3,"Notas","21-30");
        data.setValue(n4,"Notas","31-40");
        data.setValue(n5,"Notas","41-50");
        data.setValue(n6,"Notas","51-60");
        data.setValue(n7,"Notas","61-70");
        data.setValue(n8,"Notas","71-80");
        data.setValue(n9,"Notas","81-90");
        data.setValue(n10,"Notas","91-100");
        //creacion grafico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Grafica de Notas","Cantidad","Nota",data, PlotOrientation.VERTICAL,true,true,false);




    }


}
