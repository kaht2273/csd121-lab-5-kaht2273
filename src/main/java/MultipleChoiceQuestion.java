public class MultipleChoiceQuestion
{
    private String question;
    private String[] options;
    private int answerIndex;


    public MultipleChoiceQuestion(String question,String[]options, int answerIndex)
    {
        this.question = question;
        this.options = options;
        this.answerIndex = answerIndex;
    }

    String  ANSWER_CORRECT = "Correct";
    String ANSWER_INCORRECT = "Incorrect";
    String ANSWER_INVALID = "Invaild";

}
