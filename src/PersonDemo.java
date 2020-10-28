public class PersonDemo {

    public static void main(String[] args) {

        // Skapa instanser av klassen person

        Person p1; // p1 är en referensvariabel
        p1 = new Person(); // ett objekt skapas

        // Skriv ut objektet
        System.out.println(p1); // Hashkod - person@7823645
        System.out.println(p1.firstName); // Null
        System.out.println(p1.lastName); // Null
        System.out.println(p1.dateOfBirth); // Null
        System.out.println(p1.height); // 0.0
        System.out.println(p1.weight); // 0.0

        // Ändra namnet
        p1.firstName = "Omar";
        p1.lastName = "Saifi";

        // Skriv ut hela namnet med hjölp av en metod
        String name = Person.getName(p1);
        System.out.println(name);
        //eller.. Vill jag använda namn flera gånger då använd alt. 1.
        // Vill jag bara skriva ut använd alt.2
        System.out.println(Person.getName(p1));


        // Arbeta med ålder
        p1.dateOfBirth = "1973-06-28";
        Person.getAge(p1);
        System.out.println("Ålder " + Person.getAge(p1) + " år");

        // Arbeta med BMI
        double BMI = Person.getBMI(p1);
        System.out.println(BMI); // NaN NotaNumber
        p1.height = 1.70; // m
        p1.weight = 85; // kg
        System.out.printf("BMI: %.2f \n" , Person.getBMI(p1));


        // Visa viktklassen
        String viktklass = Person.getBMICategory(p1);
        System.out.println("Viktklass: " + viktklass);


    }
}
