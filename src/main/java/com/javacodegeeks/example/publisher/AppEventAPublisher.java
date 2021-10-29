package com.javacodegeeks.example.publisher;

import com.javacodegeeks.example.event.AppEventA;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class AppEventAPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(AppEventA appEventA) {
        this.publisher.publishEvent(appEventA);
    }
}