package chapter17.lambda;

interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Hello, Lambda!");
        greeting.sayHello();  // 출력: Hello, Lambda!
    }
}

