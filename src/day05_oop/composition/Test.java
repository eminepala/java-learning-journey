package day05_oop.composition;
public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);

        Case pcCase = new Case("Shadow Blade", "Shadow", "Tempered Glass");

        Motherboard motherboard = new Motherboard("B250-PRO", "Asus", 10, "Windows 10");

        Computer pc = new Computer(monitor, pcCase, motherboard);

        pc.getCase().powerOnComputer();
        pc.getMonitor().turnOffMonitor();
        pc.getMotherboard().installOperatingSystem("Ubuntu 16.04");
    }
}
