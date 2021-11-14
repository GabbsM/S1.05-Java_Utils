package Exercici_03;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*
Executi l'exercici anterior guardant a un fitxer txt el resultat.

PARA EJECUTARLO DESDE CONSOLA:
  * Escribir: javac Exercici03\ArchivoTexto.java
  * Escribir: java Exercici_03.ArchivoTexto
 */
public class ArchivoTexto {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args));

        if (args.length != 2) {
            System.err.println("Necesito 2 parametros: directorio y archivo de destino");
            return;
        }
        archivos(args[0], args[1]);


    }

    public static void archivos(String directorio, String archivoDestino) {

        File ruta = new File(directorio);

        String[] nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);

        System.out.println("Archivos: ");
        for (int i = 0; i < nombre_archivos.length; i++) {
            System.out.println(nombre_archivos[i]);

            File f = new File(ruta.getAbsolutePath(), nombre_archivos[i]);
            if (f.isDirectory()) {
                String[] archivos_subcarpeta = f.list();
                try {
                    FileOutputStream archivo_txt = new FileOutputStream(archivoDestino);
                    for (int j = 0; j < archivos_subcarpeta.length ; j++) {
                        String archivoString = archivos_subcarpeta[j];
                        archivo_txt.write(archivoString.getBytes(StandardCharsets.UTF_8));
                        archivo_txt.write("\n".getBytes(StandardCharsets.UTF_8));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


//                try{
//                    int datos_nuevo_fichero[] = new int[0];
//                    FileOutputStream archivo_txt = new FileOutputStream("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/archivo.txt");
//                    for (int j = 0; j < archivos_subcarpeta.length; j++) {
//                        archivo_txt.write(datos_nuevo_fichero[j]);
//                    }
//
//                } catch (IOException e){
//                    System.out.println("No se ha podido crear el archivo");
//
//                }

            }
        }
    }
}
