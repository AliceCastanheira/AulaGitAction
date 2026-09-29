
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    public void deveSomarDoisValores() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test
    public void deveSubtrairDoisValores() {
        assertEquals(1.0, calc.subtrair(3, 2));
    }

    @Test
    public void deveMultiplicarDoisValores() {
        assertEquals(6.0, calc.multiplicar(2, 3));
    }

    @Test
    public void deveDividirDoisValores() {
        assertEquals(2.0, calc.dividir(6, 3));
    }

    @Test
    public void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
