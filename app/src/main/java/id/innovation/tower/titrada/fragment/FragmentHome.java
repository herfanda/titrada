package id.innovation.tower.titrada.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.innovation.tower.titrada.R;
import id.innovation.tower.titrada.adapter.ImageAdapter;

public class FragmentHome extends Fragment {

    private ImageAdapter imageAdapter;
	
	public FragmentHome(){

    }
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         
        return rootView;

//        GridView gridView = (GridView) imageAdapter.getMainActivity().findViewById(R.id.grid_view);
//
//        // Instance of ImageAdapter Class
//        gridView.setAdapter(new ImageAdapter(imageAdapter.getMainActivity()));
    }
}
