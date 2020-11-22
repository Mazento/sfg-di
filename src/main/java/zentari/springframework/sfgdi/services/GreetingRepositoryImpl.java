package zentari.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello There - EN";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola, bitches! - ES";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst - DE";
    }
}
