public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);
        theater.getSeats();
        if(theater.reserveSeatBinarySearch("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved");
        }

        if(theater.reserveSeatBinarySearch("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved");
        }

        if(theater.reserveSeatBinarySearch("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved");
        }

        if(theater.reserveSeatBinarySearch("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat reserved");
        }
    }
}
