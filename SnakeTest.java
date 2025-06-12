
import com.mycompany.snake.SnakeGame;
import com.mycompany.snake.SnakeGame.Tile;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class SnakeTest {
    
    SnakeGame snakeGame;
    
    @BeforeEach
    void setUp() {
        snakeGame = new SnakeGame(600, 600);
    }
    
    @Test
    public void testBoardSize() {
        Dimension boardWeight = snakeGame.getPreferredSize();
        Dimension boardHeight = snakeGame.getPreferredSize();

        assertEquals(600, boardWeight.width, "A largura do jogo deve ser 600");
        assertEquals(600, boardHeight.height, "A altura do jogo deve ser 600");
    }
    
    @Test
    public void testSnakeHeadPosition() {
        assertEquals(5, snakeGame.snakeHead.x, "A posição X deve ser 5");
        assertEquals(5, snakeGame.snakeHead.y, "A posição Y deve ser 5");
    }
    
    @Test
    public void testFoodPosition() {
        SnakeGame.Tile original = snakeGame.new Tile(snakeGame.food.x, snakeGame.food.y);
        
        System.out.println(original.x + "..." + original.y);
        
        snakeGame.placeFood();
        
        System.out.println(original.x + "..." + original.y);

        Tile changed = snakeGame.food;
        System.out.println(changed.x + "..." + changed.y);
        
        assertFalse(snakeGame.collision(original, changed));
    }
    
    @Test
    public void testGameOver() {
        assertFalse(snakeGame.gameOver);
    }
    
    @Test
    public void testMove() {
        System.out.println(snakeGame.snakeHead.x);
        System.out.println(snakeGame.snakeHead.y);
        
        snakeGame.velocityX = -1;
        snakeGame.move();
        assertEquals(4, snakeGame.snakeHead.x);
        snakeGame.velocityY = 1;
        snakeGame.move();
        assertEquals(6, snakeGame.snakeHead.y);
    }
    
    @Test
    public void testKeyPressedUp() {
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'w'));
        assertEquals(0, snakeGame.velocityX);
        assertEquals(-1, snakeGame.velocityY);
    }
    
    @Test
    public void testKeyPressedUp2() {
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 's'));
        assertEquals(0, snakeGame.velocityX);
        assertEquals(1, snakeGame.velocityY);
    }
    
    @Test
    public void testKeyPressedUp3() {
        System.out.println(snakeGame.velocityX);
        snakeGame.velocityX = 0;
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'a'));
        assertEquals(-1, snakeGame.velocityX);
        assertEquals(0, snakeGame.velocityY);
    }
    
    @Test
    public void testKeyPressedUp4() {
        
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'd'));
        assertEquals(1, snakeGame.velocityX);
        assertEquals(0, snakeGame.velocityY);
    }
    
    @Test
    public void testColisionWithBody() {
        snakeGame.snakeHead.x = 5;
        snakeGame.snakeHead.y = 5;
        System.out.println(snakeGame.snakeBody);
        snakeGame.snakeBody.add(0, snakeGame.new Tile(5,5));
        assertEquals(snakeGame.snakeHead.x, snakeGame.snakeBody.get(0).x);
        assertEquals(snakeGame.snakeHead.y, snakeGame.snakeBody.get(0).y);
        
        assertTrue(snakeGame.collision(snakeGame.snakeHead, snakeGame.snakeBody.get(0)), "Colisão da cobra com o corpo da cobra deve ser verdadeira");
    }
    
    }
 