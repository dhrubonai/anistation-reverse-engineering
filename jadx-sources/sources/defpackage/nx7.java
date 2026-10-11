package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.Html;
import android.text.InputFilter;
import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.Studio;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.library.WatchProgress;
import com.anistation.model.update.AppUpdateCheck;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nx7 {
    public static volatile jg4 x;
    public static final ui y = new ui(16);
    public static final os0 z = new os0(-963059412, false, new ps0(9));
    public static final os0 A = new os0(267145420, false, new qs0(10));
    public static final kd3[] B = new kd3[0];
    public static final StackTraceElement[] C = new StackTraceElement[0];
    public static final n05 D = new n05(0.0f, 0.0f, 10.0f, 10.0f);

    public static final void A(ub2 ub2Var, fq3 fq3Var, fq3 fq3Var2, s34 s34Var, uh5 uh5Var, uh5 uh5Var2) {
        boolean z2;
        fq3 fq3Var3 = fq3Var;
        Region region = (Region) fq3Var3.y;
        fq3 fq3Var4 = fq3Var2;
        Region region2 = (Region) fq3Var4.y;
        za3 za3Var = uh5Var2.c;
        za3 za3Var2 = uh5Var2.c;
        if (za3Var.J() && za3Var2.I() && !region2.isEmpty()) {
            n05 m = uh5Var2.m();
            if (m.h()) {
                yc1 f = uh5Var2.f();
                if (f == null) {
                    kz2 kz2Var = (kz2) za3Var2.c0.A;
                    m = te4.B(kz2Var).G(kz2Var, false);
                } else {
                    xz3 xz3Var = ((xz3) f).x;
                    Object g = uh5Var2.d.x.g(oh5.b);
                    if (g == null) {
                        g = null;
                    }
                    if (g != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m = z51.n(xz3Var, z2, false);
                }
            }
            g13 D2 = wk6.D(m);
            fq3Var3.p(D2);
            if (region.op(region2, Region.Op.INTERSECT)) {
                int i = uh5Var2.f;
                uh5 uh5Var3 = uh5Var;
                if (i == uh5Var3.f) {
                    i = -1;
                }
                Rect bounds = region.getBounds();
                wh5 wh5Var = new wh5(uh5Var2, new g13(bounds.left, bounds.top, bounds.right, bounds.bottom));
                s34 s34Var2 = s34Var;
                s34Var2.h(i, wh5Var);
                List j = uh5.j(4, uh5Var2);
                int size = j.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) ub2Var.invoke(j.get(size))).booleanValue()) {
                        A(ub2Var, fq3Var3, fq3Var4, s34Var2, uh5Var3, (uh5) j.get(size));
                    }
                    size--;
                    fq3Var3 = fq3Var;
                    fq3Var4 = fq3Var2;
                    s34Var2 = s34Var;
                    uh5Var3 = uh5Var;
                }
                if (M(uh5Var2)) {
                    region2.op(D2.a, D2.b, D2.c, D2.d, Region.Op.DIFFERENCE);
                    return;
                }
                return;
            }
            return;
        }
        if (uh5Var2.n()) {
            B(s34Var, uh5Var, uh5Var2);
        }
    }

    public static final void B(s34 s34Var, uh5 uh5Var, uh5 uh5Var2) {
        n05 n05Var;
        za3 za3Var;
        uh5 l = uh5Var2.l();
        if (l != null && (za3Var = l.c) != null && za3Var.J()) {
            n05Var = l.g();
        } else {
            n05Var = D;
        }
        int i = uh5Var2.f;
        if (i == uh5Var.f) {
            i = -1;
        }
        s34Var.h(i, new wh5(uh5Var2, wk6.D(n05Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(defpackage.ub2 r17, defpackage.fq3 r18, defpackage.fq3 r19, defpackage.s34 r20, defpackage.uh5 r21, defpackage.uh5 r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx7.C(ub2, fq3, fq3, s34, uh5, uh5):void");
    }

    public static String D(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z2 = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((ch6) obj).a.g.p;
            if (qy3.m(str2)) {
                return "video/mp4";
            }
            if (qy3.i(str2)) {
                z2 = true;
            } else if (qy3.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z2) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static final Object F(j44 j44Var, ts4 ts4Var, Serializable serializable) {
        j44Var.getClass();
        ts4Var.getClass();
        Object c = j44Var.c(ts4Var);
        if (c == null) {
            return serializable;
        }
        return c;
    }

    public static Object G(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d4.b(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (u4.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final x75 H(ro3 ro3Var) {
        Object w = ro3Var.w();
        if (w instanceof x75) {
            return (x75) w;
        }
        return null;
    }

    public static final float I(x75 x75Var) {
        if (x75Var != null) {
            return x75Var.a;
        }
        return 0.0f;
    }

    public static final void J(l11 l11Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = q11.a.iterator();
        while (it.hasNext()) {
            try {
                ((p11) it.next()).handleException(l11Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    n03.i(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            n03.i(th, new wf1(l11Var));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static void K(yt ytVar) {
        if (yt.i == null) {
            yt.i = new yt();
            vt vtVar = new vt("Okio Watchdog");
            vtVar.setDaemon(true);
            vtVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = ytVar.c;
        boolean z2 = ytVar.a;
        if (j != 0 && z2) {
            ytVar.g = Math.min(j, ytVar.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            ytVar.g = nanoTime + j;
        } else if (z2) {
            ytVar.g = ytVar.c();
        } else {
            p65.o();
            return;
        }
        fr0 fr0Var = yt.h;
        int i = fr0Var.y + 1;
        fr0Var.y = i;
        yt[] ytVarArr = (yt[]) fr0Var.z;
        if (i == ytVarArr.length) {
            yt[] ytVarArr2 = new yt[i * 2];
            ms.B0(0, 0, 14, ytVarArr, ytVarArr2);
            fr0Var.z = ytVarArr2;
        }
        fr0Var.m(i, ytVar);
        if (ytVar.f == 1) {
            yt.k.signal();
        }
    }

    public static final boolean L(uh5 uh5Var) {
        boolean z2;
        fa4 d = uh5Var.d();
        p44 p44Var = uh5Var.d.x;
        if (d != null) {
            z2 = d.h1();
        } else {
            z2 = false;
        }
        if (!z2 && !p44Var.c(yh5.q) && !p44Var.c(yh5.p)) {
            return false;
        }
        return true;
    }

    public static final boolean M(uh5 uh5Var) {
        if (!L(uh5Var)) {
            ph5 ph5Var = uh5Var.d;
            if (!ph5Var.z) {
                p44 p44Var = ph5Var.x;
                Object[] objArr = p44Var.b;
                Object[] objArr2 = p44Var.c;
                long[] jArr = p44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr[i4];
                                    Object obj2 = objArr2[i4];
                                    if (((ai5) obj).c) {
                                        return true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean N(yk3 yk3Var) {
        yk3Var.getClass();
        return yk3Var.e();
    }

    public static fy3 O(c12 c12Var, boolean z2, boolean z3) {
        qi2 qi2Var;
        if (!z2) {
            qi2Var = fu2.j;
        } else if (z3) {
            qi2Var = fu2.k;
        } else {
            qi2Var = null;
        }
        fy3 o = new af2((byte) 23).o(c12Var, qi2Var, 0);
        if (o == null || o.a.length == 0) {
            return null;
        }
        return o;
    }

    public static rt3 P(zi4 zi4Var) {
        zi4Var.O(1);
        int D2 = zi4Var.D();
        long j = zi4Var.b + D2;
        int i = D2 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = zi4Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = zi4Var.u();
            zi4Var.O(2);
            i2++;
        }
        zi4Var.O((int) (j - zi4Var.b));
        return new rt3((Object) jArr, (Object) jArr2, (byte) 24);
    }

    public static Object Q(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final os0 R(int i, ec2 ec2Var, kd2 kd2Var) {
        Object Q = kd2Var.Q();
        boolean z2 = true;
        if (Q == au0.a) {
            Q = new os0(i, true, ec2Var);
            kd2Var.n0(Q);
        }
        os0 os0Var = (os0) Q;
        if (!a34.i(os0Var.z, ec2Var)) {
            if (os0Var.z != null) {
                z2 = false;
            }
            os0Var.z = ec2Var;
            if (!z2 && os0Var.y) {
                zz4 zz4Var = os0Var.A;
                if (zz4Var != null) {
                    a05 a05Var = zz4Var.a;
                    if (a05Var != null) {
                        a05Var.f(zz4Var, null);
                    }
                    os0Var.A = null;
                }
                ArrayList arrayList = os0Var.B;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        zz4 zz4Var2 = (zz4) arrayList.get(i2);
                        a05 a05Var2 = zz4Var2.a;
                        if (a05Var2 != null) {
                            a05Var2.f(zz4Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return os0Var;
    }

    public static final mx4 S(kd2 kd2Var) {
        Object[] objArr = new Object[0];
        Object Q = kd2Var.Q();
        if (Q == au0.a) {
            Q = new qa4((byte) 13);
            kd2Var.n0(Q);
        }
        return (mx4) oi4.D(objArr, mx4.b, (sb2) Q, kd2Var, 384);
    }

    public static final u95 V(WatchProgress watchProgress) {
        boolean z2;
        long j = 0;
        if (watchProgress == null) {
            return new u95(0L, 0L);
        }
        long positionMs = watchProgress.getPositionMs();
        if (positionMs < 0) {
            positionMs = 0;
        }
        long durationMs = watchProgress.getDurationMs();
        if (durationMs < 0) {
            durationMs = 0;
        }
        if (durationMs > 0 && (positionMs >= ((long) (durationMs * 0.95d)) || durationMs - positionMs < 10000)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            j = positionMs;
        }
        return new u95(j, durationMs);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:88)|23|24|25|26|27|28|29|(1:31)(1:80)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:57|58|59)(7:43|44|(2:46|(1:49))|50|(1:52)(1:56)|53|54)|55)(1:60))|61|62|63)(1:79)|64|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = defpackage.v.x;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jg4 W(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx7.W(android.content.Context):jg4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r35, defpackage.yz3 r36, defpackage.ic2 r37, defpackage.ic2 r38, boolean r39, boolean r40, float r41, long r42, long r44, defpackage.xd6 r46, defpackage.th4 r47, final defpackage.sb2 r48, defpackage.kd2 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx7.a(java.lang.String, yz3, ic2, ic2, boolean, boolean, float, long, long, xd6, th4, sb2, kd2, int, int, int):void");
    }

    public static final void b(bx4 bx4Var, long j, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        kd2Var.f0(-1353562852);
        byte b = 4;
        if (kd2Var.f(bx4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i5 & 1, z2)) {
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            Object obj2 = Q;
            if (Q == obj) {
                id a = kd.a();
                a.f(1);
                kd2Var.n0(a);
                obj2 = a;
            }
            Object obj3 = (id) obj2;
            Object Q2 = kd2Var.Q();
            if (Q2 == obj) {
                Q2 = ut5.b(new nj4(bx4Var, b));
                kd2Var.n0(Q2);
            }
            Object b2 = xj.b(((Number) ((px5) Q2).getValue()).floatValue(), sw0.N(z04.z, kd2Var), null, kd2Var, 0, 28);
            int i6 = i5 & 14;
            if (i6 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q3 = kd2Var.Q();
            if (z3 || Q3 == obj) {
                Q3 = new pz3((Object) bx4Var, (byte) 10);
                kd2Var.n0(Q3);
            }
            AtomicInteger atomicInteger = rh5.a;
            yz3 i7 = ar5.i(new qm0((ub2) Q3), 16.0f);
            if (i6 != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean f = z4 | kd2Var.f(b2);
            if ((i5 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean h = f | z5 | kd2Var.h(obj3);
            Object Q4 = kd2Var.Q();
            if (h || Q4 == obj) {
                Object p70Var = new p70((Object) bx4Var, b2, j, obj3, (byte) 3);
                kd2Var.n0(p70Var);
                Q4 = p70Var;
            }
            w65.c(i7, (ub2) Q4, kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new mb(bx4Var, j, i);
        }
    }

    public static final void c(final Info info, final boolean z2, final int i, final Integer num, final WatchStatus watchStatus, final boolean z3, final boolean z4, final sb2 sb2Var, final ub2 ub2Var, yz3 yz3Var, kd2 kd2Var, final int i2, final int i3) {
        int i4;
        boolean z5;
        int i5;
        Integer num2;
        boolean z6;
        sb2 sb2Var2;
        ub2 ub2Var2;
        yz3 yz3Var2;
        int i6;
        boolean z7;
        String g;
        w44 w44Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int ordinal;
        int i13;
        int i14;
        int i15;
        int i16;
        sb2Var.getClass();
        ub2Var.getClass();
        kd2Var.f0(-1592141733);
        if (kd2Var.h(info)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i17 = i4 | i2;
        if ((i2 & 48) == 0) {
            z5 = z2;
            if (kd2Var.g(z5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 |= i16;
        } else {
            z5 = z2;
        }
        if ((i2 & 384) == 0) {
            i5 = i;
            if (kd2Var.d(i5)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i17 |= i15;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            num2 = num;
            if (kd2Var.f(num2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i17 |= i14;
        } else {
            num2 = num;
        }
        if ((i2 & 24576) == 0) {
            if (watchStatus == null) {
                ordinal = -1;
            } else {
                ordinal = watchStatus.ordinal();
            }
            if (kd2Var.d(ordinal)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i17 |= i13;
        }
        if ((196608 & i2) == 0) {
            z6 = z3;
            if (kd2Var.g(z6)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i17 |= i12;
        } else {
            z6 = z3;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var.g(z4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i17 |= i11;
        }
        if ((12582912 & i2) == 0) {
            sb2Var2 = sb2Var;
            if (kd2Var.h(sb2Var2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i17 |= i10;
        } else {
            sb2Var2 = sb2Var;
        }
        if ((100663296 & i2) == 0) {
            ub2Var2 = ub2Var;
            if (kd2Var.h(ub2Var2)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i17 |= i9;
        } else {
            ub2Var2 = ub2Var;
        }
        int i18 = i3 & 512;
        if (i18 != 0) {
            i17 |= 805306368;
            yz3Var2 = yz3Var;
        } else {
            yz3Var2 = yz3Var;
            if ((i2 & 805306368) == 0) {
                if (kd2Var.f(yz3Var2)) {
                    i6 = 536870912;
                } else {
                    i6 = 268435456;
                }
                i17 |= i6;
            }
        }
        int i19 = i17 & 306783379;
        int i20 = i17;
        boolean z8 = false;
        if (i19 != 306783378) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (kd2Var.V(i20 & 1, z7)) {
            if (i18 != 0) {
                yz3Var2 = vz3.x;
            }
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = xt5.g(Boolean.FALSE);
                kd2Var.n0(Q);
            }
            w44 w44Var2 = (w44) Q;
            final String b = e02.b(info.getTitle());
            Integer averageScore = info.getAverageScore();
            if (averageScore == null) {
                kd2Var.e0(2124919740);
                kd2Var.q(false);
                g = null;
            } else {
                kd2Var.e0(2124919741);
                g = lz5.g(R.string.score, new Object[]{Integer.valueOf(averageScore.intValue())}, kd2Var);
                z8 = false;
                kd2Var.q(false);
            }
            if (g == null) {
                w44Var = w44Var2;
                g = h11.i(kd2Var, -1039831012, R.string.no_score, kd2Var, z8);
            } else {
                w44Var = w44Var2;
                kd2Var.e0(-1039833399);
                kd2Var.q(z8);
            }
            final List I = te4.I(g, "•", lz5.g(R.string.episodes_num, new Object[]{Integer.valueOf(i5)}, kd2Var));
            if (watchStatus == null) {
                i7 = -1;
            } else {
                i7 = se1.a[watchStatus.ordinal()];
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            i8 = R.drawable.play_outlined;
                        } else {
                            i8 = R.drawable.pause_outlined;
                        }
                    } else {
                        i8 = R.drawable.close_circle;
                    }
                } else {
                    i8 = R.drawable.check_circle;
                }
            } else {
                i8 = R.drawable.bookmark;
            }
            final int i21 = i8;
            final w44 w44Var3 = w44Var;
            final boolean z9 = z5;
            final int i22 = i5;
            final Integer num3 = num2;
            final boolean z10 = z6;
            final sb2 sb2Var3 = sb2Var2;
            final ub2 ub2Var3 = ub2Var2;
            x97.b(ar5.c(yz3Var2, 1.0f), null, R(536026929, new jc2() { // from class: qe1
                @Override // defpackage.jc2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z11;
                    boolean z12;
                    float f;
                    String str;
                    t53 t53Var;
                    ys0 ys0Var;
                    t53 t53Var2;
                    st0 st0Var;
                    ys0 ys0Var2;
                    st0 st0Var2;
                    kd2 kd2Var2;
                    boolean z13;
                    int i23;
                    String str2;
                    int i24;
                    q18 q18Var;
                    yz3 a;
                    boolean z14;
                    String i25;
                    long j;
                    long j2;
                    os0 os0Var;
                    int i26;
                    boolean z15;
                    String obj4;
                    int i27;
                    p90 p90Var = (p90) obj;
                    kd2 kd2Var3 = (kd2) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    p90Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (kd2Var3.f(p90Var)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        intValue |= i27;
                    }
                    if ((intValue & 19) != 18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (kd2Var3.V(intValue & 1, z11)) {
                        if (vm1.b(p90Var.c(), 600.0f) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        vz3 vz3Var = vz3.x;
                        yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 15.0f, 0.0f, 15.0f, 15.0f, 2);
                        vr vrVar = new vr(14.0f, true, new ze0((byte) 6));
                        w50 w50Var = pk2.K;
                        xp0 a2 = vp0.a(vrVar, w50Var, kd2Var3, 6);
                        int hashCode = Long.hashCode(kd2Var3.T);
                        al4 l = kd2Var3.l();
                        yz3 E = o80.E(kd2Var3, V);
                        tt0.d.getClass();
                        kd2Var3.h0();
                        boolean z16 = kd2Var3.S;
                        t53 t53Var3 = za3.p0;
                        if (z16) {
                            kd2Var3.k(t53Var3);
                        } else {
                            kd2Var3.q0();
                        }
                        st0 st0Var3 = p7.F;
                        ss5.i(st0Var3, kd2Var3, a2);
                        ys0 ys0Var3 = p7.E;
                        ss5.i(ys0Var3, kd2Var3, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        st0 st0Var4 = p7.G;
                        ss5.i(st0Var4, kd2Var3, valueOf);
                        ss5.h(kd2Var3);
                        ys0 ys0Var4 = p7.D;
                        ss5.i(ys0Var4, kd2Var3, E);
                        if (z12) {
                            f = 150.0f;
                        } else {
                            f = 110.0f;
                        }
                        Info info2 = Info.this;
                        iv.c(info2, f, kd2Var3, 0);
                        yz3 c = ar5.c(vz3Var, 1.0f);
                        x50 x50Var = pk2.I;
                        sr srVar = x97.y;
                        z75 a3 = y75.a(srVar, x50Var, kd2Var3, 48);
                        int hashCode2 = Long.hashCode(kd2Var3.T);
                        al4 l2 = kd2Var3.l();
                        yz3 E2 = o80.E(kd2Var3, c);
                        kd2Var3.h0();
                        if (kd2Var3.S) {
                            kd2Var3.k(t53Var3);
                        } else {
                            kd2Var3.q0();
                        }
                        ss5.i(st0Var3, kd2Var3, a3);
                        ss5.i(ys0Var3, kd2Var3, l2);
                        h11.q(hashCode2, kd2Var3, st0Var4, kd2Var3);
                        ss5.i(ys0Var4, kd2Var3, E2);
                        w65.a(info2, kd2Var3, 0);
                        ov5.a(kd2Var3, ar5.l(vz3Var, 14.0f));
                        b85 b85Var = b85.a;
                        yz3 a4 = b85Var.a(1.0f, true);
                        xp0 a5 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), w50Var, kd2Var3, 6);
                        int hashCode3 = Long.hashCode(kd2Var3.T);
                        al4 l3 = kd2Var3.l();
                        yz3 E3 = o80.E(kd2Var3, a4);
                        kd2Var3.h0();
                        if (kd2Var3.S) {
                            kd2Var3.k(t53Var3);
                        } else {
                            kd2Var3.q0();
                        }
                        ss5.i(st0Var3, kd2Var3, a5);
                        ss5.i(ys0Var3, kd2Var3, l3);
                        h11.q(hashCode3, kd2Var3, st0Var4, kd2Var3);
                        ss5.i(ys0Var4, kd2Var3, E3);
                        yz3 c2 = ar5.c(vz3Var, 1.0f);
                        z75 a6 = y75.a(srVar, x50Var, kd2Var3, 48);
                        int hashCode4 = Long.hashCode(kd2Var3.T);
                        al4 l4 = kd2Var3.l();
                        yz3 E4 = o80.E(kd2Var3, c2);
                        kd2Var3.h0();
                        if (kd2Var3.S) {
                            kd2Var3.k(t53Var3);
                        } else {
                            kd2Var3.q0();
                        }
                        ss5.i(st0Var3, kd2Var3, a6);
                        ss5.i(ys0Var3, kd2Var3, l4);
                        h11.q(hashCode4, kd2Var3, st0Var4, kd2Var3);
                        ss5.i(ys0Var4, kd2Var3, E4);
                        xd6 xd6Var = n03.y(kd2Var3).e;
                        s92 s92Var = s92.C;
                        yc6.b(b, b85Var.a(1.0f, false), n03.r(kd2Var3).o, 0L, s92Var, null, 0L, null, 0L, 2, false, 2, 0, xd6Var, kd2Var3, 1572864, 24960, 110520);
                        ov5.a(kd2Var3, ar5.l(vz3Var, 6.0f));
                        yt2.a(w65.H(R.drawable.tick, kd2Var3, 0), lz5.f(R.string.tick, kd2Var3), ar5.i(vz3Var, 20.0f), n03.r(kd2Var3).o, kd2Var3, 392, 0);
                        kd2Var3.q(true);
                        Studio studio = (Studio) yo0.m0(info2.getStudios());
                        os0 os0Var2 = null;
                        if (studio != null) {
                            str = studio.getName();
                        } else {
                            str = null;
                        }
                        String a7 = e02.a(str, false);
                        if (a7 == null) {
                            a7 = h11.i(kd2Var3, 2091748706, R.string.app_name, kd2Var3, false);
                        } else {
                            kd2Var3.e0(2091746319);
                            kd2Var3.q(false);
                        }
                        yc6.b(a7, null, n03.r(kd2Var3).o, 0L, s92Var, null, 0L, null, 0L, 2, false, 1, 0, n03.y(kd2Var3).l, kd2Var3, 1572864, 24960, 110522);
                        if (!z4) {
                            kd2Var3.e0(420129581);
                            q23.b(null, new vr(4.0f, true, new ze0((byte) 6)), new vr(2.0f, true, new ze0((byte) 6)), null, 0, 0, nx7.R(-545047167, new ke1(I, (byte) 1), kd2Var3), kd2Var3, 1573296, 57);
                            kd2Var2 = kd2Var3;
                            i23 = 0;
                            kd2Var2.q(false);
                            st0Var = st0Var3;
                            ys0Var2 = ys0Var3;
                            st0Var2 = st0Var4;
                            ys0Var = ys0Var4;
                            t53Var2 = t53Var3;
                            z13 = true;
                        } else {
                            kd2Var3.e0(420875131);
                            yz3 h = bx7.h(ar5.l(vz3Var, 180.0f), n03.r(kd2Var3).p, tm5.b);
                            vo3 c3 = b90.c(pk2.y, false);
                            int hashCode5 = Long.hashCode(kd2Var3.T);
                            al4 l5 = kd2Var3.l();
                            yz3 E5 = o80.E(kd2Var3, h);
                            kd2Var3.h0();
                            if (kd2Var3.S) {
                                t53Var = t53Var3;
                                kd2Var3.k(t53Var);
                            } else {
                                t53Var = t53Var3;
                                kd2Var3.q0();
                            }
                            ss5.i(st0Var3, kd2Var3, c3);
                            ss5.i(ys0Var3, kd2Var3, l5);
                            h11.q(hashCode5, kd2Var3, st0Var4, kd2Var3);
                            ss5.i(ys0Var4, kd2Var3, E5);
                            ys0Var = ys0Var4;
                            t53Var2 = t53Var;
                            st0Var = st0Var3;
                            ys0Var2 = ys0Var3;
                            st0Var2 = st0Var4;
                            yc6.b(".", null, n03.r(kd2Var3).p, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var3).l, kd2Var3, 6, 0, 131066);
                            kd2Var2 = kd2Var3;
                            z13 = true;
                            kd2Var2.q(true);
                            i23 = 0;
                            kd2Var2.q(false);
                        }
                        kd2Var2.q(z13);
                        kd2Var2.q(z13);
                        String description = info2.getDescription();
                        if (description != null && (obj4 = uz5.w0(b06.G(Html.fromHtml(description, i23).toString(), "\n\n\n", "\n\n")).toString()) != null && !uz5.V(obj4)) {
                            str2 = obj4;
                        } else {
                            str2 = null;
                        }
                        q18 q18Var2 = au0.a;
                        if (str2 == null) {
                            kd2Var2.e0(784090389);
                            kd2Var2.q(false);
                            q18Var = q18Var2;
                        } else {
                            kd2Var2.e0(784090390);
                            xd6 xd6Var2 = n03.y(kd2Var2).l;
                            long b2 = ep0.b(0.78f, n03.r(kd2Var2).o);
                            w44 w44Var4 = w44Var3;
                            if (((Boolean) w44Var4.getValue()).booleanValue()) {
                                i24 = Integer.MAX_VALUE;
                            } else {
                                i24 = 2;
                            }
                            yz3 g2 = oi4.g(vz3Var);
                            Object Q2 = kd2Var2.Q();
                            if (Q2 == q18Var2) {
                                Q2 = new cf(w44Var4, (byte) 11);
                                kd2Var2.n0(Q2);
                            }
                            kd2 kd2Var4 = kd2Var2;
                            q18Var = q18Var2;
                            yc6.b(str2, kb0.A(g2, false, null, null, false, (sb2) Q2, kd2Var4, 1572864, 31), b2, 0L, null, null, 0L, null, 0L, 2, false, i24, 0, xd6Var2, kd2Var4, 0, 384, 110584);
                            kd2Var2 = kd2Var4;
                            kd2Var2.q(false);
                        }
                        yz3 c4 = ar5.c(vz3Var, 1.0f);
                        z75 a8 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.H, kd2Var2, 6);
                        int hashCode6 = Long.hashCode(kd2Var2.T);
                        al4 l6 = kd2Var2.l();
                        yz3 E6 = o80.E(kd2Var2, c4);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var2);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a8);
                        ss5.i(ys0Var2, kd2Var2, l6);
                        h11.q(hashCode6, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var, kd2Var2, E6);
                        if (z9) {
                            a = ar5.l(vz3Var, 180.0f);
                        } else {
                            a = b85Var.a(1.0f, true);
                        }
                        yz3 yz3Var3 = a;
                        boolean z17 = z10;
                        if (z17) {
                            kd2Var2.e0(64698060);
                            WatchStatus watchStatus2 = watchStatus;
                            if (watchStatus2 != null) {
                                i25 = watchStatus2.getLabel();
                            } else {
                                i25 = null;
                            }
                            if (i25 == null) {
                                z14 = false;
                                i25 = h11.i(kd2Var2, -136459616, R.string.added, kd2Var2, false);
                            } else {
                                z14 = false;
                                kd2Var2.e0(-136460298);
                                kd2Var2.q(false);
                            }
                            kd2Var2.q(z14);
                        } else {
                            z14 = false;
                            i25 = h11.i(kd2Var2, -136457818, R.string.add_to_list, kd2Var2, false);
                        }
                        if (z17) {
                            kd2Var2.e0(-136454295);
                            j = n03.r(kd2Var2).p;
                            kd2Var2.q(z14);
                        } else {
                            kd2Var2.e0(-136452402);
                            j = n03.r(kd2Var2).o;
                            kd2Var2.q(z14);
                        }
                        long j3 = j;
                        if (z17) {
                            kd2Var2.e0(-136449490);
                            j2 = n03.r(kd2Var2).o;
                            kd2Var2.q(z14);
                        } else {
                            kd2Var2.e0(-136447447);
                            j2 = n03.r(kd2Var2).p;
                            kd2Var2.q(z14);
                        }
                        if (z17) {
                            kd2Var2.e0(65168051);
                            os0Var = nx7.R(511615329, new r(i21, (byte) 2), kd2Var2);
                            kd2Var2.q(z14);
                        } else {
                            kd2Var2.e0(65495628);
                            kd2Var2.q(z14);
                            os0Var = null;
                        }
                        if (z17) {
                            os0Var2 = tl7.d;
                        }
                        vh4 vh4Var = new vh4(10.0f, 0.0f, 10.0f, 0.0f);
                        int i28 = i22;
                        boolean z18 = z14;
                        if (i28 != 0) {
                            z14 = true;
                        }
                        kd2 kd2Var5 = kd2Var2;
                        nx7.a(i25, yz3Var3, os0Var, os0Var2, z14, false, 40.0f, j3, j2, null, vh4Var, sb2Var3, kd2Var5, 12582912, 0, 1120);
                        Integer num4 = num3;
                        if (num4 == null) {
                            i26 = R.string.watch;
                        } else {
                            i26 = R.string.continue_watch;
                        }
                        String f2 = lz5.f(i26, kd2Var5);
                        long j4 = n03.r(kd2Var5).p;
                        long j5 = n03.r(kd2Var5).o;
                        vh4 vh4Var2 = new vh4(10.0f, 0.0f, 10.0f, 0.0f);
                        if (i28 != 0) {
                            z15 = true;
                        } else {
                            z15 = z18;
                        }
                        os0 os0Var3 = tl7.e;
                        ub2 ub2Var4 = ub2Var3;
                        boolean f3 = kd2Var5.f(ub2Var4) | kd2Var5.f(num4);
                        Object Q3 = kd2Var5.Q();
                        if (f3 || Q3 == q18Var) {
                            Q3 = new va1(ub2Var4, num4, (byte) 2);
                            kd2Var5.n0(Q3);
                        }
                        nx7.a(f2, yz3Var3, os0Var3, null, z15, false, 40.0f, j4, j5, null, vh4Var2, (sb2) Q3, kd2Var5, 12583296, 0, 1128);
                        kd2Var5.q(true);
                        kd2Var5.q(true);
                    } else {
                        kd2Var3.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, 3072, 6);
        } else {
            kd2Var.Y();
        }
        final yz3 yz3Var3 = yz3Var2;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: re1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nx7.c(Info.this, z2, i, num, watchStatus, z3, z4, sb2Var, ub2Var, yz3Var3, (kd2) obj, kb0.N(i2 | 1), i3);
                    return pn6.a;
                }
            };
        }
    }

    public static final void d(final fe2 fe2Var, int i, boolean z2, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        kd2Var.f0(1331468021);
        if (kd2Var.d(fe2Var.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (kd2Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (kd2Var.g(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (kd2Var.f(yz3Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i10 & 1, z3)) {
            final int C2 = db.C(i, 0, 100);
            final float f = C2 / 100.0f;
            final xd6 a = xd6.a(((nl6) kd2Var.j(pl6.a)).o, 0L, s92.D, null, 0L, null, 0L, null, 16777147);
            boolean d = kd2Var.d(100);
            Object Q = kd2Var.Q();
            if (d || Q == au0.a) {
                Q = b06.F(String.valueOf(100).length(), "0");
                kd2Var.n0(Q);
            }
            final String str = (String) Q;
            int i11 = i10 >> 6;
            te4.c(z2, yz3Var, dv1.b(z51.V(120, 6, null), 2).a(new iv1(new wi6(null, null, null, new ya5(0.94f, xh6.b, z51.V(160, 6, null)), (LinkedHashMap) null, 119))), dv1.c(z51.V(180, 6, null), 2).a(dv1.d(z51.V(180, 6, null), 0.96f, 4)), null, R(1015861021, new jc2() { // from class: ce2
                @Override // defpackage.jc2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    int i12;
                    kd2 kd2Var2 = (kd2) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((el) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z4)) {
                        vz3 vz3Var = vz3.x;
                        yz3 n = ar5.n(vz3Var, 200.0f, 0.0f, 2);
                        long b = ep0.b(0.6f, ep0.b);
                        o75 o75Var = tm5.b;
                        yz3 S = n77.S(bx7.h(n, b, o75Var), 14.0f, 8.0f);
                        z75 a2 = y75.a(new vr(10.0f, true, new ze0((byte) 4)), pk2.I, kd2Var2, 54);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        yz3 E = o80.E(kd2Var2, S);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z5 = kd2Var2.S;
                        t53 t53Var = za3.p0;
                        if (z5) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        st0 st0Var = p7.F;
                        ss5.i(st0Var, kd2Var2, a2);
                        ys0 ys0Var = p7.E;
                        ss5.i(ys0Var, kd2Var2, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        st0 st0Var2 = p7.G;
                        ss5.i(st0Var2, kd2Var2, valueOf);
                        ss5.h(kd2Var2);
                        ys0 ys0Var2 = p7.D;
                        ss5.i(ys0Var2, kd2Var2, E);
                        int ordinal = fe2.this.ordinal();
                        int i13 = C2;
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i12 = R.drawable.brightness;
                            } else {
                                ze0.l();
                                return null;
                            }
                        } else if (i13 == 0) {
                            i12 = R.drawable.volume_off;
                        } else {
                            i12 = R.drawable.volume;
                        }
                        xh4 H = w65.H(i12, kd2Var2, 0);
                        long j = ep0.e;
                        yt2.a(H, null, ar5.i(vz3Var, 18.0f), j, kd2Var2, 3512, 0);
                        yz3 k = n03.k(ar5.e(ar5.l(vz3Var, 100.0f), 4.0f), o75Var);
                        long b2 = ep0.b(0.3f, j);
                        ao2 ao2Var = io3.h;
                        yz3 h = bx7.h(k, b2, ao2Var);
                        vo3 c = b90.c(pk2.y, false);
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, h);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, c);
                        ss5.i(ys0Var, kd2Var2, l2);
                        h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E2);
                        b90.a(bx7.h(n03.k(ar5.c(ar5.b, f), o75Var), j, ao2Var), kd2Var2, 0);
                        kd2Var2.q(true);
                        vo3 c2 = b90.c(pk2.C, false);
                        int hashCode3 = Long.hashCode(kd2Var2.T);
                        al4 l3 = kd2Var2.l();
                        yz3 E3 = o80.E(kd2Var2, vz3Var);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, c2);
                        ss5.i(ys0Var, kd2Var2, l3);
                        h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E3);
                        long j2 = ep0.h;
                        Object Q2 = kd2Var2.Q();
                        if (Q2 == au0.a) {
                            Q2 = new t72((byte) 2);
                            kd2Var2.n0(Q2);
                        }
                        AtomicInteger atomicInteger = rh5.a;
                        qm0 qm0Var = new qm0((ub2) Q2);
                        String str2 = str;
                        xd6 xd6Var = a;
                        yc6.b(str2, qm0Var, j2, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, xd6Var, kd2Var2, 384, 24576, 114680);
                        yc6.b(String.valueOf(i13), null, j, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, xd6Var, kd2Var2, 384, 24576, 114682);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, (i11 & 14) | 196608 | (i11 & 112), 16);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new de2(fe2Var, i, z2, yz3Var, i2);
        }
    }

    public static final void e(boolean z2, sb2 sb2Var, yz3 yz3Var, mx4 mx4Var, e7 e7Var, jc2 jc2Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        os0 os0Var2;
        e7 e7Var2;
        kd2Var.f0(-532332839);
        if (kd2Var.g(z2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.f(mx4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4 | 24576;
        if ((599187 & i7) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i7 & 1, z3)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                e7Var2 = e7Var;
            } else {
                e7Var2 = pk2.y;
            }
            kd2Var.r();
            yz3 w = yz3Var.w(new fx4(z2, sb2Var, mx4Var, ex4.c));
            vo3 c = b90.c(e7Var2, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, w);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            n90 n90Var = n90.a;
            os0Var2 = os0Var;
            os0Var2.invoke(n90Var, kd2Var, 54);
            jc2Var.invoke(n90Var, kd2Var, 54);
            kd2Var.q(true);
        } else {
            os0Var2 = os0Var;
            kd2Var.Y();
            e7Var2 = e7Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vx6(z2, sb2Var, yz3Var, mx4Var, e7Var2, jc2Var, os0Var2, i);
        }
    }

    public static final void f(String str, final String str2, final boolean z2, final sb2 sb2Var, final sb2 sb2Var2, final yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        String str3;
        int i8;
        kd2 kd2Var2 = kd2Var;
        str.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        kd2Var2.f0(-355013795);
        if (kd2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (kd2Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (kd2Var2.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (kd2Var2.h(sb2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (kd2Var2.h(sb2Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (kd2Var2.f(yz3Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((i14 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var2.V(i14 & 1, z3)) {
            int i15 = i14 << 9;
            yz3 A2 = kb0.A(ar5.c(yz3Var, 1.0f), false, null, null, false, sb2Var, kd2Var2, i15 & 3670016, 31);
            tq1 tq1Var = op0.a;
            long j = ((mp0) kd2Var2.j(tq1Var)).n;
            ao2 ao2Var = io3.h;
            yz3 V = n77.V(bx7.h(A2, j, ao2Var), 12.0f, 4.0f, 0.0f, 4.0f, 4);
            z75 a = y75.a(x97.y, pk2.I, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, a);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            if (z2) {
                i8 = R.drawable.trending_outlined;
            } else {
                i8 = R.drawable.search;
            }
            yt2.a(w65.H(i8, kd2Var2, 0), null, null, ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 56, 4);
            vz3 vz3Var = vz3.x;
            ov5.a(kd2Var2, ar5.i(vz3Var, 18.0f));
            yc6.b(str, new ob3(1.0f, true), ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(((nl6) kd2Var2.j(pl6.a)).j, 0L, null, null, 0L, null, hz5.g(18), null, 16646143), kd2Var, i14 & 14, 24960, 110584);
            str3 = str;
            ov5.a(kd2Var, ar5.i(vz3Var, 18.0f));
            if (str2 != null && !uz5.V(str2)) {
                kd2Var.e0(2142116678);
                tl7.a(str2, null, bx7.h(n03.k(ar5.j(vz3Var, 65.0f, 35.0f), ((cn5) kd2Var.j(dn5.a)).b), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), pk2.O, kd2Var, ((i14 >> 3) & 14) | 1572912);
                kd2Var.q(false);
            } else {
                kd2Var.e0(2142490817);
                kd2Var.q(false);
            }
            zz.a(ar5.i(n77.V(vz3Var, 5.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), false, true, null, null, 0L, 0L, sb2Var2, null, R(-2030017990, new q10(str3, (byte) 4), kd2Var), kd2Var, (i15 & 29360128) | 805306758, 378);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
        } else {
            str3 = str;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final String str4 = str3;
            u.d = new ic2(str4, str2, z2, sb2Var, sb2Var2, yz3Var, i) { // from class: pe5
                public final /* synthetic */ sb2 A;
                public final /* synthetic */ sb2 B;
                public final /* synthetic */ yz3 C;
                public final /* synthetic */ String x;
                public final /* synthetic */ String y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    nx7.f(this.x, this.y, this.z, this.A, this.B, this.C, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void g(int i, int i2, int i3, sb2 sb2Var, kd2 kd2Var, yz3 yz3Var, String str) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        yz3 yz3Var2;
        yz3 yz3Var3;
        int i7;
        int i8;
        int i9;
        str.getClass();
        sb2Var.getClass();
        kd2Var.f0(1489183546);
        if ((i2 & 6) == 0) {
            if (kd2Var.d(i)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(str)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i6 = i4 | 3072;
        } else {
            if (kd2Var.f(yz3Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i6 = i4 | i5;
        }
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i6 & 1, z2)) {
            if (i10 != 0) {
                yz3Var3 = vz3.x;
            } else {
                yz3Var3 = yz3Var;
            }
            yz3 yz3Var4 = yz3Var3;
            l36.a(yz3Var4, ((cn5) kd2Var.j(dn5.a)).e, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, R(-1912466433, new df(str, sb2Var, xj.b(i / 100.0f, z51.O(1.0f, 200.0f, null, 4), "downloadProgress", kd2Var, 3120, 20), (byte) 14), kd2Var), kd2Var, ((i6 >> 9) & 14) | 12582912, 120);
            yz3Var2 = yz3Var4;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new zo6(i, str, sb2Var, yz3Var2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(int r12, int r13, int r14, defpackage.sb2 r15, defpackage.kd2 r16, defpackage.yz3 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx7.h(int, int, int, sb2, kd2, yz3, java.lang.String):void");
    }

    public static final void i(final String str, final boolean z2, final sb2 sb2Var, yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z3;
        final yz3 yz3Var2;
        int i3;
        int i4;
        int i5;
        sb2Var.getClass();
        kd2Var.f0(1761805835);
        if ((i & 6) == 0) {
            if (kd2Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.g(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2 | 3072;
        byte b = 0;
        if ((i6 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i6 & 1, z3)) {
            vz3 vz3Var = vz3.x;
            l36.a(ar5.n(vz3Var, 0.0f, 400.0f, 1), ((cn5) kd2Var.j(dn5.a)).e, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, R(-610128410, new ap6(str, z2, sb2Var, b), kd2Var), kd2Var, 12582912, 120);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: bp6
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nx7.i(str, z2, sb2Var, yz3Var2, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void j(String str, boolean z2, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        sb2Var.getClass();
        sb2Var2.getClass();
        kd2Var.f0(667886145);
        if (kd2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.h(sb2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z5 = false;
        byte b = 1;
        if ((i9 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i9 & 1, z3)) {
            yz3 h = bx7.h(ar5.c, ep0.b(0.6f, ep0.b), io3.h);
            vo3 c = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            if ((i9 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i9 & 7168) == 2048) {
                z5 = true;
            }
            boolean z6 = z4 | z5;
            Object Q = kd2Var.Q();
            if (z6 || Q == au0.a) {
                Q = new mh(z2, sb2Var2, (byte) 6);
                kd2Var.n0(Q);
            }
            boolean z7 = !z2;
            te4.h((sb2) Q, new eg1(4, z7, z7), R(1460175966, new ap6(str, z2, sb2Var, b), kd2Var), kd2Var, 384);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new n10(str, z2, sb2Var, sb2Var2, i);
        }
    }

    public static final void k(AppUpdateCheck appUpdateCheck, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        List<String> D0;
        kd2Var.f0(-581898167);
        if (kd2Var.h(appUpdateCheck)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            Object[] objArr = new Object[0];
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new jk5((byte) 23);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) oi4.B(objArr, (sb2) Q, kd2Var);
            List<String> releaseNotes = appUpdateCheck.getReleaseNotes();
            if (((Boolean) w44Var.getValue()).booleanValue()) {
                D0 = releaseNotes;
            } else {
                D0 = yo0.D0(releaseNotes, 2);
            }
            l36.a(ar5.c(vz3.x, 1.0f), ((cn5) kd2Var.j(dn5.a)).d, ep0.b(0.7f, ((mp0) kd2Var.j(op0.a)).r), 0L, 0.0f, 0.0f, null, R(-272142748, new fj((Object) D0, (Object) releaseNotes, (Object) w44Var, (Object) appUpdateCheck, (byte) 12), kd2Var), kd2Var, 12582918, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cu5(appUpdateCheck, i, (byte) 9);
        }
    }

    public static final void l(final sb2 sb2Var, final yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z2;
        int i3;
        sb2Var.getClass();
        kd2Var.f0(-1544497995);
        if ((i & 6) == 0) {
            if (kd2Var.h(sb2Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i4 & 1, z2)) {
            o75 o75Var = ((cn5) kd2Var.j(dn5.a)).e;
            long j = ((mp0) kd2Var.j(op0.a)).p;
            os0 R = R(1517027920, new je5(sb2Var, (byte) 3), kd2Var);
            vz3 vz3Var = vz3.x;
            l36.a(vz3Var, o75Var, j, 0L, 0.0f, 0.0f, null, R, kd2Var, 12582918, 120);
            yz3Var = vz3Var;
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: cp6
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i | 1);
                    nx7.l(sb2.this, yz3Var, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void m(sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        sb2Var.getClass();
        kd2Var.f0(1367331351);
        if (kd2Var.h(sb2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        byte b = 1;
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            yz3 h = bx7.h(ar5.c, ep0.b(0.6f, ep0.b), io3.h);
            vo3 c = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new jk5((byte) 24);
                kd2Var.n0(Q);
            }
            te4.h((sb2) Q, new eg1(4, false, false), R(1460118708, new je5(sb2Var, b), kd2Var), kd2Var, 438);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je5(i, sb2Var);
        }
    }

    public static final void n(do5 do5Var, AppUpdateCheck appUpdateCheck, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        do5Var.getClass();
        appUpdateCheck.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        kd2Var.f0(-649161073);
        if (kd2Var.f(do5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var.h(appUpdateCheck)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.h(sb2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i9 & 1, z2)) {
            boolean forceUpdate = appUpdateCheck.getForceUpdate();
            sz3 sz3Var = new sz3(false, false);
            boolean z4 = !forceUpdate;
            long j = ((mp0) kd2Var.j(op0.a)).p;
            long b = ep0.b(0.6f, ep0.b);
            tq1 tq1Var = dn5.a;
            o75 o75Var = new o75(((cn5) kd2Var.j(tq1Var)).e.a, ((cn5) kd2Var.j(tq1Var)).e.b, new wm1(0.0f), new wm1(0.0f));
            yz3 X = z51.X(vz3.x, z51.p);
            boolean g = kd2Var.g(forceUpdate);
            if ((i9 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = g | z3;
            Object Q = kd2Var.Q();
            if (z5 || Q == au0.a) {
                Q = new mh(forceUpdate, sb2Var2, (byte) 5);
                kd2Var.n0(Q);
            }
            rz3.a((sb2) Q, X, do5Var, 0.0f, z4, o75Var, j, 0L, b, io3.b, null, sz3Var, R(-1048462351, new ao((Object) appUpdateCheck, (Object) sb2Var, (Object) sb2Var2, (byte) 11), kd2Var), kd2Var, ((i9 << 6) & 896) | 805306368, 2440);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new fj(do5Var, appUpdateCheck, sb2Var, sb2Var2, i, (byte) 11);
        }
    }

    public static final void o(final AppUpdateCheck appUpdateCheck, final sb2 sb2Var, final sb2 sb2Var2, yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z2;
        final yz3 yz3Var2;
        int i3;
        int i4;
        appUpdateCheck.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        kd2Var.f0(-462752147);
        if (kd2Var.h(appUpdateCheck)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if ((i & 48) == 0) {
            if (kd2Var.h(sb2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i5 |= i3;
        }
        int i6 = i5 | 3072;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i6 & 1, z2)) {
            yc5 d0 = n77.d0(kd2Var);
            boolean forceUpdate = appUpdateCheck.getForceUpdate();
            long j = ((mp0) kd2Var.j(op0.a)).p;
            os0 R = R(-291591566, new s16(d0, forceUpdate, appUpdateCheck, sb2Var, sb2Var2), kd2Var);
            vz3 vz3Var = vz3.x;
            l36.a(vz3Var, null, j, 0L, 0.0f, 0.0f, null, R, kd2Var, 12582918, 122);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: dp6
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nx7.o(AppUpdateCheck.this, sb2Var, sb2Var2, yz3Var2, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static yt p() {
        fr0 fr0Var = yt.h;
        yt ytVar = ((yt[]) fr0Var.z)[1];
        if (ytVar == null) {
            long nanoTime = System.nanoTime();
            yt.k.await(yt.l, TimeUnit.MILLISECONDS);
            if (((yt[]) fr0Var.z)[1] != null || System.nanoTime() - nanoTime < yt.m) {
                return null;
            }
            return yt.i;
        }
        long nanoTime2 = ytVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            yt.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        fr0Var.p(ytVar);
        ytVar.e = (byte) 2;
        return ytVar;
    }

    public static final int q(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final r34 r(rd3 rd3Var, yd3 yd3Var, v90 v90Var) {
        boolean z2;
        int i;
        n2 n2Var = n03.v(yd3Var.x).c;
        z44 z44Var = v90Var.a;
        int i2 = 1;
        if (z44Var.z != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && n2Var.isEmpty()) {
            return y03.a;
        }
        r34 r34Var = new r34();
        if (v90Var.a.z != 0) {
            int i3 = z44Var.z;
            if (i3 != 0) {
                Object[] objArr = z44Var.x;
                int i4 = ((cd3) objArr[0]).a;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = ((cd3) objArr[i5]).a;
                    if (i6 < i4) {
                        i4 = i6;
                    }
                }
                if (i4 < 0) {
                    hz2.a("negative minIndex");
                }
                int i7 = z44Var.z;
                if (i7 != 0) {
                    Object[] objArr2 = z44Var.x;
                    int i8 = ((cd3) objArr2[0]).b;
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = ((cd3) objArr2[i9]).b;
                        if (i10 > i8) {
                            i8 = i10;
                        }
                    }
                    i = Math.min(i8, rd3Var.a() - 1);
                    i2 = i4;
                } else {
                    p65.h("MutableVector is empty.");
                    return null;
                }
            } else {
                p65.h("MutableVector is empty.");
                return null;
            }
        } else {
            i = 0;
        }
        int b = n2Var.b();
        for (int i11 = 0; i11 < b; i11++) {
            xd3 xd3Var = (xd3) n2Var.get(i11);
            int B2 = zz.B(xd3Var.c, rd3Var, xd3Var.a);
            if ((i2 > B2 || B2 > i) && B2 >= 0 && B2 < rd3Var.a()) {
                r34Var.a(B2);
            }
        }
        if (i2 <= i) {
            while (true) {
                r34Var.a(i2);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i12 = r34Var.b;
        if (i12 == 0) {
            return r34Var;
        }
        int[] iArr = r34Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i12);
        return r34Var;
    }

    public static final void s(int i, int i2) {
        String i3;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            i3 = qx1.l("Both size ", i, " and step ", i2, " must be greater than zero.");
        } else {
            i3 = qx1.i(i, "size ", " must be greater than zero.");
        }
        ze0.e(i3);
    }

    public static w44 u() {
        return new ti4(pn6.a, h95.H);
    }

    public static final void v(bp1 bp1Var, id idVar, n05 n05Var, long j, float f, ps psVar) {
        idVar.e();
        Path path = idVar.a;
        path.moveTo(0.0f, 0.0f);
        float g0 = bp1Var.g0(10.0f);
        float f2 = psVar.b;
        path.lineTo((g0 * f2) / 2.0f, bp1Var.g0(5.0f) * f2);
        path.lineTo(bp1Var.g0(10.0f) * f2, 0.0f);
        float intBitsToFloat = (Float.intBitsToFloat((int) (n05Var.d() >> 32)) + (Math.min(n05Var.c - n05Var.a, n05Var.d - n05Var.b) / 2.0f)) - ((bp1Var.g0(10.0f) * f2) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (n05Var.d() & 4294967295L)) - bp1Var.g0(2.5f);
        idVar.g((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float g02 = psVar.a - bp1Var.g0(2.5f);
        long A0 = bp1Var.A0();
        dn0 n0 = bp1Var.n0();
        long B2 = n0.B();
        n0.y().h();
        try {
            ((af2) n0.y).q(g02, A0);
            bp1.J0(bp1Var, idVar, j, f, new d06(bp1Var.g0(2.5f), 0.0f, 0, 0, 30), 48);
        } finally {
            h11.u(n0, B2);
        }
    }

    public static final yz3 w(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new wo1(ub2Var));
    }

    public static final yz3 x(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new dp1(ub2Var));
    }

    public static final yz3 y(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new ep1(ub2Var));
    }

    public static final s34 z(xh5 xh5Var, ub2 ub2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            uh5 a = xh5Var.a();
            za3 za3Var = a.c;
            if (za3Var.J() && za3Var.I()) {
                n05 g = a.g();
                s34 s34Var = new s34(48);
                fq3 fq3Var = new fq3((byte) 8);
                fq3Var.p(wk6.D(g));
                C(ub2Var, new fq3((byte) 8), fq3Var, s34Var, a, a);
                return s34Var;
            }
            s34 s34Var2 = b13.a;
            s34Var2.getClass();
            return s34Var2;
        } finally {
            Trace.endSection();
        }
    }

    public abstract InputFilter[] E(InputFilter[] inputFilterArr);

    public abstract void T(boolean z2);

    public abstract void U(boolean z2);

    public abstract List t(String str, List list);
}
