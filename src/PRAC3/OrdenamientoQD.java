package PRAC3;

public class OrdenamientoQD implements Runnable{

    static long tiempoInicio;
    static long tiempoFinal;
    static long tiempi;
    static String tiempo;


    @Override
    public void run() {


        //ESTO ES PARA TIEMPO EN NANOSEGUNDOS

        tiempoInicio = System.nanoTime();
        tiempoFinal = System.nanoTime();


        //arreglo auxiliar
        Asignaciones [] aux = new Asignaciones[1];

            for (int i = 0; i < CargaDeDatos.ArrayAsignaciones.length-1; i++) {

                for (int j = CargaDeDatos.ArrayAsignaciones.length; j >0 ; j--) {

                    if (CargaDeDatos.ArrayAsignaciones[j-1].Nota<CargaDeDatos.ArrayAsignaciones[j].Nota){

                        aux[0] =CargaDeDatos.ArrayAsignaciones[j];
                        CargaDeDatos.ArrayAsignaciones[j-1] =CargaDeDatos.ArrayAsignaciones[j];
                        CargaDeDatos.ArrayAsignaciones[j-1]=aux[0];
                    }
                    if (CargaDeDatos.ArrayAsignaciones[j+1].Nota>CargaDeDatos.ArrayAsignaciones[j].Nota){}
                    aux[0] =CargaDeDatos.ArrayAsignaciones[j];
                    CargaDeDatos.ArrayAsignaciones[j+1] =CargaDeDatos.ArrayAsignaciones[j];
                    CargaDeDatos.ArrayAsignaciones[j+1]=aux[0];
                }

            }

        //Resta del tiempo final menos el tiempo de inicio
        tiempi=tiempoFinal-tiempoInicio;
        tiempo = String.valueOf(tiempi);

        }


    }

