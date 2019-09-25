import javax.swing.*;
import java.util.ArrayList;

public class MCQuestion extends Question {

    private ArrayList<String> options;

    public MCQuestion(){
        options = new ArrayList<String>();
    }

    public MCQuestion(String text, String correct, String option1){
        setQuestion(text);
        options = new ArrayList<String>();

        options.add(correct);
        options.add(option1);
    }

    public MCQuestion(String text,String correct, String option1, String option2){
        setQuestion(text);
        options = new ArrayList<String>();

        setAnswer(correct);
        options.add(correct);
        options.add(option1);
        options.add(option2);
    }

    public void addOption(String option){
        options.add(option);
    }



    @Override
    public String display() {

        int choices = options.size();
        int random = (int)(Math.random()* choices);

        String display = "";
        display += getQuestion() + "\n";

        for (int i =0; i<choices;i++){
            if (i==random){
                display += " " + options.get(0) + "\n";
            }
            else
            {
                display += " " + options.get(i) + "\n";
            }
        }

        return JOptionPane.showInputDialog(display);
    }
}
