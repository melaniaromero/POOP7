package poop7_1;

/**
 * Esta es la subclase Trabajador que hereda de superclase Persona
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Trabajador extends Persona {
    private int numTrabajador, sueldo;
    /**
     * Constructor que recibe cinco parametros
     * @param nombre Es el nombre del trabajador, es de tipo String y hereda de persona
     * @param edad Es la edad del trabajador, es de tipo entero y hereda de persona
     * @param sexo Es el sexo del trabajador, es de tipo String y hereda de persona
     * @param numTrabajador Es el numero de cuenta del trabajador, es de tipo entero.
     * @param sueldo Es el sueldo del trabajador, es de tipo entero
     */
    public Trabajador(String nombre, int edad, String sexo, int numTrabajador, int sueldo){
        super(nombre,edad,sexo);
        this.numTrabajador=numTrabajador;
        this.sueldo = sueldo;
    }
    
    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Trabajador{" + "numTrabajador=" + numTrabajador + ", sueldo aumentado=" + sueldo + '}';
    }
    /**
     * metodo aumentarSueldo recibe un parametro
     * @param porcent esde tipo entero
     * @return sueldo
     */
    public int aumentarSueldo(int porcent){
        sueldo +=(int)(sueldo*porcent/100);
        return sueldo;
    }
}