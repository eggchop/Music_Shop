package instrument;

import interfaces.IPlay;
import interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;

    public Guitar(double buyPrice, double sellPrice, String name, int strings) {
        super(buyPrice, sellPrice, name);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public String play(){
        return "The guitar is being strummed!";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
