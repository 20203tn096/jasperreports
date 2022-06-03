import mx.cds.utez.jasperapplication.model.Person;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestReports {


    public static void main(String[] args) throws InterruptedException {

        List<Person> myList;
        // Create some imaginary persons.
        Person p1 = new Person(1, "Patrick", "Lightbuddie", "Rodriguez", "10-02-2001", "H");
        Person p2 = new Person(2, "Jason", "Carrora", "Mendoza", "12-01-2002", "H");
        Person p3 = new Person(3, "Alexandra", "Papesco", "Garcia", "22-05-2002", "M");
        Person p4 = new Person(4, "Jay", "Boss", "Mendiola", "25-08-2003", "M");
        Person p5 = new Person(5, "Omar", "Morales", "Demetrio", "21-02-2002", "H");


        // Store people in our dataSource list (normally they would come from a database).
        myList = new ArrayList<Person>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);
        myList.add(p5);


        // Normally we would provide a pre-compiled .jrxml file
        // or check to make sure we don't compile on every request.
        try {
            JasperCompileManager.compileReportToFile(
                    "src/main/webapp/jasper/our_jasper_template.jrxml",
                    "src/main/webapp/jasper/our_compiled_template.jasper");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        Thread.sleep(2000);

        String path = "src/main/webapp/jasper/our_compiled_template.jasper";

        try {

            JRDataSource data = new JRBeanCollectionDataSource(myList);
            JasperPrint informe = JasperFillManager.fillReport(path, null, data);
            JasperExportManager.exportReportToPdfFile(informe, "src/main/webapp/jasper/Informe.pdf");
            File objetofile = new File("src/main/webapp/jasper/Informe.pdf");
            Desktop.getDesktop().open(objetofile);


           /*
            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setVisible(true);
            */


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
