import java.util.ArrayList;

public class demoArrayLIst {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<>();

        customer customer1 = new customer(1, "Zakia");
        customer customer2 = new customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);
        
        customers.add(new customer(4, "Cica"));
        customers.add(2, new customer(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        customer Customer = customers.get(1);
        System.out.println(Customer.name);
        Customer.name = "Budi Utomo";

        ArrayList<customer> newCustomers = new ArrayList<>();
        newCustomers.add(new customer(201, "Della"));
        newCustomers.add(new customer(201, "Victor"));
        newCustomers.add(new customer(201, "Sarah"));

        customers.addAll(newCustomers);

        for (customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }  
}
