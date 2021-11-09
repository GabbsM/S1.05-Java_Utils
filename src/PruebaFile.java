import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class PruebaFile {

    public static void main(String[] args) {

        File ruta = new File("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/archivos.txt");
        try{
            ruta.createNewFile();
        }catch (IOException e){

        }



    }

}