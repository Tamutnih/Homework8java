package com.example;

import java.util.Scanner;

public abstract class fileWriter {
    Scanner scan = new Scanner(System.in);

    public fileWriter() {
        this.scan = new Scanner(System.in);
    }

    abstract void LinefileWriter(String pathDoc, String nameDoc, String line);

    abstract void EnterfileWriter(String pathDoc, String nameDoc, String line);

    public void write(String string) {
    }

}
