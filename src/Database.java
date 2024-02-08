import java.util.ArrayList;

public class Database {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Ticket> getTickets(){
        return tickets;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public ArrayList<Customer> getCustomer(ind id){
        return customer;
    }

}
