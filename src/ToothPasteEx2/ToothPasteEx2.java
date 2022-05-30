package ToothPasteEx2;

import ToothPasteInterfaces.ToothPasteInterface2;

public class ToothPasteEx2 <T, E > implements ToothPasteInterface2 {
    String name ;
    double price;
    int volume;
    String type;
    String smell;
    T o1;
    E o2;

    public ToothPasteEx2(String name, double price, int volume, String type, String smell) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.type = type;
        this.smell = smell;
    }
    public ToothPasteEx2(){}


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



    @Override
    public void printObAndType (Object o1 , Object o2){
        System.out.println("First ob type = " + o1.getClass().getName() + ", Second ob type = " + o2.getClass().getName());
        System.out.println("First element = " + o1 + ", Second element = " + o2);

    }

    public T returnAloneOb (T ob){
        return ob;
    }


}
