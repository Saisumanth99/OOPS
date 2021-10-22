package inheritance;


class CustomerServices {
    
    void post(){
        System.out.println("your order has been placed");
    }
    
    void get(){
        System.out.println("loading........, you have searched for keyborad");
    }
    
}

class SellerServices extends CustomerServices {
    void put(){
        System.out.println("your product description is updated");
    }
    void delete(){
        System.out.println("your product has been deleted");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        SellerServices ss = new SellerServices();
        ss.get();
        ss.post();
        ss.put();
        ss.delete();
    }
}