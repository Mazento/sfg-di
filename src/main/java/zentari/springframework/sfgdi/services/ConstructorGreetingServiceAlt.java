package zentari.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceAlt implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello there - Constructor Alt";
    }
}
