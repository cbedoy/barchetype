package cbedoy.barchetype.io.common;

import java.util.List;



/**
 * Created by bedoy on 11/25/16.
 */

public class Department
{
    private String title;
    private String abbreviation;
    private List<Conversation> conversations;

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Department(String title, List<Conversation> conversations)
    {
        this.title = title;
        this.conversations = conversations;
    }
}
