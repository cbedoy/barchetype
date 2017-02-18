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

import cbedoy.barchetype.io.common.User;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/24/16.
 */

public class MemberItemViewCell extends RecyclerView.Adapter
{
    private List<User> users;
    private Context context;

    public void setUsers(List<User> users) {
        this.users = users;
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
        User user = users.get(position);

        MemberViewCellHolder memberViewCellHolder = (MemberViewCellHolder) holder;

        memberViewCellHolder.powerView.setVisibility(position % 3 == 0 ? View.VISIBLE : View.INVISIBLE);
        memberViewCellHolder.powerView.setImageResource(position % 5 == 0 ? R.drawable.admin_icon : R.drawable.owner_icon);
        memberViewCellHolder.titleView.setText(user.getNickname());

        Glide.with(context).load(user.getAvatar()).into(memberViewCellHolder.avatarView);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
