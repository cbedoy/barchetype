package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * barchetype
 * Created by Bedoy on 2/18/17.
 */

public class Circle extends BaseCell
{
    private String preview;
    private String title;
    private String description;

    public Circle()
    {
        setType(BASE_CELL_TYPE.CIRCLE);
    }

    public Circle(String title, String preview){
        this();
        this.title = title;
        this.preview = preview;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
