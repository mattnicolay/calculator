import java.math.BigDecimal;

public class DivideOperation extends BinaryOperation {

  @Override
  protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
    return value2.divide(value1);
  }
}
