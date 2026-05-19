import java.util.Date;

public class StudentTicket extends StandardTicket {
    private static final double STUDENT_DISCOUNT = 0.50;

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    @Override
    public double getTotalPrice() {
        double baseWithTax = getBasePrice() * (1 + getTax());
        return baseWithTax * getTicketCount() * (1 - STUDENT_DISCOUNT);
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }
}
