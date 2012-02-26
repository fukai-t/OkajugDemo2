package wiki.deep.okajugdemo2;

import android.app.Activity;
import android.	app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentEx1 extends Fragment {
	@Override
	public void onAttach(Activity activity){
		showToast( "[flag1]onAttach");
		super.onAttach(activity);
	}
	@Override
	public void onCreate(Bundle savedInstanceState){
		showToast( "[flag1]onCreate");
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
		showToast( "[flag1]onCreateView");
		return inflater.inflate(R.layout.fragone, container , false);
	}
	@Override
	public void onActivityCreated(Bundle bundle){
		showToast( "[flag1]onActivityCreated");
		super.onActivityCreated(bundle);
	}
	@Override
	public void onStart(){
		showToast( "[flag1]onStart");
		super.onStart();
	}
	@Override
	public void onResume(){
		showToast( "[flag1]onResume");
		super.onResume();
	}
	@Override
	public void onPause(){
		showToast( "[flag1]onPause");
		super.onPause();
	}
	@Override
	public void onStop(){
		showToast( "[flag1]onStop");
		super.onStop();
	}
	@Override
	public void onDestroyView(){
		showToast( "[flag1]onDestroyView");
		super.onDestroyView();
	}
	@Override
	public void onDestroy(){
		showToast( "[flag1]onDestroy");
		super.onDestroy();
	}
	@Override
	public void onDetach(){
		showToast( "[flag1]onDetach");
		super.onDetach();
	}
	private void showToast(String mes){
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
		if(sp.getBoolean("Fragment1", false)){
			St.showToast(getActivity(), mes);
		}
	}
}
