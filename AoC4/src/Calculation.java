import java.util.ArrayList;


public class Calculation {
    private Input input = new Input();
    /**
     * Calculates the points for a single line of lottery numbers.
     *
     * @return The points for a single line.
     */
    public int calculation() {
        int idk = 0;
        String s = input.getOneInput(idk);
        String[] strings = s.split(" ");
        ArrayList<String> inputs = new ArrayList<>();
        for (int t = 0; t < strings.length; t++) {
            inputs.add(strings[t]);
        }
        ArrayList<String> winningNumbers = new ArrayList<>();
        for (int i = 4; i < 14; i++) {
            winningNumbers.add(inputs.get(i));
        }
        ArrayList<String> myNumbers = new ArrayList<>();
        for (int i = 15; i < inputs.size(); i++) {
            myNumbers.add(inputs.get(i));
        }
        int oneLineWin = 1;  // Initial value
        for (String myNumber : myNumbers) {
            if (winningNumbers.contains(myNumber)) {
                oneLineWin *= 2;
            }
        }
        return oneLineWin;
    }
    /**
     * Calculates the total points for all lottery lines.
     *
     * @return The total points.
     */
    public int allPoints() {
        input.Inputs();
        int points = 0;
        for (int i = 0; i < input.getInputs().size(); i++) {
            int j = calculation();
            points += j;
        }
        return points;
    }
}
