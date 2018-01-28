package hclee.springframework.didemo.service;

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

