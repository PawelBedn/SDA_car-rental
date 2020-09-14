import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    Scanner sc = new Scanner(System.in);

    private String name;
    private String surname;
    private String pesel;
    private LocalDate dateOfBirth;
    private int numerOfRentedCars;
    private int[] pes = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    public User() {};

    public User (String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        while (name == null || name.length() < 3) {
            System.out.print("Podaj imię nowego użytkownika: ");
            name = sc.nextLine();
            if (name.length() < 3) {
                System.out.println("Podałeś nieprawidłowe imie");
            }
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        while (surname == null || surname.length() < 3) {
            System.out.print("Podaj nazwisko nowego użytkownika: ");
            surname = sc.nextLine();
            if (surname.length() < 2) {
                System.out.println("Podałeś nieprawidłowe nnazwisko");
            }
        }
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel() {
        int[] pese = new int[11];
        int liczbaKontrolna = 0;
        do {
            while (pesel == null || pesel.length() != 11) {
                System.out.print("Podaj PESEL nowego użytkownika: ");
                pesel = sc.nextLine();
                if (pesel.length() != 11) {
                    System.out.println("Podałeś nieprawidłowe PESEL");
                }
            }
            Pattern pattern = Pattern.compile("(\\d)");
            Matcher matcher = pattern.matcher(pesel);
            int k = 0;
            while (matcher.find()) {
                String p = matcher.group(1);
                pese[k] = Integer.parseInt(p);
                k++;
            }
            System.out.println(Arrays.toString(pese));
            int sum = 0;
            for (int i = 0; i < pes.length; i++) {
                sum += pes[i] * pese[i];
            }
            System.out.println("sum = " + sum);
            liczbaKontrolna = 10 - sum % 10;
            System.out.println("liczbaKontrolna = " + liczbaKontrolna);
            if (liczbaKontrolna != pese[10]) {
                System.out.println("Podanno błędny PESEL");
            }
        } while (liczbaKontrolna != pese[10]);
        this.pesel = pesel;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumerOfRentedCars() {
        return numerOfRentedCars;
    }

    public void setNumerOfRentedCars(int numerOfRentedCars) {
        this.numerOfRentedCars = numerOfRentedCars;
    }
}
