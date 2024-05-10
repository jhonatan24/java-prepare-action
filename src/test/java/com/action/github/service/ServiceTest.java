package com.action.github.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @InjectMocks
    Service service;


    @Test
    public void holaTest(){
        Assertions.assertDoesNotThrow(() ->service.hola());
    }
}
