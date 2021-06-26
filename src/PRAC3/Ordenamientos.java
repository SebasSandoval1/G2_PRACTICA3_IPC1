package PRAC3;

public class Ordenamientos {

    Asignaciones [] aux = new Asignaciones[1];

    public void OrdenamientoBb(){
        for (int i=0;i< (CargaDeDatos.ArrayAsignaciones.length-1);i++){

            for (int j =0;j< (CargaDeDatos.ArrayAsignaciones.length-1);j++){

                if (CargaDeDatos.ArrayAsignaciones[j].Nota>CargaDeDatos.ArrayAsignaciones[j+1].Nota){

                    aux[0]=CargaDeDatos.ArrayAsignaciones[j];
                    CargaDeDatos.ArrayAsignaciones[j]=CargaDeDatos.ArrayAsignaciones[j+1];
                    CargaDeDatos.ArrayAsignaciones[j+1]=aux[0];

                }

            }

        }


    }



}
