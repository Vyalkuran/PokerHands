package com.sebastianpopa.pokerhands;

import java.io.*;

public class RoundReader implements Closeable {
    private final BufferedReader bufferedReader;

    public RoundReader(FileReader fileReader){
        bufferedReader = new BufferedReader(fileReader);
    }

    public String getRound() throws IOException{
        return bufferedReader.readLine();
    }
    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
