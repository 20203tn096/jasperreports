package mx.cds.utez.jasperapplication.actions;

import com.opensymphony.xwork2.ActionSupport;
import mx.cds.utez.jasperapplication.model.Person;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.List;

public class JasperAction extends ActionSupport {
    /** List to use as our JasperReports dataSource. */
    private List<Person> myList;

    public String getPdf() throws Exception {

        // Create some imaginary persons.
        Person p1 = new Person(1, "Patrick", "Lightbuddie", "Rodriguez", "10-02-2001", "H");
        Person p2 = new Person(2, "Jason", "Carrora", "Mendoza", "12-01-2002", "H");
        Person p3 = new Person(2, "Alexandra", "Papesco", "Garcia", "22-05-2002", "M");
        Person p4 = new Person(2, "Jay", "Boss", "Mendiola", "25-08-2003", "M");

        // Store people in our dataSource list (normally they would come from a database).
        myList = new ArrayList<Person>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);

        // Normally we would provide a pre-compiled .jrxml file
        // or check to make sure we don't compile on every request.
        try {
            System.out.println("Hola");
            JasperCompileManager.compileReportToFile(
                    "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\our_jasper_template.jrxml",
                    "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\our_compiled_template.jasper");
            JRDataSource data = new JRBeanCollectionDataSource(myList);
            String path = "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\our_compiled_template.jasper";
            JasperPrint informe = JasperFillManager.fillReport(path, null, data);
            JasperExportManager.exportReportToPdfFile(informe, "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\Informe.pdf");

        } catch (Exception e) {
            System.out.println("Hola hubo un error" + e.getMessage());
            return ERROR;
        }

        return SUCCESS;
    }

    public List<Person> getMyList() {
        return myList;
    }
}
