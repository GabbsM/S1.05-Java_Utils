package Exercici_02;

import java.io.File;
import java.util.Arrays;

public class Directorio2 {
    public static void main(String[] args) {

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


        }
    }
