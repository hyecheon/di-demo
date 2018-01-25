package hclee.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HelloHcLee = "Hello Hclee!!!";

    @Override
    public String sayGreeting() {
        return HelloHcLee;
    }
}
