package com.codegym.ailatrieuphu;

public class Answer {
    private int idAnswer;
    private String nameAnswer;

    public Answer(int idAnswer, String nameAnswer) {
        this.idAnswer = idAnswer;
        this.nameAnswer = nameAnswer;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getNameAnswer() {
        return nameAnswer;
    }

    public void setNameAnswer(String nameAnswer) {
        this.nameAnswer = nameAnswer;
    }
}
