package com.vasiliskardaras.microservices.order.config;

import com.vasiliskardaras.microservices.order.client.InventoryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
public class RestClientConfig {

    @Bean
    InventoryClient inventoryClient() {
        RestClient client = RestClient.create("http://localhost:8082");
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(client))
                .build();
        return factory.createClient(InventoryClient.class);
    }
}
