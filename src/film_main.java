/*
Create a class Film with string objects which stores name, language and
lead_actor and category (action/drama/fiction/comedy). Also include an
integer data member that stores the duration of the film. Include parameterized
constructor, default constructor and accessory functions to film class. Film
objects can be initialized either using a constructor or accessor functions.
Create a class Film Main that includes a main function. In the main function
create an array of objects that stores the information about the film. Also write
suitable methods to display the following
a. The English film(s) that has Arnold as its lead actor and that runs for
shortest duration.
b. The Tamil film(s) with Rajini as lead actor.
c. All the comedy movies.
 */
// Thu June 13 2024

class film {
    String name;
    String language;
    String lead_actor;
    String category;
    int duration;

    film(String name, String language, String lead_actor, String category, int duration) {
        this.name = name;
        this.language = language;
        this.lead_actor = lead_actor;
        this.category = category;
        this.duration = duration;
    }
}

public class film_main {
    public static void main(String[] args) {

        System.out.println("Question 5 output : ");
        System.out.println();


        film[] films = new film[5];
        films[0] = new film("The Terminator", "English", "Arnold", "Action", 107);
        films[1] = new film("Endhiran", "Tamil", "Rajini", "Fiction", 155);
        films[2] = new film("The Matrix", "English", "Keanu Reeves", "Action", 136);
        films[3] = new film("Chandramukhi", "Tamil", "Rajini", "Comedy", 166);
        films[4] = new film("The Hangover", "English", "Bradley Cooper", "Comedy", 100);

        System.out.println("English film(s) that has Arnold as its lead actor and that runs for shortest duration:");
        for (film f : films) {
            if (f.language.equals("English") && f.lead_actor.equals("Arnold")) {
                System.out.println(f.name + " - " + f.duration + " minutes");
            }
        }

        System.out.println("\nTamil film(s) with Rajini as lead actor:");
        for (film f : films) {
            if (f.language.equals("Tamil") && f.lead_actor.equals("Rajini")) {
                System.out.println(f.name);
            }
        }

        System.out.println("\nAll the comedy movies:");
        for (film f : films) {
            if (f.category.equals("Comedy")) {
                System.out.println(f.name);
            }
        }
    }
}







