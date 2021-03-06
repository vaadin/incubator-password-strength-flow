package com.vaadin.flow.component.incubator.vaadincom;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.incubator.PasswordStrength;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;

@Route("password-strength")
public class PasswordStrengthView extends DemoView {

    @Override
    protected void initView() {
        PasswordField passwordField = new PasswordField();
        passwordField.setLabel("Press enter for change");
        PasswordStrength passwordStrength = new PasswordStrength();
        Div text = new Div();

        passwordField.addValueChangeListener(changeEvent -> {
            passwordStrength.setStrength(changeEvent.getValue().length() / 3);
            text.setText("Password strength set to " + passwordStrength.getStrength());
        });

        addCard("Basic Password Strength setting usage", passwordField, passwordStrength, text);



    }
}