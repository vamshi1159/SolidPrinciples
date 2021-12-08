package Demo;

public class Main {
    public static void main(String[] args) {
        
        //single responsibilty principle
             Media media= new Document("abc.txt");
            //editing responsibility
            Edit edit=new Edit(media);
            edit.editMedia();
            //sharing responsibility
            ExternalShareService externalShareService=new BluetoothService(media);
            ExternalServicePlatform servicePlatform=new ExternalServicePlatform(externalShareService);
            servicePlatform.shareMedia();
            
       //open closed principle
           Media media1=new Document("abc.txt");
           Media media2=new Video("abc.mp4");

       //Liskov Substitution principle
            ExternalShareService externalShareService1=new BluetoothService(media);
            ExternalServicePlatform servicePlatform1=new ExternalServicePlatform(externalShareService1);
            servicePlatform1.shareMedia();
            InternalShareService internalShareService=new WhatsAppService(media);
            InternalServicePlatform internalServicePlatform=new InternalServicePlatform(internalShareService);
            internalServicePlatform.shareMedia();

         //Inteface Segregation principle
            ExternalShareService externalShareService2=new BluetoothService(media);
            InternalShareService internalShareService1=new WhatsAppService(media);

         //Dependency Inversion Principle
        ExternalShareService externalShareService3=new BluetoothService(media);
        ExternalServicePlatform servicePlatform2=new ExternalServicePlatform(externalShareService1);
        servicePlatform1.shareMedia();
        InternalShareService internalShareService3=new WhatsAppService(media);
        InternalServicePlatform internalServicePlatform3=new InternalServicePlatform(internalShareService);
        internalServicePlatform.shareMedia();


    }
}
