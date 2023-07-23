public class morePractice {
    public static void main(String[] args) {
         var x = "0123456789101213";

        x = "*".repeat(12) + x.substring(12);
        //x = "*".repeat(12)+x;
        System.out.println(x);
        System.out.println(x.length());
    }
}
