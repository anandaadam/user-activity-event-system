package com.example.activity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.example.activity.services",
        "com.example.activity.listeners",
        "com.example.activity.repositories"
})
public class AppConfig {
}
