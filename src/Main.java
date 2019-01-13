public class Main {
    static int count = 0;

    public static void main(String[] args)
    {
        Person a = new Person(count++, "", "",  "", 1990, "", "", 60, 180, false);
        Person b = new Person(count++, "", "",  "", 1990, "", "", 60, 180, false);
        Person c = new Person(count++, "", "",  "", 1990, "", "", 60, 180, false);
        Person d = new Person(count++, "", "",  "", 1990, "", "", 60, 180, false);


        Person[] four = new Person[4];
//        a.getInfo();
//        b.getInfo();
        System.out.println(four);
    }
}
