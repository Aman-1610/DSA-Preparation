// A simple definition for a DVD.
class DVD {
    public String name;
    public int releaseYear;
    public String director;

    // Constructor to initialize the DVD object
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    // Overriding toString() method to print DVD details
    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

public class CreatingArray {
    public static void main(String[] args) {
        // Creating an array to hold DVD objects
        DVD[] dvdCollection = new DVD[5]; // Array size 5

        // Adding DVD objects to the array
        dvdCollection[0] = new DVD("Inception", 2010, "Christopher Nolan");
        dvdCollection[1] = new DVD("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski");
        dvdCollection[2] = new DVD("Interstellar", 2014, "Christopher Nolan");
        dvdCollection[3] = new DVD("The Godfather", 1972, "Francis Ford Coppola");
        //dvdCollection[4] = new DVD("Parasite", 2019, "Bong Joon-ho");

        // Displaying all DVDs in the collection
        System.out.println("DVD Collection:");
        for (int i = 0; i < dvdCollection.length; i++) {
            System.out.println((i + 1) + ". " + dvdCollection[i]);
        }
    }
}
