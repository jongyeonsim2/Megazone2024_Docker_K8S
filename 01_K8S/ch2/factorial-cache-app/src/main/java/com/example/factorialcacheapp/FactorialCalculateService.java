package com.example.factorialcacheapp;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.RestClient;

import java.math.BigDecimal;

public class FactorialCalculateService {

    /**
     * HTTP clinet
     */
    private final RestClient factorialClient = RestClient.create();

    public BigDecimal getCalculateResult(int n) {

        /**
         * HTTP clinet 를 이용해서,
         * factorial-app-service:8080/factorial?n=10 호출해서
         * 결과를 받을 수 있도록 구현
         *
         * factorial-app-service:8080 호출
         * =>
         * 두 pod
         *   - my-factorial-app~~~~
         *   - my-factorial-cache-ap~~~~
         *  는 모두 동일한 factorial namespace 에 있고,
         *  동일한 네트워크상에 있으므로
         *  K8S Service 객체명(type : Cluster IP)으로 접속이 가능함.
         */
        /*
        factorialClient.get()
                .uri("http://factorial-app-service:8080/factorial?n="+n)
                .retrieve()
                .onStatus(HttpStatusCode::isError, ((request, response) ->
                        ))

         */

        BigDecimal result = BigDecimal.ZERO;

        return result;
    }
}
