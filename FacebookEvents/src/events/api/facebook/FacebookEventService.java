package events.api.facebook;

import events.api.EventService;

public class FacebookEventService implements EventService{
	
	public FacebookEventService() {
		System.out.println("FacebookEventService Constructor");
	}
	
	public String getName() {
		return "facebook events";
	}
}
