import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Persoane {
    String prenume;
    String nume;

    public Persoane() {
        
    }
    Map<Persoane, Integer> counter=new HashMap<Persoane,Integer>();
            for(String line:lines)

    {
        String[] words = line.lowerCase().split(" ");
        Persoane pers = new Persoane(words[0], words[1]);
        if (counters.containKey(pers) >= 3) {
            print(pers);
        }
    }
}
