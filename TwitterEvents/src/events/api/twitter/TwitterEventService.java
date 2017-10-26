package events.api.twitter;

import events.api.EventService;

public class TwitterEventService implements EventService{
	
	public TwitterEventService() {
		System.out.println("TwitterEventService Constructor");
	}
	
	public String getName() {
		return "twitter events";
	}
}
