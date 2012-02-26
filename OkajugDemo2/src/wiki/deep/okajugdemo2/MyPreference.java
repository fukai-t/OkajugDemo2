package wiki.deep.okajugdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MyPreference extends PreferenceActivity {
	private static final String ACTION_BTNCLICK = "wiki.deep.OkajugDemo2.PUSH_ACT_BTN";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		//android.os.Debug.waitForDebugger();
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pre);
	}

}
	