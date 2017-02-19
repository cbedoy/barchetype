package cbedoy.barchetype.io.common.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


import cbedoy.barchetype.R;
import cbedoy.barchetype.io.common.Value;
import cbedoy.barchetype.utils.ItemTouchHelperAdapter;
import cbedoy.barchetype.utils.ItemTouchHelperViewHolder;
import cbedoy.barchetype.utils.Utils;
import cbedoy.barchetype.io.common.Button;
import cbedoy.barchetype.io.common.CommonHeader;
import cbedoy.barchetype.io.common.Counter;
import cbedoy.barchetype.io.common.Credit;
import cbedoy.barchetype.io.common.Detail;
import cbedoy.barchetype.io.common.DetailSelector;
import cbedoy.barchetype.io.common.DividerSectionTitle;
import cbedoy.barchetype.io.common.Header;
import cbedoy.barchetype.io.common.Circles;
import cbedoy.barchetype.io.common.Option;
import cbedoy.barchetype.io.common.Section;
import cbedoy.barchetype.io.common.Selector;
import cbedoy.barchetype.io.common.Single;
import cbedoy.barchetype.io.common.User;
import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/14/16.
 */
public class BaseViewCell extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemTouchHelperAdapter {

    private List<BaseCell> dataModel;
    private Context context;
    private IBaseViewCellDelegate delegate;

    public void setDelegate(IBaseViewCellDelegate delegate) {
        this.delegate = delegate;
    }
    public void setDataModel(List<BaseCell> dataModel) {
        this.dataModel = dataModel;
    }
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        BaseCell baseCell = dataModel.remove(fromPosition);
        dataModel.add(toPosition > fromPosition ? toPosition - 1 : toPosition, baseCell);
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void onItemDismiss(int position) {
        dataModel.remove(position);
        notifyItemRemoved(position);
    }

    private class BaseHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {

