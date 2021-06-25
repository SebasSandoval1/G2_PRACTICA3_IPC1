package PRAC3;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Array;

public class CargaDeDatos
{
    public static Asignaciones ArrayAsignaciones[];
    public static Cursos ArrayCursos[];
    public static Alumnos ArrayAlumnos[];
    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    public static boolean isNumeric2(String cadena){
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    //para obtener el contenido de un archivo mediante su ruta
    public static String getContentOfFile(String pathname) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathname);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String content = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                content += linea + "\n";
            }
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public void CargaAlumnos() {//--------------------------------------------------------------------------------------------------------------------


        String ruta = "C:\\Users\\sebas\\Downloads\\Alumnos.csv";
        String ContenidoAlumnos = getContentOfFile(ruta);

        String[] Lineasdocumento = ContenidoAlumnos.split("\n");
        String [][] Array1 = new String[Lineasdocumento.length][5];

        for (int i = 0; i < Array1.length; i++) {
            String [] FilaSplit = Lineasdocumento[i].split(",");
            for (int j = 0; j < 5; j++) {
                Array1[i][j]= FilaSplit[j].trim();
            }
        }

       /* for (int i = 0; i < Lineasdocumento.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+Array1[i][j]);
            }
            System.out.println();
        }*/


        int contadorNulls=0;
        for (int i = 0; i < Array1.length; i++) {

            if (CargaDeDatos.isNumeric(Array1[i][0])){
                if (CargaDeDatos.isNumeric(Array1[i][1])){
                   if (Array1[i][4].equals("M")||Array1[i][4].equals("F")){

                    }
                    else{
                        contadorNulls++;
                    }
                }
                else{
                    contadorNulls++;
                }
            }
            else{
                contadorNulls++;
            }

        }

        String [][] Array2 = new String[Lineasdocumento.length-contadorNulls][5];
        for (int i = 0,k=0; k < Lineasdocumento.length-contadorNulls; i++) {

                boolean correcto = true;
                if (CargaDeDatos.isNumeric(Array1[i][0])){
                    if (CargaDeDatos.isNumeric(Array1[i][1])){
                        if (Array1[i][4].equals("M")||Array1[i][4].equals("F")){

                        }
                        else{
                            correcto =false;

                        }
                    }
                    else{
                        correcto =false;

                    }
                }
                else{
                    correcto =false;

                }
                if (correcto==true){
                    for (int j = 0; j < 5; j++) {
                        Array2[k][j] = Array1[i][j];

                    }
                    k++;

                }
            }

      /*
      for (int k = 0; k < Array2.length; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(" "+Array2[k][l]);
            }
            System.out.println();
        }
        */


        int contador=0;
        for (int i = 0; i < Array2.length; i++) {
                for (int g= i+1; g < Array2.length; g++) {

                        if (i==g){}
                        else {
                            if (Array2[i][0].equals("")) {}
                            else{
                                if (Array2[i][0].equals(Array2[g][0])) {

                                    contador++;
                                    Array2[g][0] = "";

                                }
                            }
                        }
                }


        }
        int contador2=0;
        for (int i = 0; i < Array2.length; i++) {
            for (int g= i+1; g < Array2.length; g++) {

                if (i==g){}
                else {
                    if (Array2[i][1].equals("")) {}
                    else{
                        if (Array2[i][1].equals(Array2[g][1])) {

                            contador2++;
                            Array2[g][1] = "";

                        }
                    }
                }
            }
        }

        int cont = 0;

        for (int i = 0; i < Array2.length; i++) {
                    if (Array2[i][0].equals("")) {
                    cont++;
                    } else {
                        if (Array2[i][1].equals("")) {
                            cont++;
                        }
                        else {
                        }
                    }
                }
       // System.out.println(cont);



        String Array3[][] = new String[Array2.length-cont][5];

        for (int i = 0,k=0; k < Array3.length; i++) {

            if (Array2[i][0].equals("")) {

            }
            else {
                if (Array2[i][1].equals("")) {

                }
                else {
                    for (int j = 0; j < 5; j++) {
                        Array3[k][j] = Array2[i][j];
                    }
                    k++;
                }
            }

        }

        ArrayAlumnos=new Alumnos[Array3.length];
        for (int i = 0; i < Array3.length; i++) {
            int id = Integer.parseInt(Array3[i][0]);
            int carne = Integer.parseInt(Array3[i][1]);
            String nombre=Array3[i][2];
            String fecha=Array3[i][3];
            String genero=Array3[i][4];
            ArrayAlumnos[i]=new Alumnos(id,carne,nombre,fecha,genero);
        }



/*
        for (int k = 0; k < Array3.length; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(" "+Array3[k][l]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        for (int k = 0; k < Array2.length; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(" "+Array2[k][l]);
            }
            System.out.println();
        }*/
        }

        public void CargaCursos() {//--------------------------------------------------------------------------------------------------------------------

            String ruta = "C:\\Users\\sebas\\OneDrive\\Escritorio\\Cursos.csv";
            String ContenidoAlumnos = getContentOfFile(ruta);

            String[] Lineasdocumento = ContenidoAlumnos.split("\n");
            String[][] Array1 = new String[Lineasdocumento.length][3];

            for (int i = 0; i < Array1.length; i++) {
                String[] FilaSplit = Lineasdocumento[i].split(",");
                for (int j = 0; j < 3; j++) {
                    Array1[i][j] = FilaSplit[j].trim();
                }
            }


            int contadorNulls = 0;
            for (int i = 0; i < Array1.length; i++) {

                if (CargaDeDatos.isNumeric(Array1[i][0])) {
                    if (CargaDeDatos.isNumeric(Array1[i][1])) {
                        if (CargaDeDatos.isNumeric(Array1[i][2]) || Array1[i][2].equals("")) {
                            contadorNulls++;
                        } else {

                        }
                    } else {
                        contadorNulls++;
                    }
                } else {
                    contadorNulls++;
                }

            }

            String[][] Array2 = new String[Lineasdocumento.length - contadorNulls][3];
            for (int i = 0, k = 0; k < Lineasdocumento.length - contadorNulls; i++) {

                boolean correcto = true;
                if (CargaDeDatos.isNumeric(Array1[i][0])) {
                    if (CargaDeDatos.isNumeric(Array1[i][1])) {
                        if (CargaDeDatos.isNumeric(Array1[i][2]) || Array1[i][2].equals("")) {
                            correcto = false;
                        } else {

                        }
                    } else {
                        correcto = false;

                    }
                } else {
                    correcto = false;

                }
                if (correcto == true) {
                    for (int j = 0; j < 3; j++) {
                        Array2[k][j] = Array1[i][j];

                    }
                    k++;

                }
            }



/*
            for (int k = 0; k < Array2.length; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.print(" "+Array2[k][l]);
                }
                System.out.println();
            }
*/
            int contador = 0;
            for (int i = 0; i < Array2.length; i++) {
                for (int g = i + 1; g < Array2.length; g++) {

                    if (i == g) {
                    } else {
                        if (Array2[i][0].equals("")) {
                        } else {
                            if (Array2[i][0].equals(Array2[g][0])) {

                                contador++;
                                Array2[g][0] = "";

                            }
                        }
                    }
                }
            }

            int contador2 = 0;
            for (int i = 0; i < Array2.length; i++) {
                for (int g = i + 1; g < Array2.length; g++) {

                    if (i == g) {
                    } else {
                        if (Array2[i][1].equals("")) {
                        } else {
                            if (Array2[i][1].equals(Array2[g][1])) {

                                contador2++;
                                Array2[g][1] = "";

                            }
                        }
                    }
                }
            }


            int contador3 = 0;
            for (int i = 0; i < Array2.length; i++) {
                for (int g = i + 1; g < Array2.length; g++) {

                    if (i == g) {
                    } else {
                        if (Array2[i][2].equals("")) {
                        } else {
                            if (Array2[i][2].equals(Array2[g][2])) {

                                contador2++;
                                Array2[g][2] = "";

                            }
                        }
                    }
                }
            }


            int cont = 0;

            for (int i = 0; i < Array2.length; i++) {
                if (Array2[i][0].equals("")) {
                    cont++;
                } else {
                    if (Array2[i][1].equals("")) {
                        cont++;
                    } else {
                    }
                }
            }
           // System.out.println(cont);

            String Array3[][] = new String[Array2.length - cont][3];

            for (int i = 0, k = 0; k < Array3.length; i++) {

                if (Array2[i][0].equals("")) {

                } else {
                    if (Array2[i][1].equals("")) {

                    } else {
                        if (Array2[i][2].equals("")) {

                        } else {
                            for (int j = 0; j < 3; j++) {
                                Array3[k][j] = Array2[i][j];
                            }

                            k++;
                        }
                    }

                }


            }/*
            for (int k = 0; k < Array3.length; k++) {
                for (int l = 0; l < 3; l++) {
                    System.out.print(" "+Array3[k][l]);
                }
                System.out.println();
            }*/
            ArrayCursos=new Cursos[Array3.length];
            for (int i = 0; i < Array3.length; i++) {
                int id = Integer.parseInt(Array3[i][0]);
                int codigo = Integer.parseInt(Array3[i][1]);
                String nombre=Array3[i][2];

                ArrayCursos[i]=new Cursos(id,codigo,nombre);
            }
        }

    public void CargaAsignaciones() {//--------------------------------------------------------------------------------------------------------------------
        String ruta = "C:\\Users\\sebas\\OneDrive\\Escritorio\\AsigAlumno.csv";
        String ContenidoAlumnos = getContentOfFile(ruta);

        String[] Lineasdocumento = ContenidoAlumnos.split("\n");
        String[][] Array1 = new String[Lineasdocumento.length][3];

        for (int i = 0; i < Array1.length; i++) {
            String[] FilaSplit = Lineasdocumento[i].split(",");
            for (int j = 0; j < 3; j++) {
                Array1[i][j] = FilaSplit[j].trim();
            }
        }


        int contadorNulls = 0;
        for (int i = 0; i < Array1.length; i++) {

            if (CargaDeDatos.isNumeric(Array1[i][0])) {
                if (CargaDeDatos.isNumeric(Array1[i][1])) {
                    if (CargaDeDatos.isNumeric2(Array1[i][2])) {

                    } else {
                        contadorNulls++;
                    }
                } else {
                    contadorNulls++;
                }
            } else {
                contadorNulls++;
            }

        }

        String[][] Array2 = new String[Lineasdocumento.length - contadorNulls][3];
        for (int i = 0, k = 0; k < Lineasdocumento.length - contadorNulls; i++) {

            boolean correcto = true;
            if (CargaDeDatos.isNumeric(Array1[i][0])) {
                if (CargaDeDatos.isNumeric(Array1[i][1])) {
                    if (CargaDeDatos.isNumeric2(Array1[i][2])) {

                    } else {
                        correcto = false;
                    }
                } else {
                    correcto = false;

                }
            } else {
                correcto = false;

            }
            if (correcto == true) {
                for (int j = 0; j < 3; j++) {
                    Array2[k][j] = Array1[i][j];

                }
                k++;

            }
        }
        /*for (int k = 0; k < Array2.length; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(" " + Array2[k][l]);
            }
            System.out.println();
        }*/
        for (int i = 0; i < Array2.length; i++) {
            if (Double.parseDouble(Array2[i][2])<0||Double.parseDouble(Array2[i][2])>100){
                Array2[i][2]="";
            }
        }
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2.length ; j++) {
                if (i==j){

                }
                else{
                    if (Array2[i][0].equals("")) {}
                    else{
                        if (Array2[i][0].equals(Array2[j][0])) {
                            if (Array2[i][1].equals(Array2[j][1])) {
                                Array2[j][1] = "";
                            }

                        }
                    }
                }
            }
        }

        int contadorNulls2 = 0;
        for (int i = 0; i < Array2.length; i++) {

            if (CargaDeDatos.isNumeric(Array2[i][0])) {
                if (CargaDeDatos.isNumeric(Array2[i][1])) {
                    if (CargaDeDatos.isNumeric2(Array2[i][2])) {

                    } else {
                        contadorNulls2++;
                    }
                } else {
                    contadorNulls2++;
                }
            } else {
                contadorNulls2++;
            }

        }


        String Array3[][] = new String[Array2.length - contadorNulls2][3];

        for (int i = 0, k = 0; k < Array3.length; i++) {

            if (Array2[i][0].equals("")) {

            } else {
                if (Array2[i][1].equals("")) {

                } else {
                    if (Array2[i][2].equals("")) {

                    } else {
                        for (int j = 0; j < 3; j++) {
                            Array3[k][j] = Array2[i][j];
                        }

                        k++;
                    }
                }

            }


        }/*
        for (int k = 0; k < Array3.length; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(" " + Array3[k][l]);
            }
            System.out.println();
        }*/
         ArrayAsignaciones=new Asignaciones[Array3.length];
        for (int i = 0; i < Array3.length; i++) {
            int id = Integer.parseInt(Array3[i][0]);
            int codigo = Integer.parseInt(Array3[i][1]);
            double nota=Double.parseDouble(Array3[i][2]);

            ArrayAsignaciones[i]=new Asignaciones(id,codigo,nota);
        }

    }
}


