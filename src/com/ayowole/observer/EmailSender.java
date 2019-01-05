package com.ayowole.observer;

class EmailSender implements ActionAfterCreateTiding {

    @Override
    public void execute(News tiding) {
        
        System.out.println("sending tiding by email " + tiding);
        
    }

}
