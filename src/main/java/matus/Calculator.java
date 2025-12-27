package matus;

public class Calculator {
  public int sum(int a, int b) {
    return a + b;
  }

  public int diff(int a, int b) {
    return a - b;
  }

  public int prod(int a, int b) {
    return a * b;
  }

  public double div(double a, double b) {
    if (b != 0) {
      return a / b;
    } else {
      throw new IllegalArgumentException("Division by zero!");
    }
  }
}
