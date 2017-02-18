package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Selector extends BaseCell
{
    private String title;
    private boolean selected;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getTitle() {
        return title;
    }

    public boolean isSelected() {
        return selected;
    }

    public Selector(String title, boolean selected){
        this.title = title;
        this.selected = selected;

        setType(BASE_CELL_TYPE.SELECTOR);
    }
}
