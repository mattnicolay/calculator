import java.math.BigDecimal;

public abstract class UnaryOperation implements Operation {

  @Override
  public void apply(OperandStack stack) {
    BigDecimal value = stack.peek();
    stack.replaceTop(calculate(value));
  }

  protected abstract BigDecimal calculate(BigDecimal value);
}
