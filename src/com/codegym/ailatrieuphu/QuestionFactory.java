package com.codegym.ailatrieuphu;

public class QuestionFactory {
    private int number;
    public Question reateQuestion(int id, String name){
        Question question = new Question("Ai la giam doc codegym Hue", 1);
        return question;
    }
}
