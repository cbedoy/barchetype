package cbedoy.barchetype.io.common;

import java.util.List;

import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/24/16.
 */

public class Members extends BaseCell
{
    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public Members(List<User> users){
        this.users = users;

        setType(BASE_CELL_TYPE.MEMBERS);
    }
}
