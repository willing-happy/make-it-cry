package com.cry.it.make.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FaceTest {

    @Test
    public void should_cry() throws Exception {
        assertThat(new Face().face(), is("cry"));
    }
}