package com.service.xuyang0409.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestXuyang0409 {

        Xuyang0409Delegate xuyang0409Delegate = new Xuyang0409Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = xuyang0409Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}