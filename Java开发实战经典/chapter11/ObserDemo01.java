package Java开发实战经典.chapter11;

import java.util.Observable;
import java.util.Observer;

class House extends Observable{
    private float price;
    public House(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}

class HousePriceObserver implements Observer {
    private String name;
    public HousePriceObserver(String name){
        this.name = name;
    }

    public void update(Observable obj, Object arg){
        if (arg instanceof Float){
            System.out.println(this.name + "观察到价格变化");
            System.out.println(((Float) arg).floatValue());
        }
    }
}
public class ObserDemo01 {
    public static void main(String[] args) {
        House h = new House(100000);
        HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者C");
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);
        System.out.println(h);
        h.setPrice(666666);
        System.out.println(h);
    }
}
