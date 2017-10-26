package client.calendar;

import java.util.ServiceLoader;

import events.api.EventService;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Calendar events..!!!");

		ServiceLoader<EventService> events = ServiceLoader.load(EventService.class);
		
		for(EventService event : events) {
			System.out.println(event.hashCode() + " : " +event.getName());
		}
		
		events.reload();
		
		for(EventService event : events) {
			System.out.println(event.hashCode() + " : " +event.getName());
		}
		
	}

}
