package org.launchcode;

public class TrueOrFalseQuestion extends Question{

    public TrueOrFalseQuestion(String question, String answer) {

        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();

        return answer.equalsIgnoreCase(actualAnswer);
    }

}