package com.google.android.gms.common.internal;

import android.content.ClipData;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder h(int i10) {
        return new TrackChangeEvent.Builder(i10);
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }
}
