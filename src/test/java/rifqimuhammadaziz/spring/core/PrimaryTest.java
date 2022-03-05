package rifqimuhammadaziz.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rifqimuhammadaziz.spring.core.data.Foo;

public class PrimaryTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimaryBean() {
        Foo foo = applicationContext.getBean(Foo.class); // auto get primary bean (foo1)
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);// get foo1
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);// get foo2

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
