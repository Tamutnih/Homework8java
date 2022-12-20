package com.example;

public class Main {
    public static void main(String[] args) {
        fileWritertxt txt = new fileWritertxt();
        fileWriterJson json = new fileWriterJson();
        fileWritertXml xml = new fileWritertXml();

        txt.Linefilewriter("job/DOC", "file", "Иван Иванов=4.8");
        txt.Linefilewriter("job/DOC", "file", "Мария Кузнецова=5.0");
        txt.Linefilewriter("job/DOC", "file", "Степан Кузьмин=3.6");

        json.Linefilewriter("job/DOC", "file", "{");
        json.Linefilewriter("job/DOC", "file", "\"Иван Иванов\": 4.8,");
        json.Linefilewriter("job/DOC", "file", "\"Мария Кузнецова\": 5.0,");
        json.Linefilewriter("job/DOC", "file", "\"Степан Кузьмин\": 3.6");
        json.Linefilewriter("job/DOC", "file", "}");

        xml.Linefilewriter("job/DOC", "file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.Linefilewriter("job/DOC", "file", "<students>");
        xml.Linefilewriter("job/DOC", "file", "<student>");
        xml.Linefilewriter("job/DOC", "file", "<name>Иван Иванов</name>");
        xml.Linefilewriter("job/DOC", "file", "<grade>4.8</grade>");
        xml.Linefilewriter("job/DOC", "file", "</student>");
        xml.Linefilewriter("job/DOC", "file", "<student>");
        xml.Linefilewriter("job/DOC", "file", "<name>Мария Кузнецова</name>");
        xml.Linefilewriter("job/DOC", "file", "<grade>5.0</grade>");
        xml.Linefilewriter("job/DOC", "file", "</student>");
        xml.Linefilewriter("job/DOC", "file", "<student>");
        xml.Linefilewriter("job/DOC", "file", "<name>Степан Кузьмин</name>");
        xml.Linefilewriter("job/DOC", "file", "<grade>3.6</grade>");
        xml.Linefilewriter("job/DOC", "file", "</student>");
        xml.Linefilewriter("job/DOC", "file", "</students>");

    }
}
