package com.questdot.deviceinfoexample;

/**
 * Created by HP on 15/12/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.MyViewHolder> {

    private List<Device> deviceList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView key, value;

        public MyViewHolder(View view) {
            super(view);
            key = (TextView) view.findViewById(R.id.txtKey);
            value = (TextView) view.findViewById(R.id.txtValue);
        }
    }


    public DeviceAdapter(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Device device = deviceList.get(position);
        holder.key.setText(device.getKey());
        holder.value.setText(device.getValue());
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }
}