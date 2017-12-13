package mobileappscompany.w3d1hwfragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fallaye on 12/12/17.
 */
public class DetailCelebrityAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Celebrity> mDataSource;
    TextView tvName, tvId, tvAge, tvGender;

    public DetailCelebrityAdapter(Context context, ArrayList<Celebrity> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get view for row item

        View rowView = mInflater.inflate(R.layout.detail_celebrity_list_item, parent, false);
        tvId = rowView.findViewById(R.id.tvCelebrityId);
        tvName = rowView.findViewById(R.id.tvCelebrityName);
        tvAge = rowView.findViewById(R.id.tvCelebrityAge);
        tvGender = rowView.findViewById(R.id.tvCelebrityGender);
        //let the activity pass the data to this fragment instead
        /*Celebrity celebrity = (Celebrity) getItem(position);
        tvId.setText(celebrity.getId());
        tvName.setText(celebrity.getName());
        tvAge.setText(celebrity.getAge());
        tvGender.setText(celebrity.getGender());*/

        return rowView;
    }

    public void updateCelebrityView(String id, String name, String age, String gender){
        /*TextView tvName, tvId, tvAge, tvGender;
        View rowView = mInflater.inflate(R.layout.detail_celebrity_list_item, null, false);
        tvId = rowView.findViewById(R.id.tvCelebrityId);
        tvName = rowView.findViewById(R.id.tvCelebrityName);
        tvAge = rowView.findViewById(R.id.tvCelebrityAge);
        tvGender = rowView.findViewById(R.id.tvCelebrityGender);*/

        tvId.setText(id);
        tvName.setText(name);
        tvAge.setText(age);
        tvGender.setText(gender);
    }


}
