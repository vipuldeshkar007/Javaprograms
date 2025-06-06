package Encapsulation;

public class DTO {
    private int age;
    private String eventName;
    private String location;
    private Integer owner;

    public void setAge(int age){
        if(age > 18){
            this.age =  age;
        }
    }
    public void getAge(){

    }

}
