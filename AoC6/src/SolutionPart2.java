import java.util.ArrayList;
public class SolutionPart2 extends Solution {
    Solution solution = new Solution();
    /**
     * Reads input data, processes it, and prints the result of finding ways to win the race for Part 2.
     */
    public void findResult() {
        Input inputs = new Input();
        inputs.Inputs();
        ArrayList<String> input = inputs.getInputs();
        long time = Long.parseLong(input.get(0).split(":")[1].trim().replaceAll("\\s+", ""));
        long currentWinningDistance = Long.parseLong(input.get(1).split(":")[1].trim().replaceAll("\\s+", ""));
        int result = solution.findWaysToWin(time, currentWinningDistance);
        System.out.println("Part 2: " + result);
    }
}
