import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution_naïve {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "/range.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            
            for (int i = 2; i < lines.size(); i += 2) {
                
                String h = lines.get(i);
                String[] sequence = h.split(" ");

               System.out.println(foundenvahissant(sequence.length,sequence));
      
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String foundenvahissant( int length , String[] sequence){

        String envahissant = "null";
        String[] arr = sequence;
        List<String> list = Arrays.asList(arr);
        int occu;

    
       String plante1 = sequence[0];

        for(int i = 0; i < length; i++){

            occu = Collections.frequency(list, plante1);

            if   (occu > (length/ 2)){

                envahissant = plante1;
            }

            else if (plante1 != sequence[i]) {
                
                plante1 = sequence[i];
                            }
        }
        return envahissant;
    }
}