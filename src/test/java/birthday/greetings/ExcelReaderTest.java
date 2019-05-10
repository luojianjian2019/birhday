package birthday.greetings;

import org.junit.Test;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReader;
import org.xml.sax.SAXException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExcelReaderTest {

    @Test
    public void should_find_excel_data() {
        InputStream inputXML=new BufferedInputStream(getClass().getResourceAsStream("/StudentList.xml"));
        try {
            XLSReader mainReader = ReaderBuilder.buildFromXML(inputXML);
            InputStream inputXLS = new BufferedInputStream(getClass().getResourceAsStream("/student.xlsx"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
