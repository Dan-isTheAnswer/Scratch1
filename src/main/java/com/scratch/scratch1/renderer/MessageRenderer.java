package com.scratch.scratch1.renderer;

import com.scratch.scratch1.provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}