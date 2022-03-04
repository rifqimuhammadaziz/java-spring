package rifqimuhammadaziz.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rifqimuhammadaziz.spring.core.data.Foo;

public class DuplicateConfigurationTest {

    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class); // has 2 bean (foo1, foo2)
        });
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        // different object and name
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
