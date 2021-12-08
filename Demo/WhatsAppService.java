package Demo;

public class WhatsAppService implements InternalShareService{

    Media media;

    public WhatsAppService(Media media) {
        this.media = media;
    }

    @Override
    public void share() {

    }
}
