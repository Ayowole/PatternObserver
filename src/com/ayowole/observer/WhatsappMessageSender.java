package com.ayowole.observer;

class WhatsappMessageSender implements ActionAfterCreateTiding {

    @Override
    public void execute(News tiding) {
        
        System.out.println("sending tiding by whatsapp " + tiding);

    }

}
