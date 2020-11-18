/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7_1;
/**
 * Esta es la subclase Profesor que hereda de la subclase Trabajador
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Profesor extends Trabajador {
    private String materia;
    private int grupos;
    /**
     * Constructor que recibe seis parametros
     * @param nombre Es el nombre del maestro, es de tipo String y hereda de trabajador
     * @param edad Es la edad del maestro, es de tipo entero y hereda de trabajador
     * @param sexo Es el sexo del maestro, es de tipo String y hereda de trabajador
     * @param numTrabajador Es el numero de trabajor, es de tipo entero y hereda de trabajador
     * @param sueldo Es el sueldo del director, es de tipo entero y hereda de trabajador
     * @param materia Es la materia que tiene acargo, es de tipo String
     * @param grupos Es el numero de grupos que tiene acargo, es de tipo entero
     */
    public Profesor(String nombre, int edad, String sexo, int numTrabajador, int sueldo, String materia, int grupos) {
        super(nombre, edad, sexo, numTrabajador, sueldo);
        this.grupos=grupos;
        this.materia=materia;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    /**
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Profesor{" + "materia=" + materia + ", grupos=" + grupos + '}';
    }
    /**
     * metodo excentar recibe un parametro
     * @param prom es de tipo flotante
     */
    public void excentar(float prom){
        if(prom>=8){
            System.out.println("Estas excento");
        }else{
            System.out.println("No estas excento");
        }
    }
}