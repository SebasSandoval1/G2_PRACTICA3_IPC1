package PRAC3;

public class OrdenamientoD implements Runnable{


    @Override
    public void run() {
        //arreglo auxiliar
        Asignaciones [] aux = new Asignaciones[1];
        for (int i=0;i< (CargaDeDatos.ArrayAsignaciones.length-1);i++){

            for (int j =CargaDeDatos.ArrayAsignaciones.length;j>0;j--){

                if (CargaDeDatos.ArrayAsignaciones[j+1].Nota>CargaDeDatos.ArrayAsignaciones[j].Nota){

                    aux[0]=CargaDeDatos.ArrayAsignaciones[j];
                    CargaDeDatos.ArrayAsignaciones[j+1]=CargaDeDatos.ArrayAsignaciones[j];
                    CargaDeDatos.ArrayAsignaciones[j+1]=aux[0];

                }

            }

        }
    }
}
