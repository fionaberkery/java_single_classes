import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void volumeis100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void volumeReducesBy10WhenTakes1Drink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void volumeReducesBy20WhenTakes2Drinks(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void bottleCanEmpty(){
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        waterbottle.refillBottle();
        assertEquals(100, waterbottle.getVolume());
    }

}


