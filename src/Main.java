public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Git");
        System.out.println(calc());
        String s = calc();
        stuff(s);
        System.out.println(s);
    }
    private static String calc(){
        return "Stuff";
    }
private static void stuff(String stuff){
        stuff = "Dette her " + stuff;
}

}
