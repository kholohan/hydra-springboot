package de.escalon.hypermedia.sample.springboot.event;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import de.escalon.hypermedia.sample.springboot.beans.event.Event;
import de.escalon.hypermedia.sample.springboot.model.event.EventModel;

/**
 * Created by dschulten on 28.12.2014.
 */
@Component
public class EventResourceAssembler extends ResourceAssemblerSupport<EventModel, Event> {

    public EventResourceAssembler() {
        super(EventController.class, Event.class);
    }

    @Override
    public Event toResource(EventModel eventModel) {
        return new Event(eventModel.id, eventModel.performer, eventModel.workPerformed, eventModel.location,
                eventModel.eventStatus);
    }
}
