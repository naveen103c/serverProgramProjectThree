import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordgameLogicTest {
    
    public WordgameLogicTest() {
    }
    
    
    /**
     * Test of loseLife method, of class WordgameLogic.
     */
    @Test
    public void testLoseLife() {
        System.out.println("loseLife");
        WordgameLogic instance = new WordgameLogic();
        instance.loseLife();
    }

    /**
     * Test of livesleft method, of class WordgameLogic.
     */
    @Test
    public void testLivesleft() {
        System.out.println("livesleft");
        int lives = 5;
        WordgameLogic instance = new WordgameLogic();
        int expResult = 4;
        int result = instance.livesleft(lives);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLives method, of class WordgameLogic.
     */
    @Test
    public void testGetLives() {
        System.out.println("getLives");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getLives();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLoser method, of class WordgameLogic.
     */
    @Test
    public void testGetLoser() {
        System.out.println("getLoser");
        WordgameLogic instance = new WordgameLogic();
        boolean expResult = false;
        boolean result = instance.getLoser();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of dispWord method, of class WordgameLogic.
     */
    @Test
    public void testDispWord() {
        System.out.println("dispWord");
        WordgameLogic instance = new WordgameLogic();
        String expResult = "";
        String result = instance.dispWord();
        assertEquals(expResult, result);  
    }

    /**
     * Test of changeWordCatagorey method, of class WordgameLogic.
     */
    @Test
    public void testChangeWordCatagorey() {
        System.out.println("changeWordCatagorey");
        int i = 0;
        WordgameLogic instance = new WordgameLogic();
        instance.changeWordCatagorey(i);
    }

    /**
     * Test of getWins method, of class WordgameLogic.
     */
    @Test
    public void testGetWins() {
        System.out.println("getWins");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getWins();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTheme method, of class WordgameLogic.
     */
    @Test
    public void testGetTheme() {
        System.out.println("getTheme");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getTheme();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat1b method, of class WordgameLogic.
     */
    @Test
    public void testGetCat1b() {
        System.out.println("getCat1b");
        WordgameLogic instance = new WordgameLogic();
        boolean expResult = false;
        boolean result = instance.getCat1b();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat2b method, of class WordgameLogic.
     */
    @Test
    public void testGetCat2b() {
        System.out.println("getCat2b");
        WordgameLogic instance = new WordgameLogic();
        boolean expResult = false;
        boolean result = instance.getCat2b();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat3b method, of class WordgameLogic.
     */
    @Test
    public void testGetCat3b() {
        System.out.println("getCat3b");
        WordgameLogic instance = new WordgameLogic();
        boolean expResult = false;
        boolean result = instance.getCat3b();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat1 method, of class WordgameLogic.
     */
    @Test
    public void testGetCat1() {
        System.out.println("getCat1");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getCat1();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat2 method, of class WordgameLogic.
     */
    @Test
    public void testGetCat2() {
        System.out.println("getCat2");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getCat2();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCat3 method, of class WordgameLogic.
     */
    @Test
    public void testGetCat3() {
        System.out.println("getCat3");
        WordgameLogic instance = new WordgameLogic();
        int expResult = 0;
        int result = instance.getCat3();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of reset method, of class WordgameLogic.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        WordgameLogic instance = new WordgameLogic();
        instance.reset();
        
        
    }
    
}
