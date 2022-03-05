package rifqimuhammadaziz.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import rifqimuhammadaziz.spring.core.data.Bar;
import rifqimuhammadaziz.spring.core.data.Foo;
import rifqimuhammadaziz.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary // will be used if no @Qualifier
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    // auto dependency injection
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) { // specific Foo Bean
        return new FooBar(foo, bar);
    }
}
