package com.bumptech.glide.load;

import v3.d;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f2245a;

    ImageHeaderParser$ImageType(boolean z9) {
        this.f2245a = z9;
    }

    public boolean hasAlpha() {
        return this.f2245a;
    }

    public boolean isWebp() {
        int i10 = d.f10640a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }
}
