package practice.generic;

import java.io.Serializable;

public class GenericClass<T extends Comparable ,V extends Serializable,K>  {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return String.format("t class - %1$s, v class - %2$s, k class - %3$s",t.getClass(),v.getClass(),k.getClass());
    }
}
