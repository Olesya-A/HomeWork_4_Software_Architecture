public class CashProvider {
    private Long card;
    private boolean isAuthoriation;

    public boolean buy(int price) {
        return true;
    }

    public boolean repealTicket(int price) {
        return false;
    }
    public void isAuthoriation(Customer customer){}
}