import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Solution {
    /**
     * Finds the number of ways to win based on time and current best distance.
     *
     * @param time               The total time available for the race.
     * @param currentBestDistance The current best distance covered.
     * @return The number of ways to win.
     */
    protected int findWaysToWin(long time, long currentBestDistance) {
        int winners = 0;
        for (int i = 0; i <= time; i++) {
            if ((i * (time - i)) > currentBestDistance) winners++;
        }
        return winners;
    }
    /**
     * Reads input data, processes it, and prints the result of finding ways to win the race.
     */
    public void findResult() {
        Input inputs = new Input();
        inputs.Inputs();
        ArrayList<String> input = inputs.getInputs();
        ArrayList<Long> time = Arrays.stream(input.get(0).split(":")[1].trim().split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Long> distance = Arrays.stream(input.get(1).split(":")[1].trim().split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toCollection(ArrayList::new));
        int result = 1;
        int size = Math.min(time.size(), distance.size());
        // Iterate through the time and distance arrays to calculate the result
        for (int i = 0; i < size; i++) {
            result *= findWaysToWin(time.get(i), distance.get(i));
        }
        System.out.println("Part 1 : " + result);
    }
}