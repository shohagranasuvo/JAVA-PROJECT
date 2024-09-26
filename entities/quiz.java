package entities;

import java.util.*;

import java.util.List;

public class quiz {
    private String id;
    private String name;
    private List<Question> Questions;

    // Constructor
    public quiz(String id, String name, List<Question> Questions) {
        this.id = id;
        this.name = name;
        this.Questions = Questions;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return Questions;
    }

    public void setQuestions(List<Question> Questions) {
        this.Questions = Questions;
    }

    
    public void addQuestion(Question Question) {
        this.Questions.add(Question);
    }

    
    public void removeQuestion(Question Question) {
        this.Questions.remove(Question);
    }

    
    public void displayQuiz() {
        System.out.println("Quiz ID: " + id);
        System.out.println("Quiz Name: " + name);
        System.out.println("Questions: ");
        for (Question Question : Questions) {
            System.out.println("- " + Question.getQuestionText());
        }
    }
}


























