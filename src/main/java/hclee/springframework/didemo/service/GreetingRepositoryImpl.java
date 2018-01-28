package hclee.springframework.didemo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getKoreaGreeting() {
        return "안녕 중요 인사 서비스";
    }
}
