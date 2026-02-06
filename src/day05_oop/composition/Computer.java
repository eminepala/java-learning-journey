package day05_oop.composition;
public class Computer {

    private Monitor monitor;
    private Case pcCase;
    private Motherboard motherboard;

    public Computer(Monitor monitor, Case pcCase, Motherboard motherboard) {
        this.monitor = monitor;
        this.pcCase = pcCase;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case getCase() {
        return pcCase;
    }

    public void setCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
