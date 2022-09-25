package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashBackHackerTest {
    @Test
    public void shouldShowGetAmount() {
        int expected = 400;
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1600);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowAmountIfMinBoundary() {
        int expected = 200;
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldNotShowAmount() {
        CashBackHacker service = new CashBackHacker();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}
