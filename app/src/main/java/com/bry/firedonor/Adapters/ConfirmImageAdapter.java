package com.bry.firedonor.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bry.firedonor.Models.DonationImage;
import com.bry.firedonor.R;

import java.util.List;

public class ConfirmImageAdapter extends RecyclerView.Adapter<ConfirmImageAdapter.ViewHolder>{
    private List<DonationImage> selectedDonationItemImages;
    private Activity mActivity;
    private Context mContext;

    public ConfirmImageAdapter(List<DonationImage> itemImages, Activity ac, Context mCont){
        this.selectedDonationItemImages = itemImages;
        this.mActivity = ac;
        this.mContext = mCont;
    }

    @NonNull
    @Override
    public ConfirmImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.selected_image_item, viewGroup, false);
        return new ConfirmImageAdapter.ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull ConfirmImageAdapter.ViewHolder viewHolder, int i) {
        final DonationImage image = selectedDonationItemImages.get(i);
        viewHolder.itemImage.setImageBitmap(image.getImageBitmap());
    }

    @Override
    public int getItemCount() {
        return selectedDonationItemImages.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.confirmImagePart);
        }
    }
}
