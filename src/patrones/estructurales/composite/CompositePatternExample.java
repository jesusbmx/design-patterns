package patrones.estructurales.composite;

/**
 * El patrón de diseño Composite es útil para tratar grupos de objetos de manera 
 * similar a como se trataría a un objeto individual. 
 * Este patrón organiza objetos en una estructura de árbol y permite a los clientes 
 * tratar objetos individuales y composiciones de objetos de manera uniforme.
 * 
 * Es es un ejemplo de Composite en Java que gestiona un sistema de archivos con 
 * directorios y archivos. En este ejemplo, tanto los archivos como los 
 * directorios se tratan como FileSystemElement.
 * 
 * Componentes del patrón Composite:
 * - Component (Componente): Interfaz o clase abstracta para los objetos en la composición.
 * - Leaf (Hoja): Representa objetos hoja en la composición que no tienen hijos.
 * - Composite: Define el comportamiento de los componentes que tienen hijos y almacena componentes hijos.
 * - Client (Cliente): Manipula objetos en la composición a través de la interfaz del Component.
 * 
 * @author Jesus
 */
public class CompositePatternExample {
    
    public static void main(String[] args) {
        Directory root = new Directory("root/");
        Directory home = new Directory("home/");
        Directory user = new Directory("user/");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("config.json");

        root.addElement(home);
        home.addElement(user);
        user.addElement(file1);
        user.addElement(file2);
        root.addElement(file3);

        root.print("");
    }
}
