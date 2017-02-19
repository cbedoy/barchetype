package cbedoy.barchetype.io.common;


import cbedoy.barchetype.io.common.base.BaseCell;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/2/16.
 */

public class User extends BaseCell
{
    private String jid;
    private String id;
    private String nickname;
    private String avatar;
    private String email;
    private boolean favorite;
    private boolean external;
    private String college;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public User(){
        setType(BASE_CELL_TYPE.CIRCLE);
    }

    public User(String nickname, String avatar){
        this();
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isExternal() {
        return external;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCollege() {
        return college;
    }
}
