package com.customer.admin.cpepsi_customers.Adapters;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.customer.admin.cpepsi_customers.After_service;
import com.customer.admin.cpepsi_customers.Java_files.ApiModel;
import com.customer.admin.cpepsi_customers.R;
import com.customer.admin.cpepsi_customers.util.AppPreference;
import com.squareup.picasso.Picasso;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Service_Recycler_Adapter extends RecyclerView.Adapter<Service_Recycler_Adapter.MyViewHolder> implements Filterable {
    private Context mContext;
    DownloadManager downloadManager;
    private Service_Recycler_Adapter service_recycler_adapter;
    Service_Recycler_Adapter_Listener listener;

    private String communStr = "http://jntrcpl.com/CPEPSI/uploads/";
   // private String communStr = "http://jntrcpl.com/CPEPSI/ ";

    DownloadManager.Request request;
    StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();


    String service;

    public ArrayList<ApiModel> services_list;
    private ArrayList<ApiModel> serviceListFiltered;
    private ProgressDialog progressBar;
    private String id= "";
    private String Service= "";
    private String Image;
    String sId = "";

    String[] sections;
    List<String> sectionLetters=new ArrayList<String>();

    public Service_Recycler_Adapter(FragmentActivity activity, ArrayList<ApiModel> services, Service_Recycler_Adapter_Listener listener) {
        mContext = activity;
        this.listener=listener;
        this.services_list = services;

        setHasStableIds(true);


    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView service_doc;
        public ImageView animalDoctor;
        public LinearLayout mainclick;


        public MyViewHolder(View itemView) {
            super(itemView);
            service_doc = (TextView) itemView.findViewById(R.id.service_txt_id);
            mainclick = (LinearLayout) itemView.findViewById(R.id.mainclick);
            animalDoctor = (ImageView) itemView.findViewById(R.id.animalDoctor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // send selected contact in callback
                    listener.onItemSelected(serviceListFiltered.get(getAdapterPosition()));
                }
            });
        }


    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.services_list, parent, false);


        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final ApiModel apiModel = services_list.get(position);
        holder.service_doc.setText(apiModel.getService());



        holder.mainclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiModel apiModel = services_list.get(position);
              /*  sId = apiModel.getId();
                AppPreference.setSid(mContext,sId);*/
                Intent intent = new Intent(mContext, After_service.class);
                intent.putExtra("ApiModel", apiModel);
                mContext.startActivity(intent);
              /*  Intent intent = new Intent(v.getContext(), After_service.class);
                intent.putExtra("ServiceId",id);
                intent.putExtra("ServiceName",Service);
                v.getContext().startActivity(intent);*/
            }
        });

        Image = apiModel.getImage();

        Picasso.with(mContext)
                .load(communStr + Image)
                .placeholder(R.drawable.doct1)
                .into(holder.animalDoctor);
//        holder.doc_date.setText(reports.getDoc_date());

        // notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return services_list.size();
    }


    @Override
    public long getItemId(int position) {
//        return super.getItemId(position);
        return position;
    }

 //**********************************************************************

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    serviceListFiltered = services_list;
                } else {
                   ArrayList<ApiModel> filteredList = new ArrayList<>();
                    for (ApiModel row : services_list) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getService().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    serviceListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = serviceListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                serviceListFiltered = (ArrayList<ApiModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public interface Service_Recycler_Adapter_Listener {
        void onItemSelected(ApiModel apiModel);
    }
}