        public BaseHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }
    }

    private class HeaderHolder extends RecyclerView.ViewHolder
    {
        ImageView avatar;
        TextView nickname;
        TextView email;
        ImageView holderView;
        public HeaderHolder(View itemView) {
            super(itemView);

            nickname = (TextView) itemView.findViewById(R.id.header_cell_nickname);
            email = (TextView) itemView.findViewById(R.id.header_cell_email);
            avatar = (ImageView) itemView.findViewById(R.id.header_cell_avatar);
            holderView = (ImageView) itemView.findViewById(R.id.header_cell_avatar_holder_view);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, nickname);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, email);
        }
    }

    private class ButtonHolder extends RecyclerView.ViewHolder
    {
        TextView titleView;
        public ButtonHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.button_cell_title);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
        }
    }

    private class SingleHolder extends RecyclerView.ViewHolder{
        TextView titleView;

        public SingleHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.single_cell_title);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, titleView);
        }
    }

    private class CreditHolder extends RecyclerView.ViewHolder{
        TextView titleView;

        public CreditHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.credit_cell_title);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_THIN, titleView);
        }
    }

    private class OptionHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        ImageView iconView;
        public OptionHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.option_cell_title);
            iconView = (ImageView) itemView.findViewById(R.id.option_cell_icon);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, titleView);
        }
    }

    private class CounterHolder extends RecyclerView.ViewHolder{

        TextView titleView;
        TextView counterView;
        public CounterHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.counter_cell_title);
            counterView = (TextView) itemView.findViewById(R.id.counter_cell_value);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, counterView);
        }
    }


    private class ValueHolder extends RecyclerView.ViewHolder{

        TextView titleView;
        TextView valueView;
        public ValueHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.common_text_cell_title);
            valueView = (TextView) itemView.findViewById(R.id.common_text_cell_value);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, valueView);
        }
    }

    private class DetailHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        TextView descriptionView;
        public DetailHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.detail_cell_title);
            descriptionView = (TextView) itemView.findViewById(R.id.detail_cell_description);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, descriptionView);
        }
    }

    private class DetailSelectorHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        TextView descriptionView;
        Switch selectorView;
        public DetailSelectorHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.detail_selector_cell_title);
            descriptionView = (TextView) itemView.findViewById(R.id.detail_selector_cell_description);
            selectorView = (Switch) itemView.findViewById(R.id.detail_selector_cell_selector);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, descriptionView);
        }
    }

    private class DividerHolder extends RecyclerView.ViewHolder{

        public DividerHolder(View itemView) {
            super(itemView);
        }
    }

    private class DividerSectionHolder extends RecyclerView.ViewHolder{

        public DividerSectionHolder(View itemView) {
            super(itemView);
        }
    }

    private class SelectorHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        Switch selectorView;
        public SelectorHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.selector_cell_title);
            selectorView = (Switch) itemView.findViewById(R.id.selector_cell_selector);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, titleView);
        }
    }

    private class SectionHolder extends RecyclerView.ViewHolder
    {
        TextView titleView;
        public SectionHolder(View itemView)
        {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.section_cell_title);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_BOLD, titleView);
        }
    }

    private class PeopleHolder extends BaseHolder
    {
        ImageView favoriteView;
        TextView nicknameView;
        ImageView avatarView;

        public PeopleHolder(View itemView) {
            super(itemView);

            favoriteView = (ImageView) itemView.findViewById(R.id.people_view_cell_favorite);
            nicknameView = (TextView) itemView.findViewById(R.id.people_view_cell_username);
            avatarView = (ImageView) itemView.findViewById(R.id.people_view_cell_avatar);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, nicknameView);
        }
    }

    private class DividerSectionTitleHolder extends RecyclerView.ViewHolder{
        TextView titleView;

        public DividerSectionTitleHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.divider_section_cell_title);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_BOLD, titleView);
        }
    }

    private class CommonHeaderHolder extends RecyclerView.ViewHolder{
        TextView titleView;
        TextView descriptionView;
        ImageView avatarView;
        ImageView holderView;

        public CommonHeaderHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.common_header_cell_title);
            descriptionView = (TextView) itemView.findViewById(R.id.common_header_cell_description);
            avatarView = (ImageView) itemView.findViewById(R.id.common_header_cell_avatar);
            holderView = (ImageView) itemView.findViewById(R.id.common_header_cell_overlay);

            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_MEDIUM, titleView);
            Utils.setTypefaceOnView(Utils.TYPEFACE.ROBOTO_REGULAR, descriptionView);
        }
    }

    private class MembersHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public MembersHolder(View itemView) {
            super(itemView);

            recyclerView = (RecyclerView) itemView.findViewById(R.id.member_cell_recycler_view);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == BaseCell.BASE_CELL_TYPE.OPTION.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.option_cell, parent, false);
            return new OptionHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.COUNTER.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.counter_cell, parent, false);
            return new CounterHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DETAIL.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_cell, parent, false);
            return new DetailHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DIVIDER.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.divider_cell, parent, false);
            return new DividerHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DIVIDER_SECTION.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.divider_section_cell, parent, false);
            return new DividerSectionHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SECTION.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_cell, parent, false);
            return new SectionHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SELECTOR.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.selector_cell, parent, false);
            return new SelectorHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DETAIL_SELECTOR.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_selector_cell, parent, false);
            return new DetailSelectorHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.CREDIT.getValue()){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.credit_cell, parent, false);
            return new CreditHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SINGLE.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_cell, parent, false);
            return new SingleHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.BUTTON.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.button_cell, parent, false);
            return new ButtonHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.CIRCLE.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.people_cell, parent, false);
            return new PeopleHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DIVIDER_SECTION_TITLE.getValue()){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.divider_title_cell, parent, false);
            return new DividerSectionTitleHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.COMMON_HEADER.getValue()){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_header_cell, parent, false);
            return new CommonHeaderHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.MEMBERS.getValue()){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.members_cell, parent, false);
            return new MembersHolder(view);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.VALUE.getValue())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_text_cell, parent, false);
            return new ValueHolder(view);
        }
        else
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_cell, parent, false);
            return new HeaderHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position)
    {

        int viewType = getItemViewType(position);

        if (viewType == BaseCell.BASE_CELL_TYPE.HEADER.getValue())
        {
            HeaderHolder headerHolder = (HeaderHolder) holder;

            Header header = (Header) dataModel.get(position);

            headerHolder.nickname.setText(header.getUser().getNickname());
            headerHolder.email.setText(header.getUser().getEmail());

            Glide.with(context).load(header.getUser().getAvatar()).into(headerHolder.avatar);

            Glide.with(context)
                    .load(header.getUser().getAvatar())
                    .bitmapTransform(new BlurTransformation(context, 25))
                    .into(headerHolder.holderView);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SELECTOR.getValue())
        {
            SelectorHolder selectorHolder = (SelectorHolder) holder;

            Selector selector = (Selector) dataModel.get(position);

            selectorHolder.titleView.setText(selector.getTitle());
            selectorHolder.selectorView.setChecked(selector.isSelected());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SECTION.getValue()){
            SectionHolder sectionHolder = (SectionHolder) holder;

            Section section = (Section) dataModel.get(position);

            sectionHolder.titleView.setText(section.getTitle());
        }
        else if(viewType == BaseCell.BASE_CELL_TYPE.DIVIDER_SECTION.getValue())
        {

        }
        else if(viewType == BaseCell.BASE_CELL_TYPE.DIVIDER.getValue())
        {

        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.COUNTER.getValue())
        {
            CounterHolder counterHolder = (CounterHolder) holder;

            Counter counter = (Counter) dataModel.get(position);

            counterHolder.titleView.setText(counter.getTitle());
            counterHolder.counterView.setText(String.valueOf(counter.getCount()));
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.VALUE.getValue())
        {
            ValueHolder valueHolder = (ValueHolder) holder;

            Value value = (Value) dataModel.get(position);

            valueHolder.titleView.setText(value.getTitle());
            valueHolder.valueView.setText(String.valueOf(value.getValue()));
        }
        else if(viewType == BaseCell.BASE_CELL_TYPE.DETAIL.getValue())
        {
            DetailHolder detailHolder = (DetailHolder) holder;

            Detail detail = (Detail) dataModel.get(position);

            detailHolder.titleView.setText(detail.getTitle());
            detailHolder.descriptionView.setText(detail.getDescription());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DETAIL_SELECTOR.getValue())
        {
            DetailSelectorHolder detailSelectorHolder = (DetailSelectorHolder) holder;

            DetailSelector detailSelector = (DetailSelector) dataModel.get(position);

            detailSelectorHolder.titleView.setText(detailSelector.getTitle());
            detailSelectorHolder.descriptionView.setText(detailSelector.getDescription());
            detailSelectorHolder.selectorView.setChecked(detailSelector.isSelected());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.OPTION.getValue())
        {
            OptionHolder optionHolder = (OptionHolder) holder;

            Option option = (Option) dataModel.get(position);

            optionHolder.iconView.setImageResource(option.getResource());
            optionHolder.titleView.setText(option.getTitle());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.CREDIT.getValue())
        {
            CreditHolder creditHolder = (CreditHolder) holder;

            Credit credit = (Credit) dataModel.get(position);

            creditHolder.titleView.setText(credit.getTitle());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.SINGLE.getValue()){

            SingleHolder singleHolder = (SingleHolder) holder;

            Single single = (Single) dataModel.get(position);

            singleHolder.titleView.setText(single.getTitle());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.BUTTON.getValue()){

            ButtonHolder buttonHolder = (ButtonHolder) holder;

            Button button = (Button) dataModel.get(position);

            buttonHolder.titleView.setText(button.getTitle());

            Drawable drawable = context.getResources().getDrawable(R.drawable.button_background);
            drawable.setColorFilter(button.getColor(), PorterDuff.Mode.MULTIPLY);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.CIRCLE.getValue())
        {
            PeopleHolder peopleHolder = (PeopleHolder) holder;

            User user = (User) dataModel.get(position);

            peopleHolder.nicknameView.setText(user.getNickname());
            peopleHolder.favoriteView.setVisibility(user.isFavorite() ? View.VISIBLE: View.INVISIBLE);

            Glide.with(context).load(user.getAvatar()).into(peopleHolder.avatarView);
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.DIVIDER_SECTION_TITLE.getValue())
        {

            DividerSectionTitleHolder dividerSectionTitleHolder = (DividerSectionTitleHolder) holder;

            DividerSectionTitle dividerSectionTitle = (DividerSectionTitle) dataModel.get(position);

            dividerSectionTitleHolder.titleView.setText(dividerSectionTitle.getTitle());
        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.COMMON_HEADER.getValue())
        {
            CommonHeaderHolder commonHeaderHolder = (CommonHeaderHolder) holder;

            CommonHeader commonHeader = (CommonHeader) dataModel.get(position);

            commonHeaderHolder.titleView.setText(commonHeader.getUser().getNickname());
            commonHeaderHolder.descriptionView.setText(commonHeader.getUser().getEmail());

            Glide.with(context)
                    .load(commonHeader.getUser().getAvatar())
                    .bitmapTransform(new BlurTransformation(context, 25))
                    .into(commonHeaderHolder.holderView);

            Glide.with(context)
                    .load(commonHeader.getUser().getAvatar())
                    .into(commonHeaderHolder.avatarView);

        }
        else if (viewType == BaseCell.BASE_CELL_TYPE.MEMBERS.getValue())
        {
            MembersHolder membersHolder = (MembersHolder) holder;

            Circles circles = (Circles) dataModel.get(position);

            MemberItemViewCell viewCell = new MemberItemViewCell();
            viewCell.setContext(context);
            viewCell.setCircles(circles.getCircles());

            membersHolder.recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
            membersHolder.recyclerView.setAdapter(viewCell);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (delegate != null)
                    delegate.onSelectedCell(dataModel.get(position));
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return dataModel.size();
    }
    @Override
    public int getItemViewType(int position)
    {
        BaseCell baseCell = dataModel.get(position);

        return baseCell.getType().getValue();
    }

    public interface IBaseViewCellDelegate
    {
        void onSelectedCell(BaseCell cell);
    }

}