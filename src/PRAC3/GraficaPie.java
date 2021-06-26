package PRAC3;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GraficaPie {

public static int H,M;


public void DatosObtenidos(){

InterfazLogin tusa = new InterfazLogin();
CargaDeDatos tuso = new CargaDeDatos();
    //arreglo asignaciones recorrido
    H=0;
    M=0;
    for (int i = 0; i <CargaDeDatos.ArrayAsignaciones.length; i++) {
        //busqueda de personas con ese curso
        if (Integer.parseInt(InterfazLogin.datoCodigo)==CargaDeDatos.ArrayAsignaciones[i].CodigoCursoAsig){
            //busqueda de personas con el curso
            for (int j = 0; j <CargaDeDatos.ArrayAlumnos.length ; j++) {
                //personas con el curso
                if (CargaDeDatos.ArrayAsignaciones[i].idAlumnoAsig==CargaDeDatos.ArrayAlumnos[j].idAlumnos){
                    //si es hombre
                    if (CargaDeDatos.ArrayAlumnos[j].GeneroAlumnos.equals("M")){

                        H++;
                    }
                    //si es mujer
                    if(CargaDeDatos.ArrayAlumnos[j].GeneroAlumnos.equals("F")){

                        M++;
                    }

                }


            }

        }

    }


}

public void Grafica(){

//definiendo grafico
    DefaultPieDataset data = new DefaultPieDataset();
    //datos del grafico
    data.setValue("Hombres",H);
    data.setValue("Mujeres",M);
    //creando el grafico
    JFreeChart graficoDeSexos = ChartFactory.createPieChart("Grafico de Sexos",data,true,true,false);
    ChartFrame ventanagraf = new ChartFrame("Grafico de Sexos",graficoDeSexos);
    ventanagraf.pack();
    ventanagraf.setVisible(true);
    ventanagraf.setLocationRelativeTo(null);


}

}
