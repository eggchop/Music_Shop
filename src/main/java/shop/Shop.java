package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int countStock(){
        return stock.size();
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){
        double count = 0;
        for (ISell item : stock){
            count = count + item.calculateMarkup();

        }
        return count;
    }
}
