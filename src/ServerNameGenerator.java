import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = new String[] {"bright", "sunny", "loud", "smelly", "cold", "hot", "bitter", "salty", "sweet", "sour"};

        String[] noun = {"Tomas", "apple", "cookie", "dog", "cat", "rabbit", "car", "baby", "notebook", "cup"};
        System.out.println("Here is your server name:");
        System.out.print(getString(adjectives));
        System.out.print("-");
        System.out.print(getString(noun));


    }
        public static String getString(String[] array){
            int i = (int) (Math.random() * array.length);
            return array[i];
        }




}

