package org.gdg.frisbee.android.event;

import org.gdg.frisbee.android.api.model.Directory;

public interface DirectoryCallback {
    void process(Directory directory);
}
