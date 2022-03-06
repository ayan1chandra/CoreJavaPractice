package Interfaces;

public class InterfaceImpl2 implements Series {

    int val;


    public void setVal(int val) {
        this.val = 0;
    }

    @Override
    public int getNext() {
        val+=3;
        return val;
    }
}
