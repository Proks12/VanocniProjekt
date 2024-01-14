import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Calibration {
    private int totalValue = 0;
    /**
     * Calibrates a given string by extracting numeric values and adding them to the totalValue.
     *
     * @param s The input string to be calibrated.
     */
    public void calibration(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (s1.matches("[0-9]")) {
                number = number + Integer.valueOf(s1) * 10;
                break;
            }
        }
        for (int j = s.length() - 1; j >= 0; j--) {
            String s2 = String.valueOf(s.charAt(j));
            if (s2.matches("[0-9]")) {
                number = number + Integer.valueOf(s2);
                break;
            }
        }
        totalValue = totalValue + number;
    }
    /**
     * Processes input strings by replacing words with their mapped representations and calculates their total value.
     *
     * @return Calcuted number for part 2.
     */
    public int part2() {
        int number = 0;
        HashMap<String, String> wordToNumber = new HashMap<String, String>();
        wordToNumber.put("one", "o1e");
        wordToNumber.put("two", "t2o");
        wordToNumber.put("three", "t3");
        wordToNumber.put("four", "4");
        wordToNumber.put("five", "5e");
        wordToNumber.put("six", "6");
        wordToNumber.put("seven", "7");
        wordToNumber.put("eight", "8t");
        wordToNumber.put("nine", "9");
        Input input = new Input();
        input.Inputs();
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> inputs = input.getInputs();
        for (String line : inputs) {
            for (Map.Entry<String, String> entry : wordToNumber.entrySet()) {
                String current = entry.getKey();
                String newCurrent = entry.getValue();
                line = line.replaceAll(current, newCurrent);
            }
            temp.add(line);
        }
        for (int k = 0; k < temp.size(); k++) {
            String s = temp.get(k);
            for (int i = 0; i < s.length(); i++) {
                String s1 = String.valueOf(s.charAt(i));
                if (s1.matches("[0-9]")) {
                    number = number + Integer.valueOf(s1) * 10;
                    break;
                }
            }
            for (int j = s.length() - 1; j >= 0; j--) {
                String s2 = String.valueOf(s.charAt(j));
                if (s2.matches("[0-9]")) {
                    number = number + Integer.valueOf(s2);
                    break;
                }
            }
        }
        return  number;
    }
    /**
     * Gets the total calculated value.
     *
     * @return The total calculated value.
     */
    public int getTotalValue() {
        return totalValue;
    }
}