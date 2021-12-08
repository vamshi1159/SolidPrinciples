package Violation;

public class BluetoothService implements Service {
    Document document;

    public BluetoothService(Document document) {
        this.document = document;
    }

    @Override
    public void shareViaExternal() {

        System.out.println("document is started sharing");
        System.out.println("sharing...");
        System.out.println("sharing"+document+" successfull!");
    }

    @Override
    public void shareViaInternal() {

        throw new UnsupportedOperationException("bluetooth doesn't support");
    }
}
