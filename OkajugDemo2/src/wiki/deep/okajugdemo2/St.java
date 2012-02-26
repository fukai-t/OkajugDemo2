package wiki.deep.okajugdemo2;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class St {
	public static void showToast(Context context, String mes ){
		Toast t = Toast.makeText(context ,mes, Toast.LENGTH_SHORT);
		t.show();	
		Log.d("[OkajugDemo2]", mes);
	}	
}
