
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HangmanLogicTest {

    public HangmanLogicTest() {
    }

    /**
     * Test of takeAGuess method, of class HangmanLogic.
     */
    @Test
    public void testTakeAGuess() {
        System.out.println("takeAGuess");
        String choice = "";
        HangmanLogic instance = null;
        boolean expResult = false;
        System.out.println("expResult "+expResult);
        boolean result = instance.takeAGuess(choice);
        System.out.println("result "+result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
