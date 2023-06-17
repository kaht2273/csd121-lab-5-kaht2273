package app.questions;
public class MultiplicationQuestion extends ArithmeticQuestion
{
    int operand1;
    int operand2;
    public MultiplicationQuestion
    {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operandSymbol = "+";
    }
    @Override
    protected double calculateAnswer()
    {
        return operand1 * operand2;
    }
}
