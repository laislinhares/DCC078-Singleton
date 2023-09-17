import org.example.Bingo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BingoTest {

    @Test
    public void deveRetornarDatadoBingo () {
        Bingo.getInstance().setData("17/09/2023");
        assertEquals("17/09/2023", Bingo.getInstance().getData());
    }

    @Test
    public void deveRetornarNumerosSorteados () {
        Bingo.getInstance().setNumerosSorteados("10,7,1,5,23,9,11,19,4,20");
        assertEquals("10,7,1,5,23,9,11,19,4,20", Bingo.getInstance().getNumerosSorteados());
    }
}
