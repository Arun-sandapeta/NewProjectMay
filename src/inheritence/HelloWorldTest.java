package inheritence;

public class HelloWorldTest {
    public static void main(String[] args){
        HelloWorldService helloWorldService = new HelloWorldService();
        String greet =helloWorldService.sayHi();
        System.out.println(greet);
    }
}
