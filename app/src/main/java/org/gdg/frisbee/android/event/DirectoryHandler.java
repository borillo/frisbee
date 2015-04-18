package org.gdg.frisbee.android.event;

import android.content.Context;

public abstract class DirectoryHandler {
    protected DirectoryHandler next;

    public void registerNext(DirectoryHandler handler) {
        next = handler;
    }

    protected void next(DirectoryCallback response) {
        if (next != null) {
            next.handle(response);
        }
    }

    protected abstract void handle(DirectoryCallback response);
}