/**
 * 
 */
/**
 * @author rameshcharykotha
 *
 */
module events.api.twitter {
	requires events.api;
	
	provides events.api.EventService
 	with events.api.twitter.TwitterEventService;
}