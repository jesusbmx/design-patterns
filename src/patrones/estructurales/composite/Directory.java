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

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemElement element : elements) {
            element.print(structure + "   ");
        }
    }
    
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public void removeElement(FileSystemElement element) {
        elements.remove(element);
    }

    public FileSystemElement getChild(int index) {
        return elements.get(index);
    }
    
    public int size() {
        return elements.size();
    }
}
