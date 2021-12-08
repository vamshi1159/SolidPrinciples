package Demo;

public abstract class  Media {
    private String fileName;

    public Media(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract  void  mediaType();

}
