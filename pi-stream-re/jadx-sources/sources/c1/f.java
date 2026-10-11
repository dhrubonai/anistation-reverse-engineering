package c1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1677a;

    /* renamed from: b, reason: collision with root package name */
    public int f1678b;

    /* renamed from: c, reason: collision with root package name */
    public int f1679c;

    /* renamed from: d, reason: collision with root package name */
    public int f1680d;

    /* renamed from: e, reason: collision with root package name */
    public int f1681e;

    public f(int i10, int i11, int i12, int i13, int i14) {
        this.f1677a = i10;
        this.f1678b = i11;
        this.f1679c = i12;
        this.f1680d = i13;
        this.f1681e = i14;
    }

    public static f b(String str) {
        char c6;
        w7.b.g(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String g02 = j5.a.g0(split[i14].trim());
            g02.getClass();
            switch (g02.hashCode()) {
                case 100571:
                    if (g02.equals("end")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (g02.equals("text")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (g02.equals("start")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (g02.equals("style")) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            c6 = 65535;
            switch (c6) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new f(i10, i11, i12, i13, split.length);
        }
        return null;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f1677a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f1680d;
            int i16 = this.f1678b;
            if (i15 > i16) {
                i12 = 1;
            } else if (i15 == i16) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            if (((i12 << 0) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f1680d;
            int i18 = this.f1679c;
            if (i17 > i18) {
                i11 = 1;
            } else if (i17 == i18) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f1681e;
            int i20 = this.f1678b;
            if (i19 > i20) {
                i10 = 1;
            } else if (i19 == i20) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f1681e;
            int i22 = this.f1679c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public f(int i10, int i11, int i12, int i13) {
        this.f1677a = i10;
        this.f1679c = 2;
        this.f1678b = i11;
        this.f1680d = i12;
        this.f1681e = i13;
    }

    public /* synthetic */ f() {
        this.f1677a = 0;
    }
}
