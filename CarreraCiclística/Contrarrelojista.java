package CarreraCiclística;
/**
* Esta clase denominada Contrarrelojista es un tipo de Ciclista que se
* encuentra mejor adaptado a las etapas contrarreloj. Posee un nuevo
* atributo: su velocidad máxima
* @version 1.2/2020
*/
public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMáxima;
    /**
    * Constructor de la clase Escalador
    * @param identificador Parámetro que define el identificador de un
    * contrarrelojista
    * @param nombre Parámetro que define el nombre de un
    * contrarrelojista
    * @param velocidadMáxima Parámetro que define la velocidad
    * máxima de un contrarrelojista
    */
    public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
    super(identificador, nombre);
    this.velocidadMáxima = velocidadMáxima;
    }
    /**
    * Método que devuelve la velocidad máxima de un contrarrelojista
    * @return La velocidad máxima de un contrarrelojista
    */
    protected double getVelocidadMáxima() {
    return velocidadMáxima;
    }
    /**
    * Método que establece la velocidad máxima de un contrarrelojista
    * @param Parámetro que especifica la velocidad máxima de un
    * contrarrelojista
    */
    protected void setVelocidadMáxima(double velocidadMáxima) {
    this.velocidadMáxima = velocidadMáxima;
    }
    /**
    * Método que muestra en pantalla los datos de un contrarrelojista
    */
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " + velocidadMáxima);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un constrarrelojista”
    */
    protected String imprimirTipo() {
    return "Es un constrarrelojista";
    }
}