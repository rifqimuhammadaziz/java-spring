package rifqimuhammadaziz.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rifqimuhammadaziz.spring.core.data.Foo;

public class DependsOnTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        Foo foo = applicationContext.getBean(Foo.class); // Foo is lazy but this line is need Foo, so Foo will be created
    }
}
