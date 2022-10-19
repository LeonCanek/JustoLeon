package c_referencias_metodos;

class Persona{
    private String nombre;
    private String apellidos;
    Persona(){}
    Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        }
        public String toString(){return nombre + " " + apellidos;}
        }
interface FabricaPersonas{
    Persona crear(String nombre, String apellidos);
}
public class Referencias4 {
    public static void main(String[] args){
        FabricaPersonas p = Persona::new;
        System.out.println(p.crear("Alan","Turing"));


    }
}
