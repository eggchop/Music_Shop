import instrument.Guitar;
import instrument.Piano;
import interfaces.ISell;
import merch.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(50.00, 75.00, "Fender", 6);
        piano = new Piano(1000, 1500, "Grand", 30);
        sheetMusic = new SheetMusic("Piano Ballads Vol 1", 15.00, 10.00);
    }

    @Test
    public void checkCanAddStockToShop(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(sheetMusic);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void checkCanRemoveItemStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.removeItemFromStock(piano);
        assertEquals(1, shop.countStock());

    }

    @Test
    public void checkCanCalculatePotentialProfit(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(sheetMusic);
        assertEquals(530.00, shop.calculateProfit(), 0.01);
    }
}
