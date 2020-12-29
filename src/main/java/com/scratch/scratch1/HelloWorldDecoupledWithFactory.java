package com.scratch.scratch1;

import com.scratch.scratch1.factory.MessageSupportFactory;
import com.scratch.scratch1.provider.MessageProvider;
import com.scratch.scratch1.renderer.MessageRenderer;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}