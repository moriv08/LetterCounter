
public class MainLetterCounter {
    
    public static void main(String[] args) {

        System.out.println(letterCounter("aaabccccgghhhhn"));

    }
    public static String letterCounter(String str){

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            int counter = 1;

            int j = i;
            while ( (++j < str.length()) && (str.charAt(j) == tmp) )
                counter++;

            result.append(counter).append(tmp);
            i = (j - 1);
        }
        return result.toString();
    }
}