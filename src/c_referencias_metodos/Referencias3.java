package c_referencias_metodos;
interface I3{
    String m(String s, int i);
}
class C3{
    String saludar(String nombre, int edad) {return "Hola"+nombre + " tu edad "+edad+" años. ";}
    String m(String cad, int x){ return cad + " " + x; }
}
public class Referencias3 {
    public static void main(String[] args){
        C3 c3 = new C3();
        I3 i3 = c3::saludar;
        System.out.println(i3.m("Ivar Hjalmar Jacobson (2 de septiembre de 1939, Ystad - ), es un ingeniero sueco en Ciencias de la computación.\n" +
                "\n" +
                "Inventó el diagrama de secuencia y desarrolló los diagramas de colaboración\n. También impuso el uso de diagramas de estado de transición \npara describir los flujos de mensajes entre los componentes.\n Fue uno de los desarrolladores originales del SDL (lenguaje de especificación),\n que se convirtió en estándar en 1967.",60));
    }
}
