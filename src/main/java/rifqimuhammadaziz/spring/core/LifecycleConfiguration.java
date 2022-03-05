package rifqimuhammadaziz.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rifqimuhammadaziz.spring.core.data.Connection;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }
}
