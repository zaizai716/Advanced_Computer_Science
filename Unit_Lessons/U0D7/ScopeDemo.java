public class ScopeDemo {

    private String world = "World";
    public static void main(String[] args) {
        
    }

    public String method2() {
        String goodbye = "Goodbye";
        String hello = "Hello";

        if(true){
            
            System.out.println(goodbye);
        }
        return hello;

    }

    public String method1() {
        return method2() + world;
    }

}
