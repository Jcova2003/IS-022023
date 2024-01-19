package docs.diagrams.Reto_15;

public class CoffeMakerAdapter {
    public void turnOn() {
        CoffeMaker.on();
    }

    public void turnOff() {
        CoffeMaker.off();
    }

    public boolean isOn() {
        return !(CoffeMaker.isOff());
    }
}
