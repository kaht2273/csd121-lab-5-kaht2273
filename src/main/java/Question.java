import java.util.Random;

public class Question
{
    String  ANSWER_CORRECT = "Correct";
    String ANSWER_INCORRECT = "Incorrect";
    String ANSWER_INVALID = "Invaild";

    String getPrompt();
    String getVaildMessage();
    double parseAnswer(String answer);

 }

