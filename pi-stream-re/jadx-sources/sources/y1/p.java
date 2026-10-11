package y1;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.q0;
import c1.f1;
import c1.i1;
import j1.h1;
import j1.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import o1.d0;
import r6.b0;
import r6.m1;
import r6.n1;
import r6.o0;
import v1.g1;

/* loaded from: classes.dex */
public final class p extends v implements h1 {

    /* renamed from: j, reason: collision with root package name */
    public static final m1 f11515j;

    /* renamed from: k, reason: collision with root package name */
    public static final m1 f11516k;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11517c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11518d;

    /* renamed from: e, reason: collision with root package name */
    public final r f11519e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11520f;

    /* renamed from: g, reason: collision with root package name */
    public j f11521g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f11522h;

    /* renamed from: i, reason: collision with root package name */
    public c1.g f11523i;

    static {
        m1 b0Var;
        m1 b0Var2;
        Comparator bVar = new d0.b(7);
        if (bVar instanceof m1) {
            b0Var = (m1) bVar;
        } else {
            b0Var = new b0(bVar);
        }
        f11515j = b0Var;
        Comparator bVar2 = new d0.b(8);
        if (bVar2 instanceof m1) {
            b0Var2 = (m1) bVar2;
        } else {
            b0Var2 = new b0(bVar2);
        }
        f11516k = b0Var2;
    }

    public p(Context context) {
        Context context2;
        boolean z9;
        Spatializer spatializer;
        q0 q0Var = new q0();
        int i10 = j.T;
        j d10 = new i(context).d();
        this.f11517c = new Object();
        d0 d0Var = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f11518d = context2;
        this.f11519e = q0Var;
        this.f11521g = d10;
        this.f11523i = c1.g.f1695g;
        if (context != null && f1.b0.N(context)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11520f = z9;
        if (!z9 && context != null && f1.b0.f3799a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                d0Var = new d0(spatializer);
            }
            this.f11522h = d0Var;
        }
        if (this.f11521g.M && context == null) {
            f1.o.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c6 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void e(g1 g1Var, j jVar, HashMap hashMap) {
        for (int i10 = 0; i10 < g1Var.f10432a; i10++) {
            c1.g1 g1Var2 = (c1.g1) jVar.A.get(g1Var.a(i10));
            if (g1Var2 != null) {
                f1 f1Var = g1Var2.f1706a;
                c1.g1 g1Var3 = (c1.g1) hashMap.get(Integer.valueOf(f1Var.f1692c));
                if (g1Var3 == null || (g1Var3.f1707b.isEmpty() && !g1Var2.f1707b.isEmpty())) {
                    hashMap.put(Integer.valueOf(f1Var.f1692c), g1Var2);
                }
            }
        }
    }

    public static int f(c1.v vVar, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f1926d)) {
            return 4;
        }
        String j4 = j(str);
        String j10 = j(vVar.f1926d);
        if (j10 != null && j4 != null) {
            if (!j10.startsWith(j4) && !j4.startsWith(j10)) {
                int i10 = f1.b0.f3799a;
                if (!j10.split("-", 2)[0].equals(j4.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z9 || j10 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean h(int i10, boolean z9) {
        int i11 = i10 & 7;
        return i11 == 4 || (z9 && i11 == 3);
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean l(j jVar, int i10, c1.v vVar) {
        boolean z9;
        boolean z10;
        int i11 = i10 & 3584;
        if (i11 == 0) {
            return false;
        }
        i1 i1Var = jVar.f1791s;
        if (i1Var.f1722c && (i11 & 2048) == 0) {
            return false;
        }
        if (!i1Var.f1721b) {
            return true;
        }
        if (vVar.C == 0 && vVar.D == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i11 & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && !z10) {
            return false;
        }
        return true;
    }

    public static Pair m(int i10, u uVar, int[][][] iArr, m mVar, d0.b bVar) {
        RandomAccess randomAccess;
        boolean z9;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < uVar2.f11527a) {
            if (i10 == uVar2.f11528b[i11]) {
                g1 g1Var = uVar2.f11529c[i11];
                for (int i12 = 0; i12 < g1Var.f10432a; i12++) {
                    f1 a10 = g1Var.a(i12);
                    n1 a11 = mVar.a(i11, a10, iArr[i11][i12]);
                    int i13 = a10.f1690a;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        n nVar = (n) a11.get(i14);
                        int a12 = nVar.a();
                        if (!zArr[i14] && a12 != 0) {
                            if (a12 == 1) {
                                randomAccess = o0.o(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    n nVar2 = (n) a11.get(i15);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z9 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z9 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i11++;
            uVar2 = uVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, bVar);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((n) list.get(i16)).f11508c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f11507b, iArr2), Integer.valueOf(nVar3.f11506a));
    }

    @Override // y1.v
    public final void a() {
        d0 d0Var;
        synchronized (this.f11517c) {
            if (f1.b0.f3799a >= 32 && (d0Var = this.f11522h) != null) {
                Object obj = d0Var.f8140d;
                if (((Spatializer$OnSpatializerStateChangedListener) obj) != null && ((Handler) d0Var.f8139c) != null) {
                    ((Spatializer) d0Var.f8138b).removeOnSpatializerStateChangedListener((Spatializer$OnSpatializerStateChangedListener) obj);
                    ((Handler) d0Var.f8139c).removeCallbacksAndMessages(null);
                    d0Var.f8139c = null;
                    d0Var.f8140d = null;
                }
            }
        }
        this.f11533a = null;
        this.f11534b = null;
    }

    public final i d() {
        j jVar;
        synchronized (this.f11517c) {
            jVar = this.f11521g;
        }
        jVar.getClass();
        return new i(jVar);
    }

    public final j g() {
        j jVar;
        synchronized (this.f11517c) {
            jVar = this.f11521g;
        }
        return jVar;
    }

    public final void i() {
        boolean z9;
        j0 j0Var;
        d0 d0Var;
        synchronized (this.f11517c) {
            if (this.f11521g.M && !this.f11520f && f1.b0.f3799a >= 32 && (d0Var = this.f11522h) != null && d0Var.f8137a) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (z9 && (j0Var = this.f11533a) != null) {
            j0Var.f5806y.d(10);
        }
    }

    public final void k() {
        boolean z9;
        j0 j0Var;
        synchronized (this.f11517c) {
            z9 = this.f11521g.Q;
        }
        if (z9 && (j0Var = this.f11533a) != null) {
            j0Var.f5806y.d(26);
        }
    }

    public final void n(i iVar) {
        o(new j(iVar));
    }

    public final void o(j jVar) {
        boolean z9;
        jVar.getClass();
        synchronized (this.f11517c) {
            if (!this.f11521g.equals(jVar)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f11521g = jVar;
        }
        if (z9) {
            if (jVar.M && this.f11518d == null) {
                f1.o.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            j0 j0Var = this.f11533a;
            if (j0Var != null) {
                j0Var.f5806y.d(10);
            }
        }
    }
}
