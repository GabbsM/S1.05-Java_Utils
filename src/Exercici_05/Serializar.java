package Exercici_05;

import java.io.*;

/*
Mostri com serialitzar un Objecte Java a un fitxer .ser i deserialícelo després.
 */
public class Serializar {

    public static void main(String[] args) {
        //Creamos un array de tipo "Juguete" e instanciamos 3 objetos.

      Juguete[] juguetes = new Juguete[3];
      juguetes[0]= new Juguete("cochecito");
      juguetes[1]= new Juguete("carrousel");
      juguetes[2]= new Juguete("canicas");

      try{
          //Creamos flujo de datos  e indicamos dirección donde se va a crear el archivo.
          ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/juguetes.ser"));
          //Usamos el método writeObject e indicamos el nombre del array como parámetro
          escribiendo_fichero.writeObject(juguetes);
          //Cerramos flujo de datos.
          escribiendo_fichero.close();

          ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/gmore/OneDrive/Escritorio/Carpeta_Ejemplo/juguetes.ser"));

          Juguete[]juguetes_recuperados = (Juguete[])recuperando_fichero.readObject();
          recuperando_fichero.close();

         for(Juguete e:juguetes_recuperados){
             System.out.println(e);
         }

          }  catch (IOException | ClassNotFoundException e){

      }




    }
}
//Implementamos interfaz Serializable:
class Juguete implements Serializable {

    String nombre;
    public Juguete(String nombre){
        this.nombre = nombre;

    }

    public String toString(){
        return "Juguete: " + nombre;
    }
}


