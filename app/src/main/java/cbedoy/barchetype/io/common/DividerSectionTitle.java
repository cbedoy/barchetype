package cbedoy.barchetype.io.common;


import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/16/16.
 */

public class DividerSectionTitle extends BaseCell
{
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public DividerSectionTitle(String title)
    {
        this.title = title;

        setType(BASE_CELL_TYPE.DIVIDER_SECTION_TITLE);
    }
}
