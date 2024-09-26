package entities;
import java.util.*;

public class Question {

    private String id;                
    private String questionText;      
    private String correctAnswer;      
             
    private List<String> options;     

    // Default constructor
    public Question() {
        this.id = "";
        this.questionText = "";
        this.correctAnswer = "";
        
        this.options = new ArrayList<>();
    }

    // Parameterized constructor
    public Question(String id, String questionText, String correctAnswer, List<String> options) {
        this.id = id;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        
        this.options = options;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

   

    
    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

   
    public void displayQuestion() {
        System.out.println("Question ID: " + id);
        System.out.println("Question: " + questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i)); 
       
    }
}
}
