package com.example.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;
import com.example.demo.Model.Tugas1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tugas1Controller {

    private static final String template = "Hello";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/tugas")
    public Tugas1 tugas() {
        return new Tugas1(counter.incrementAndGet(), String.format(template));
    }
}