package wiki.deep.okajugdemo2;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class OkajugDemo2Activity extends Activity {
    /** Called when the activity is first created. */
/*    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    */
	final String PUSH_ACT_BTN = "wiki.deep.OkajugDemo2.PUSH_ACT_BTN";
	boolean even = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.main);
        showToast( "[Activity]onCreate");
        
        FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction 
			= fragmentManager.beginTransaction();
		
		FragmentEx1 fragment1 = new FragmentEx1();
		fragmentTransaction.replace(android.R.id.content, fragment1);
		fragmentTransaction.commit();
    }
    @Override
    public void onStart() {
        super.onStart();
        showToast( "[Activity]onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        showToast( "[Activity]onResume");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        showToast( "[Activity]onRestart");
    }
    @Override
    public void onPause() {
        super.onPause();
        showToast( "[Activity]onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        showToast("[Activity]onstop" );
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        showToast( "[Activity]onDestory");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// メニューの要素を追加
    	MenuItem cfg = menu.add("change Fragment");
    	cfg.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
    	cfg.setIcon(android.R.drawable.ic_menu_rotate);
	    // メニューの要素を追加して取得
	    MenuItem actionItem = menu.add("Setting");
	    // SHOW_AS_ACTION_IF_ROOM:余裕があれば表示
	    actionItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
	    actionItem.setIcon(android.R.drawable.ic_menu_more);
	    return true;
    }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getTitle().equals("Setting")){
			Intent intent = new Intent(this , MyPreference.class);
			startActivity(intent);
		}
		else if(item.getTitle().equals("change Fragment")){
			 FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
			if(even){
				FragmentEx1 fragment1 = new FragmentEx1();
				fragmentTransaction.replace(android.R.id.content, fragment1);
				even = false;
				fragmentTransaction.commit();
				}
			else{
				FragmentEx2 fragment2 = new FragmentEx2();
				fragmentTransaction.replace(android.R.id.content, fragment2);
				even = true;
				fragmentTransaction.commit();
			}
		}
	
	    return true;
	}
	 
	private void showToast(String mes){
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		if(sp.getBoolean("Activity", false)){
			St.showToast(this, mes);
		}
	}
}