package Interfaces;

public class CallInterface {

    public static void main(String[] args) {

        InterfaceImpl1 interfaceImpl1 = new InterfaceImpl1();

        interfaceImpl1.getNext();

        System.out.println("Value of the variable: "+interfaceImpl1.val);

        InterfaceImpl2 interfaceImpl2 = new InterfaceImpl2();

        interfaceImpl2.getNext();

        System.out.println("Value of the variable: "+interfaceImpl2.val);

        //Calling multiple interfaces.
        interfaceImpl1.getPrev();
        System.out.println("Value of the variable: "+interfaceImpl1.val);

        //Creating Interface Objects.
        Series interfaceObj=interfaceImpl1;
        System.out.println("Value of the variable: "+interfaceObj.getNext());

        //Calling Interface Variables.
        System.out.println("Calling Interface Variable"+interfaceImpl1.MAX);
        System.out.println("Calling Interface Variable"+Series.MAX);
        System.out.println("Calling Interface Variable"+interfaceObj.MAX);

        //You can not change the interface variable values.
        //Series.MAX=20; - Will not work




    }
}
