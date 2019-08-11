package impl;

import intel.Gen;

public class GenImpl<T> implements Gen<T> {
    @Override
    public T getObj(T obj) {
        return obj;
    }

    @Override
    public void setObj(T obj) {

    }
}
