package patrones.estructurales.facade;

/**
 * 2. Facade Class - Proporciona métodos simples para operar todo el sistema.
 * 
 * @author jesus
 */
class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private Lights lights;

    HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, Lights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    public HomeTheaterFacade() {
        this(new Amplifier(), new DvdPlayer(), new Projector(), new Lights());
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        projector.on();
        projector.setInput(dvd);
    }

    void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        dvd.off();
        amp.off();
        lights.dim(100);
    }
}

