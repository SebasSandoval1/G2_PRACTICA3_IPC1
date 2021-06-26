package PRAC3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaEdades {

    public void Grafica(){

        //datos de la grafica
        //cantidad,nombre de la categoria, nombre de la barra
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setValue(1,"edad","1-10");
        data.setValue(20,"edad","11-20");
        data.setValue(11,"edad","21-30");
        data.setValue(4,"edad","31-40");
        data.setValue(9,"edad","41-50");
        data.setValue(18,"edad","51-60");
        data.setValue(5,"edad","61-70");
        data.setValue(8,"edad","71-80");
        data.setValue(9,"edad","81-90");
        data.setValue(8,"edad","91-100");
        //creacion grafico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Grafica de Edades","Edad","Cantidad Alumnos",data, PlotOrientation.VERTICAL,true,true,false);
        ChartFrame ventanagrafbarras = new ChartFrame("Grafica de Edades Alumnos",grafico_barras);
        ventanagrafbarras.pack();
        ventanagrafbarras.setVisible(true);
        ventanagrafbarras.setLocationRelativeTo(null);



    }


}
