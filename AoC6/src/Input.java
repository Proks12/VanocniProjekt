import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Input {
    private ArrayList<String> inputs = new ArrayList<>();
    BufferedReader br;
    /**
     * Constructor initializes the BufferedReader with the specified file ("Inputs.txt").
     *
     * @throws RuntimeException if the file is not found.
     */
    {
        try {
            br = new BufferedReader(new FileReader("Inputs.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Retrieves the list of input lines.
     *
     * @return The ArrayList containing input lines.
     */
    public ArrayList<String> getInputs() {
        return inputs;
    }
    /**
     * Reads input lines from the file and populates the inputs ArrayList.
     *
     * @throws RuntimeException if an IOException occurs during the file reading process.
     */
    public void Inputs() {
        try {
            String s;
            do {
                s = br.readLine();
                inputs.add(s);
            } while (s != null);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        inputs.remove(inputs.size() - 1);
    }
    /**
     * Returns a string representation of the Input object.
     *
     * @return A string containing information about the Input object.
     */
    @Override
    public String toString() {
        return "Input{" +
                "inputs=" + inputs +
                '}';
    }
}