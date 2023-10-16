package CarreraCiclística;
/**
* Esta clase abstracta denominada Ciclista posee como atributos un
* identificador, un nombre y un tiempo acumulado en una carrera
* ciclística.
* @version 1.2/2020
*/
public abstract class Ciclista {
    private int identificador; /* Atributo que define el identificador de
    un ciclista */
    private String nombre; // Atributo que define el nombre del ciclista
    private int tiempoAcumulado = 0; /* Atributo que define el tiempo
    acumulado de un ciclista */
    /**
    * Constructor de la clase Ciclista
    * @param identificador Parámetro que define el identificador de un
    * ciclista
    * @param nombre Parámetro que define el nombre completo de un
    * ciclista
    */
    public Ciclista(int identificador, String nombre) {
    this.identificador = identificador;
    this.nombre = nombre;
    }
    /**
    * Método abstracto que muestra en pantalla el tipo específico de un
    * ciclista
    *@return Tipo de ciclista
    */
    abstract String imprimirTipo();
    /**
    * Método que devuelve el identificador de un ciclista
    * @return El identificador de un ciclista
    */
    protected int getIdentificador() {
    return identificador;
    }
    /**
    * Método que establece el identificador de un ciclista
    * @param Parámetro que especifica el identificador de un ciclista
    */
    protected void setIdentificador() {
    this.identificador = identificador;
    }
    /**
    * Método que devuelve el nombre de un ciclista
    * @return El nombre de un ciclista
    */
    protected String getNombre() {
    return nombre;
    }
    /**
    * Método que establece el nombre de un ciclista
    * @param Parámetro que especifica el nombre de un ciclista
    */
    protected void setNombre(String nombre) {
    this.nombre = nombre;
    }
    /**
    * Método que devuelve el puesto que ocupa un ciclista en la
    * posición general de la competencia
    * @return El puesto del ciclista en la posición general
    */
    protected int getPosiciónGeneral(int posiciónGeneral) {
    return posiciónGeneral;
    }
    /**
    * Método que establece el puesto que ocupa un ciclista en la
    * posición general
    * @param Parámetro que especifica el puesto que ocupa un ciclista
    * en la posición general
    */
    protected void setPosiciónGeneral(int posiciónGeneral) {
    posiciónGeneral = posiciónGeneral;
    }
    /**
    * Método que devuelve el tiempo acumulado de un ciclista en una
    * competencia
    * @return El tiempo acumulado de un ciclista en una competencia
    */
    protected int getTiempoAcumulado() {
    return tiempoAcumulado;
    }
    /**
    * Método que establece el tiempo acumulado por un ciclista
    * @param Parámetro que especifica el tiempo acumulado por un ciclista
    */
    protected void setTiempoAcumulado(int tiempoAcumulado) {
    this.tiempoAcumulado = tiempoAcumulado;
    }
    /**
    * Método muestra en pantalla los datos de un ciclista
    */
    protected void imprimir() {
    System.out.println("Identificador = " + identificador);
    System.out.println("Nombre = " + nombre);
    System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}