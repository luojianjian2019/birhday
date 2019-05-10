package birthday.greetings;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.xml.sax.SAXException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentExcelFinder {
    public List<Student> readExcel() throws IOException, SAXException, InvalidFormatException {
        InputStream inputXML=new BufferedInputStream(getClass().getResourceAsStream("/StudentList.xml"));
        XLSReader mainReader = ReaderBuilder.buildFromXML(inputXML);
        InputStream inputXLS = new BufferedInputStream(getClass().getResourceAsStream("/student.xlsx"));
        List<Student> studentList=new ArrayList<>();
        Map beans = new HashMap();
        beans.put("students", studentList);
        XLSReadStatus readStatus = mainReader.read( inputXLS, beans);
        if(readStatus.isStatusOK()){
            return readStatus.getReadMessages();
        }else {
            return new ArrayList<>();
        }
    }

    public List<Student> readExcelRows(){
        
    }

    public static void main(String[] args) {
    }
}
