package io.microsamples.spring.experiments.notmanaged;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Builder
@Data
public class NsmLocation {
    @Value("not.managed.location.name")
    private String name;
}
