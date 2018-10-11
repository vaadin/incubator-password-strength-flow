package com.vaadin.flow.component.incubator;

import com.vaadin.flow.component.AttachEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordStrengthTest {

    private PasswordStrength systemUnderTest;

    @Before
    public void setUp() {
        systemUnderTest = new PasswordStrength();
    }

    @Test
    public void onAttach_init() {
        systemUnderTest.onAttach(new AttachEvent(systemUnderTest, true));

        Assert.assertTrue(true);
    }
}