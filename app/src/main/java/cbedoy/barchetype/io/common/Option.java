package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Option extends BaseCell
{
    private String title;
    private int resource;

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResource() {
        return resource;
    }

    public String getTitle() {
        return title;
    }

    public Option(int resource, String title)
    {
        this.resource = resource;
        this.title = title;

        setType(BASE_CELL_TYPE.OPTION);
    }
}
