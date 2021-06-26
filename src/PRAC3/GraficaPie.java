package PRAC3;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GraficaPie {

public void Grafica(){

//definiendo grafico
    DefaultPieDataset data = new DefaultPieDataset();
    //datos del grafico
    data.setValue("Hombres",50);
    data.setValue("Mujeres",20);
    //creando el grafico
    JFreeChart graficoDeSexos = ChartFactory.createPieChart("Grafico de Sexos",data,true,true,false);
    ChartFrame ventanagraf = new ChartFrame("Grafico de Sexos",graficoDeSexos);
    ventanagraf.pack();
    ventanagraf.setVisible(true);
    ventanagraf.setLocationRelativeTo(null);


}

}
