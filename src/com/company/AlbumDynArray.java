package com.company;
public class AlbumDynArray implements list {
    private Album[] items;
    private int size;

    public AlbumDynArray() {
        this.items = new Album[3];
        size = 0;
    }

    public Album getAlbum(int index){
        return items[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Object getItem(int index) {
        return getAlbum(index);
    }

    /**
     *  Method : add
     *  adds the producto to the items array.
     *
     * @param album: the product to add.
     */
    public void add(Album album){

        if(size >= items.length){
            grow();
        }
        items[size] = album;
        size++;

    }

    private void grow() {
        Album[] temp = new Album[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    /**
     * Method: remove
     *  removes an object at a the specified index
     *  if posible returns false if it fails.
     * @param index: index of the object to be removed.
     * @return true if it removes the item successfully.
     */
    public Album remove(int index){
        if(index >= size)
            return null;
        Album retval = items[index];

        for (int i = index + 1; i < size ; i++) {
            items[i-1] = items[i];
        }
        size--;
        return retval;
    }

    @Override
    public void add(Object data) {
        this.add((Album) data);
    }

    public boolean isEmpty(){

        if(size == 0)
            return true;
        return false;
    }

}