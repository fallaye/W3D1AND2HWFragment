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
public class CelebrityAdapter extends BaseAdapter{

    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Celebrity> mDataSource;

    public CelebrityAdapter(Context context, ArrayList<Celebrity> items) {
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
        TextView tvName;
        View rowView = mInflater.inflate(R.layout.celebrity_list_item, parent, false);
        tvName = rowView.findViewById(R.id.tvCelebrityName);

        Celebrity celebrity = (Celebrity)getItem(position);
        tvName.setText(celebrity.getName());

        return rowView;
    }
}

/*
public class CelebrityAdapter extends RecyclerView.Adapter<CelebrityAdapter.CelebrityViewHolder> {
    private ArrayList<Celebrity> celebrityArrayList;

    public CelebrityAdapter(ArrayList<Celebrity> celebrityArrayList){
        this.celebrityArrayList = celebrityArrayList;
    }

    @Override
    public CelebrityAdapter.CelebrityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.celebrity_list_item, parent, false);

        return new CelebrityViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CelebrityAdapter.CelebrityViewHolder holder, int position) {
        Celebrity celebrity = celebrityArrayList.get(position);
       // holder.id.setText(celebrity.getId());
        holder.name.setText("Name: " + celebrity.getName());
        //holder.age.setText(celebrity.getAge());
        //holder.gender.setText(celebrity.getGender());

    }

    @Override
    public int getItemCount() {
        return celebrityArrayList.size();
    }

    public class CelebrityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView id, name, age, gender;

        public CelebrityViewHolder(View itemView) {
            super(itemView);

            //id = itemView.findViewById(R.id.tvCelebrityId);
            //age = itemView.findViewById(R.id.tvCelebrityAge);
            name = itemView.findViewById(R.id.tvCelebrityName);
            //gender = itemView.findViewById(R.id.tvCelebrityGender);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
*/
