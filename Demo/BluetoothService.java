package Demo;

public class BluetoothService implements ExternalShareService{

    Media media;

    public BluetoothService(Media media) {
        this.media = media;
    }

    @Override
    public void share() {
        System.out.println(media.getFileName()+" is started sharing");
        System.out.println("sharing...");
        System.out.println("sharing"+media+" successfull!");
    }
}
