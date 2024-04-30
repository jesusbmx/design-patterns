package patrones.estructurales.composite;

/**
 * Leaf - Clase que representa los archivos en el sistema de archivos.
 * 
 * @author Jesus
 */
public class File extends FileSystemElement {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}