/*
 * Copyright 2013-2015 The GDG Frisbee Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gdg.frisbee.android;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: maui
 * Date: 20.04.13
 * Time: 12:19
 */
public class Const {
    
    private Const() {
    }

    //GitHub
    public static final String GITHUB_ORGA = "gdg-x";
    public static final String GITHUB_REPO = "frisbee";

    //Special Events
    public static final String EXTRA_TAGGED_EVENT = "org.gdg.frisbee.TAGGED_EVENT";
    public static final String EXTRA_TAGGED_EVENT_CACHEKEY = "org.gdg.frisbee.TAGGED_EVENT_CACHEKEY";
    //Special Events Dates
    public static final DateTime START_TIME_IOEXTENDED =    new DateTime(2015, 5, 1, 0, 0);
    public static final DateTime START_TIME_STUDY_JAMS =    new DateTime(2015, 2, 1, 0, 0);
    public static final DateTime START_TIME_WTM =           new DateTime(2015, 2, 1, 0, 0);

    public static final DateTime END_TIME_IOEXTENDED =      new DateTime(2015, 6, 1, 0, 0);
    public static final DateTime END_TIME_STUDY_JAMS =      new DateTime(2015, 5, 1, 0, 0);
    public static final DateTime END_TIME_WTM =             new DateTime(2015, 4, 1, 0, 0);

    public static final String EXTRA_PLUS_ID = "plus_id";

    //Navigation Drawer
    public static final int DRAWER_HOME = 0;
    public static final int DRAWER_PULSE = 2;
    public static final int DRAWER_SPECIAL = 3;
    public static final int DRAWER_ACHIEVEMENTS = 4;
    public static final int DRAWER_GDE = 5;
    public static final int DRAWER_ARROW = 99;
    public static final int DRAWER_SETTINGS = 100;
    public static final int DRAWER_HELP = 101;
    public static final int DRAWER_FEEDBACK = 102;
    public static final int DRAWER_ABOUT = 103;

    //Arrow
    public static final String QR_MSG_PREFIX = "gdgx://arrow?m=";
    public static final String PREF_ORGANIZER_CHECK_TIME = "pref_organizer_check_time";
    public static final String PREF_ORGANIZER_CHECK_ID = "pref_organizer_check_id";
    public static final long ORGANIZER_CHECK_MAX_TIME = 2592000000L; // 30 days
    public static final String ARROW_MIME = "application/vnd.org.gdgx.frisbee.arrow";
    public static final String ARROW_LB = "CgkIh5yNxL8MEAIQBw";
    public static final String ARROW_K = "XXXX111122223333";
    public static final int ARROW_STATE_KEY = 1;

    public static final int ARROW_DONE_STATE_KEY = 2;

    public static final String EXTRA_EVENT_ID = "EXTRA_EVENT_ID";
    public static final String EXTRA_SECTION = "EXTRA_SECTION";
    public static final String URL_DEVELOPERS_GOOGLE_COM = "https://developers.google.com";
    public static final String URL_HELP = "https://support.google.com/developergroups";
    public static final String EVENTS = "events";

    //Keys
    public static final String EXTRA_CHAPTER_ID = "org.gdg.frisbee.CHAPTER";
    public static final String CACHE_KEY_CHAPTER_LIST_HUB = "chapter_list_hub";
    public static final String CACHE_KEY_PULSE_GLOBAL = "pulse_global";
    public static final String CACHE_KEY_GDE_MAP = "gde_map";
    public static final String CACHE_KEY_FRISBEE_CONTRIBUTORS = "frisbee_contributors";
    public static final String CACHE_KEY_PERSON = "person_";
    public static final String CACHE_KEY_NEWS = "news_";
    public static final String CACHE_KEY_PULSE = "pulse_";
    public static final String CACHE_KEY_GDE = "gde_";

    public static final String GOOGLE_DEVELOPERS_YT_ID = "UC_x5XG1OV2P6uZZ5FSM9Ttw";
    public static final String ANDROID_DEVELOPERS_YT_ID = "UCVHFbqXqoYvEWM1Ddxl0QDg";
    public static final String YOUTUBE_DEVELOPERS_YT_ID = "UCtVd0c0tGXuTSbU5d8cSBUg";


    public static final String TRUSTSTORE_PW = "VU%&ibkr45pnq39v53x";
}
