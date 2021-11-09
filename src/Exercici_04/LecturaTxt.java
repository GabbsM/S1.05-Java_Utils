package Exercici_04;

import java.io.FileReader;
import java.io.IOException;

/* Afegeixi la funcionalitat de llegir qualsevol fitxer txt i mostrar per consola el seu contingut.
 */
public class LecturaTxt {

    //Método para leer la información de un archivo txt
    public void lee(){
        try{
            //Creamos FileReader e indicamos donde está nuestro ardhivo.
            FileReader entrada = new FileReader("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/DonQuijote.txt");

            //Creamos una variable entero y usamos el método read.
            int c = entrada.read();

            //Creamos un bucle While y le indicamos que mientras la variable "c" no sea "-1" (el valor que muestra
           // el método read al terminar de leer el contenido), nos lo vaya mostrando en consola.
            while (c!=-1){
                c = entrada.read();
                //Realizamos un casteo para que convierta lo que hay en la variable "c" en carácteres e imprimimos el contenido.
                char letra = (char)c;
                System.out.print(letra);

            }
        }catch (IOException e){
            System.out.println("No se ha encontrado el archivo");
        }

    }

    public static void main(String[] args) {

        LecturaTxt accesoArchivo = new LecturaTxt();
        accesoArchivo.lee();
    }
}

