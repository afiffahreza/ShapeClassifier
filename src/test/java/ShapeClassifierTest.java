import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ShapeClassifierTest {

    /**
     * This is an example test 
     */
    @DisplayName("Example Test")
    @Test
    public void example() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertNotEquals("Yes", answer);
    }

    @DisplayName("Test Equilateral Triangle")
    @Test
    public void testEquilateralTriangle() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Isosceles Triangle")
    @Test
    public void testIsoscelesTriangle() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Isosceles,Large,Yes,100,100,50");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Scalene Triangle")
    @Test
    public void testScaleneTriangle() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Scalene,Large,Yes,100,80,60");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Circle")
    @Test
    public void testCircle() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Circle,Large,Yes,50,50");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Ellipse")
    @Test
    public void testEllipse() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Ellipse,Large,Yes,60,40");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Rectangle")
    @Test
    public void testRectangle() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Rectangle,Large,Yes,100,50,100,50");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Square")
    @Test
    public void testSquare() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Square,Large,Yes,100,100,100,100");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Line")
    @Test
    public void testLine() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Line,Small,Yes,5");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test Incorrect Shape Guess")
    @Test
    public void testIncorrectShapeGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Circle,Large,Yes,100,100,100");
        assertNotEquals("Yes", answer);
    }

    @DisplayName("Test Incorrect Size Guess")
    @Test
    public void testIncorrectSizeGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Small,Yes,100,100,100");
        assertNotEquals("Yes", answer);
    }

    @DisplayName("Test Incorrect Even/Odd Guess")
    @Test
    public void testIncorrectEvenOddGuess() {
        ShapeClassifier s = new ShapeClassifier();
        String answer = s.evaluateGuess("Equilateral,Large,No,100,100,100");
        assertNotEquals("Yes", answer);
    }
}
