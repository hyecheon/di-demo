package hclee.springframework.didemo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ko")
public class PrimaryKoreaGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryKoreaGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getKoreaGreeting();
    }
}

