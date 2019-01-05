package com.ayowole.observer;

class FacebookMessageSender implements ActionAfterCreateTiding {

    @Override
    public void execute(News tiding) {
        
        System.out.println("sending tiding by facebook " + tiding);
        
    }

}
