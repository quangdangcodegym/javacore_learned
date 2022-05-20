package com.codegym.ailatrieuphu;

import java.util.List;

public class Question {
    private String nameQuestion;
    private int idQuestion;
    private List<Answer> listAnswer;
    private Answer rightedAnswer;

    Question(){}

    public Question(String nameQuestion, int idQuestion) {
        this.nameQuestion = nameQuestion;
        this.idQuestion = idQuestion;
    }


}
