package mx.cds.utez.jasperapplication.actions;

import com.opensymphony.xwork2.ActionSupport;
import mx.cds.utez.jasperapplication.model.Person;
import net.sf.jasperreports.engine.JasperCompileManager;

import java.util.ArrayList;
import java.util.List;

public class JasperAction extends ActionSupport {
    /** List to use as our JasperReports dataSource. */
    private List<Person> myList;

    public String execute() throws Exception {

        // Create some imaginary persons.
        Person p1 = new Person(new Long(1), "Patrick", "Lightbuddie");
        Person p2 = new Person(new Long(2), "Jason", "Carrora");
        Person p3 = new Person(new Long(3), "Alexandru", "Papesco");
        Person p4 = new Person(new Long(4), "Jay", "Boss");

        // Store people in our dataSource list (normally they would come from a database).
        myList = new ArrayList<Person>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);

        // Normally we would provide a pre-compiled .jrxml file
        // or check to make sure we don't compile on every request.
        try {
            JasperCompileManager.compileReportToFile(
                    "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\our_jasper_template.jrxml",
                    "C:\\Users\\CDS\\Documents\\NetBeansProjects\\JasperApplication\\src\\main\\webapp\\jasper\\our_compiled_template.jasper");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }

    public List<Person> getMyList() {
        return myList;
    }
}
