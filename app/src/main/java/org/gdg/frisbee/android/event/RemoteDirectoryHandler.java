package org.gdg.frisbee.android.event;

import android.content.Context;

import org.gdg.frisbee.android.api.model.Directory;
import org.gdg.frisbee.android.app.App;

import retrofit.Callback;
import retrofit.RetrofitError;

public class RemoteDirectoryHandler extends DirectoryHandler {
    private Context context;

    public RemoteDirectoryHandler(Context context) {
        this.context = context;
    }

    @Override
    public void handle(final DirectoryCallback response) {
        App.getInstance().getGdgXHub().getDirectory(new Callback<Directory>() {
            @Override
            public void success(Directory directory, retrofit.client.Response directoryResponse) {
                response.process(directory);
            }

            @Override
            public void failure(RetrofitError error) {
                next(response);
            }
        });
    }
}
