import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
  private Calculator calculator;

  @Before
  public void createCalculatorWithTwoValues() {
    calculator = new Calculator();
    calculator.setAccumulator(new BigDecimal(20));
    calculator.enter();
    calculator.setAccumulator(new BigDecimal(4));
  }

  @Test
  public void testAddExecution() {
    calculator.execute(new AddOperation());
    assertEquals(new BigDecimal(24), calculator.getAccumulator());
  }

  @Test
  public void testSubtractExecution() {
    calculator.execute(new SubtractOperation());
    assertEquals(new BigDecimal(16), calculator.getAccumulator());
  }

  @Test
  public void testMultiplyExecution() {
    calculator.execute(new MultiplyOperation());
    assertEquals(new BigDecimal(80), calculator.getAccumulator());
  }

  @Test
  public void testDivideExecution() {
    calculator.execute(new DivideOperation());
    assertEquals(new BigDecimal(5), calculator.getAccumulator());
  }

  @Test
  public void testSquareOperation() {
    calculator.execute(new SquareOperation());
    assertEquals(new BigDecimal(16), calculator.getAccumulator());
  }

  @Test
  public void testCustomOperation() {
    Operation cubeOperation = new UnaryOperation() {
      @Override
      protected BigDecimal calculate(BigDecimal value) {
        return value.pow(3);
      }
    };
    calculator.execute(cubeOperation);
    assertEquals(new BigDecimal(64), calculator.getAccumulator());

  }
}
