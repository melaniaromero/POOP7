package poop7_1;
/**
 * Esta es la clase POOP7 que se utilizo para la creacion de nuestros objetos Persona, Alumno, Trabajador, Director y Profesor
 * @author Dafne_Sandoval
 * @author Melania_Romero
 */
public class POOP7_1 {
    public static void main(String[] args) {
        Persona person = new Persona("Cesar", 20, "Masculino");
        System.out.println(person);
        person.lugar();
        
        System.out.println("***************************************************");
        Alumno alumn = new Alumno("Cristian", 22, "Masculino", 317212456,"2020-1");
        System.out.println("Nombre del alumno: "+ alumn.getNombre());
        System.out.println("Edad del alumno: "+ alumn.getEdad());
        System.out.println("Sexo del alumno: "+ alumn.getSexo());
        System.out.println("Numero de cuenta: "+alumn.getNumCuenta());
        System.out.println("Semestre que actualmente esta cursando: "+alumn.getSemestre());
        System.out.println("El alumno tiene promedio aprobatorio?: "+alumn.promedio(5));
        
        System.out.println("**************************************************************");
        Trabajador trabaja = new Trabajador("Alan", 28, "Masculino", 25, 7000);
        System.out.println("Nombre del trabajador: "+ trabaja.getNombre());
        System.out.println("Edad del trabajador: "+ trabaja.getEdad());
        System.out.println("Sexo del trabajador: "+ trabaja.getSexo());
        System.out.println("Sueldo: "+ trabaja.getSueldo());
        trabaja.aumentarSueldo(20);
        System.out.println(trabaja);
        
        System.out.println("**************************************************************");
        Director direc = new Director("Jimena", 45, "Femenino", 1, 9000,"Facultad de Ingenieria");
        System.out.println("Nombre del director: "+ direc.getNombre());
        System.out.println("Edad del director: "+ direc.getEdad());
        System.out.println("Sexo del director: "+ direc.getSexo());
        System.out.println("Numero de trabajador: "+direc.getNumTrabajador());
        System.out.println("Sueldo: "+ direc.getSueldo());
        System.out.println(direc);
        direc.ascender(41);
        
        System.out.println("***************************************************************");
        Profesor profe = new Profesor("Lizbeth", 35, "Femenino", 15, 8000, "Cultura", 4);
        System.out.println("Nombre del profesor: "+ profe.getNombre());
        System.out.println("Edad del profesor: "+ profe.getEdad());
        System.out.println("Sexo del profesor: "+ profe.getSexo());
        System.out.println("Numero de trabajador: "+profe.getNumTrabajador());
        System.out.println(profe);
        profe.excentar(8);
        
    }
    
}
