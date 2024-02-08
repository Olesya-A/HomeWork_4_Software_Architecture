import java.util.ArrayList;

public class Customer {
    private int id;
    private ArrayList<Ticket> tickets;
    private CashProvider cashProvider;

    public boolean buyTicket(Ticket ticket) {
        return true;
    }

    public boolean repealTicket(Ticket ticket) {
        return false;
    }

    public ArrayList<Ticket> searchTicket(int rootNumber){
        return new ArrayList<Ticket>();
    }
}