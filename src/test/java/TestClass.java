import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import matus.Calculator;

public class TestClass {

  Calculator c;

  @BeforeEach
  public void createCalculator() {
    c = new Calculator();
  }

  @Test
  public void sumTest() {
    assertTrue(4 == c.sum(2, 2));
    assertEquals(10, c.sum(4, 6));
  }

  @Test
  public void diffTest() {
    assertEquals(10, c.diff(30, 20));
  }

  @Test
  public void prodTest() {
    assertEquals(64, c.prod(8, 8));
  }

  @Test
  public void divTest() {
    assertEquals(5, c.div(10, 2), 1e-8);
  }

  @Test
  public void divExceptionTest() {
    assertThrows(IllegalArgumentException.class, () -> c.div(1, 0));
  }

  @Nested
  public class NestedTestClass {

    @Test
    public void allTest() {
      assertTrue(true);
      sumTest();
      diffTest();
      prodTest();
      divTest();
      divExceptionTest();
    }
  }
}
