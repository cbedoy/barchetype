package cbedoy.barchetype.io.common;


import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/15/16.
 */

public class Button extends BaseCell
{
    private String title;
    private int color;

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Button(String title, int color){
        this.title = title;
        this.color = color;

        setType(BASE_CELL_TYPE.BUTTON);
    }
}
