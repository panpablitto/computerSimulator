package pl.komputer.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name){
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected){
            System.out.println("Please eject Memory Stick first");
            return false;
        }else{
            System.out.println("Memory stick disconnected");
            return true;
        }
    }
    public void ejected(){
        System.out.println("Eject Memory Stick");
        ejected = true;
    }
    @Override
    public String getName() {
        return name;
    }
}
