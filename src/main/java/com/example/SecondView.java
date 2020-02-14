package com.example;

import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

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

            menuBar.addThemeVariants(MenuBarVariant.LUMO_SMALL);

        }
        return menuBar;
    }
}
