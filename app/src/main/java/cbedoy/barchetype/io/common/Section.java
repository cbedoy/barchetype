package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Section extends BaseCell
{
    private String title;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Section(String title)
    {
        this.title = title;
        setType(BASE_CELL_TYPE.SECTION);
    }
}
