package io.zipcoder;

public class Dog extends Pet{

    public Dog(){}
    public Dog (String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Woof";
    }
}
