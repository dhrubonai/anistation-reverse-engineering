package defpackage;

import com.anistation.model.animelist.AnimeListImportProvider;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xl5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AnimeListImportProvider.values().length];
        try {
            iArr[AnimeListImportProvider.ANILIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnimeListImportProvider.MAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
