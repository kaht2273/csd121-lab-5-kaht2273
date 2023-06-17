package app.questions;
import java.util.Random;


public class QuestionFactory
{
    private Random rand;
    public QuestionFactory(Random rand)
    {
        this.rand = rand;
    }
    public Question makeQuestion()
    {
        int questionType = rand.nextInt(bound:4);

        switch (questionType)
        {
            case 0:
            case 1:
                return new SubtractionQuestion();
            case 2:
                return new MultiplicationQuestion();
            case 3:
                return new DivisionQuestion();
            default:
                throw new IllegalArgumentException("Invalid question typed");
        }




        }


        public Question[] makeQuestion(int n )
        {
        Question[] questiona = new Question[n];
        Random random = new Random();
        for(int i=0; i < n; i++)
        {
        int operand1 = random.nextint(bound:10) + 1
        int operand2 = random.nextint(bound:10) + 1
        questions[1] = new app.questions.MultiplicationQuestion(operand1, operand2);
         }

        return questions;
    }




