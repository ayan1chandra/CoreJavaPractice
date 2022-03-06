package Interfaces;

public class InterfaceImpl1 implements Series,PrevSeries {

    int val;


    public void setVal(int val) {
        this.val = 0;
    }

    @Override
    public int getNext() {
        val+=2;
        return val;
    }

    @Override
    public int getPrev() {
        val-=2;
        return val;
    }
}
