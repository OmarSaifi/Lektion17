import java.util.Calendar;

public class Person {

    // Instansvariabler

    String firstName;
    String lastName;
    String dateOfBirth; // YYYY-MM-DD
    double height; // meter
    double weight; // kg

    // Metoder / Operationer / Funktioner

    /**
     * En klassmetod om returnerar hela namnet
     * @param p en instans av klassen person
     * @return namnet (förnamn + efternamn)
     ***/

    public static String getName(Person p){

        return p.firstName + " " + p.lastName;
    }

    /**
     * getAge är en klassmetod som beräknar ålder
     * @param p är en referens till ett objekt
     * @return
     */

    public static int getAge(Person p){
        String calender = Calendar.getInstance().getTime().toString();
        System.out.println(calender);
        // Substring nedan.
        String thisYearString = calender.substring(calender.lastIndexOf(' ')+1);
        System.out.println(thisYearString);
        int thisYear = Integer.parseInt(thisYearString);

        // Hämta år från dateOfBirth (1973-02-02) - Vill bara plocka de första 4.
        String yearString = p.dateOfBirth.substring(0, 4);
        int year = Integer.parseInt((yearString));
        System.out.println(year); // Problem har inte angett ålder


        // aktuellt år - år t.ex. 2020-1973 = 47
        int age = thisYear - year;
        System.out.println(age);

        return age;

    }

    /**
     * En klassmetod som beräknar kroppsmassindex
     * @param p är en referensvariabel av typer av person
     * @return
     */
    public static double getBMI(Person p){
        // Vikt / Längd * Längd
        return p.weight / (p.height * p.height);
    }

    /**
     * En klassmetod som returnerar viktklassen
     * @param p är en person
     * @return
     */
    public static String getBMICategory(Person p){

       double BMI = Person.getBMI(p);
        System.out.println(BMI);

        String category;
        if (BMI < 18.5)
            category = "Undervikt";
        else if (BMI < 25)
            category = "Normalvikt";
        else
            category = "Övervikt";


        return category;


    }


}
