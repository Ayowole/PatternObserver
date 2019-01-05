package com.ayowole.observer;

class Main {

    public static void main(String[] args) {
        NewsBuilder newsBuilderActionPart = new NewsBuilder();

        NewsBuilder newsBuilder = newsBuilderActionPart
                .addActionAfterCreateTiding(new EmailSender())
                .addActionAfterCreateTiding(new SMSSender())
                .addActionAfterCreateTiding(new FacebookMessageSender())
                .addActionAfterCreateTiding(new WhatsappMessageSender());

        News news = newsBuilder
                .addTitle("The good news is coming!")
                .addDescription("The good projects is coming because you'll learn design patterns")
                .build();
        
        System.out.println("This is the created news " + news);
    }

}
