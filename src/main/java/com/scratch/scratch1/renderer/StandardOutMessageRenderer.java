package com.scratch.scratch1.renderer;

import com.scratch.scratch1.provider.MessageProvider;

public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("you must set the property messageProvider of class:" 
            + StandardOutMessageRenderer.class.getName());
        } 

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }


}