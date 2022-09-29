public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("zelena");
        Auto auto3 = new Auto();

        auto1.nastartovatAuto();


        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        System.out.println(auto2.nastartovatAuto2());
        System.out.println(auto2.nastartovatAuto2());


    }
}
