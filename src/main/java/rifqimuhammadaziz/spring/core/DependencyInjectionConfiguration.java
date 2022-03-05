package rifqimuhammadaziz.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rifqimuhammadaziz.spring.core.data.Bar;
import rifqimuhammadaziz.spring.core.data.Foo;
import rifqimuhammadaziz.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    // auto dependency injection
    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
