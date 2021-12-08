package Violation;

public class WhatsappService implements  Service{

    @Override
    public void shareViaExternal() {

        throw new UnsupportedOperationException("whatsapp doesn't require device to connect!!");
    }

    @Override
    public void shareViaInternal() {

    }
}
