package com.company;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;
import java.util.StringTokenizer;

public class FileIO {
    private String fileName = "products.csv";

    public FileIO(String fileName){
        this.fileName=fileName;
    }
    public list<Album> readAlbum() throws IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        AlbumDynArray album = new AlbumDynArray() {
            @Override
            public void add(Object data) {

            }

            @Override
            public Object getItem(int index) {
                return null;
            }
        };
        String line = null;
        while ((line = br.readLine())!= null){
            StringTokenizer st = new StringTokenizer(line,",");
            String name = st.nextToken();
            String artistname = st.nextToken();
            String songname = st.nextToken();
            Album album1 = new Album(name,artistname,songname);
            album.add(album);
        }
        br.close();
        return (list<Album>) album;
    }
    public void writeProducts(list<Album> album)throws IOException{
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i<album.getSize();i++){
            Album album1 = album.getItem(i);
            bw.write(album.toString());
            bw.newLine();
        }
        bw.close();
    }
}
