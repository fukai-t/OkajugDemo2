package wiki.deep.okajugdemo2;

import android.app.Activity;
import android.	app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
public class FragmentEx2 extends Fragment {
	@Override
	public void onAttach(Activity activity){
		showToast( "[flag2]onAttach");
		super.onAttach(activity);
	}
	@Override
	public void onCreate(Bundle savedInstanceState){
		showToast( "[flag2]onCreate");
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
		showToast( "[flag2]onCreateView");
		return inflater.inflate(R.layout.fragtwo, container , false);
	}
	@Override
	public void onActivityCreated(Bundle bundle){
		showToast( "[flag2]onActivityCreated");
		super.onActivityCreated(bundle);
	}
	@Override
	public void onStart(){
		showToast( "[flag2]onStart");
		super.onStart();
	}
	@Override
	public void onResume(){
		showToast( "[flag2]onResume");
		super.onResume();
	}
	@Override
	public void onPause(){
		showToast( "[flag2]onPause");
		super.onPause();
	}
	@Override
	public void onStop(){
		showToast( "[flag2]onStop");
		super.onStop();
	}
	@Override
	public void onDestroyView(){
		showToast( "[flag2]onDestroyView");
		super.onDestroyView();
	}
	@Override
	public void onDestroy(){
		showToast( "[flag2]onDestroy");
		super.onDestroy();
	}
	@Override
	public void onDetach(){
		showToast( "[flag2]onDetach");
		super.onDetach();
	}
	
	private void showToast(String mes)	{
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
		if(sp.getBoolean("Fragment2", false)){
			St.showToast(getActivity(), mes);
		}
	}
}
