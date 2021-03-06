package in.vtrc.android.app.lib;

import android.os.Environment;

public final class Constants {

	public static final String IBR_DTN_RECEIVE = "de.tubs.ibr.dtn.intent.RECEIVE"; // RECEIVE
			
	public static final String IBR_DTN_STATUS_REPORT = "de.tubs.ibr.dtn.intent.STATUS_REPORT"; // STATUS_REPORT
	
	
	public static final String REPORT_DELIVERED_INTENT = "in.vtrc.app.REPORT_DELIVERED";
	
	public static final String SEND_MSG_INTENT = "in.vtrc.app.SEND_MSG";
	
	public static final String NEWMSG_RECEIVED = "in.vtrc.app.DATA_RECEIVED";

	public static final String MSG_DELIVERED_APPHUB = "in.vtrc.app.HUB_RECEIVED";
	
	public static final String MARK_DELIVERED_INTENT = "in.vtrc.app.MARK_DELIVERED";
	
	public static final long LONG_LIFETIME = 3600*12;
	
	public static final long SHORT_LIFETIME = 3600;
	
	
	public static final String PUBLIC_DIR_PATH = Environment.getExternalStorageDirectory().toString() + "/vtrc/";
}
