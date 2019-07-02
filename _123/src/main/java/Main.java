public class Main {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob","newemail@.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Sammy", 30000.0, "sammy@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }

}
