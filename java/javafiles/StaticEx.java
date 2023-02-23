class Example {

    String name;
    int rollnumber;

    void listen() {
        System.out.println(name + "  is listening to class");

    }

    static String board;
    static void teaching() {
        System.out.println("  is teaching the class");
    }

}

class StaticEx {
    public static void main(String args[])

    {
        Example obj = new Example();
        obj.name = "Reethu";
        obj.listen();

        Example.board = "white board";
        Example.teaching();

    }
    static 
     {
         System.out.println("Iam static block");
    }

}