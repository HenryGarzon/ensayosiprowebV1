package com.ensayosiprowebV1.ensayosiprowebV1.configuration;

import com.ensayosiprowebV1.ensayosiprowebV1.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public BeanMiNombre opearBeanMiNombre () {

        return new BeanMiNombreImplement();
    }
    @Bean
    public BeanMiAsignatura beanOperaMiAsignatura(BeanMiNombre beanMiNombre) {

        return new BeanMiAsignaturaImplement(beanMiNombre);
    }



}
