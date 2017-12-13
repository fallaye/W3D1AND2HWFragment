package mobileappscompany.w3d1hwfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailCelebrityFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    TextView tvCelebrityName, tvCelebrityId, tvCelebrityAge, tvCelebrityGender;

    public DetailCelebrityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.detail_celebrity_list_item, container, false);

        //updateCelebrityView();
        tvCelebrityId = view.findViewById(R.id.tvCelebrityId);
        tvCelebrityName = view.findViewById(R.id.tvCelebrityName);
        tvCelebrityAge = view.findViewById(R.id.tvCelebrityAge);
        tvCelebrityGender = view.findViewById(R.id.tvCelebrityGender);
        //updateCelebrityView();

        return view;
    }

    public void updateCelebrityView(String id, String name, String age, String gender){
        tvCelebrityId.setText(id);
        tvCelebrityName.setText(name);
        tvCelebrityAge.setText(age);
        tvCelebrityGender.setText(gender);
    }



}
