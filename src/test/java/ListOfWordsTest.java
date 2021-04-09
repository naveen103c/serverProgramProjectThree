/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brkgb
 */
public class ListOfWordsTest {
    
    public ListOfWordsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRandomWord method, of class ListOfWords.
     */
    @Test
    public void testGetRandomWord() {
        System.out.println("getRandomWord");
        int theme = 0;
        int lastWord = 0;
        String expResult = "";
        String result = ListOfWords.getRandomWord(theme, lastWord);
        assertEquals(expResult, result);
    }
    
}
