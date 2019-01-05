package com.ayowole.observer;

class SMSSender implements ActionAfterCreateTiding {

    @Override
    public void execute(News tiding) {
        
        System.out.println("sending tiding by sms " + tiding);
        
    }

}
