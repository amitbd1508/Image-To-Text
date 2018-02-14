/**
 * Created by DoSomething on 3/28/2016.
 */
import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {

    public static void main(String[] args) {
        File imageFile = new File("p13a.tiff");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}