package org.example;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        File pdfFile = new File("sample.pdf");
        File capiFile = new File("capi.jpg");

        URL pdfurl = new URL("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        URL capiurl = new URL("https://www.thealexandriazoo.com/images/animals/Capybara02.jpg");

        FileUtils.copyURLToFile(pdfurl, pdfFile);
        FileUtils.copyURLToFile(capiurl, capiFile);

        PDDocument doc = PDDocument.load(pdfFile);
        PDPage page = doc.getPage(0);
        PDImageXObject pdImage = PDImageXObject.createFromFile("capi.jpg", doc);
        PDPageContentStream contentStream =
                new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true);
        contentStream.drawImage(pdImage, 70, 250, 400, 300);
        contentStream.close();
        doc.save(pdfFile);
        doc.close();
    }
}