package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.Scanner;

public class fileWriterJson {
    public static void main(String[] args) {

    }

    public void Linefilewriter(String string, String string2, String string3) {
    }

    public class filewriterJson extends FileWriter {

        private Scanner scan;

        public filewriterJson(File file) throws IOException {
            super(file);
            // TODO Auto-generated constructor stub
        }

        public void fileWriterTxt() {
            super.scan = new Scanner(System.in);
        }

        @Override
        void EnterfileWriter(String Path, String nameDoc) {
            try {
                String expansion = ".txt";
                if (new File(Path + "/" + nameDoc + expansion).isFile() != true) {
                    Writer fw = new FileWriter(Path + "/" + nameDoc + expansion);
                    String input = scan.nextLine();
                    fw.write(input);
                    fw.close();
                } else {
                    Writer fw = new FileWriter(Path + "/" + nameDoc + expansion, true);
                    String input = scan.nextLine();
                    fw.append("\n" + input);
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("Ошибка чтения файла!");
            }
        }

        @Override
        void LinefileWriter(String Path, String nameDoc, String line) {
            try {
                String expansion = ".txt";
                if (new File(Path + "/" + nameDoc + expansion).isFile() != true) {
                    Writer fw = new FileWriter(Path + "/" + nameDoc + expansion);
                    fw.write(line);
                    fw.close();
                } else {
                    Writer fw = new FileWriter(Path + "/" + nameDoc + expansion, true);
                    fw.append("\n" + line);
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println("Ошибка чтения файла!");
            }
        }

    }

}
