import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

public class NewCalculatorTest {

  private Calculator calculator;

  @Before
  public void createCalculator() {
    calculator = new Calculator();
  }

  @Test
  public void testNewCalculatorHasAnAccumulatorOfZero() {
    assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
  }

  @Test
  public void testSettingAccumulatorValue() {
    BigDecimal value = new BigDecimal(23);
    calculator.setAccumulator(value);
    assertEquals(value, calculator.getAccumulator());
  }

}
