package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Shader;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.util.Log;
import com.anistation.android.R;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.library.WatchProgress;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bx7 {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final os0 c = new os0(-1203217486, false, new vs0(0));
    public static final os0 d = new os0(457265248, false, new qs0(8));
    public static final os0 e = new os0(1821805799, false, new qs0(9));
    public static final xd1 f = new xd1(1.0f, 1.0f);
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final Object h = new Object();

    public static final boolean A(m75 m75Var) {
        long j = m75Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == m75Var.f && j == m75Var.g && j == m75Var.h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [rb3, java.lang.Object, a95] */
    /* JADX WARN: Type inference failed for: r2v5, types: [rb3, mo6, java.lang.Object] */
    public static rb3 B(jf3 jf3Var, sb2 sb2Var) {
        pk2 pk2Var = pk2.i0;
        int ordinal = jf3Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.x = sb2Var;
                    obj.y = pk2Var;
                    return obj;
                }
                ze0.l();
                return null;
            }
            ?? obj2 = new Object();
            obj2.x = sb2Var;
            obj2.y = pk2Var;
            return obj2;
        }
        return new d46(sb2Var);
    }

    public static d46 C(sb2 sb2Var) {
        sb2Var.getClass();
        return new d46(sb2Var);
    }

    public static final yz3 D(hd3 hd3Var, v90 v90Var, rg4 rg4Var) {
        return new dd3(hd3Var, v90Var, rg4Var);
    }

    public static final l11 E(v11 v11Var, l11 l11Var) {
        l11 s = s(v11Var.getCoroutineContext(), l11Var, true);
        ja1 ja1Var = rh1.a;
        if (s != ja1Var && s.get(h95.B) == null) {
            return s.plus(ja1Var);
        }
        return s;
    }

    public static int H(int i, zi4 zi4Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zi4Var.A() + 1;
            case 7:
                return zi4Var.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static Object I(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final Object J(Object obj) {
        if (obj instanceof dr0) {
            return m37.l(((dr0) obj).a);
        }
        return obj;
    }

    public static final Object K(l11 l11Var, ic2 ic2Var) {
        mw1 mw1Var;
        l11 s;
        long B0;
        dr0 dr0Var;
        k11 k11Var = h95.B;
        n11 n11Var = (n11) l11Var.get(k11Var);
        it1 it1Var = it1.x;
        if (n11Var == null) {
            mw1Var = me6.a();
            s = s(it1Var, l11Var.plus(mw1Var), true);
            ja1 ja1Var = rh1.a;
            if (s != ja1Var && s.get(k11Var) == null) {
                s = s.plus(ja1Var);
            }
        } else {
            mw1Var = (mw1) me6.a.get();
            s = s(it1Var, l11Var, true);
            ja1 ja1Var2 = rh1.a;
            if (s != ja1Var2 && s.get(k11Var) == null) {
                s = s.plus(ja1Var2);
            }
        }
        a70 a70Var = new a70(s, Thread.currentThread(), mw1Var);
        a70Var.i0(y11.x, a70Var, ic2Var);
        mw1 mw1Var2 = a70Var.C;
        if (mw1Var2 != null) {
            int i = mw1.B;
            mw1Var2.A0(false);
        }
        while (true) {
            if (mw1Var2 != null) {
                try {
                    B0 = mw1Var2.B0();
                } catch (Throwable th) {
                    if (mw1Var2 != null) {
                        int i2 = mw1.B;
                        mw1Var2.y0(false);
                    }
                    throw th;
                }
            } else {
                B0 = Long.MAX_VALUE;
            }
            if (a70Var.k0()) {
                break;
            }
            LockSupport.parkNanos(a70Var, B0);
            if (Thread.interrupted()) {
                a70Var.r(new InterruptedException());
            }
        }
        if (mw1Var2 != null) {
            int i3 = mw1.B;
            mw1Var2.y0(false);
        }
        Object a2 = u43.a(a70Var.K());
        if (a2 instanceof dr0) {
            dr0Var = (dr0) a2;
        } else {
            dr0Var = null;
        }
        if (dr0Var == null) {
            return a2;
        }
        throw dr0Var.a;
    }

    public static final yz3 L(yz3 yz3Var, boolean z, by2 by2Var, boolean z2, m65 m65Var, sb2 sb2Var) {
        yz3 s;
        if (by2Var != null) {
            s = new sg5(z, null, by2Var, z2, m65Var, sb2Var);
        } else if (by2Var == null) {
            s = new sg5(z, null, null, z2, m65Var, sb2Var);
        } else {
            s = o80.s(vz3.x, new ug5(by2Var, z, z2, m65Var, sb2Var));
        }
        return yz3Var.w(s);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Typeface M(android.graphics.Typeface r6, defpackage.r92 r7, android.content.Context r8) {
        /*
            java.util.List r7 = r7.a
            java.lang.ThreadLocal r0 = defpackage.el6.a
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lf
            return r6
        Lf:
            java.lang.ThreadLocal r1 = defpackage.el6.a
            java.lang.Object r2 = r1.get()
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            if (r2 != 0) goto L21
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.set(r2)
        L21:
            r2.setFontVariationSettings(r0)
            r2.setTypeface(r6)
            yd1 r6 = defpackage.bb4.f(r8)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            if (r1 < r3) goto L43
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = defpackage.sh1.a(r1)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r5) goto L45
        L43:
            r8 = r4
            goto L51
        L45:
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = defpackage.sh1.a(r8)
        L51:
            if (r8 != 0) goto L5d
            c94 r8 = new c94
            r8.<init>(r6)
            java.lang.String r6 = defpackage.hi3.a(r7, r0, r8, r3)
            goto L8e
        L5d:
            int r6 = r7.size()
            if (r6 > 0) goto L96
            r6 = 1137180672(0x43c80000, float:400.0)
            float r8 = (float) r8
            float r8 = r8 + r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r6 = defpackage.db.B(r8, r6, r0)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L78
            java.lang.String r7 = ","
            goto L7a
        L78:
            java.lang.String r7 = ""
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "'wght' "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L8e:
            r2.setFontVariationSettings(r6)
            android.graphics.Typeface r6 = r2.getTypeface()
            return r6
        L96:
            java.lang.Object r6 = r7.get(r4)
            r6.getClass()
            defpackage.ov3.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx7.M(android.graphics.Typeface, r92, android.content.Context):android.graphics.Typeface");
    }

    public static void N(List list, gs4 gs4Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (gs4Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final Shader.TileMode O(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                return lr3.e();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final String P(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            if (f2 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / pow;
        if (max > 0) {
            return String.valueOf(f4);
        }
        return String.valueOf((int) f4);
    }

    public static final gn6 Q(vz0 vz0Var, l11 l11Var, Object obj) {
        gn6 gn6Var = null;
        if ((vz0Var instanceof x11) && l11Var.get(ug0.A) != null) {
            x11 x11Var = (x11) vz0Var;
            while (true) {
                if ((x11Var instanceof lh1) || (x11Var = x11Var.getCallerFrame()) == null) {
                    break;
                }
                if (x11Var instanceof gn6) {
                    gn6Var = (gn6) x11Var;
                    break;
                }
            }
            if (gn6Var != null) {
                gn6Var.o0(l11Var, obj);
            }
        }
        return gn6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [hk6, ii3, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v8, types: [hk6, j1, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [j1, java.lang.Object, fl5] */
    public static j1 R(Context context, Callable callable, Executor executor) {
        qb7 qb7Var = new qb7((Object) callable, (byte) 8);
        if (S(context)) {
            ?? obj = new Object();
            obj.F = new gk6((hk6) obj, qb7Var);
            executor.execute(obj);
            return obj;
        }
        ?? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ax7 ax7Var = new ax7(atomicBoolean, context, obj2, qb7Var, executor);
        context.registerReceiver(ax7Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (S(context) && atomicBoolean.compareAndSet(false, true)) {
            try {
                context.unregisterReceiver(ax7Var);
            } catch (IllegalArgumentException e2) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
            }
            ?? obj3 = new Object();
            obj3.F = new gk6((hk6) obj3, qb7Var);
            executor.execute(obj3);
            obj2.n(obj3);
            return obj2;
        }
        obj2.a(new w47(obj2, atomicBoolean, context, ax7Var, (byte) 5), qg1.x);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S(android.content.Context r7) {
        /*
            boolean r0 = defpackage.bx7.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<bx7> r0 = defpackage.bx7.class
            monitor-enter(r0)
            boolean r2 = defpackage.bx7.b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L52
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = defpackage.bx7.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            defpackage.bx7.a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            if (r3 != 0) goto L29
            r5 = r1
            goto L4c
        L29:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L48
        L39:
            r5 = r1
            goto L48
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            defpackage.bx7.a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L48:
            if (r5 == 0) goto L4c
            defpackage.bx7.a = r4     // Catch: java.lang.Throwable -> Lf
        L4c:
            if (r5 == 0) goto L50
            defpackage.bx7.b = r1     // Catch: java.lang.Throwable -> Lf
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx7.S(android.content.Context):boolean");
    }

    public static final void a(final ut utVar, final String str, final yz3 yz3Var, final ub2 ub2Var, final ub2 ub2Var2, final e7 e7Var, final dz0 dz0Var, kd2 kd2Var, final int i, final int i2) {
        int i3;
        String str2;
        dz0 dz0Var2;
        int i4;
        boolean z;
        ev2 ev2Var;
        tt ttVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        kd2Var.f0(1236588022);
        int i15 = 4;
        if ((i & 6) == 0) {
            if (kd2Var.f(utVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            if (kd2Var.f(str2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            if (kd2Var.f(yz3Var)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i3 |= i12;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(ub2Var)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.f(e7Var)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((1572864 & i) == 0) {
            dz0Var2 = dz0Var;
            if (kd2Var.f(dz0Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        } else {
            dz0Var2 = dz0Var;
        }
        if ((12582912 & i) == 0) {
            if (kd2Var.c(1.0f)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((100663296 & i) == 0) {
            if (kd2Var.f(null)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((805306368 & i) == 0) {
            if (kd2Var.d(1)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((i2 & 6) == 0) {
            if (!kd2Var.g(true)) {
                i15 = 2;
            }
            i4 = i2 | i15;
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (kd2Var.V(i3 & 1, z)) {
            Object obj = utVar.a;
            int i16 = lq6.b;
            kd2Var.e0(-329318062);
            boolean z2 = obj instanceof ev2;
            Object obj2 = au0.a;
            if (z2) {
                kd2Var.e0(-1008942344);
                ev2Var = (ev2) obj;
                if (ev2Var.s.d != null) {
                    kd2Var.e0(-1008902292);
                    kd2Var.q(false);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(-1008854118);
                    cr5 a2 = lq6.a(dz0Var, kd2Var);
                    boolean f2 = kd2Var.f(obj) | kd2Var.f(a2);
                    Object Q = kd2Var.Q();
                    if (f2 || Q == obj2) {
                        bv2 a3 = ev2.a(ev2Var);
                        a3.i = a2;
                        Q = a3.a();
                        kd2Var.n0(Q);
                    }
                    ev2Var = (ev2) Q;
                    kd2Var.q(false);
                    kd2Var.q(false);
                }
            } else {
                kd2Var.e0(-1008595950);
                Context context = (Context) kd2Var.j(eb.b);
                cr5 a4 = lq6.a(dz0Var, kd2Var);
                boolean f3 = kd2Var.f(context) | kd2Var.f(obj) | kd2Var.f(a4);
                Object Q2 = kd2Var.Q();
                if (f3 || Q2 == obj2) {
                    bv2 bv2Var = new bv2(context);
                    bv2Var.c = obj;
                    bv2Var.i = a4;
                    Q2 = bv2Var.a();
                    kd2Var.n0(Q2);
                }
                ev2Var = (ev2) Q2;
                kd2Var.q(false);
            }
            kd2Var.q(false);
            Object obj3 = ev2Var.b;
            if (!(obj3 instanceof bv2)) {
                if (!(obj3 instanceof pc)) {
                    if (!(obj3 instanceof ov2)) {
                        if (!(obj3 instanceof xh4)) {
                            if (ev2Var.c == null) {
                                if (((fg3) wk6.o(ev2Var, jv2.e)) == null) {
                                    kz4 kz4Var = utVar.c;
                                    jt jtVar = utVar.b;
                                    if (((Boolean) kd2Var.j(i03.a)).booleanValue()) {
                                        kd2Var.e0(2019030948);
                                        tt ttVar2 = (tt) kd2Var.j(uj3.a);
                                        kd2Var.q(false);
                                        ttVar = ttVar2;
                                    } else {
                                        kd2Var.e0(2019088453);
                                        kd2Var.q(false);
                                        ttVar = null;
                                    }
                                    tt ttVar3 = ttVar;
                                    yz3 w = yz3Var.w(new az0(ev2Var, kz4Var, jtVar, ub2Var, ub2Var2, e7Var, dz0Var2, ttVar3, str2));
                                    yb ybVar = yb.l;
                                    int hashCode = Long.hashCode(kd2Var.T);
                                    yz3 E = o80.E(kd2Var, w);
                                    al4 l = kd2Var.l();
                                    tt0.d.getClass();
                                    kd2Var.h0();
                                    if (kd2Var.S) {
                                        kd2Var.k(za3.p0);
                                    } else {
                                        kd2Var.q0();
                                    }
                                    ss5.i(p7.F, kd2Var, ybVar);
                                    ss5.i(p7.E, kd2Var, l);
                                    ss5.h(kd2Var);
                                    ss5.i(p7.D, kd2Var, E);
                                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                                    kd2Var.q(true);
                                } else {
                                    ze0.k("request.lifecycle must be null.");
                                    return;
                                }
                            } else {
                                ze0.k("request.target must be null.");
                                return;
                            }
                        } else {
                            lq6.c("Painter");
                            throw null;
                        }
                    } else {
                        lq6.c("ImageVector");
                        throw null;
                    }
                } else {
                    lq6.c("ImageBitmap");
                    throw null;
                }
            } else {
                ze0.k("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: ht
                @Override // defpackage.ic2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    bx7.a(ut.this, str, yz3Var, ub2Var, ub2Var2, e7Var, dz0Var, (kd2) obj4, kb0.N(i | 1), kb0.N(i2));
                    return pn6.a;
                }
            };
        }
    }

    public static final m75 b(float f2, float f3, float f4, float f5, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new m75(f2, f3, f4, f5, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void c(String str, sb2 sb2Var, sb2 sb2Var2, sb2 sb2Var3, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        String str2;
        kd2 kd2Var2 = kd2Var;
        str.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var2.f0(-1263165940);
        if (kd2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (kd2Var2.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (kd2Var2.h(sb2Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (kd2Var2.h(sb2Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (kd2Var2.f(yz3Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i11 & 1, z)) {
            int i12 = i11 << 15;
            yz3 V = n77.V(kb0.z(ar5.c(yz3Var, 1.0f), false, sb2Var, sb2Var3, kd2Var2, ((i11 << 18) & 29360128) | (i12 & 234881024), 63), 12.0f, 4.0f, 0.0f, 4.0f, 4);
            tq1 tq1Var = op0.a;
            yz3 h2 = h(V, ((mp0) kd2Var2.j(tq1Var)).n, io3.h);
            z75 a2 = y75.a(new vr(18.0f, true, new ze0((byte) 6)), pk2.I, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, h2);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, a2);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            yt2.a(w65.H(R.drawable.history, kd2Var2, 0), null, null, ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 56, 4);
            yc6.b(str, new ob3(1.0f, true), ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(((nl6) kd2Var2.j(pl6.a)).j, 0L, null, null, 0L, null, hz5.g(18), null, 16646143), kd2Var, i11 & 14, 24960, 110584);
            str2 = str;
            kd2Var2 = kd2Var;
            zz.a(ar5.i(vz3.x, 40.0f), false, true, null, null, 0L, 0L, sb2Var2, null, nx7.R(-147730609, new q10(str2, (byte) 3), kd2Var2), kd2Var2, (i12 & 29360128) | 805306758, 378);
            kd2Var2.q(true);
        } else {
            str2 = str;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ni(str2, sb2Var, sb2Var2, sb2Var3, yz3Var, i, (byte) 3);
        }
    }

    public static boolean d(Iterable iterable, gs4 gs4Var) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (gs4Var.apply(it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return false;
        }
        return true;
    }

    public static final AnimeListItem e(com.anistation.local.entity.AnimeListItem animeListItem) {
        animeListItem.getClass();
        return new AnimeListItem(animeListItem.getAnistationId(), animeListItem.getAnilistId(), animeListItem.getMalId(), animeListItem.getTitle(), animeListItem.getCoverImage(), animeListItem.getBannerImage(), animeListItem.getTotalEpisodes(), animeListItem.getCurrentAiredEpisodes(), animeListItem.getMediaStatus(), animeListItem.getWatchStatus(), animeListItem.getImportedProgress(), animeListItem.getScore(), animeListItem.getFormat(), animeListItem.getNotes(), animeListItem.getCreatedAt(), animeListItem.getUpdatedAt());
    }

    public static final WatchProgress f(com.anistation.local.entity.WatchProgress watchProgress) {
        watchProgress.getClass();
        return new WatchProgress(watchProgress.getId(), watchProgress.getAnistationId(), watchProgress.getAnilistId(), watchProgress.getMalId(), watchProgress.getAnimeTitle(), watchProgress.getEpisodeTitle(), watchProgress.getCoverImage(), watchProgress.getThumbnailImage(), watchProgress.getEpisodeNumber(), watchProgress.getPositionMs(), watchProgress.getDurationMs(), watchProgress.getCompleted(), watchProgress.getUpdatedAt());
    }

    public static yz3 g(yz3 yz3Var, oh3 oh3Var) {
        return yz3Var.w(new yz(0L, oh3Var, io3.h, 1));
    }

    public static final yz3 h(yz3 yz3Var, long j, om5 om5Var) {
        return yz3Var.w(new yz(j, null, om5Var, 2));
    }

    public static yz3 i(long j, yz3 yz3Var) {
        return h(yz3Var, j, io3.h);
    }

    public static String j(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i10][i11];
                    byte[] bArr3 = dq6.a;
                    int i13 = b2 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b3 = bArr[i7 + i12];
                byte[] bArr4 = dq6.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length == i11) {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static boolean n(zi4 zi4Var, f42 f42Var, int i, d42 d42Var) {
        boolean z;
        boolean z2;
        boolean z3;
        long C = zi4Var.C();
        long j = C >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((C >> 12) & 15);
        int i3 = (int) ((C >> 8) & 15);
        int i4 = (int) ((C >> 4) & 15);
        int i5 = (int) ((C >> 1) & 7);
        if ((C & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 <= 7) {
            if (i4 != f42Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || f42Var.g != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != f42Var.i) || z2) {
            return false;
        }
        try {
            long I = zi4Var.I();
            if (!z) {
                I *= f42Var.b;
            }
            long j2 = f42Var.j;
            if (j2 != 0 && I > j2) {
                return false;
            }
            d42Var.a = I;
            int H = H(i2, zi4Var);
            long j3 = f42Var.j;
            if (j3 != 0 && I + H < j3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (H == -1) {
                return false;
            }
            if ((!z3 && H < f42Var.a) || H > f42Var.b) {
                return false;
            }
            int i6 = f42Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != f42Var.f) {
                        return false;
                    }
                } else if (i3 == 12) {
                    if (zi4Var.A() * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT != i6) {
                        return false;
                    }
                } else {
                    if (i3 > 14) {
                        return false;
                    }
                    int H2 = zi4Var.H();
                    if (i3 == 14) {
                        H2 *= 10;
                    }
                    if (H2 != i6) {
                        return false;
                    }
                }
            }
            int A = zi4Var.A();
            int i7 = zi4Var.b;
            byte[] bArr = zi4Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = zi4Var.b; i10 < i8; i10++) {
                i9 = eq6.l[i9 ^ (bArr[i10] & 255)];
            }
            String str = eq6.a;
            if (A != i9) {
                return false;
            }
            if (zi4Var.a() != 0) {
                int j4 = zi4Var.j();
                if ((j4 & 128) != 0) {
                    return false;
                }
                int i11 = (j4 & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    kb0.B("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void o(long j, zi4 zi4Var, bh6[] bh6VarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (zi4Var.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (zi4Var.a() == 0) {
                        i = -1;
                        break;
                    }
                    int A = zi4Var.A();
                    i3 += A;
                    if (A != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (zi4Var.a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int A2 = zi4Var.A();
                    i4 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i5 = zi4Var.b + i4;
                if (i4 != -1 && i4 <= zi4Var.a()) {
                    if (i == 4 && i4 >= 8) {
                        int A3 = zi4Var.A();
                        int H = zi4Var.H();
                        if (H == 49) {
                            i2 = zi4Var.m();
                        } else {
                            i2 = 0;
                        }
                        int A4 = zi4Var.A();
                        if (H == 47) {
                            zi4Var.O(1);
                        }
                        if (A3 == 181 && ((H == 49 || H == 47) && A4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (H == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            p(j, zi4Var, bh6VarArr);
                        }
                    }
                } else {
                    kb0.O("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = zi4Var.c;
                }
                zi4Var.N(i5);
            } else {
                return;
            }
        }
    }

    public static void p(long j, zi4 zi4Var, bh6[] bh6VarArr) {
        boolean z;
        int A = zi4Var.A();
        if ((A & 64) != 0) {
            zi4Var.O(1);
            int i = (A & 31) * 3;
            int i2 = zi4Var.b;
            for (bh6 bh6Var : bh6VarArr) {
                zi4Var.N(i2);
                bh6Var.e(i, zi4Var);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                bh6Var.a(j, 1, i, 0, null);
            }
        }
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[EDGE_INSN: B:47:0x008b->B:31:0x008b BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List r(defpackage.a94 r9, int r10, int r11) {
        /*
            if (r10 != r11) goto L5
            nt1 r9 = defpackage.nt1.x
            return r9
        L5:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L11:
            if (r2 == 0) goto L16
            if (r10 >= r11) goto L8c
            goto L18
        L16:
            if (r10 <= r11) goto L8c
        L18:
            java.util.LinkedHashMap r4 = r9.a
            r5 = 0
            if (r2 == 0) goto L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2b
        L29:
            r7 = r5
            goto L4b
        L2b:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            ai4 r7 = new ai4
            r7.<init>(r4, r6)
            goto L4b
        L35:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L42
            goto L29
        L42:
            java.util.Set r6 = r4.keySet()
            ai4 r7 = new ai4
            r7.<init>(r4, r6)
        L4b:
            if (r7 != 0) goto L4e
            goto L8b
        L4e:
            java.lang.Object r4 = r7.x
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.y
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L88
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L73
            int r8 = r10 + 1
            if (r8 > r7) goto L5a
            if (r7 > r11) goto L5a
            goto L77
        L73:
            if (r11 > r7) goto L5a
            if (r7 >= r10) goto L5a
        L77:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L89
        L88:
            r4 = r0
        L89:
            if (r4 != 0) goto L11
        L8b:
            return r5
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx7.r(a94, int, int):java.util.List");
    }

    public static final l11 s(l11 l11Var, l11 l11Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 5;
        boolean booleanValue = ((Boolean) l11Var.fold(bool, new st0(b2))).booleanValue();
        boolean booleanValue2 = ((Boolean) l11Var2.fold(bool, new st0(b2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return l11Var.plus(l11Var2);
        }
        st0 st0Var = new st0((byte) 6);
        it1 it1Var = it1.x;
        l11 l11Var3 = (l11) l11Var.fold(it1Var, st0Var);
        Object obj = l11Var2;
        if (booleanValue2) {
            obj = l11Var2.fold(it1Var, new st0((byte) 7));
        }
        return l11Var3.plus((l11) obj);
    }

    public static final List v(ce1 ce1Var, String str) {
        ce1Var.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList K0 = yo0.K0(ce1Var.getDependentWorkIds(str));
        while (!K0.isEmpty()) {
            String str2 = (String) dp0.b0(K0);
            linkedHashSet.add(str2);
            K0.addAll(ce1Var.getDependentWorkIds(str2));
        }
        return yo0.I0(linkedHashSet);
    }

    public static final long w(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static Set x() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static Object y(AbstractCollection abstractCollection, Object obj) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static Object z(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            qi2.e();
            return null;
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public void F(i1 i1Var, i1 i1Var2) {
        i1Var.b = i1Var2;
    }

    public void G(i1 i1Var, Thread thread) {
        i1Var.a = thread;
    }

    public boolean k(j1 j1Var, a1 a1Var, a1 a1Var2) {
        synchronized (j1Var) {
            try {
                if (j1Var.y == a1Var) {
                    j1Var.y = a1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(j1 j1Var, Object obj, Object obj2) {
        synchronized (j1Var) {
            try {
                if (j1Var.x == obj) {
                    j1Var.x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m(j1 j1Var, i1 i1Var, i1 i1Var2) {
        synchronized (j1Var) {
            try {
                if (j1Var.z == i1Var) {
                    j1Var.z = i1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a1 t(j1 j1Var) {
        a1 a1Var;
        a1 a1Var2 = a1.d;
        synchronized (j1Var) {
            try {
                a1Var = j1Var.y;
                if (a1Var != a1Var2) {
                    j1Var.y = a1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a1Var;
    }

    public i1 u(j1 j1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        synchronized (j1Var) {
            try {
                i1Var = j1Var.z;
                if (i1Var != i1Var2) {
                    j1Var.z = i1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i1Var;
    }
}
