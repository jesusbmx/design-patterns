package patrones.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite - Clase que representa los directorios que pueden contener tanto otros directorios como archivos.
 * 
 * @author Jesus
 */
public class Directory extends FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemElement element : elements) {
            element.print(structure + "   ");
        }
    }
}
