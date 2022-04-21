package Clases;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService ns;

    public UserService(NotificationService ns) {
        this.ns = ns;
    }

}
