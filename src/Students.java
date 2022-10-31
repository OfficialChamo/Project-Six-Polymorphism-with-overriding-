public class Students {
    public void student (){
        System.out.println("Samal can Java & Python");
    }
}
class A extends Students{
    @Override
    public void student() {
        System.out.println("Kamal can Java");
    }
}
class B extends Students{
    @Override
    public void student() {
        System.out.println("Amal can not Java");
    }
}
class Main {
    public static void main(String[] args) {
        Students s;
        s = new A();
        s.student();
        s = new B();
        s.student();
        s = new Students();
        s.student();

    }
}