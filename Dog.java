public class Dog {
    private String dog;


    public String ToString(){
        String fart = "Dog: ";
        return fart + dog;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public void Bark(){
        System.out.println("woof!");
    }
}
