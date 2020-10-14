package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MediaCalculadorTest {
    
    @Test public void testeDoubleReprovadoNegativo() {
        Calculadora m = new Calculadora();
        assertEquals(-1.0, m.calcular(0.0, -0.1));
    }
    @Test public void testeDoubleReprovadoZerado() {
        Calculadora m = new Calculadora();
        assertEquals(0.0, m.calcular(0.0, 0.0));
    }
    @Test public void testeDoubleReprovado01() {
        Calculadora m = new Calculadora();
        assertEquals(0.05, m.calcular(0.0, 0.1));
    }
    @Test public void testeDoubleReprovado() {
        Calculadora m = new Calculadora();
        assertEquals(5.95, m.calcular(10.0, 1.9));
    }
    @Test public void testeDoubleAprovado(){
        Calculadora m2 = new Calculadora();
        assertEquals(6.0, m2.calcular(10.0, 2.0));
    }
    @Test public void testeDoubleAprovado10(){
        Calculadora m2 = new Calculadora();
        assertEquals(10.0, m2.calcular(10.0, 10.0));
    }
    @Test public void testeDoubleAprovadoMaior10(){
        Calculadora m2 = new Calculadora();
        assertEquals(10.0, m2.calcular(10.0, 10.1));
    }
    @Test public void testeStringReprovadoNegativo(){
        Calculadora m2 = new Calculadora();
        assertEquals("Media inválida, valor negativo", m2.aprovacao(-0.2, 0.0));
    }
    @Test public void testeStringReprovadoZerado(){
        Calculadora m2 = new Calculadora();
        assertEquals("Aluno Reprovado", m2.aprovacao(0.0, 0.0));
    }
    @Test public void testeStringReprovado(){
        Calculadora m2 = new Calculadora();
        assertEquals("Aluno Reprovado", m2.aprovacao(3.0, 3.0));
    }
    @Test public void testeStringReprovadoProximo6(){
            Calculadora m2 = new Calculadora();
            assertEquals("Aluno Reprovado", m2.aprovacao(5.8, 6.0));
    }
    @Test public void testeStringAprovado6(){
        Calculadora m2 = new Calculadora();
        assertEquals("Aluno Aprovado", m2.aprovacao(6.0,6.2));
    }
    @Test public void testeStringAprovado(){
        Calculadora m2 = new Calculadora();
        assertEquals("Aluno Aprovado", m2.aprovacao(10.0,8.0));
    }
    @Test public void testeStringAprovado10(){
        Calculadora m2 = new Calculadora();
        assertEquals("Aluno Aprovado", m2.aprovacao(10.0,10.0));
    }
    @Test public void testeStringAcima10(){
        Calculadora m2 = new Calculadora();
        assertEquals("Media inválida, valor superior a 10", m2.aprovacao(10.1,10.0));
    }

}