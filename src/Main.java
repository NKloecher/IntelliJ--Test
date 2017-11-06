public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Git");
        System.out.println(calc());
        String s = calc();
        System.out.println(stuff(s));
        System.out.println("TEAM CITY CAN YOU RUN THIS?!");
    }
    private static String calc(){
        return "Stuff";
    }

    private static String stuff(String stuff) {
        return "This " + stuff;
}

}
