package com.telenav.osv.event.hardware.camera;

import com.telenav.osv.event.OSVEvent;

/**
 * Created by Kalman on 16/11/2016.
 */

public class ImageSavedEvent extends OSVEvent {
    public boolean saved;

    public ImageSavedEvent(boolean saved){
        this.saved = saved;
    }
}
