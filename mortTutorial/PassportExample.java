import java.time.LocalDate;

public class PassportExample {
    public static void main(String[] args){


        Passport passportKen = new Passport("1234", "US", LocalDate.of(2021,3,6));
        Passport passportYan = new Passport("5678", "Malaysia",LocalDate.of(2025,3,28));

        System.out.println("Passport Ken");
        System.out.println(passportKen.number);
        System.out.println(passportKen.country);
        System.out.println(passportKen.expiryDate);
        System.out.println();

        System.out.println("Passport Yan");
        System.out.println(passportYan.number);
        System.out.println(passportYan.country);
        System.out.println(passportYan.expiryDate);
        System.out.println();
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number,String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate=expiryDate;

        }



    }
}
