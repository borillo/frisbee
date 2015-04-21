package org.gdg.frisbee.android.activity;

import android.support.v4.app.Fragment;

import org.gdg.frisbee.android.fragment.AboutFragment;
import org.gdg.frisbee.android.fragment.ChangelogFragment;
import org.gdg.frisbee.android.fragment.ContributorsFragment;
import org.gdg.frisbee.android.fragment.ExtLibrariesFragment;
import org.gdg.frisbee.android.fragment.GetInvolvedFragment;
import org.gdg.frisbee.android.fragment.TranslatorsFragment;

public enum NextItem {
    ABOUT,
    CONTRIBUTORS {
        public Fragment create() {
            return new ContributorsFragment();
        }
    },
    TRANSLATORS {
        public Fragment create() {
            return new TranslatorsFragment();
        }
    },
    CHANGELOG {
        public Fragment create() {
            return new ChangelogFragment();
        }
    },
    GETINVOLVED {
        public Fragment create() {
            return new GetInvolvedFragment();
        }
    },
    EXTLIBRARIES {
        public Fragment create() {
            return new ExtLibrariesFragment();
        }
    };

    public static NextItem next(int position) {
        return NextItem.values()[position];
    }

    public Fragment create() {
        return new AboutFragment();
    }

    public static void main(String[] args) {
        int position = 2;
        NextItem.next(position).create();
    }
}