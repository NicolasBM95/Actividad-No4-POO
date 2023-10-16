package CarreraCiclística;
/**
* Esta clase denominada Velocista es un tipo de Ciclista caracterizado
* por poseer gran potencia y alta velocidad punta en esfuerzos cortos.
* Posee nuevos atributos como la potencia promedio y la velocidad
* promedio
* @version 1.2/2020
*/
public class Velocista extends Ciclista {
    private double potenciaPromedio; /* Atributo que define la potencia
    promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la
    velocidad promedio de un velocista */
    /**
    * Constructor de la clase Velocista
    * @param identificador Parámetro que define el identificador de un
    * velocista
    * @param nombre Parámetro que define el nombre de un velocista
    * @param potenciaPromedio Parámetro que define la potencia
    * promedio de un velocista
    * @param velocidadPromedio Parámetro que define la velocidad
    * promedio de un velocista
    */
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
    super(identificador, nombre);
    potenciaPromedio = potenciaPromedio;
    this.velocidadPromedio = velocidadPromedio;
    }
    /**
    * Método que devuelve la potencia promedio de un velocista
    * @return La potencia promedio de un velocista
    */
    protected double getPotenciaPromedio() {
    return potenciaPromedio;
    }
    /**
    * Método que establece la potencia promedio de un velocista
    * @param Parámetro que especifica la potencia promedio de un
    * velocista
    */
    protected void setPotenciaPromedio(double potenciaPromedio) {
    this.potenciaPromedio = potenciaPromedio;
    }
    /**
    * Método que devuelve la velocidad promedio de un velocista
    * @return La velocidad promedio de un velocista
    */
    protected double getvelocidadPromedio() {
    return velocidadPromedio;
    }
    /**
    * Método que establece la velocidad promedio de un velocista
    * @param Parámetro que especifica la velocidad promedio de un
    * velocista
    */
    protected void setVelocidadPromedio(double velocidadPromedio) {
    this.velocidadPromedio = velocidadPromedio;
    }
    /**
    * Método que muestra en pantalla los datos de un velocista
    */
    protected void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Potencia promedio = " + potenciaPromedio);
    System.out.println("Velocidad promedio = " + velocidadPromedio);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un velocista”
    */
    protected String imprimirTipo() {
    return "Es un velocista";
    }
}
