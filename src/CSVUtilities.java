
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {

    private ArrayList<String> CSVData;
    private int numColumns;

    public CSVUtilities(String fileName){
        CSVData = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                numColumns = attributes.length;

                // adding book into ArrayList
                CSVData.add(line);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public List<String> getColumnHeaders(){
        List<String> headers = new ArrayList<String>();
        String[] x = CSVData.get(0).split(",");
        for(int i = 0; i < x.length; i++){
            headers.add(x[i]);
        }
        return headers;
    }
    public List<String> getDataString(int column){
        List<String> result = new ArrayList<String>();
        for(int i = 1; i < CSVData.size(); i++){
            String[] test = CSVData.get(i).split(",");
            result.add(test[column]);
        }
        return result;
    }
    public List<Integer> getDataInt(int column){
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < CSVData.size(); i++){
            String[] test = CSVData.get(i).split(",");
            result.add(Integer.valueOf(test[column]));
        }
        return result;
    }

    public List<Double> getDataDouble(int column){
        List<Double> result = new ArrayList<Double>();
        for(int i = 1; i < CSVData.size(); i++){
            String[] test = CSVData.get(i).split(",");
            result.add(Double.valueOf(test[column]));
        }
        return result;
    }

}
