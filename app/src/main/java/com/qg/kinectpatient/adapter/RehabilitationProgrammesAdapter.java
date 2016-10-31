package com.qg.kinectpatient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.qg.kinectpatient.R;
import com.qg.kinectpatient.model.RcStage;

import java.util.ArrayList;

/**
 * Created by 攀登者 on 2016/10/31.
 */
public class RehabilitationProgrammesAdapter extends ArrayAdapter<RcStage> {

    private int resourceId;

    public RehabilitationProgrammesAdapter(Context context, int resource, ArrayList<RcStage> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        RcStage rcStage = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (converView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.stage_name = (TextView) view.findViewById(R.id.stage_name);
            viewHolder.num = (TextView) view.findViewById(R.id.stage_num);
            view.setTag(viewHolder);
        } else {
            view = converView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.num.setText("阶段" + rcStage.getNum());
        viewHolder.stage_name.setText(rcStage.getActionName());
        return view;
    }

    class ViewHolder {
        TextView num;
        TextView stage_name;
    }
}