package Model;

public class GooglePlay {
    private String author;
    private String category;
    private String changelog;
    private String contentRating;
    private String datePublished;
    private int datePublishedIso;
    private String description;
    private String shortDescription;
    private String fileSize;
    private String icon;
    private Boolean inAppBiling;
    private String name;
    private int numDownloads;
    private String operatingSystem;

    public GooglePlay(){

    }

    public GooglePlay(String author,String category,String changelog,String contentRating,String datePublished,int datePublishedIso,String description,String shortDescription,String fileSize,
                      String icon,Boolean inAppBiling,String name,int numDownloads,String operatingSystem){
        this.author=author;
        this.category=category;
        this.changelog=changelog;
        this.contentRating=contentRating;
        this.datePublished=datePublished;
        this.datePublishedIso=datePublishedIso;
        this.description=description;
        this.shortDescription=shortDescription;
        this.fileSize=fileSize;
        this.icon=icon;
        this.inAppBiling=inAppBiling;
        this.name=name;
        this.numDownloads=numDownloads;
        this.operatingSystem=operatingSystem;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public int getDatePublishedIso() {
        return datePublishedIso;
    }

    public void setDatePublishedIso(int datePublishedIso) {
        this.datePublishedIso = datePublishedIso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getInAppBiling() {
        return inAppBiling;
    }

    public void setInAppBiling(Boolean inAppBiling) {
        this.inAppBiling = inAppBiling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDownloads() {
        return numDownloads;
    }

    public void setNumDownloads(int numDownloads) {
        this.numDownloads = numDownloads;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
