package instrument;

import interfaces.IPlay;
import interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int keys;

    public Piano(double buyPrice, double sellPrice, String name, int keys) {
        super(buyPrice, sellPrice, name);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "The piano is being played!";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
