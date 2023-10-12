package org.example.service;

import org.example.domain.Event;
import org.example.repository.EventRepository;

public class EventService {

    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}
