package defpackage;

import com.anistation.model.download.EpisodeDownloadState;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v02 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EpisodeDownloadState.values().length];
        try {
            iArr[EpisodeDownloadState.DOWNLOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EpisodeDownloadState.RESTARTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
