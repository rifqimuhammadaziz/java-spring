package rifqimuhammadaziz.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import rifqimuhammadaziz.spring.core.data.Bar;
import rifqimuhammadaziz.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar" // create Foo after Bar created
    })
    public Foo foo() {
        log.info("New Foo created.");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("New Bar created.");
        return new Bar();
    }
}
