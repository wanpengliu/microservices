
package com.book.store.bookstorecustomer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {


    @RequestMapping("/greeting")
    public String greeting(@RequestParam ("name") String name) {

        log.debug("greeting called");
        return "hello" + name;
    }
}
