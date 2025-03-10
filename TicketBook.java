import java.util.Scanner;
public class TicketBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input movie details
        System.out.println("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.println("Enter Seat Number: ");
        String seatNumber = sc.nextLine();
        System.out.println("Enter Ticket Price: ");
        double TicketPrice = sc.nextDouble();

        // Create MovieTicket object and book ticket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, TicketPrice);
        ticket.bookTicket(seatNumber, TicketPrice);
        ticket.displayTicketDetails();

        sc.close();
    }
}
// MovieTicket class to manage movie ticket details
class MovieTicket {
    String MovieName;
    String SeatNumber;
    double TicketPrice;

    // Constructor to initialize movie ticket details
    public MovieTicket(String MovieName, String SeatNumber, double TicketPrice) {
        this.MovieName = MovieName;
        this.SeatNumber = SeatNumber;
        this.TicketPrice = TicketPrice;
    }

    // Method to book a ticket
    public void bookTicket(String SeatNumber, double TicketPrice) {
        this.SeatNumber = SeatNumber;
        this.TicketPrice = TicketPrice;
        System.out.println("Ticket booked for " + MovieName + " at seat " + SeatNumber);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + MovieName);
        System.out.println("Seat Number: " + SeatNumber);
        System.out.println("Price: " + TicketPrice);
    }
}

//input
//Enter Movie Name:
//Mission Impossible
//Enter Seat Number:
//        34
//Enter Ticket Price:
//        400
//output
//Ticket booked for Mission Impossible at seat 34
//Movie Name: Mission Impossible
//Seat Number: 34
//Price: 400.0