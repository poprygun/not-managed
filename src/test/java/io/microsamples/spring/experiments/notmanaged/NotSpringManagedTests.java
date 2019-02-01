package io.microsamples.spring.experiments.notmanaged;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = { ContextProvider.class })
@RunWith(SpringRunner.class)
public class NotSpringManagedTests {

    @Test
    public void shouldLoadProperties() {
        NsmLocation nsmLocation = NsmLocation.builder().build();

        ApplicationContext context = ContextProvider.context();

        context.getAutowireCapableBeanFactory().autowireBeanProperties(nsmLocation
        , AutowireCapableBeanFactory.AUTOWIRE_BY_NAME
        , true);

        assertThat(nsmLocation.getName()).isNotEmpty();
    }
}
