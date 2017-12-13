package mobileappscompany.w3d1hwfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CelebrityFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CelebrityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CelebrityFragment extends Fragment /**implements AdapterView.OnItemClickListener*/{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param1";
    private static final String ARG_PARAM4 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    OnFragmentInteractionListener mListener;

    ArrayList<Celebrity> celebrityArrayList;
    //RecyclerView recyclerView;
    ListView listViewCelebrity;
    CelebrityAdapter celebrityAdapter;

    TextView tvCelebrityName, tvCelebrityId, tvCelebrityAge, tvCelebrityGender;
    String id, name, age, gender;

    public CelebrityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CelebrityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CelebrityFragment newInstance(String param1, String param2) {
        CelebrityFragment fragment = new CelebrityFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_celebrity, container, false);

        listViewCelebrity = rootView.findViewById(R.id.lvCelebrity);

        celebrityArrayList = new ArrayList<Celebrity>();
        celebrityArrayList = DataSource.getAllCelebrities();

        celebrityAdapter = new CelebrityAdapter(getContext(), celebrityArrayList);
        listViewCelebrity.setAdapter(celebrityAdapter);

        final Context context = getContext();

        listViewCelebrity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Celebrity celebrity = celebrityArrayList.get(position);

                id = celebrity.getId();
                name = celebrity.getName();
                age = celebrity.getAge();
                gender = celebrity.getGender();

                onCelebritySelected(id, name, age, gender);

            }
        });

        /*recyclerView = rootView.findViewById(R.id.rvCelebrity);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        celebrityArrayList = new ArrayList<Celebrity>();
        celebrityArrayList = DataSource.getAllCelebrities();

        celebrityAdapter = new CelebrityAdapter(celebrityArrayList);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(celebrityAdapter);*/

        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void onCelebritySelected(String id, String name, String age, String gender){
        if(mListener != null){
            mListener.onFragmentInteraction(id, name, age, gender);
        }
    }

  /*  @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Celebrity celebrity = DataSource.getAllCelebrities().get(position);

            *//*tvCelebrityId = view.findViewById(R.id.tvCelebrityId);
            tvCelebrityName = view.findViewById(R.id.tvCelebrityName);
            tvCelebrityAge = view.findViewById(R.id.tvCelebrityAge);
            tvCelebrityGender = view.findViewById(R.id.tvCelebrityGender);
*//*
            id = celebrity.getId();
            name = celebrity.getName();
            age = celebrity.getAge();
            gender = celebrity.getGender();

            onCelebritySelected(id, name, age, gender);
    }
*/


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String id, String name, String age, String gender);
    }


}
