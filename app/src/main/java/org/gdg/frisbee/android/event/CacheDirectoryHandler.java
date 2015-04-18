package org.gdg.frisbee.android.event;

import org.gdg.frisbee.android.Const;
import org.gdg.frisbee.android.api.model.Directory;
import org.gdg.frisbee.android.app.App;
import org.gdg.frisbee.android.cache.ModelCache;

public class CacheDirectoryHandler extends DirectoryHandler {
    @Override
    public void handle(final DirectoryCallback response) {
        App.getInstance().getModelCache().getAsync(Const.CACHE_KEY_CHAPTER_LIST_HUB, new ModelCache.CacheListener() {
            @Override
            public void onGet(Object item) {
                response.process((Directory) item);
            }

            @Override
            public void onNotFound(String key) {
                next(response);
            }
        });
    }
}
