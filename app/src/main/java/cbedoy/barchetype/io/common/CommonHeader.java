package cbedoy.barchetype.io.common;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/19/16.
 */

public class CommonHeader extends BaseCell
{
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public CommonHeader(User user){
        this.user = user;

        setType(BASE_CELL_TYPE.COMMON_HEADER);
    }
}
