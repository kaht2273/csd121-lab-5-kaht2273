import java.util.Random;

public class Question
{
    private int operand1;
    private int operand2;

    public Question(Random rand)
    {
        this.operand1 = rand.nextInt(0,12);
        this.operand2 = rand.nextInt(0,12);
    }
 public String getPromt()
 {
     return "What is <"operand1+">  x <"operand2">?";
     return "What is %d x%d?".formatted(operand1,operand2);
 }
}
