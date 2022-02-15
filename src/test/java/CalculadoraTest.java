import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void SumarPositivosTest(){

        double actual = Calculadora.Sumar(2,2);;
        double expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void SumarNegativosTest(){

        double actual = Calculadora.Sumar(-2,-2);;
        double expected = -4;

        assertEquals(expected, actual);
    }

    @Test
    public void RestaTest(){

        double actual = Calculadora.Restar(2,2);;
        double expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void MultiplicarTest(){

        double actual = Calculadora.Multiplicar(2,2);;
        double expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void DividirTest(){

        double actual = Calculadora.Dividir(2,2);;
        double expected = 1;

        assertEquals(expected, actual);
    }
}
