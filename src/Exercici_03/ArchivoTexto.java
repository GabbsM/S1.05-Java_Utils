package Exercici_03;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ArchivoTexto {
    public static void main(String[] args) {

        archivos();


    }

    public static void archivos() {

        File ruta = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo");

        String[] nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);

        System.out.println("Archivos: ");
        for (int i = 0; i < nombre_archivos.length; i++) {
            System.out.println(nombre_archivos[i]);

            File f = new File(ruta.getAbsolutePath(), nombre_archivos[i]);
            if (f.isDirectory()) {
                String[] archivos_subcarpeta = f.list();

                try{
                    int datos_nuevo_fichero[] = new int[0];
                    FileOutputStream archivo_txt = new FileOutputStream("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/archivo.txt");
                    for (int j = 0; j < archivos_subcarpeta.length; j++) {
                        archivo_txt.write(datos_nuevo_fichero[j]);
                    }

                } catch (IOException e){
                    System.out.println("No se ha podido crear el archivo");

                }

            }
        }
    }
}
