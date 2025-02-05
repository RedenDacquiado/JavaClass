public class ParseConverstion {
    public static void main(String[] args){
        int a = Integer.parseInt("12");
        double b = Double.parseDouble("12");
        int c = Integer.parseInt("100",2);
        double d = Double.parseDouble("100");

        System.out.println(Integer.parseInt("12"));
        System.out.println(Double.parseDouble("12"));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Double.parseDouble("100"));
    }
    
}
