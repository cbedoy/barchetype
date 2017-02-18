package cbedoy.barchetype.io.common;


/**
 * Created by bedoy on 10/31/16.
 */

public class Message
{
    private User user;
    private String content;
    private Metadata metadata;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
