public class CallGenericPrinter {
    public static void main(String[] args) {
        Integer intElement = 10;
        String strElement = "Baby elephant";

        GenericPrinter<Integer> intPrinter = new GenericPrinter<>(10);
        GenericPrinter<Float> floatGenericPrinter = new GenericPrinter<>((float) 10.3);

        intPrinter.printer();
        floatGenericPrinter.printer();





    }
}
