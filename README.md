# Incubator Password Strength for Flow

Incubator Password Strength for Flow is server-side component of [incubator-password-strength](https://github.com/vaadin/incubator-password-strength) web component for Vaadin 10.

## Usage

```
PasswordStrength passwordStrength = new PasswordStrength();
passwordStrength.setStrength(4);
```
Common use case would be to track changes of PasswordField and then calculating and setting strength on every change: 
```
passwordField.addValueChangeListener(changeEvent -> {
    passwordStrength.setStrength(changeEvent.getValue().length() / 3);
});
```  

## Setting up for development:

Clone the project in GitHub (or fork it if you plan on contributing)

```
https://github.com/vaadin/incubator-password-strength-flow
```

To build and install the project into the local repository run 

```mvn install ```

## License & Author

This Add-on is distributed under [Commercial Vaadin Add-on License version 3](http://vaadin.com/license/cval-3) (CVALv3). For license terms, see LICENSE.txt.

Incubator Password Strength is written by Vaadin Ltd.

