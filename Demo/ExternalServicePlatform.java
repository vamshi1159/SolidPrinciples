package Demo;

public class ExternalServicePlatform {
    ExternalShareService externalShareService;

    public ExternalServicePlatform(ExternalShareService externalShareService) {
        this.externalShareService = externalShareService;
    }
    public void shareMedia()
    {
        externalShareService.share();
    }
}
