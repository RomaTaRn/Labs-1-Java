package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Потрібно вказати текст як аргумент командного рядка.");
            return;
        }

        String inputText = args[0];

        String processedText = processText(inputText);
        System.out.println(processedText);
    }

    public static String processText(String text) {
        Pattern pattern = Pattern.compile("\\b(\\w*)(\\w)\\b");
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        int lastIndex = 0;

        while (matcher.find()) {
            result.append(text, lastIndex, matcher.start());
            result.append(matcher.group(1)).append(Character.toUpperCase(matcher.group(2).charAt(0)));
            lastIndex = matcher.end();
        }

        result.append(text.substring(lastIndex));

        return result.toString();
    }
}