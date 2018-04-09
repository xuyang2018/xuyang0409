package com.service.xuyang0409.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-09T13:10:58.564Z")

@RestSchema(schemaId = "xuyang0409")
@RequestMapping(path = "/xuyang0409", produces = MediaType.APPLICATION_JSON)
public class Xuyang0409Impl {

    @Autowired
    private Xuyang0409Delegate userXuyang0409Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userXuyang0409Delegate.helloworld(name);
    }

}
