package de.escalon.hypermedia.sample.springboot.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by ryan on 7/31/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({HydraConfig.class})
public @interface EnableHydra {

    HydraType value() default HydraType.HYDRA;

    public static enum HydraType {
        HYDRA,UBER,SIREN,HTML,HAL
    }


}
