package Pruebas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Fitxer_TXT {
    public static void main(String[] args) {

     //Mostrar por consola los archivos de la carpeta:

        File ruta = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo");

        String[] nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);

        System.out.println("Archivos: ");
        for (int i = 0; i < nombre_archivos.length; i++) {
            System.out.println(nombre_archivos[i]);
            File f = new File(ruta.getAbsolutePath(), nombre_archivos[i]);
            if (f.isDirectory()) {
                String[] archivos_subcarpeta = f.list();
                for (int j = 0; j < archivos_subcarpeta.length; j++) {
                    System.out.println(archivos_subcarpeta[j] + " (D)");

                }
            } else {
                System.out.println(" (F)");
            }
        }

        //Crear archivo de texto:

        File dire = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/archivos.txt");
        String archivo_destino = dire.getAbsolutePath();
        try{
            dire.createNewFile();
        }catch (IOException e){
        }

        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);

    }
}
class Escribiendo{
    public void escribir(String ruta_archivo){
        String frase = "Esta frase es un ejemplo;
        try {
            FileWriter escritura = new FileWriter(ruta_archivo);
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        }catch (IOException e){

        }
    }
}


