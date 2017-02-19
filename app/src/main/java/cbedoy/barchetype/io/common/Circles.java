package cbedoy.barchetype.io.common;

import java.util.List;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/24/16.
 */

public class Circles extends BaseCell
{
    private List<Circle> circles;

    public void setCircles(List<Circle> circles) {
        this.circles = circles;
    }

    public List<Circle> getCircles() {
        return circles;
    }

    public Circles(List<Circle> circles){
        this.circles = circles;

        setType(BASE_CELL_TYPE.MEMBERS);
    }
}
