package Neutrino.String;

public class SplitCSV {
    public static void main(String[] args) {
        getDataFromCSV();
    }

    private static void getDataFromCSV() {
        String text = """
                Smith, Alex, Moncton
                Debbie, Paul, Moncton
                Richard, Kevin, Moncton
                Solo, David, Moncton
                Holpo, Pompy, Moncton
                """;
        String[] people = text.split("\n",1);
        System.out.println(people.length);

        System.out.println(people[0]);

        /*for (int i = 0; i <people.length ; i++) {
            System.out.println(people[i]);
        }*/
    }
}
