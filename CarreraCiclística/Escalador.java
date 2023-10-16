package CarreraCiclística;
/**
* Esta clase denominada Escalador es un tipo de Ciclista que se
* encuentra mejor adaptado y se destaca cuando las carreteras son en
* ascenso, ya sea en colinas o montañas. Posee nuevos atributos como
* su aceleración promedio y el grado de rampa que soporta
* @version 1.2/2020
*/
public class Escalador extends Ciclista {
    // Atributo que define la acelaración promedio de un escalador
    private double aceleraciónPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;
    /**
    * Constructor de la clase Escalador
    * @param identificador Parámetro que define el identificador de un
    * escalador
    * @param nombre Parámetro que define el nombre de un escalador
    * @param aceleraciónPromedio Parámetro que define la aceleración
    * promedio de un escalador
    * @param gradoRampa Parámetro que define el grado de rampa de
    * un escalador
    */
    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
    super(identificador, nombre);
    this.aceleraciónPromedio = aceleraciónPromedio;
    this.gradoRampa = gradoRampa;
    }
    /**
    * Método que devuelve la aceleración promedio de un escalador
    * @return La aceleración promedio de un escalador
    */
    protected double getAceleraciónPromedio() {
    return aceleraciónPromedio;
    }
    /**
    * Método que establece la aceleración promedio de un escalador
    * @param Parámetro que especifica la aceleración promedio de un
    * escalador
    */
    protected void setAceleraciónPromedio(double aceleraciónPromedio) {
    this.aceleraciónPromedio = aceleraciónPromedio;
    }
    /**
    * Método que devuelve el grado de rampa soportado de un escalador
    * @return El grado de rampa soportado de un escalador
    */
    protected double getGradoRampa() {
    return gradoRampa;
    }
    /**
    * Método que establece el grado de rampa soportado por un escalador
    * @param Parámetro que especifica el grado de rampa soportado
    * por un escalador
    */
    protected void setGradoRampa(double gradoRampa) {
    this.gradoRampa = gradoRampa;
    }
    /**
    * Método que muestra en pantalla los datos de un escalador
    */
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " + aceleraciónPromedio);
    System.out.println("Grado de rampa = " + gradoRampa);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un escalador”
    */
    protected String imprimirTipo() {
    return "Es un escalador";
    }
}
