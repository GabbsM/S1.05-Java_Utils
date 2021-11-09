import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Afegeixi a la classe del nivell anterior la funcionalitat de llistar un arbre de directoris
 amb el contingut de tots els seus nivells (recursivamente) de manera que s'imprimeixin en pantalla
 en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i
  la seva última data de modificació.
 */
public class Directorio2 {
    public static void main(String[] args) {

        File ruta = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo");

        String[]nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);

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