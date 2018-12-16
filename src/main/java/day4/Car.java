package day4;

import java.math.BigDecimal;

public class Car {
    private String model;
    private String colour;
    private int hp;
    private String manufacturer;
    private String vin;
    private BigDecimal basePrise;
    private int doorNumber;
    private CarOption[] options;


    public BigDecimal summaryPrice() {

        BigDecimal result = basePrise;
        if (options == null) {
            return result;
        }
        for (int i = 0; i < options.length; i++) {

            result = result.add(options[i].getOptionPrice());
        }
        return result==null?BigDecimal.ZERO:result;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;                   // this bo to zmienna z klasy, a nie do metody
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public BigDecimal getBasePrise() {
        return basePrise;
    }

    public void setBasePrise(BigDecimal basePrise) {
        this.basePrise = basePrise;
    }

    public CarOption[] getOptions() {
        return options;

    }

    public void setOptions(CarOption[] options) {
        this.options = options;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {

        return manufacturer + " " + summaryPrice();

    }
}
