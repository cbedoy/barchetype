package cbedoy.barchetype.io.common;

import java.util.Date;
import java.util.List;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/14/16.
 */

public class Conversation
{
    public enum CONVERSATION_TYPE{
        P2P,
        CLASS,
        GROUP
    }


    private Date date;
    private int badges;
    private Message lastMessage;
    private CONVERSATION_TYPE conversationType;
    private String name;
    private String avatar;
    private List<User> members;
    private String abbreviation;
    private boolean enableNotifications;
    private boolean featured;

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setEnableNotifications(boolean enableNotifications) {
        this.enableNotifications = enableNotifications;
    }

    public boolean isEnableNotifications() {
        return enableNotifications;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public void setConversationType(CONVERSATION_TYPE conversationType) {
        this.conversationType = conversationType;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLastMessage(Message lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public CONVERSATION_TYPE getConversationType() {
        return conversationType;
    }

    public Date getDate() {
        return date;
    }

    public int getBadges() {
        return badges;
    }

    public List<User> getMembers() {
        return members;
    }

    public Message getLastMessage() {
        return lastMessage;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public Conversation(){

    }

    public Conversation(String title, String avatar, CONVERSATION_TYPE type){
        this.conversationType = type;
        this.name = title;
        this.avatar = avatar;
    }

    public Conversation(String title, CONVERSATION_TYPE type){
        this.name = title;
        this.conversationType = type;

        String[] split = title.split(" ");
        String abbreviation = "";

        for (String s : split)
            abbreviation+=s;

        this.abbreviation = abbreviation.toUpperCase();
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

