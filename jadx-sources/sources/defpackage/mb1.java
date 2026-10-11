package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mb1 {
    public static final qg4 k = new tq0(new be(4));
    public ih6 a;
    public z20 b;
    public final Context c;
    public final iz1 d;
    public hb1 e;
    public hb1 f;
    public volatile Thread g;
    public tu h;
    public ru i;
    public Boolean j;

    public mb1(hh6 hh6Var, iz1 iz1Var, Context context) {
        Context context2;
        hb1 hb1Var;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.c = context2;
        this.d = iz1Var;
        if (hh6Var instanceof hb1) {
            hb1Var = (hb1) hh6Var;
        } else {
            hb1 hb1Var2 = hb1.F0;
            hb1Var2.getClass();
            gb1 gb1Var = new gb1(hb1Var2);
            gb1Var.e(hh6Var);
            hb1Var = new hb1(gb1Var);
        }
        this.e = hb1Var;
        this.f = hb1Var;
        this.i = ru.i;
        if (hb1Var.A0 && context == null) {
            kb0.O("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(nn3 nn3Var, hb1 hb1Var, hz1[] hz1VarArr) {
        int i = nn3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            zg6 zg6Var = nn3Var.c[i2];
            Map map = (Map) hb1Var.D0.get(i2);
            if (map != null && map.containsKey(zg6Var)) {
                Map map2 = (Map) hb1Var.D0.get(i2);
                if (map2 != null && map2.get(zg6Var) != null) {
                    ov3.d();
                    return;
                }
                hz1VarArr[i2] = null;
            }
        }
    }

    public static void b(nn3 nn3Var, hb1 hb1Var, hz1[] hz1VarArr) {
        for (int i = 0; i < nn3Var.a; i++) {
            int i2 = nn3Var.b[i];
            if (hb1Var.E0.get(i) || hb1Var.I.contains(Integer.valueOf(i2))) {
                hz1VarArr[i] = null;
            }
        }
    }

    public static void c(nn3 nn3Var, hb1 hb1Var, hz1[] hz1VarArr) {
        hz1 hz1Var;
        int i = nn3Var.a;
        zg6[] zg6VarArr = nn3Var.c;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(zg6VarArr[i2], hb1Var, hashMap);
        }
        d(nn3Var.f, hb1Var, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            dh6 dh6Var = (dh6) hashMap.get(Integer.valueOf(nn3Var.b[i3]));
            if (dh6Var != null) {
                yg6 yg6Var = dh6Var.a;
                nw2 nw2Var = dh6Var.b;
                if (!nw2Var.isEmpty() && zg6VarArr[i3].b(yg6Var) != -1) {
                    hz1Var = new hz1(yg6Var, jf7.L(nw2Var));
                } else {
                    hz1Var = null;
                }
                hz1VarArr[i3] = hz1Var;
            }
        }
    }

    public static void d(zg6 zg6Var, hh6 hh6Var, HashMap hashMap) {
        for (int i = 0; i < zg6Var.a; i++) {
            dh6 dh6Var = (dh6) hh6Var.H.get(zg6Var.a(i));
            if (dh6Var != null) {
                yg6 yg6Var = dh6Var.a;
                dh6 dh6Var2 = (dh6) hashMap.get(Integer.valueOf(yg6Var.c));
                if (dh6Var2 == null || (dh6Var2.b.isEmpty() && !dh6Var.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(yg6Var.c), dh6Var);
                }
            }
        }
    }

    public static Pair e(hz1[] hz1VarArr, int i) {
        for (int i2 = 0; i2 < hz1VarArr.length; i2++) {
            hz1 hz1Var = hz1VarArr[i2];
            if (hz1Var != null && hz1Var.a.c == i) {
                return Pair.create(hz1Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(ea2 ea2Var, nw2 nw2Var) {
        for (int i = 0; i < nw2Var.size(); i++) {
            for (int i2 = 0; i2 < ea2Var.c.size(); i2++) {
                if (((w93) ea2Var.c.get(i2)).b.equals(nw2Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(ea2 ea2Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ea2Var.d)) {
            return 4;
        }
        String h = h(str);
        String h2 = h(ea2Var.d);
        if (h2 != null && h != null) {
            if (!h2.startsWith(h) && !h.startsWith(h2)) {
                String str2 = eq6.a;
                if (!h2.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z || h2 != null) {
            return 0;
        }
        return 1;
    }

    public static String h(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean k(hb1 hb1Var, int i, ea2 ea2Var) {
        boolean z;
        boolean z2;
        if ((i & 3584) == 0) {
            return false;
        }
        fh6 fh6Var = hb1Var.w;
        if (fh6Var.c && (i & 2048) == 0) {
            return false;
        }
        if (fh6Var.b) {
            if (ea2Var.N == 0 && ea2Var.O == 0) {
                z = false;
            } else {
                z = true;
            }
            if ((i & 1024) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static hz1 l(zg6 zg6Var, int[][] iArr, hb1 hb1Var) {
        if (hb1Var.w.a != 2) {
            int i = 0;
            yg6 yg6Var = null;
            fb1 fb1Var = null;
            for (int i2 = 0; i2 < zg6Var.a; i2++) {
                yg6 a = zg6Var.a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < a.a; i3++) {
                    if (w30.l(iArr2[i3], hb1Var.B0)) {
                        fb1 fb1Var2 = new fb1(iArr2[i3], a.d[i3]);
                        if (fb1Var != null) {
                            if (wq0.a.d(fb1Var2.y, fb1Var.y).d(fb1Var2.x, fb1Var.x).f() <= 0) {
                            }
                        }
                        yg6Var = a;
                        i = i3;
                        fb1Var = fb1Var2;
                    }
                }
            }
            if (yg6Var != null) {
                return new hz1(yg6Var, i);
            }
        }
        return null;
    }

    public static Pair n(int i, nn3 nn3Var, int[][][] iArr, jb1 jb1Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        nn3 nn3Var2 = nn3Var;
        ArrayList arrayList = new ArrayList();
        int i3 = nn3Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == nn3Var2.b[i4]) {
                zg6 zg6Var = nn3Var2.c[i4];
                for (int i5 = 0; i5 < zg6Var.a; i5++) {
                    yg6 a = zg6Var.a(i5);
                    o15 a2 = jb1Var.a(i4, a, iArr[i4][i5]);
                    int i6 = a.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        kb1 kb1Var = (kb1) a2.get(i7);
                        int a3 = kb1Var.a();
                        if (zArr[i7] || a3 == 0) {
                            i2 = i3;
                        } else {
                            if (a3 == 1) {
                                randomAccess = nw2.s(kb1Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(kb1Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    kb1 kb1Var2 = (kb1) a2.get(i8);
                                    int i9 = i3;
                                    if (kb1Var2.a() == 2 && kb1Var.b(kb1Var2)) {
                                        arrayList2.add(kb1Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            nn3Var2 = nn3Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((kb1) list.get(i10)).z;
        }
        kb1 kb1Var3 = (kb1) list.get(0);
        return Pair.create(new hz1(kb1Var3.y, iArr2), Integer.valueOf(kb1Var3.x));
    }

    public final void i(hh6 hh6Var) {
        if (hh6Var == null) {
            return;
        }
        if (hh6Var instanceof hb1) {
            this.f = (hb1) hh6Var;
            return;
        }
        gb1 gb1Var = new gb1(this.f);
        gb1Var.e(hh6Var);
        this.f = new hb1(gb1Var);
    }

    public final void j() {
        tu tuVar;
        aw5 aw5Var;
        if (this.g != null) {
            io3.A("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(this.g));
        }
        if (Build.VERSION.SDK_INT >= 32 && (tuVar = this.h) != null) {
            Handler handler = (Handler) tuVar.z;
            Spatializer spatializer = (Spatializer) tuVar.y;
            if (spatializer != null && (aw5Var = (aw5) tuVar.A) != null && handler != null) {
                z3.h(spatializer, aw5Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [ew2, jw2] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ew2, yw2] */
    public final jh6 m(w30[] w30VarArr, zg6 zg6Var, jw3 jw3Var, kf6 kf6Var) {
        byte b;
        final String str;
        int[] iArr;
        zg6[] zg6VarArr;
        int[][][] iArr2;
        boolean z;
        boolean z2;
        int[] iArr3;
        boolean z3;
        o15 o15Var;
        boolean z4;
        x25 x25Var;
        String str2;
        Pair n;
        CaptioningManager captioningManager;
        Locale locale;
        final Point point;
        Pair n2;
        Pair n3;
        final boolean z5;
        Context context;
        int i;
        int[] iArr4;
        int i2;
        zg6 zg6Var2 = zg6Var;
        int i3 = 1;
        int[] iArr5 = new int[w30VarArr.length + 1];
        int length = w30VarArr.length + 1;
        yg6[][] yg6VarArr = new yg6[length];
        int[][][] iArr6 = new int[w30VarArr.length + 1][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = zg6Var2.a;
            yg6VarArr[i4] = new yg6[i5];
            iArr6[i4] = new int[i5];
        }
        int length2 = w30VarArr.length;
        final int[] iArr7 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr7[i6] = w30VarArr[i6].E();
        }
        int i7 = 0;
        while (true) {
            b = 5;
            if (i7 >= zg6Var2.a) {
                break;
            }
            yg6 a = zg6Var2.a(i7);
            if (a.c == 5) {
                i = i3;
            } else {
                i = 0;
            }
            int length3 = w30VarArr.length;
            int i8 = i3;
            int i9 = 0;
            int i10 = 0;
            while (i9 < w30VarArr.length) {
                w30 w30Var = w30VarArr[i9];
                int i11 = i3;
                int i12 = 0;
                for (int i13 = 0; i13 < a.a; i13++) {
                    i12 = Math.max(i12, w30Var.D(a.d[i13]) & 7);
                }
                if (iArr5[i9] == 0) {
                    i2 = i11;
                } else {
                    i2 = 0;
                }
                if (i12 > i10 || (i12 == i10 && i != 0 && i8 == 0 && i2 != 0)) {
                    i8 = i2;
                    i10 = i12;
                    length3 = i9;
                }
                i9++;
                i3 = i11;
            }
            int i14 = i3;
            if (length3 == w30VarArr.length) {
                iArr4 = new int[a.a];
            } else {
                w30 w30Var2 = w30VarArr[length3];
                int[] iArr8 = new int[a.a];
                for (int i15 = 0; i15 < a.a; i15++) {
                    iArr8[i15] = w30Var2.D(a.d[i15]);
                }
                iArr4 = iArr8;
            }
            int i16 = iArr5[length3];
            yg6VarArr[length3][i16] = a;
            iArr6[length3][i16] = iArr4;
            iArr5[length3] = i16 + 1;
            i7++;
            zg6Var2 = zg6Var;
            i3 = i14;
        }
        int i17 = i3;
        byte b2 = 7;
        zg6[] zg6VarArr2 = new zg6[w30VarArr.length];
        String[] strArr = new String[w30VarArr.length];
        int[] iArr9 = new int[w30VarArr.length];
        for (int i18 = 0; i18 < w30VarArr.length; i18++) {
            int i19 = iArr5[i18];
            zg6VarArr2[i18] = new zg6((yg6[]) eq6.W(yg6VarArr[i18], i19));
            iArr6[i18] = (int[][]) eq6.W(iArr6[i18], i19);
            strArr[i18] = w30VarArr[i18].i();
            iArr9[i18] = w30VarArr[i18].y;
        }
        nn3 nn3Var = new nn3(iArr9, zg6VarArr2, iArr7, iArr6, new zg6((yg6[]) eq6.W(yg6VarArr[w30VarArr.length], iArr5[w30VarArr.length])));
        this.g = Thread.currentThread();
        Boolean bool = this.j;
        if (bool == null && (context = this.c) != null) {
            bool = Boolean.valueOf(eq6.R(context));
            this.j = bool;
        }
        if (this.f.A0 && Build.VERSION.SDK_INT >= 32 && this.h == null) {
            this.h = new tu(this.c, new p0((Object) this, (byte) 15), bool);
        }
        int i20 = nn3Var.a;
        hz1[] hz1VarArr = new hz1[i20];
        c(nn3Var, this.f, hz1VarArr);
        a(nn3Var, this.f, hz1VarArr);
        b(nn3Var, this.f, hz1VarArr);
        final hb1 hb1Var = this.f;
        Context context2 = this.c;
        int i21 = nn3Var.a;
        Pair e = e(hz1VarArr, i17);
        if (e == null) {
            int i22 = 0;
            while (true) {
                if (i22 < i21) {
                    if (2 == iArr9[i22] && zg6VarArr2[i22].a > 0) {
                        z5 = true;
                        break;
                    }
                    i22++;
                } else {
                    z5 = false;
                    break;
                }
            }
            e = n(1, nn3Var, iArr6, new jb1() { // from class: cb1
                @Override // defpackage.jb1
                public final o15 a(int i23, yg6 yg6Var, int[] iArr10) {
                    mb1 mb1Var = mb1.this;
                    hb1 hb1Var2 = hb1Var;
                    za1 za1Var = new za1(mb1Var, hb1Var2);
                    int i24 = iArr7[i23];
                    jw2 k2 = nw2.k();
                    for (int i25 = 0; i25 < yg6Var.a; i25++) {
                        k2.c(new db1(i23, yg6Var, i25, hb1Var2, iArr10[i25], z5, za1Var, i24));
                    }
                    return k2.g();
                }
            }, new be(b2));
            if (e != null) {
                hz1VarArr[((Integer) e.second).intValue()] = (hz1) e.first;
            }
        }
        if (e == null) {
            str = null;
        } else {
            hz1 hz1Var = (hz1) e.first;
            str = hz1Var.a.d[hz1Var.b[0]].d;
        }
        Pair e2 = e(hz1VarArr, 2);
        Pair e3 = e(hz1VarArr, 4);
        if (e2 == null && e3 == null) {
            if (hb1Var.w.a == 2) {
                n2 = null;
            } else {
                if (hb1Var.k && context2 != null) {
                    point = eq6.y(context2);
                } else {
                    point = null;
                }
                n2 = n(2, nn3Var, iArr6, new jb1() { // from class: bb1
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
                    @Override // defpackage.jb1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final defpackage.o15 a(int r17, defpackage.yg6 r18, int[] r19) {
                        /*
                            Method dump skipped, instructions count: 190
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb1.a(int, yg6, int[]):o15");
                    }
                }, new be((byte) 6));
            }
            if ((!hb1Var.E && n2 != null) || hb1Var.w.a == 2) {
                n3 = null;
            } else {
                n3 = n(4, nn3Var, iArr6, new ab1(hb1Var), new be(b));
            }
            if (n3 != null) {
                hz1VarArr[((Integer) n3.second).intValue()] = (hz1) n3.first;
            } else if (n2 != null) {
                hz1VarArr[((Integer) n2.second).intValue()] = (hz1) n2.first;
            }
        }
        if (e(hz1VarArr, 3) == null) {
            if (hb1Var.w.a == 2) {
                n = null;
            } else {
                if (hb1Var.B && context2 != null && (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
                    String str3 = eq6.a;
                    str2 = locale.toLanguageTag();
                } else {
                    str2 = null;
                }
                n = n(3, nn3Var, iArr6, new ia1((Object) hb1Var, (Object) str, (Object) str2, (byte) 1), new be((byte) 8));
            }
            if (n != null) {
                hz1VarArr[((Integer) n.second).intValue()] = (hz1) n.first;
            }
        }
        int a2 = w30.a(0, 0, 0, 0);
        if (hb1Var.w.a == 2) {
            iArr = iArr9;
            zg6VarArr = zg6VarArr2;
            iArr2 = iArr6;
        } else {
            int i23 = zw2.z;
            ?? ew2Var = new ew2(4);
            int i24 = 0;
            while (i24 < i20) {
                hz1 hz1Var2 = hz1VarArr[i24];
                if (hz1Var2 != null) {
                    yg6 yg6Var = hz1Var2.a;
                    if (!hb1Var.E0.get(i24) && !hb1Var.I.contains(Integer.valueOf(yg6Var.c))) {
                        ew2Var.a(yg6Var.b);
                        int i25 = 0;
                        while (true) {
                            int[] iArr10 = hz1Var2.b;
                            iArr3 = iArr9;
                            if (i25 < iArr10.length) {
                                String str4 = yg6Var.d[iArr10[i25]].n;
                                if (str4 != null) {
                                    ew2Var.c(str4);
                                }
                                i25++;
                                iArr9 = iArr3;
                            }
                        }
                        i24++;
                        iArr9 = iArr3;
                    }
                }
                iArr3 = iArr9;
                i24++;
                iArr9 = iArr3;
            }
            iArr = iArr9;
            zw2 h = ew2Var.h();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i26 = 0;
            while (i26 < i21) {
                if (iArr[i26] == 5) {
                    zg6 zg6Var3 = zg6VarArr2[i26];
                    int i27 = 0;
                    while (i27 < zg6Var3.a) {
                        yg6 a3 = zg6Var3.a(i27);
                        arrayList.add(a3);
                        zg6[] zg6VarArr3 = zg6VarArr2;
                        int[] iArr11 = (int[]) iArr6[i26][i27].clone();
                        int i28 = i26;
                        int[][][] iArr12 = iArr6;
                        for (int i29 = 0; i29 < iArr11.length; i29++) {
                            String str5 = a3.d[i29].n;
                            if (str5 != null && !h.contains(str5)) {
                                iArr11[i29] = a2;
                            }
                        }
                        arrayList2.add(iArr11);
                        i27++;
                        i26 = i28;
                        zg6VarArr2 = zg6VarArr3;
                        iArr6 = iArr12;
                    }
                }
                i26++;
                zg6VarArr2 = zg6VarArr2;
                iArr6 = iArr6;
            }
            zg6VarArr = zg6VarArr2;
            iArr2 = iArr6;
            int size = arrayList.size();
            yg6[] yg6VarArr2 = new yg6[size];
            if (arrayList.size() == size) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            arrayList.toArray(yg6VarArr2);
            zg6 zg6Var4 = new zg6(yg6VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr13 = new int[size2];
            if (arrayList2.size() == size2) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.B(z2);
            arrayList2.toArray(iArr13);
            for (int i30 = 0; i30 < i21; i30++) {
                if (iArr[i30] == 5) {
                    hz1 l = l(zg6Var4, iArr13, hb1Var);
                    hz1VarArr[i30] = l;
                    if (l == null) {
                        break;
                    }
                    Arrays.fill(iArr13[zg6Var4.b(l.a)], a2);
                }
            }
        }
        for (int i31 = 0; i31 < i21; i31++) {
            int i32 = iArr[i31];
            if (i32 != 2 && i32 != 1) {
                if (i32 != 3 && i32 != 4) {
                    if (i32 != 5 && hz1VarArr[i31] == null) {
                        hz1VarArr[i31] = l(zg6VarArr[i31], iArr2[i31], hb1Var);
                    }
                }
            }
        }
        int i33 = 2;
        c(nn3Var, this.f, hz1VarArr);
        a(nn3Var, this.f, hz1VarArr);
        b(nn3Var, this.f, hz1VarArr);
        iz1 iz1Var = this.d;
        z20 z20Var = this.b;
        z20Var.getClass();
        jz1[] d = iz1Var.d(hz1VarArr, z20Var);
        x25[] x25VarArr = new x25[i20];
        for (int i34 = 0; i34 < i20; i34++) {
            int i35 = nn3Var.b[i34];
            if (!this.f.E0.get(i34) && !this.f.I.contains(Integer.valueOf(i35)) && (nn3Var.b[i34] == -2 || d[i34] != null)) {
                x25Var = x25.c;
            } else {
                x25Var = null;
            }
            x25VarArr[i34] = x25Var;
        }
        this.f.getClass();
        hb1 hb1Var2 = this.f;
        if (hb1Var2.w.a != 0) {
            int i36 = 0;
            int i37 = 0;
            int i38 = -1;
            while (true) {
                if (i36 < nn3Var.a) {
                    int i39 = nn3Var.b[i36];
                    jz1 jz1Var = d[i36];
                    if (i39 != 1 && jz1Var != null) {
                        break;
                    }
                    if (i39 == 1 && jz1Var != null && jz1Var.length() == 1) {
                        if (k(hb1Var2, iArr2[i36][nn3Var.c[i36].b(jz1Var.c())][jz1Var.j(0)], jz1Var.n())) {
                            i37++;
                            i38 = i36;
                        }
                    }
                    i36++;
                } else if (i37 == 1) {
                    if (hb1Var2.w.b) {
                        i33 = 1;
                    }
                    x25 x25Var2 = x25VarArr[i38];
                    if (x25Var2 != null && x25Var2.b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    x25VarArr[i38] = new x25(i33, z4);
                }
            }
        }
        Pair create = Pair.create(x25VarArr, d);
        jz1[] jz1VarArr = (jz1[]) create.second;
        int length4 = jz1VarArr.length;
        List[] listArr = new List[length4];
        for (int i40 = 0; i40 < jz1VarArr.length; i40++) {
            jz1 jz1Var2 = jz1VarArr[i40];
            if (jz1Var2 != null) {
                o15Var = nw2.s(jz1Var2);
            } else {
                z62 z62Var = nw2.y;
                o15Var = o15.B;
            }
            listArr[i40] = o15Var;
        }
        ?? ew2Var2 = new ew2(4);
        int i41 = 0;
        while (true) {
            int i42 = nn3Var.a;
            zg6[] zg6VarArr4 = nn3Var.c;
            if (i41 >= i42) {
                break;
            }
            zg6 zg6Var5 = zg6VarArr4[i41];
            int i43 = 0;
            while (i43 < zg6Var5.a) {
                yg6 a4 = zg6Var5.a(i43);
                int i44 = zg6VarArr4[i41].a(i43).a;
                int[] iArr14 = new int[i44];
                int i45 = 0;
                for (int i46 = 0; i46 < i44; i46++) {
                    if ((nn3Var.e[i41][i43][i46] & 7) == 4) {
                        iArr14[i45] = i46;
                        i45++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr14, i45);
                List[] listArr2 = listArr;
                int i47 = 16;
                String str6 = null;
                int i48 = 0;
                boolean z6 = false;
                int i49 = 0;
                while (i48 < copyOf.length) {
                    String str7 = zg6VarArr4[i41].a(i43).d[copyOf[i48]].p;
                    int i50 = i49 + 1;
                    if (i49 == 0) {
                        str6 = str7;
                    } else {
                        z6 = (!Objects.equals(str6, str7)) | z6;
                    }
                    i47 = Math.min(i47, nn3Var.e[i41][i43][i48] & 24);
                    i48++;
                    i49 = i50;
                }
                if (z6) {
                    i47 = Math.min(i47, nn3Var.d[i41]);
                }
                if (i47 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i51 = a4.a;
                int[] iArr15 = new int[i51];
                boolean[] zArr = new boolean[i51];
                int i52 = 0;
                while (i52 < a4.a) {
                    iArr15[i52] = nn3Var.e[i41][i43][i52] & 7;
                    int i53 = 0;
                    boolean z7 = false;
                    while (i53 < length4) {
                        List list = listArr2[i53];
                        int i54 = length4;
                        int i55 = i41;
                        int i56 = 0;
                        while (true) {
                            if (i56 < list.size()) {
                                jz1 jz1Var3 = (jz1) list.get(i56);
                                int i57 = i56;
                                if (jz1Var3.c().equals(a4) && jz1Var3.u(i52) != -1) {
                                    z7 = true;
                                    break;
                                }
                                i56 = i57 + 1;
                            }
                        }
                        i53++;
                        length4 = i54;
                        i41 = i55;
                    }
                    zArr[i52] = z7;
                    i52++;
                    i41 = i41;
                }
                ew2Var2.c(new ph6(a4, z3, iArr15, zArr));
                i43++;
                listArr = listArr2;
                length4 = length4;
                i41 = i41;
            }
            i41++;
            length4 = length4;
        }
        zg6 zg6Var6 = nn3Var.f;
        for (int i58 = 0; i58 < zg6Var6.a; i58++) {
            yg6 a5 = zg6Var6.a(i58);
            int[] iArr16 = new int[a5.a];
            Arrays.fill(iArr16, 0);
            ew2Var2.c(new ph6(a5, false, iArr16, new boolean[a5.a]));
        }
        return new jh6((x25[]) create.first, (jz1[]) create.second, new qh6(ew2Var2.g()), nn3Var);
    }

    public final void o(hh6 hh6Var) {
        if (hh6Var instanceof hb1) {
            p((hb1) hh6Var);
        }
        gb1 gb1Var = new gb1(this.e);
        gb1Var.e(hh6Var);
        p(new hb1(gb1Var));
    }

    public final void p(hb1 hb1Var) {
        boolean equals = this.e.equals(hb1Var);
        this.e = hb1Var;
        if (!equals) {
            if (hb1Var.A0 && this.c == null) {
                kb0.O("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            ih6 ih6Var = this.a;
            if (ih6Var != null) {
                ih6Var.f(hb1Var);
            }
        }
    }

    public mb1(Context context) {
        this(hb1.F0, new r18((byte) 4), context);
    }
}
