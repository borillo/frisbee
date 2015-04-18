package org.gdg.frisbee.android.event;

import android.content.Context;

public class DirectoryHandlerFactory {
    public static DirectoryHandler handler(Context context) {
        DirectoryHandler remote = new RemoteDirectoryHandler(context);
        DirectoryHandler cache = new CacheDirectoryHandler();
        cache.registerNext(remote);

        return cache;
    }
}
