package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutAamin() throws Exception {
        assertThat(queryProcessor.process("Aamin"), containsString("spammer"));
    }

    @Test
    public void knowsName() throws Exception {
        assertThat(queryProcessor.process("name"), containsString("Aamin"));
    }


    @Test
    public void AddsNumbers() throws Exception {
        //assertThat(queryProcessor.process("q:what is 10 plus 3"), containsString("13"));
    }

    @Test
    public void WhichOfTheFollowing() throws Exception {
        //assertThat(queryProcessor.process("q:which of the following numbers is the largest: 374, 14"), containsString("374"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

}
