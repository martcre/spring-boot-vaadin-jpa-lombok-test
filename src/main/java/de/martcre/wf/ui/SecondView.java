package de.martcre.wf.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("second")
public class SecondView extends VerticalLayout {

    private MenuBar menuBar;

    public SecondView() {
        add(getMenuBar());
    }

    private MenuBar getMenuBar() {
        if (menuBar == null) {
            menuBar = new MenuBar();
            menuBar.addItem("File");
            menuBar.addItem("Edit");
            menuBar.addItem("View");
            menuBar.addItem("Help");
            MenuItem wheo = menuBar.addItem("The new one Wheo");
            wheo.addClickListener(click -> {
                Notification.show("Wheo!");
                UI.getCurrent().navigate("ti");
            });

            menuBar.addThemeVariants(MenuBarVariant.LUMO_SMALL);

            add(new RouterLink("Ti", MainView.class));

        }
        return menuBar;
    }
}
