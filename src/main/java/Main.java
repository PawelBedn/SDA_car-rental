import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int liczbaMenu = 0;

        User user1 = new User("Paweł", "Bednaroski", "86062915399");
        User user2 = new User("Marcin", "Jóźwik", "86100632456");
        User user3 = new User("Milena", "Cnotkowska", "85022032134");

        UserNonActive userNonActive = new UserNonActive(10);
        userNonActive.add(user1);
        userNonActive.add(user2);
        userNonActive.add(user3);

        Car car1 = new Car("Toyota", "Corolla", 200000, LocalDate.of(2008, 12, 20));
        Car car2 = new Car("Kia", "Rio", 12000, LocalDate.of(2018, 01, 12));
        Car car3 = new Car("Honda", "Civic", 15000, LocalDate.of(2018, 02, 21));

        CarParking carParking = new CarParking(10);
        carParking.add(car1);
        carParking.add(car2);
        carParking.add(car3);



        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to car rental");
            System.out.println("    1. List available cars");
            System.out.println("    2. Edit rental price");
            System.out.println("    3. Add new car");
            System.out.println("    4. List active users");
            System.out.println("    5. Add user");
            System.out.println("    6. Activate a user");
            System.out.println("    7. Rent a car");
            System.out.println("    8. List all rented cars");
            System.out.println("    9. Return a car");
            System.out.println("    10. Display monthly report");
            System.out.println("    11. Display yearly report");
            System.out.println("    12. Exit");
            System.out.println("Choose your option:");

            liczbaMenu = sc.nextInt();

            switch (liczbaMenu) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    User user = new User();
                    user.setName();
                    user.setSurname();
                    user.setPesel();
                    userNonActive.add(user);
                    break;
                }
            }

        } while (liczbaMenu != 12);





    }
}
