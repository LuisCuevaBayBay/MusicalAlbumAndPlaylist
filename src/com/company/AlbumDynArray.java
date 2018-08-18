package com.company;

public abstract class AlbumDynArray implements list {
    private Album[] items;
    private int size;

    public AlbumDynArray(){
        this.items = new Album[3];
        size = 0;
    }

    public Album getAlbum(int index) {
        return items[index];
    }


    public void add(Album album) {
        if(size >= items.length){
            grow();
        }
        items[size] = album;
    }
    private void grow(){
        Album[] temp = new Album[items.length*2];
        for (int i = 0; i<items.length;i++){
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(Object data, Album album) {
        if (size>= items.length){
            grow();
        }
        items[size] = album;
        size++;
    }

    @Override
    public boolean isEmpty() {
        if (size==0)
            return true;
        return false;
    }

    @Override
    public Object remove(int index) {
        if(index>= size)
        return null;
        Album retval = items[index];

        for(int i =  index+1; i<size; i++){
            items[i-1] = items[i];
        }
        size--;
        return retval;
    }

    @Override
    public int getSize() {
        return size;
    }
}
