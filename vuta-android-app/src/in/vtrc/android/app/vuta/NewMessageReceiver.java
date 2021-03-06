package in.vtrc.android.app.vuta;

import in.vtrc.android.app.lib.Helper;
import in.vtrc.android.app.lib.xml.Notification;
import in.vtrc.android.app.vuta.provider.Provider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NewMessageReceiver extends BroadcastReceiver {

	private static final String TAG = "NewMessageReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.hasExtra("notification")) {
        	String payload = intent.getStringExtra("notification");
            Log.d(TAG, "Handling incoming messages: " + payload);
            Notification notif = Helper.parseNotification(payload);
            handleNotification(notif);
        } else {
            Log.d(TAG, "Broadcast Receiver ignoring message - no notification found");
        }
	}
	
	protected void handleNotification(Notification notif){
    	// TODO
    	// we need these arguments

    	// lastSyncToHubReceivedAtHub
    	// lastMessageReceivedAtHub
    	// lastBillingDetails - free string ...
    	// balance / credit
    	// userAppListLastChangeTimestamp on appHub
    	
    	// userList <u name="" id="" alias="" />...
    	// appList  <app name="" id="" alias=""> <role alias=""> <u id="" /> ... </role> <role...> </app>
    	
    	// Above was the grand goal - now simple implementation
    	// userList "username|alias;username|alias;..."
    	// appList  "appName|appId|appAlias|role1Alias:usrId:usrId:usrId|role2alias:...;
    	
    	if(null == Provider.providerInstance){
    		Log.e(TAG,"No Provider - whatsup...?");
    	} else {
    		if(notif.getNotificationName().equals("DeviceListUpdate")) {
    			String userList = notif.getArgument("userList");
    			Log.d(TAG, "Got user list as: " + userList);
    			Provider.providerInstance.loadUserSchema(userList);
    		}		
    	}
    }

}
