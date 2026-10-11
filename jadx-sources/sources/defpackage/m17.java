package defpackage;

import com.anistation.model.download.EpisodeDownloadState;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m17 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[n17.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[kk1.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr3 = new int[EpisodeDownloadState.values().length];
        try {
            iArr3[EpisodeDownloadState.DOWNLOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[EpisodeDownloadState.QUEUED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[EpisodeDownloadState.STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[EpisodeDownloadState.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[EpisodeDownloadState.REMOVING.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[EpisodeDownloadState.RESTARTING.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        a = iArr3;
    }
}
