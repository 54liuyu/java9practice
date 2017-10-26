/**
 * 
 */
module events.api.facebook {
	 requires events.api;
	 
	 provides events.api.EventService
	 	with events.api.facebook.FacebookEventService;
}