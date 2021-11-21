package ToothPasteEx1;

import ToothPasteInterfaces.ToothPasteInterface;

public class ToothPasteEx1 implements ToothPasteInterface {
    private String name;
    protected double price;
    int volume;
    String type;
    public String smell;

    public ToothPasteEx1(String name, double price, int volume, String type, String smell) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.type = type;
        this.smell = smell;
    }

    @Override
    public void printVolume() {
        System.out.println(getVolume());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
