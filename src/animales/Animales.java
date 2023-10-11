/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta. Generar una clase Main que realice lo siguiente:
 *
 * @author kamil
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion del objeto perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15,"Doberman");
        perro1.alimentarse();
        
         // Declaracion de otro perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10,"Chihuahua");
        perro2.alimentarse();
        
         // Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15,"Siamés");
        gato1.alimentarse();
        
         // Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25,"Fino");
        caballo1.alimentarse();
        
    }
    
}
