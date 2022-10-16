package hw4solidjavaprinciples;
class ProductService{
    public void addProduct(){
        System.out.println("Adding product");
    }
}

class NotificationService{
    public void sendSMS(){
        System.out.println("SMS sent");
    }
}

//=========

class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}


class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(Math.PI * radius * radius);
    }
}

public class Main {
    public static void main(String[] args) {
        //SOLID stands for these principles: Single Responsibility, Open Closed, Liskov Substitution, Interface Segregation, Dependancy Inversion
        //A class should only have one responsibility/only one reason to change
        //Software entities such as classes, modules, functions should be opened to extension but closed to modification
        //Use inheritance only for substitituability
        //a client should not be forced to implement an interface which it does not use
        //high level modules should not depend on low level modules. Both should depend on abstractions.
    }
}
