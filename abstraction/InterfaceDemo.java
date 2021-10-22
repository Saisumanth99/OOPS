package abstraction;

interface RestAPI {
    void post();
    void get();
    void put();
    void delete();
}

class RestController implements RestAPI {

    @Override
    public void post() {
        System.out.println("this method handles post request");
        
    }

    @Override
    public void get() {
        System.out.println("this method handles get request");
        
    }

    @Override
    public void put() {
        System.out.println("this method handles put request");
        
    }

    @Override
    public void delete() {
        System.out.println("this method handles delete request");
        
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        RestController controller = new RestController();
        controller.get();
        controller.post();
        controller.put();
        controller.delete();
    }
}
