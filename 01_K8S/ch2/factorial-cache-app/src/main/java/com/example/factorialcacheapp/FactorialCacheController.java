package com.example.factorialcacheapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialCacheController {

    /**
     * K8S ConfigMap 객체에서 설정된 language 환경변수
     */
    @Value("${APP_LANGUAGE}")
    private String language;

    // http://localhost/factorial/10
    @GetMapping("/factorial/{n}")
    public String calculateFactorial(@PathVariable("n") int number) {

        return switch (language) {
            case "ko" -> number + " 팩토리얼은" + number + "입니다.";
            case "en" -> "the factorial of " + number + " is " + number;
            default -> "Unknown language.";
        };
    }
}
