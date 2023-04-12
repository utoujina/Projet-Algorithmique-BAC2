import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution_diviser_pour_regner{

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "/range.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            
            for (int i = 2; i < lines.size(); i += 2) {
                
                String h = lines.get(i);
                String[] sequence = h.split(" ");

               System.out.println(foundenvahissant(sequence.length,sequence,sequence,0,sequence.length));
      
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String foundenvahissant( int length_sequence_t,String[] sequence_t,String[] sequence,int low,int high){
        
        

        int mid = (low + high / 2) + 1;

        String[] sequence_biggest_part = Arrays.copyOfRange(sequence, low, mid);
        
        // recherche du nombre d'occurence 
        String[] arr = sequence_t;
        List<String> list = Arrays.asList(arr);
        int occu = Collections.frequency(list, sequence_biggest_part[0]);

        if (sequence_biggest_part.length <= 2 && occu == 1 && length_sequence_t != 1) {
            return "null";
        }
        else if (occu > (length_sequence_t/ 2)){
            return sequence[0];
        }
        else {
            return foundenvahissant(length_sequence_t,sequence_t,sequence_biggest_part,low,mid);
        }

    }



}