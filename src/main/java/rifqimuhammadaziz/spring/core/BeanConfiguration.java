package rifqimuhammadaziz.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rifqimuhammadaziz.spring.core.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean // auto create object
    public Foo foo() {
        Foo foo = new Foo();
        log.info("New Foo created.");
        return foo;
    }
}
