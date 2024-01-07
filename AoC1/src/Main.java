import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {


        Calibration calibration = new Calibration();
        Input inp  = new Input();

        inp.Input();
        for (int i = 0;i<inp.getInputs().size();i++){
            calibration.calibration(inp.getOneInput(i));
        }
        System.out.println(calibration.getTotalValue());




    }
}