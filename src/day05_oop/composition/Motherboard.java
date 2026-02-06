package day05_oop.composition;
public class Motherboard {

    private String model;
    private String manufacturer;
    private int slotCount;
    private String operatingSystem;

    public Motherboard(String model, String manufacturer, int slotCount, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.slotCount = slotCount;
        this.operatingSystem = operatingSystem;
    }

    public void installOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        System.out.println("Operating system installed: " + operatingSystem);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSlotCount() {
        return slotCount;
    }

    public void setSlotCount(int slotCount) {
        this.slotCount = slotCount;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
