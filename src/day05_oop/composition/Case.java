package day05_oop.composition;
public class Case {

    private String model;
    private String manufacturer;
    private String material;

    public Case(String model, String manufacturer, String material) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public void powerOnComputer() {
        System.out.println("Computer is powering on...");
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
