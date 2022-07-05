package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("aamin")) {
            return "Aamin Gem (11 April 2001 - ) is an " +
                    "Indian student, traveller, and human being, widely regarded as the greatest " +
                    "spammer in the TUM Informatik Community and the Discord Server.";
        }
        return "";
    }
}
