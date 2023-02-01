import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(2, 3, "Science Fiction", "Arrival", "Denis Villeneuve", "10 baje", 500);
        moviesList.add(m1);
        Movie m2 = new Movie(3,4, "Indie Film", "Carol", "Todd Haynes", "11 baje", 699);
        moviesList.add(m2);
        Movie m3 = new Movie(4,5, "Romance", "Brokeback Mountain", "Ang Lew", "12 baje", 500);
        moviesList.add(m3);
        Movie m4 = new Movie(5,6, "Tragicomedy", "The Banshees of Inisherin", "Martin McDonagh", "2 baje", 699);
        moviesList.add(m4);
        Movie m5 = new Movie(6,7,"Melodrama", "One Day", "Lone Scherfig", "7 baje", 555);
        moviesList.add(m5);


        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Pranjal", 19,"pranjal.khatiwada@gmail.com");
        users.add(u1);
        User u2 = new User("Sangita", 18, "sangita.kc@gmail.com");
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Comfortable", 4);
        seats.add(s1);
        Seat s2 = new Seat("Very very comfortable", 5);
        seats.add(s2);

        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m4.getMovies("2 baje");

    }
}

