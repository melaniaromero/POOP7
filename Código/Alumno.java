package poop7_1;
/**
 * Esta es la subclase Alumno que hereda de superclase Persona
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Alumno extends Persona{
    private int numCuenta;
    private String semestre;
    private boolean apro;
    /**
     * Constructor que recibe cinco parametros
     * @param nombre Es el nombre del alumno, es de tipo String y hereda de persona
     * @param edad Es la edad del alumno, es de tipo entero y hereda de persona
     * @param sexo Es el sexo del alumno, es de tipo String y hereda de persona
     * @param numCuenta Es el numero de cuenta del alumno, es de tipo entero.
     * @param semestre Es el semestre del alumno, es de tipo String
     */
    public Alumno(String nombre, int edad, String sexo, int numCuenta, String semestre){
        super(nombre,edad,sexo);
        this.numCuenta = numCuenta;
        this.semestre = semestre;
    }
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Metodo que recibe un parametro
     * @param prom es el promedio del alumno de tipo entero
     * @return apro de tipo boolean
     */
    public boolean promedio(int prom){
        if(prom>=6){
            return apro=true;
        }
        return apro;
    }
    /**
     * 
     * @return el objeto en tipo String 
     */
    @Override
    public String toString() {
        return "Alumno{" + "numCuenta=" + numCuenta + ", semestre=" + semestre + ", aprobado=" + apro + '}';
    }
    
}
    
