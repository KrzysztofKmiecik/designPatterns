package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommand implements CommandBase {

    // zle private UserRepository  userRepository =new UserRepository
    //bo wiązemy sie z konkretna implementacja
//lepiej w konstruktorze zeby byc zgodnym z SOLID Dependency injection wstrzykiwanie dependencji
    private UserRepository userRepository;
    private UserData user;

    public UserRegistrationCommand(final UserRepository userRepository,final UserData user) {
        this.userRepository = userRepository;
        this.user = user;
    }

    @Override
    public void execute() { // sprawdzic juz uzytkownika istnieje
        final boolean mailExists = userRepository.getUserData().stream()
                .anyMatch(ud -> ud.getEmail().equals(user.getEmail()));
        if (!mailExists) {
            userRepository.addUser(user);
        }
    }

    @Override
    public void undo() {
        userRepository.removeUser(user); //remove na liscie zwraca true albo false(nie ma go na liscie) i nic sie nie dzieje
    }
}
