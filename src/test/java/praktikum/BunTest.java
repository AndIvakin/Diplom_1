package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getNameTest() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988f);
        assertEquals("Название булочки не совпадает.", "Флюоресцентная булка R2-D3", bun.getName());
    }

    @Test
    public void getPriceTest() {
        Bun bun = new Bun("Краторная булка N-200i", 1255);
        assertEquals("Цена булочки не совпадает.", 1255, bun.getPrice(), 0.00);
    }
}