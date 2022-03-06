public class GenericPrinter <T>{

    public GenericPrinter(T i) {
        this.element =i;
    }

    public void setElement(T element) {
        this.element = element;
    }

    T element;

    public void printer(){
        System.out.println("Printing element"+element);
    }


}
