# Deprecated
This repository has been deprecated. Please find the latest code here: https://github.com/vaadin-component-factory/password-strength

# Incubator Password Strength for Flow

Incubator Password Strength for Flow is server-side component of [incubator-password-strength](https://github.com/vaadin/incubator-password-strength) web component for Vaadin 10. 
It provides a strength indicator for a password field. 

[<img src="https://raw.githubusercontent.com/vaadin/incubator-password-strength/master/screenshot.gif" width="200" alt="Screenshot of incubator-password-strength">](https://vaadin.com/directory/component/vaadinincubator-password-strength)

## Usage

Strength can be set from 0 to 5. Strength represent number of blocks that would be filled with color and color of fill
ling(0 - nothing, 1 - red, 2 - orange, 3 - yellow, 4 - light green, 5 - dark green). Setting strength to more then 5 will make no difference from just setting it to 5.

```
PasswordStrength passwordStrength = new PasswordStrength();
passwordStrength.setStrength(4);
```
Setting strength to 4 mean will indicate good password strength. 

Common use case would be to track changes of PasswordField and then calculating and setting strength on every change: 
```
passwordField.addValueChangeListener(changeEvent -> {
    passwordStrength.setStrength(changeEvent.getValue().length() / 3);
});
```  

## Demo
To run demo go to `incubator-password-strength-flow-vaadincom-demo/` subfolder and run `mbn jetty:run`.
After server startup, you'll be able find demo at [http://localhost:8080/password-strength](http://localhost:8080/password-strength)

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

