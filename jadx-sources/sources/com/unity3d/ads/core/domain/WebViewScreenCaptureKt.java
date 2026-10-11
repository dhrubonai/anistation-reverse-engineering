package com.unity3d.ads.core.domain;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebViewScreenCaptureKt {
    public static final double countBlackPixelRatio(int[] iArr, int i) {
        iArr.getClass();
        if (iArr.length == 0) {
            return 0.0d;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = (i3 >> 16) & 255;
            int i5 = (i3 >> 8) & 255;
            int i6 = i3 & 255;
            if (i4 < i && i5 < i && i6 < i) {
                i2++;
            }
        }
        return i2 / iArr.length;
    }
}
