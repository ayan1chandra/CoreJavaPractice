package Interfaces;

public class InterfaceImplSeriesSub implements SeriesExtend {

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
    public int getMult() {
        val*=2;
        return val;
    }
}
