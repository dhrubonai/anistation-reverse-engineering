package com.unity3d.ads.core.extensions;

import defpackage.a34;
import defpackage.b06;
import defpackage.c15;
import defpackage.kl0;
import defpackage.uz5;
import defpackage.yo0;
import defpackage.zd0;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    private static final c15 VERSION_REGEX = new c15("[0-9.]+");

    public static final int compareVersion(String str, String str2) {
        int i;
        int i2;
        Integer J;
        Integer J2;
        str.getClass();
        str2.getClass();
        if (str.length() != 0 && str2.length() != 0) {
            String c0 = uz5.c0(uz5.c0(str, "v"), "V");
            String c02 = uz5.c0(uz5.c0(str2, "v"), "V");
            c15 c15Var = VERSION_REGEX;
            if (c15Var.b(c0) && c15Var.b(c02) && !uz5.M(c0, "..", false) && !uz5.M(c02, "..", false)) {
                List i0 = uz5.i0(c0, new String[]{"."}, 6);
                List i02 = uz5.i0(c02, new String[]{"."}, 6);
                int max = Math.max(i0.size(), i02.size());
                for (int i3 = 0; i3 < max; i3++) {
                    String str3 = (String) yo0.n0(i3, i0);
                    if (str3 != null && (J2 = b06.J(10, str3)) != null) {
                        i = J2.intValue();
                    } else {
                        i = 0;
                    }
                    String str4 = (String) yo0.n0(i3, i02);
                    if (str4 != null && (J = b06.J(10, str4)) != null) {
                        i2 = J.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (i != i2) {
                        return a34.D(i, i2);
                    }
                }
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public static final String getSHA256Hash(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kl0.a);
        bytes.getClass();
        byte[] copyOf = Arrays.copyOf(bytes, bytes.length);
        String e = new zd0(Arrays.copyOf(copyOf, copyOf.length)).c("SHA-256").e();
        e.getClass();
        return e;
    }

    public static final String guessMimeType(String str) {
        str.getClass();
        return URLConnection.guessContentTypeFromName(str);
    }
}
