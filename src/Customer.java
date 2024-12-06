public class Customer {

    private String name;

    private double creditLimit;

    private String emailAddress;


    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;

        this.creditLimit = creditLimit;

        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Default Name", "defaul@email.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 9999.00, emailAddress);
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
