package hclee.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ko")
public class PrimaryKoreaGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "한국 안녕 서비";
    }
}

