package com.develogical;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        try {
            if (query.toLowerCase().contains("shakespeare")) {
                return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                        "English poet, playwright, and actor, widely regarded as the greatest " +
                        "writer in the English language and the world's pre-eminent dramatist.";
            } else if (query.toLowerCase().contains("aamin")) {
                return "Aamin Gem (11 April 2001 - ) is an " +
                        "Indian student, traveller, and human being, widely regarded as the greatest " +
                        "spammer in the TUM Informatik Community and the Discord Server.";
            } else if (query.toLowerCase().contains("name")) {
                return "Aamin";
            } else if (query.toLowerCase().contains("what")) {
                String[] parts = query.toLowerCase().split(":");
                System.out.println(Arrays.toString(parts));
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(parts[1]);
                int finalAnswer = 0;
                while (m.find()) {
                    finalAnswer += Integer.parseInt(m.group());
                }
                return String.valueOf(finalAnswer);
            } else if (query.toLowerCase().contains("which")) {
                String[] parts = query.toLowerCase().split(":");
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(parts[1]);
                List<Integer> finalAnswer = new ArrayList<>();
                while (m.find()) {
                    finalAnswer.add(Integer.parseInt(m.group()));
                }
                System.out.println(finalAnswer);
                return String.valueOf(Collections.max(finalAnswer));
            }
        } catch (NoSuchElementException e) {
            return "";
        }
        return "";
    }
}
