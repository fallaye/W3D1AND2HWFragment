package mobileappscompany.w3d1hwfragment;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CelebrityFragment.OnFragmentInteractionListener {

    ArrayList<Celebrity> celebrityArrayList;
    private static final String TAG = "Celebrity Fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment celebrityFragment =  CelebrityFragment.newInstance("s1", "s2");

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentCelebrity, celebrityFragment, TAG)
                    .commit();
    }

    @Override
    public void onFragmentInteraction(String id, String name, String age, String gender) {
        DetailCelebrityFragment detailCelebrityFragment = (DetailCelebrityFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragmentDetailCelebrity);
        detailCelebrityFragment.updateCelebrityView(id, name, age, gender);

    }
}
