package defpackage;

import com.anistation.model.settings.SubtitleFontFamily;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qp4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SubtitleFontFamily.values().length];
        try {
            iArr[SubtitleFontFamily.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubtitleFontFamily.TREBUCHET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubtitleFontFamily.INTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubtitleFontFamily.LEVENIM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
