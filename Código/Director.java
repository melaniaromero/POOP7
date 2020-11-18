/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7_1;
    /**
    * Esta es la subclase Director que hereda de la subclase Empleado
    * @author Dafne_Sandoval
    * @author Melania_Romero
     */
    public class Director extends Trabajador{
    private String facAcargo;
    /**
     * Constructor que recibe seis parametros
     * @param nombre Es el nombre del director, es de tipo String y hereda de trabajador
     * @param edad Es la edad del director, es de tipo entero y hereda de trabajador
     * @param sexo Es el sexo del director, es de tipo String y hereda de trabajador
     * @param numTrabajador Es el numero de trabajor, es de tipo entero y hereda de trabajador
     * @param sueldo Es el sueldo del director, es de tipo entero y hereda de trabajador
     * @param facAcargo Es la facultad que tiene acargo, es de tipo String
     */
    public Director(String nombre, int edad, String sexo, int numTrabajador, int sueldo,String facAcargo) {
        super(nombre, edad, sexo, numTrabajador, sueldo);
        this.facAcargo=facAcargo;
    }
    
    public String getFacAcargo() {
        return facAcargo;
    }
    
    public void setFacAcargo(String facAcargo) {
        this.facAcargo = facAcargo;
    }
    /**
     * 
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Director{" + "facAcargo=" + facAcargo + '}';
    }
    /**
     * Metodo que recibe un parametro 
     * @param numAlumn es el numero de alumnos aprobados, es de tipo entero
     */
    public void ascender(int numAlumn){
        if(numAlumn>=40){
            System.out.println("Has sido ascendido por tener un mayor numero de alumnos aprobados");
        }
        if(numAlumn<40){
            System.out.println("No has sido ascendido");
        }
    }
}