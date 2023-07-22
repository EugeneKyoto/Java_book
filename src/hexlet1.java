public class hexlet1 {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        var a = Math.random();
        var b = a * 10;
        var c = (int) b;
        var d = "Google";
        var name = " How much is the fish?   \n";
        var site = "https://ru.hexlet.io";
        System.out.println("Json-object: "+ name.trim().toLowerCase().replace(" ", "-").replace("?", ""));
    }
}