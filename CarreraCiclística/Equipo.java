package CarreraCiclística;
import java.util.*;
/**
* Esta clase denominada Equipo modela un equipo de ciclismo
* conformado por un vector de ciclistas. La clase tiene atributos como
* el nombre del equipo, el país del equipo y el tiempo total acumulado
* del equipo
* @version 1.2/2020
*/
public class Equipo {
private String nombre; /* Atributo que define el nombre del equipo
de ciclismo */
private static double totalTiempo; /* Atributo que define el tiempo
total obtenido por el equipo */
private String país; /* Atributo que define el país al que pertenece el
equipo */
Vector listaCiclistas; // Atributo que define un vector de objetos ciclista
/**
* Constructor de la clase Equipo
* @param nombre Parámetro que define el nombre del equipo
* @param país Parámetro que define el país del equipo
*/
    public Equipo(String nombre, String país) {
    this.nombre = nombre;
    this.país = país;
    totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
    listaCiclistas = new Vector(); /* Se crea el vector de ciclistas que
    conforma el equipo */
    }
/**
* Método que devuelve el nombre del equipo
* @return El nombre del equipo
*/
    public String getNombre() {
    return nombre;
    }
/**
* Método que establece el nombre de un equipo
* @param Parámetro que especifica el nombre de un equipo
*/
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
/**
* Método que devuelve el país del equipo
* @return El país del equipo
*/
    private String getPaís() {
    return país;
    }
/**
* Método que establece el país de un equipo
* @param Parámetro que especifica el país de un equipo
*/
    private void setPaís(String país) {
    this.país = país;
    }
/**
* Método que añade un ciclista al vector de ciclistas de un equipo
*/
    void añadirCiclista(Ciclista ciclista) {
    listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
/**
* Método que muestra en pantalla los nombres de los ciclistas que
* conforman un equipo
*/
    void listarEquipo() {
    /* Se recorre el vector de ciclistas y para cada elemento se
    imprime el nombre del ciclista */
        for (int i = 0; i < listaCiclistas.size(); i++) {
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se aplica
        casting para extraer el elemento */
        System.out.println(c.getNombre());
        }
    }
/**
* Método que busca un ciclista ingresado por teclado
*/
    void buscarCiclista() {
    Scanner sc = new Scanner(System.in); /* Se solicita texto
    ingresado por teclado */
    String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector
        de ciclistas */
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
        un elemento del vector */
            if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre
            ingresado se encuentra */
            System.out.println(c.getNombre());
            }
        }
    }
/**
* Método que calcula el tiempo total de un equipo acumulando el
* tiempo obtenido por cada uno de sus ciclistas
*/
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
        Ciclista c = (Ciclista) listaCiclistas.elementAt(i); /* Se obtiene
        un elemento del vector */
        // Se acumula el tiempo del ciclista en el tiempo del equipo
        totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }
/**
* Método que muestra en pantalla los datos de un equipo
*/
    void imprimir() {
    System.out.println("Nombre del equipo = " + nombre);
    System.out.println("País = " + país);
    System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}