package hclee.springframework.didemo.config;

import hclee.springframework.didemo.examplebeans.FakeDataSource;
import hclee.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:jms.properties"),
        @PropertySource("classpath:datasource.properties")
})
public class PropertyConfig {

    @Autowired
    private Environment env;
    @Value("${hclee.username}")
    private String username;
    @Value("${hclee.password}")
    private String password;
    @Value("${hclee.dburl}")
    private String url;

    @Value("${hclee.jms.username}")
    private String jmsUsername;
    @Value("${hclee.jms.password}")
    private String jmsPassword;
    @Value("${hclee.jms.dburl}")
    private String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        final FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        final FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
