package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MediaCalculadorTest {
    @Test public void testeDoubleReprovado() {
        Calculadora m = new Calculadora();
        assertEquals(4.0, m.calcular(5.0,3.0));
    }

    @Test public void testeDoubleAprovado(){
        Calculadora m2 = new Calculadora();
        assertEquals(6.0, m2.calcular(10.0,2.0));
    }

}