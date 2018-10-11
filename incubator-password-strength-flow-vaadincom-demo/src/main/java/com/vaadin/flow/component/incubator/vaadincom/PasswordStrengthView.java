package com.vaadin.flow.component.incubator.vaadincom;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;

@Route("vaadin-crud")
public class PasswordStrengthView extends DemoView {

    @Override
    protected void initView() {
        addCard("Basic PasswordStrength", new H1("Hello PasswordStrength!"));
    }
}
