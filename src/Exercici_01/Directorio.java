package Exercici_01;
import java.io.File;
import java.util.Arrays;
/*
  Creu una classe Java que llisti el contingut d'un directori rebut per paràmetre ordenat alfabèticament.
  PARA EJECUTARLO DESDE CONSOLA:
  * Escribir: javac Exercici01\Directorio.java
  * Escribir: java Exercici_01.Directorio
*/


public class Directorio {

    public static void main(String[] args) {
        File ruta = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo") ;
        String[]nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);
        System.out.println("Archivos: ");
        System.out.println();
        for (int i = 0; i < nombre_archivos.length; i++) {
            System.out.println(nombre_archivos[i]);

        }
    }
}