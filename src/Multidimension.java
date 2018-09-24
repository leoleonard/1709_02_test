public class Multidimension {
    public static void main(String[] args) {
        String[] firstNames = {"Karol", "Basia", "Kasia", "Damian"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka", "Nowak"};

        String[][] firstLast = {firstNames, lastNames}; // laczenie dwoch tablic

        System.out.println("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
        System.out.println("Czwarta osoba:");
        System.out.println(firstLast[0][3] + " " + firstLast[1][3]);
    }
}