package com.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class AppConfigData {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String passWord;

    @Value("${url}")
    private String url;


}
