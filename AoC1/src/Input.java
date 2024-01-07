import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
    private ArrayList<String> inputs = new ArrayList<>();
//    String path = "Inputs.txt";
    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("Inputs.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void test(){
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<String> getInputs() {
        return inputs;
    }
    public String getOneInput(int i){
        return String.valueOf(inputs.get(i));
    }
    public void Input(){


            try {
                String s;
                do {


                    s = br.readLine();
                    inputs.add(s);

                } while (s != null);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        inputs.removeLast();
        System.out.println(inputs);
    }




    public void setInput(){
        try {
            inputs.add(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Input{" +
                "inputs=" + inputs +
                '}';
    }
}
