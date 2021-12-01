
package finalwork;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Romes
 */
@XmlRootElement(name = "MaxProducts")
public class MaxProducts {
    
private List<FirstZeroVariant> items;

    public List<FirstZeroVariant> getItems() {
        return items;
    }

    @XmlElement(name = "product")
    public void setItems(List<FirstZeroVariant> items) {
        this.items = items;
    }

    public void add(FirstZeroVariant item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }

    
}
