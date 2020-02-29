package de.martcre.wf.ui;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;
import de.martcre.wf.dto.Customer;
import de.martcre.wf.service.CustomerService;
import de.martcre.wf.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Route("SelectCustomer")
public class SelectCustomer extends VerticalLayout implements Serializable {

    @Autowired CustomerService customerService;
    @Autowired
    GreetService greetService;

    public SelectCustomer() {
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        add(new H3("Select Customer"));
        Select<Customer> customerSelect = new Select<>();
        customerSelect.setItems(customerService.findAllCustomer());
        customerSelect.setLabel("Customer");
        add(customerSelect);
        add(new Text("some more text goes here"));
    }
}
