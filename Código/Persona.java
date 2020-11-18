/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7_1;
/**
 * Esta es la superclase Persona, se utiliza para heredar a las subclases
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class Persona {
    private String nombre,sexo;
    private int edad;
    /**
     * Constructor vacio
     */
    public Persona(){   
    }
    /**
     * Constructor que recibe tres parametros
     * @param nombre es el nombre de la persona, es de tipo String
     * @param edad es la edad de la persona, es de tipo entero
     * @param sexo es el sexo de la ppersona, es de tipo String
     */
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo= sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * Metodo lugar no recibe ninigun parametro
     */
    public void lugar(){
        System.out.println("Pertenece a la comunidad UNAM");
    }
    /**
     * @return el objeto en tipo String
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    
}
