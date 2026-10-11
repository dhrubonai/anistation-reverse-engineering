package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lq1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ lq1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static lq1 a(String str) {
        char c;
        io3.n(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String U = wc7.U(split[i6].trim());
            U.getClass();
            switch (U.hashCode()) {
                case 100571:
                    if (U.equals("end")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (U.equals("text")) {
                        c = 1;
                        break;
                    }
                    break;
                case 102749521:
                    if (U.equals("layer")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (U.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (U.equals("style")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 != -1 && i3 != -1 && i5 != -1) {
            return new lq1(i, i2, i3, i4, i5, split.length);
        }
        return null;
    }
}
