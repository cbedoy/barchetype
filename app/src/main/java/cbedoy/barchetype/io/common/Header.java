package cbedoy.barchetype.io.common;


import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/14/16.
 */

public class Header extends BaseCell
{
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Header(){
        setType(BaseCell.BASE_CELL_TYPE.HEADER);
    }

    public Header(User user){

        this.user = user;

        setType(BASE_CELL_TYPE.HEADER);
    }
}
