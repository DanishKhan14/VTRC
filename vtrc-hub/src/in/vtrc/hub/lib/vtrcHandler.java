package in.vtrc.hub.lib;

public interface vtrcHandler {
	
	public class Context {
		public String srcUrl;
		// TODO add other context for incoming message
	}

	public void handlePayload(String payload, final Context ctx);
}
