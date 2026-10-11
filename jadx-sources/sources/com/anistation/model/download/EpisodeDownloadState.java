package com.anistation.model.download;

import defpackage.sv1;
import defpackage.t80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class EpisodeDownloadState {
    private static final /* synthetic */ sv1 $ENTRIES;
    private static final /* synthetic */ EpisodeDownloadState[] $VALUES;
    public static final EpisodeDownloadState QUEUED = new EpisodeDownloadState("QUEUED", 0);
    public static final EpisodeDownloadState STOPPED = new EpisodeDownloadState("STOPPED", 1);
    public static final EpisodeDownloadState DOWNLOADING = new EpisodeDownloadState("DOWNLOADING", 2);
    public static final EpisodeDownloadState COMPLETED = new EpisodeDownloadState("COMPLETED", 3);
    public static final EpisodeDownloadState FAILED = new EpisodeDownloadState("FAILED", 4);
    public static final EpisodeDownloadState REMOVING = new EpisodeDownloadState("REMOVING", 5);
    public static final EpisodeDownloadState RESTARTING = new EpisodeDownloadState("RESTARTING", 6);

    private static final /* synthetic */ EpisodeDownloadState[] $values() {
        return new EpisodeDownloadState[]{QUEUED, STOPPED, DOWNLOADING, COMPLETED, FAILED, REMOVING, RESTARTING};
    }

    static {
        EpisodeDownloadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = t80.D($values);
    }

    private EpisodeDownloadState(String str, int i) {
    }

    public static sv1 getEntries() {
        return $ENTRIES;
    }

    public static EpisodeDownloadState valueOf(String str) {
        return (EpisodeDownloadState) Enum.valueOf(EpisodeDownloadState.class, str);
    }

    public static EpisodeDownloadState[] values() {
        return (EpisodeDownloadState[]) $VALUES.clone();
    }

    public final boolean getCanPause() {
        if (this != QUEUED && this != DOWNLOADING && this != RESTARTING) {
            return false;
        }
        return true;
    }

    public final boolean getCanResume() {
        if (this == STOPPED) {
            return true;
        }
        return false;
    }
}
