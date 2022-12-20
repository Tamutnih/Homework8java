package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class fileWritertXml {
    public class fileWriter extends fileWritertXml {

        private Object scan;

        public fileWriter() {
            super.scan = new Scanner(System.in);
        }

        @Override
        void EnterfileWriter(String pathDoc, String nameDoc) {
            try {
                String expansion = ".xml";
                if (new File(path + "/" + nameDoc + expansion).isFile() != true) {
                    Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion);
                    String input = scan.nextLine();
                    fw.write(input);
                    fw.close();
                } else {
                    Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion, true);
                    String input = scan.nextLine();
                    fw.append("\n" + input);
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("Ошибка записи файла");
            }
        }

        @Override
        void LinefileWriter(String path, String nameDoc, String line) {
            try {
                String expansion = ".xml";
                if (new File(path + "/" + nameDoc + expansion).isFile() != true) {
                    Writer fw = new FileWriter(path + "/" + nameDoc + expansion);
                    fw.write(line);
                    fw.close();
                } else {
                    Writer fw = new FileWriter(path + "/" + nameDoc + expansion, true);
                    fw.append("\n" + line);
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("Oшибка записи файла!");
            }
        }

        @Override
        public String toString() {
            return "fileWriter []";
        }
    }

    public void Linefilewriter(String string, String string2, String string3) {
    }
}
