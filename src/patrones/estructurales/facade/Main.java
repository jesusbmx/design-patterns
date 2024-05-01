package patrones.estructurales.facade;

/**
 * El patrón de diseño Facade proporciona una interfaz unificada a un conjunto de 
 * interfaces en un subsistema. Facade define una interfaz de nivel superior que 
 * hace que el subsistema sea más fácil de usar. 
 * 
 * Este patrón es especialmente útil para sistemas complejos con múltiples módulos 
 * o librerías, donde una interfaz simplificada puede ayudar a reducir la complejidad 
 * y mejorar la usabilidad.
 * 
 * Contexto del ejemplo:
 * Supongamos que tenemos un sistema de cine en casa que incluye varios componentes como un proyector, un amplificador, un reproductor de DVD y altavoces. Operar cada uno de estos componentes individualmente puede ser complicado y tedioso para el usuario.
 * 
 * Componentes del patrón Facade:
 * 1. Facade: La interfaz simplificada que los clientes utilizan para interactuar con el subsistema.
 * 2. Subsistema: Las clases que realizan el trabajo real detrás de la fachada.
 * 
 * @author jesus
 */
public class Main {
    
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
