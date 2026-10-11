package com.anistation.download.service;

import defpackage.bx7;
import defpackage.jf3;
import defpackage.kl1;
import defpackage.r02;
import defpackage.rb3;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class InternalDownloadService extends kl1 {
    public final rb3 G = bx7.B(jf3.x, new r02(this, (byte) 2));

    public static String d(long j) {
        if (j <= 0) {
            return "0 MB";
        }
        float f = ((float) j) / 1048576.0f;
        if (f < 1024.0f) {
            return String.format(Locale.US, "%.0f MB", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        return String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f)}, 1));
    }
}
