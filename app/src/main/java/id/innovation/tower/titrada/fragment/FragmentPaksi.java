package id.innovation.tower.titrada.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.innovation.tower.titrada.R;

public class FragmentPaksi extends Fragment {
	
	public FragmentPaksi(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_paksi, container, false);
         
        return rootView;
    }
}
