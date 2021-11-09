package Pruebas;
import java.io.*;

public class PruebasFile {
    public static void main(String[] args) {

        File ruta = new File("C:" + File.separator + "gmore" + File.separator + "OneDrive" + File.separator + "Escritorio" + File.separator + "Carpeta_Ejemplo" + File.separator + "Nuevo_Directorio");
        ruta.mkdir();

        System.out.println(ruta.getAbsolutePath());

        String[]nombre_archivos = ruta.list();
        System.out.println("Archivos: ");
        for (int i = 0; i <nombre_archivos.length ; i++) {
            System.out.println(nombre_archivos[i]);
            File f = new File(ruta.getAbsolutePath(),nombre_archivos[i]);
            if(f.isDirectory()){
                String[] archivos_subcarpeta = f.list();
                for (int j = 0; j < archivos_subcarpeta.length ; j++) {
                    System.out.println(archivos_subcarpeta[j] + " (D)");

                    }
           }else {
                System.out.println(" (F)");
            }
            }

        }


    }

