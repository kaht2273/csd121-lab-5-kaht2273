package app.questions;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class DivisionQuestion extends ArithmeticQuesion
{
    public DivisionQuestion()
    {
        int divisor = random.nextInt(bound: 12) +1;
        int quotient = random.nextInt(bound: 13);
        this.operand2 = divisor;
        this.operand1 = quotient * divisor;
        this operatorSymbol = "/";
    }
    @Override
    protected double calculateAnswer()
    {
        return (double) operand1 / operand2;
    }
}
