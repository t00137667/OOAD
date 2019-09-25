import javax.swing.*;

public class QuizDriver {
    public static void main(String[] args) {
        Question q1 = new Question("What is the capital of Ireland?", "Dublin");
        Question q2 = new Question("What is the real capital of Ireland", "Cork");

        if (q1.checkAnswer(q1.display())){
            JOptionPane.showMessageDialog(null,"You Are Correct!");
        }
        else
            JOptionPane.showMessageDialog(null,"You Are Incorrect!");

        if (q2.checkAnswer(q2.display())){
            JOptionPane.showMessageDialog(null,"You Are Correct!");
        }
        else
            JOptionPane.showMessageDialog(null,"You Are Incorrect!");

        MCQuestion mQ1 = new MCQuestion("What is the capital of Ireland?", "Dublin", "Cork", "Limerick");
        MCQuestion mQ2 = new MCQuestion("What is the capital of Ireland?", "Cork", "Dublin", "Limerick");

        if (mQ1.checkAnswer(mQ1.display()))
            JOptionPane.showMessageDialog(null,"You Are Correct!");
        else
            JOptionPane.showMessageDialog(null,"You Are Incorrect!");
    }

}
