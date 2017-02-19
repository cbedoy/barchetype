package cbedoy.barchetype.io.common.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.List;

import cbedoy.barchetype.R;
import cbedoy.barchetype.io.common.Circle;
import cbedoy.barchetype.io.common.User;
import cbedoy.barchetype.utils.Utils;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/24/16.
 */

public class MemberItemViewCell extends RecyclerView.Adapter
{
    private List<Circle> circles;
    private Context context;

    public void setCircles(List<Circle> circles) {
        this.circles = circles;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private class MemberViewCellHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        ImageView avatarView;
        ImageView powerView;
        public MemberViewCellHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.member_item_cell_title);
            avatarView = (ImageView) itemView.findViewById(R.id.member_item_cell_avatar);
            powerView = (ImageView) itemView.findViewById(R.id.member_item_cell_power);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_item_cell, null);
        return new MemberViewCellHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        Circle circle = circles.get(position);

        MemberViewCellHolder memberViewCellHolder = (MemberViewCellHolder) holder;

        memberViewCellHolder.powerView.setVisibility(position % 3 == 0 ? View.VISIBLE : View.INVISIBLE);
        memberViewCellHolder.titleView.setText(circle.getTitle());

        Glide.with(context).load(circle.getPreview()).into(memberViewCellHolder.avatarView);
    }

    @Override
    public int getItemCount() {
        return circles.size();
    }
}
