package com.company;

public class GenDynArray <Z>implements list<Z> {
    private Z[] mItems;
    int mSize;

    public GenDynArray(){
        this.mItems = (Z[]) new Object[25];
        mSize = 0;
    }

    private void grow(){
        Z[] temp = (Z[]) new  Object[mItems.length*2];
        for(int i = 0; i<mItems.length; i++){
            temp[i] = mItems[i];
        }
        mItems = temp;
    }
    @Override
    public void add(Z data){
        if(mSize >= mItems.length){
            grow();
        }
        mItems[mSize] = data;
        mSize++;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public Z remove(int index){
        if (index >= mSize)
            return null;
        Z retval = mItems[index];
        for (int i = index +1; i<mSize; i++){
            mItems[i-1] = mItems[i];
        }
        mSize--;
        return retval;
    }
    @Override
    public Z getItem(int index){
        return mItems[index];
    }

    public int getSize(){
        return mSize;
    }
}
