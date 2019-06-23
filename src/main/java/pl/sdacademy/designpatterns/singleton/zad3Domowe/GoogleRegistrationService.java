package pl.sdacademy.designpatterns.singleton.zad3Domowe;

public class GoogleRegistrationService implements RegistrationService {
    @Override
    public void register(final String username, final String email) {
        UsersRepository usersRepository = UsersRepository.INSTANCE;
        usersRepository.addUser(username,email);
    }
}
