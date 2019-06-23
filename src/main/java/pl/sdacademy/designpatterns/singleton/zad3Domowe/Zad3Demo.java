package pl.sdacademy.designpatterns.singleton.zad3Domowe;

public class Zad3Demo {
    public static void main(String[] args) {
        FBRegistrationService fbRegistrationService = new FBRegistrationService();
        GoogleRegistrationService googleRegistrationService = new GoogleRegistrationService();

        fbRegistrationService.register("Janek", "janek@gmail.com");
        fbRegistrationService.register("Marek", "marek@gmail.com");
        googleRegistrationService.register("Franek", "franek@gmail.com");
        googleRegistrationService.register("Darek", "darek@gmail.com");

        UsersRepository usersRepository = UsersRepository.INSTANCE;
        usersRepository.getUsernamesToEmails().forEach((k, v) -> System.out.println("userName:" + k + ", email:" + v));
    }
}
//OUTPUT
/*
userName:Darek, email:darek@gmail.com
userName:Franek, email:franek@gmail.com
userName:Janek, email:janek@gmail.com
userName:Marek, email:marek@gmail.com
 */