import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String input = "abcd";
        System.out.println(input);
        StringBuilder stringBuilder = new StringBuilder(input);
        int i = 0;
        while (true){
            stringBuilder.append(input.charAt(i));
            stringBuilder.delete(0, 1);
            i++;
            if(stringBuilder.toString().equals(input)){ break;}
            else{System.out.println(stringBuilder);}
        }


    }
}
