package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Counter extends BaseCell
{
    private String title;
    private int count;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public Counter(String title, int count){
        this.title = title;
        this.count = count;

        setType(BASE_CELL_TYPE.COUNTER);
    }
}
