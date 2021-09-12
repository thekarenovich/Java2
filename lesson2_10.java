//Объекты род. класса не могут обращаться к методам и полям наследника

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//Допустим, А - родитель(суперкласс), В, C - наследники
//А objb = new А(); - объект класса А
//B objb = new B(); - объект класса В
//А objc = new C(); - объект класса А (высходящее преобразование - upcast)
//С objcc = C(objc) - объект класса С (нисходящее преобразование - downcast)

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


public class Main{
      
    public static void main(String[] args) {
        
        A obja = new A();
        obja.first();
        B objb = new B();
        objb.first();
        objb.second();
        C objc = new C();
        objc.first();
        objc.third();
        
    }
}

class A{
    public void first(){ System.out.println("A"); }
}

class B extends A{
    public void second(){ System.out.println("B"); }
}

class C extends A{
    public void third(){ System.out.println("C"); }
}
