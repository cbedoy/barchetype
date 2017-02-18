package cbedoy.barchetype.io.common;



import org.apache.commons.io.FilenameUtils;

/**
 * RecyclerChatView
 * Created by Bedoy on 10/31/16.
 */

public class Metadata
{
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public int getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    public String getProviderDisplay() {
        return providerDisplay;
    }

    public void setProviderDisplay(String providerDisplay) {
        this.providerDisplay = providerDisplay;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enum TYPE_METADATA
    {
        LINK,
        IMAGE,
        MEDIA,
        GIF
    }

    public static TYPE_METADATA evaluteType(String urlMetadata)
    {
        String extension = FilenameUtils.getExtension(urlMetadata);
        if (extension.equals("") || urlMetadata.contains("spotify") || urlMetadata.contains("youtube"))
            return TYPE_METADATA.MEDIA;
        if (extension.equals(""))
            return TYPE_METADATA.LINK;
        if (extension.equalsIgnoreCase("gif"))
            return TYPE_METADATA.GIF;
        else if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpeg"))
            return TYPE_METADATA.IMAGE;
        return TYPE_METADATA.LINK;
    }

    private String faviconUrl;
    private String providerDisplay;
    private String providerName;
    private String type;
    private String urlMetadata;
    private String title;
    private String description;
    private String thumbnail;
    private float size;
    private int thumbnailWidth;
    private int thumbnailHeight;
    private TYPE_METADATA typeMetadata;

    public String getUrlMetadata() {
        return urlMetadata;
    }

    public void setUrlMetadata(String urlMetadata) {
        this.urlMetadata = urlMetadata;
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

    public TYPE_METADATA getTypeMetadata() {
        return typeMetadata;
    }

    public void setTypeMetadata(TYPE_METADATA typeMetadata) {
        this.typeMetadata = typeMetadata;
    }




}
