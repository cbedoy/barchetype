package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Value extends BaseCell
{
    private String title;
    private String value;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }

    public Value(String title, String value){
        this.title = title;
        this.value = value;

        setType(BASE_CELL_TYPE.VALUE);
    }
}
