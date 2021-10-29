package com.javacodegeeks.example.eventhandler;

import com.javacodegeeks.example.event.AppEventA;
import com.javacodegeeks.example.source.EventSource;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventAHandler implements ApplicationListener<AppEventA> {

    @Override
    public void onApplicationEvent(AppEventA event) {

        Object source = event.getSource();
        if(source instanceof EventSource) {
            EventSource es = (EventSource)source;
            System.out.print(es.getNotes());
        }
    }
}