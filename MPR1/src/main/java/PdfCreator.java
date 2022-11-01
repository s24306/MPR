import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PdfCreator {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();
        for(int i = 0; i < 10; i++){
            PDPage page = new PDPage();
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
            contentStream.newLineAtOffset(600, 10);
            String text = Integer.toString(i + 1);
            contentStream.showText(text);
            contentStream.endText();
            contentStream.close();
            document.addPage(page);
        }
        PDPage page = document.getPage(0);
        PDPageContentStream contentStream =
                new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 32);
        contentStream.newLineAtOffset(250, 600);
        String text = "Hello World!";
        contentStream.showText(text);
        contentStream.endText();
        contentStream.close();

        PDPage page2 = document.getPage(9);
        PDPageContentStream contentStream2 =
                new PDPageContentStream(document, page2, PDPageContentStream.AppendMode.APPEND, true);
        contentStream2.beginText();
        contentStream2.setFont(PDType1Font.TIMES_ROMAN, 32);
        contentStream2.newLineAtOffset(250, 600);
        String text2 = "Goodbye World!";
        contentStream2.showText(text2);
        contentStream2.endText();
        contentStream2.close();

        document.save("pdfBoxHelloWorld.pdf");
        document.close();
    }
}
