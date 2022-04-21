package Clases;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService ns;

    public UserService(NotificationService ns) {
        this.ns = ns;
    }

}
