public abstract class A extends Shape{
    public abstract int go();
}



class B extends A{

    @Override
    public int go() {
        return 0;
    }

    @Override
    public double getS() {
        return 0;
    }

    @Override
    public double getV() {
        return 0;
    }
}
