import java.math.BigDecimal;

public class SquareOperation extends UnaryOperation{

  @Override
  protected BigDecimal calculate(BigDecimal value) {
    return value.pow(2);
  }
}
