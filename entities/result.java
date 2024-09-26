package entities ;

public class result {
    private user userr;         
    private quiz quizz;         
    private int totalQuestions; 
    private int correctAnswers;
    private double score;     
     

   
    public result(user userr, quiz quizz, int totalQuestions, int correctAnswers, double score) {
        this.userr = userr;
        this.quizz = quizz;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.score = score;
        
    }

   
    public user getUser() {
        return userr;
    }

    public void setUser(user userr) {
        this.userr = userr;
    }

    public quiz getQuiz() {
        return quizz;
    }

    public void setQuiz(quiz quizz) {
        this.quizz = quizz;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

  

   

  
    public void displayResult() {
        
        System.out.println("Result for: " + userr.getName());
        System.out.println("Quiz: " + quizz.getName());
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Score: " + score);
        
    }
}
