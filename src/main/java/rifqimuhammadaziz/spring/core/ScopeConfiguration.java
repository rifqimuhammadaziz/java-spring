package rifqimuhammadaziz.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import rifqimuhammadaziz.spring.core.data.Bar;
import rifqimuhammadaziz.spring.core.data.Foo;
import rifqimuhammadaziz.spring.core.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    // configure new scope
    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer customScope = new CustomScopeConfigurer();
        customScope.addScope("doubleton", new DoubletonScope());
        return customScope;
    }

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("New Foo created.");
        return new Foo();
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("New Bar created.");
        return new Bar();
    }
}
