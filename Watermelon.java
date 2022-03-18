package Test;

public class Watermelon {
    public static String isdivisible(int weight) {
        if(weight == 2) {
            System.out.println("NO");
            return "NO";
        }
        if(weight % 2 == 0){
            System.out.println("YES");
            return "YES";
        }else {
            System.out.println("NO");
            return "NO";
        }
    }
}
