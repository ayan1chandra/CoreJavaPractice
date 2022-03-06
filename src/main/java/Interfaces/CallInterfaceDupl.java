package Interfaces;

public class CallInterfaceDupl {

    public static void main(String[] args) {

        InterfaceImplSeriesSub interfaceImpl1 = new InterfaceImplSeriesSub();

        interfaceImpl1.getNext();

        System.out.println("Value of the variable: "+interfaceImpl1.val);

        interfaceImpl1.getMult();

        System.out.println("Value of the variable: "+interfaceImpl1.val);



    }
}
