package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.anistation.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class t80 {
    public static final vz0[] a = new vz0[0];
    public static final os0 b = new os0(-257159609, false, new qs0(20));
    public static final os0 c = new os0(-1899922972, false, new qs0(21));
    public static final q18 d;
    public static final x73[] e;
    public static tk4 f;

    static {
        new os0(553870606, false, new qs0((byte) 22));
        d = new q18((byte) 23);
        e = new x73[0];
    }

    public static int A(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new mb4(context).b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        qi2.m("permission must be non-null");
        return 0;
    }

    public static final int B(long j, long j2) {
        boolean Z = Z(j);
        if (Z != Z(j2)) {
            if (!Z) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(L(j) - L(j2));
        if (Math.min(L(j), L(j2)) >= 0.0f && Y(j) != Y(j2)) {
            if (!Y(j)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object C(wu0 wu0Var, jw4 jw4Var) {
        if (!((xz3) wu0Var).x.K) {
            ez2.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        al4 al4Var = (al4) wc7.O(wu0Var).Y;
        al4Var.getClass();
        return sw0.E(al4Var, jw4Var);
    }

    public static final tv1 D(Enum[] enumArr) {
        enumArr.getClass();
        return new tv1(enumArr);
    }

    public static final boolean E(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean F(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final boolean G(h82 h82Var, bg bgVar) {
        int ordinal = h82Var.f1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (h82Var.c1().a) {
                            return ((Boolean) bgVar.invoke(h82Var)).booleanValue();
                        }
                        return g0(h82Var, bgVar);
                    }
                    ze0.l();
                    return false;
                }
            } else {
                h82 C = bb4.C(h82Var);
                if (C != null) {
                    if (!G(C, bgVar) && !H(h82Var, C, 1, bgVar)) {
                        return false;
                    }
                    return true;
                }
                ze0.m("ActiveParent must have a focusedChild");
                return false;
            }
        }
        return g0(h82Var, bgVar);
    }

    public static final boolean H(final h82 h82Var, final h82 h82Var2, final int i, final bg bgVar) {
        if (l0(h82Var, h82Var2, i, bgVar)) {
            return true;
        }
        final h82 g = ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).g();
        Boolean bool = (Boolean) bb4.O(h82Var, i, new ub2() { // from class: ne4
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                t50 t50Var = (t50) obj;
                h82 h82Var3 = h82Var;
                if (h82.this != ((r72) ((oa) wc7.P(h82Var3)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean l0 = t80.l0(h82Var3, h82Var2, i, bgVar);
                Boolean valueOf = Boolean.valueOf(l0);
                if (!l0 && t50Var.a()) {
                    return null;
                }
                return valueOf;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList I(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            k45 r1 = new k45
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.m45.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.m45.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            j45 r5 = (defpackage.j45) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.m45.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.sp0.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.m45.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.m45.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            j45 r0 = new j45     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.I(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final int J(m85 m85Var, String str) {
        m85Var.getClass();
        return kb0.n(m85Var, str);
    }

    public static final int K(m85 m85Var, String str) {
        m85Var.getClass();
        int n = kb0.n(m85Var, str);
        if (n >= 0) {
            return n;
        }
        int columnCount = m85Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(m85Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + yo0.q0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final float L(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final Class M(e73 e73Var) {
        e73Var.getClass();
        Class d2 = ((gm0) e73Var).d();
        d2.getClass();
        return d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    public static final Class N(e73 e73Var) {
        e73Var.getClass();
        Class d2 = ((gm0) e73Var).d();
        if (d2.isPrimitive()) {
            String name = d2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return d2;
    }

    public static final int O(o24 o24Var, long j, rv6 rv6Var) {
        float f2;
        if (rv6Var != null) {
            f2 = rv6Var.g();
        } else {
            f2 = 0.0f;
        }
        int i = (int) (4294967295L & j);
        int e2 = o24Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= o24Var.f(e2) - f2 && Float.intBitsToFloat(i) <= o24Var.b(e2) + f2) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-f2) && Float.intBitsToFloat(i2) <= o24Var.d + f2) {
                return e2;
            }
            return -1;
        }
        return -1;
    }

    public static final uf P(l11 l11Var) {
        uf ufVar = (uf) l11Var.get(pk2.Z);
        if (ufVar != null) {
            return ufVar;
        }
        ze0.m("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final int Q(o24 o24Var, long j, ha3 ha3Var, rv6 rv6Var) {
        long D;
        int O;
        if (ha3Var == null || (O = O(o24Var, (D = ha3Var.D(j)), rv6Var)) == -1) {
            return -1;
        }
        return o24Var.g(xc4.a(D, (o24Var.b(O) + o24Var.f(O)) / 2.0f, 1));
    }

    public static final long R(bd6 bd6Var, long j, long j2, ha3 ha3Var, rv6 rv6Var) {
        if (bd6Var != null) {
            o24 o24Var = bd6Var.b;
            if (ha3Var != null) {
                long D = ha3Var.D(j);
                long D2 = ha3Var.D(j2);
                int O = O(o24Var, D, rv6Var);
                int O2 = O(o24Var, D2, rv6Var);
                if (O == -1) {
                    if (O2 == -1) {
                        return nd6.b;
                    }
                } else {
                    if (O2 != -1) {
                        O = Math.min(O, O2);
                    }
                    O2 = O;
                }
                float b2 = (o24Var.b(O2) + o24Var.f(O2)) / 2.0f;
                int i = (int) (D >> 32);
                int i2 = (int) (D2 >> 32);
                return o24Var.h(new n05(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), b2 - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), b2 + 0.1f), 0, pk2.g0);
            }
        }
        return nd6.b;
    }

    public static final long S(uf3 uf3Var, n05 n05Var, int i) {
        o24 o24Var;
        cd6 d2 = uf3Var.d();
        if (d2 != null) {
            o24Var = d2.a.b;
        } else {
            o24Var = null;
        }
        ha3 c2 = uf3Var.c();
        p65 p65Var = pk2.h0;
        if (o24Var != null && c2 != null) {
            return o24Var.h(n05Var.k(c2.D(0L)), i, p65Var);
        }
        return nd6.b;
    }

    public static final long T(dd6 dd6Var, n05 n05Var, int i) {
        o24 o24Var;
        bd6 c2 = dd6Var.c();
        if (c2 != null) {
            o24Var = c2.b;
        } else {
            o24Var = null;
        }
        ha3 e2 = dd6Var.e();
        p65 p65Var = pk2.h0;
        if (o24Var != null && e2 != null) {
            return o24Var.h(n05Var.k(e2.D(0L)), i, p65Var);
        }
        return nd6.b;
    }

    public static final long U(uf3 uf3Var, n05 n05Var, n05 n05Var2, int i) {
        long S = S(uf3Var, n05Var, i);
        if (nd6.d(S)) {
            return nd6.b;
        }
        long S2 = S(uf3Var, n05Var2, i);
        if (nd6.d(S2)) {
            return nd6.b;
        }
        int i2 = (int) (S >> 32);
        int i3 = (int) (S2 & 4294967295L);
        return fy5.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long V(dd6 dd6Var, n05 n05Var, n05 n05Var2, int i) {
        long T = T(dd6Var, n05Var, i);
        if (nd6.d(T)) {
            return nd6.b;
        }
        long T2 = T(dd6Var, n05Var2, i);
        if (nd6.d(T2)) {
            return nd6.b;
        }
        int i2 = (int) (T >> 32);
        int i3 = (int) (T2 & 4294967295L);
        return fy5.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final c45 W(bd6 bd6Var, int i) {
        ad6 ad6Var = bd6Var.a;
        o24 o24Var = bd6Var.b;
        if (ad6Var.a.y.length() != 0) {
            int d2 = o24Var.d(i);
            if ((i != 0 && d2 == o24Var.d(i - 1)) || (i != ad6Var.a.y.length() && d2 == o24Var.d(i + 1))) {
                return bd6Var.a(i);
            }
        }
        return bd6Var.i(i);
    }

    public static final boolean X(bd6 bd6Var, int i) {
        o24 o24Var = bd6Var.b;
        int d2 = o24Var.d(i);
        if (i == bd6Var.h(d2) || i == o24Var.c(d2, false) ? bd6Var.i(i) != bd6Var.a(i) : bd6Var.a(i) != bd6Var.a(i - 1)) {
            return true;
        }
        return false;
    }

    public static final boolean Y(long j) {
        if ((j & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean Z(long j) {
        if ((j & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.util.List r27, final java.lang.Object r28, final defpackage.ub2 r29, defpackage.yz3 r30, defpackage.ub2 r31, boolean r32, defpackage.om5 r33, long r34, defpackage.th4 r36, defpackage.xd6 r37, defpackage.kd2 r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.a(java.util.List, java.lang.Object, ub2, yz3, ub2, boolean, om5, long, th4, xd6, kd2, int, int):void");
    }

    public static final boolean a0(uq4 uq4Var, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (uq4Var.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = uq4Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        float f4 = ((int) (j & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f4) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static final void b(xi6 xi6Var, yz3 yz3Var, j32 j32Var, ub2 ub2Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        ub2 ub2Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        qt0 qt0Var = xi6Var.a;
        kd2Var.f0(-1877370462);
        if ((i & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(j32Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = yj.E;
                kd2Var.n0(Q);
            }
            ub2 ub2Var3 = (ub2) Q;
            Object Q2 = kd2Var.Q();
            Object obj2 = Q2;
            if (Q2 == obj) {
                zt5 zt5Var = new zt5();
                zt5Var.add(qt0Var.v());
                kd2Var.n0(zt5Var);
                obj2 = zt5Var;
            }
            zt5 zt5Var2 = (zt5) obj2;
            Object Q3 = kd2Var.Q();
            if (Q3 == obj) {
                long[] jArr = cb5.a;
                Q3 = new p44();
                kd2Var.n0(Q3);
            }
            p44 p44Var = (p44) Q3;
            ti4 ti4Var = xi6Var.d;
            if (a34.i(qt0Var.v(), ti4Var.getValue())) {
                kd2Var.e0(321145192);
                if (zt5Var2.size() == 1 && a34.i(zt5Var2.get(0), ti4Var.getValue())) {
                    kd2Var.e0(321469824);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(321279546);
                    if ((i7 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object Q4 = kd2Var.Q();
                    if (z2 || Q4 == obj) {
                        Q4 = new bk(xi6Var, (byte) 3);
                        kd2Var.n0(Q4);
                    }
                    dp0.a0(zt5Var2, (ub2) Q4);
                    p44Var.a();
                    kd2Var.q(false);
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(321475776);
                kd2Var.q(false);
            }
            if (!p44Var.b(ti4Var.getValue())) {
                kd2Var.e0(321536443);
                ListIterator listIterator = zt5Var2.listIterator();
                int i8 = 0;
                while (true) {
                    gl2 gl2Var = (gl2) listIterator;
                    if (gl2Var.hasNext()) {
                        if (a34.i(ub2Var3.invoke(gl2Var.next()), ub2Var3.invoke(ti4Var.getValue()))) {
                            break;
                        } else {
                            i8++;
                        }
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 == -1) {
                    zt5Var2.add(ti4Var.getValue());
                } else {
                    zt5Var2.set(i8, ti4Var.getValue());
                }
                p44Var.a();
                int size = zt5Var2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj3 = zt5Var2.get(i9);
                    p44Var.n(obj3, nx7.R(-934471669, new s21(xi6Var, j32Var, obj3, os0Var), kd2Var));
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(322279296);
                kd2Var.q(false);
            }
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l);
            ss5.e(kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            kd2Var.e0(-1312707512);
            int size2 = zt5Var2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj4 = zt5Var2.get(i10);
                kd2Var.c0(1171574969, ub2Var3.invoke(obj4));
                ic2 ic2Var = (ic2) p44Var.g(obj4);
                if (ic2Var == null) {
                    kd2Var.e0(1959122128);
                } else {
                    kd2Var.e0(1171576145);
                    ic2Var.invoke(kd2Var, 0);
                }
                kd2Var.q(false);
                kd2Var.q(false);
            }
            kd2Var.q(false);
            kd2Var.q(true);
            ub2Var2 = ub2Var3;
        } else {
            kd2Var.Y();
            ub2Var2 = ub2Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new t21(xi6Var, yz3Var, j32Var, ub2Var2, os0Var, i);
        }
    }

    public static final boolean b0(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final void c(Boolean bool, yz3 yz3Var, j32 j32Var, String str, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        yz3 yz3Var2;
        String str2;
        kd2Var.f0(-513216493);
        if (kd2Var.f(bool)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (kd2Var.h(j32Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3 | 3072;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            vz3 vz3Var = vz3.x;
            b(tl7.T(bool, "Crossfade", kd2Var, (i5 & 14) | 48, 0), vz3Var, j32Var, null, os0Var, kd2Var, i5 & 58352);
            yz3Var2 = vz3Var;
            str2 = "Crossfade";
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            str2 = str;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new r21(bool, yz3Var2, j32Var, str2, os0Var, i);
        }
    }

    public static boolean c0(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static final void d(xm6 xm6Var, sb2 sb2Var, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        yz3 yz3Var2;
        vz3 vz3Var;
        int i3;
        sb2 sb2Var2 = sb2Var;
        kd2 kd2Var2 = kd2Var;
        xm6Var.getClass();
        sb2Var2.getClass();
        kd2Var2.f0(796696705);
        if (kd2Var2.h(xm6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i & 48) == 0) {
            if (kd2Var2.h(sb2Var2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        int i5 = i4 | 384;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i5 & 1, z)) {
            yz3 T = n77.T(ar5.c, 0.0f, 10.0f, 1);
            xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, T);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z2 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z2) {
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
            yc6.b(lz5.f(R.string.export_point, kd2Var2), null, ep0.b(0.7f, n03.r(kd2Var2).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).k, kd2Var2, 0, 0, 131066);
            vz3 vz3Var2 = vz3.x;
            ov5.a(kd2Var2, ar5.e(vz3Var2, 24.0f));
            yz3 S = n77.S(bx7.h(ar5.c(vz3Var2, 1.0f), n03.r(kd2Var2).p, n03.w(kd2Var2).c), 16.0f, 14.0f);
            p18 p18Var = x97.B;
            x50 x50Var = pk2.I;
            z75 a3 = y75.a(p18Var, x50Var, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, S);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a3);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            z75 a4 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 54);
            int hashCode3 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E3 = o80.E(kd2Var2, vz3Var2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var, kd2Var2, l3);
            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E3);
            yt2.a(w65.H(R.drawable.file, kd2Var2, 0), null, ar5.i(vz3Var2, 20.0f), 0L, kd2Var2, 440, 8);
            yc6.b(lz5.f(R.string.export_format, kd2Var2), null, n03.r(kd2Var2).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).j, kd2Var2, 1572864, 0, 131002);
            kd2Var2.q(true);
            yc6.b(lz5.f(R.string.xml, kd2Var2), null, ep0.b(0.6f, n03.r(kd2Var2).o), 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).j, kd2Var2, 1572864, 0, 131002);
            kd2Var2.q(true);
            String str = xm6Var.s;
            if (str == null) {
                kd2Var2.e0(1421227161);
                kd2Var2.q(false);
                vz3Var = vz3Var2;
            } else {
                kd2Var2.e0(1421227162);
                ov5.a(kd2Var2, ar5.e(vz3Var2, 20.0f));
                vz3Var = vz3Var2;
                l36.a(ar5.c(vz3Var2, 1.0f), n03.w(kd2Var2).c, n03.r(kd2Var2).p, 0L, 0.0f, 0.0f, null, nx7.R(-1590479682, new q10(str, (byte) 2), kd2Var2), kd2Var2, 12582918, 120);
                kd2Var2.q(false);
            }
            ov5.a(kd2Var2, ar5.e(vz3Var, 30.0f));
            String f2 = lz5.f(R.string.export, kd2Var2);
            yz3 c2 = ar5.c(vz3Var, 1.0f);
            boolean z3 = xm6Var.y;
            vz3 vz3Var3 = vz3Var;
            sb2Var2 = sb2Var;
            nx7.a(f2, c2, null, null, !z3, z3, 0.0f, 0L, 0L, n03.y(kd2Var2).j, null, sb2Var2, kd2Var, 48, (i5 << 3) & 896, 3020);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            yz3Var2 = vz3Var3;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new tz0(xm6Var, sb2Var2, yz3Var2, i);
        }
    }

    public static final boolean d0(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final void e(Object obj, int i, yd3 yd3Var, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        ub2 ub2Var;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(872548579);
        if ((i2 & 6) == 0) {
            if (kd2Var.h(obj)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(yd3Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            boolean f2 = kd2Var.f(obj) | kd2Var.f(yd3Var);
            Object Q = kd2Var.Q();
            Object obj2 = au0.a;
            if (f2 || Q == obj2) {
                Q = new xd3(obj, yd3Var);
                kd2Var.n0(Q);
            }
            xd3 xd3Var = (xd3) Q;
            xd3Var.c = i;
            ti4 ti4Var = xd3Var.g;
            jw4 jw4Var = wl4.a;
            xd3 xd3Var2 = (xd3) kd2Var.j(jw4Var);
            ft5 b2 = et5.b();
            if (b2 != null) {
                ub2Var = b2.e();
            } else {
                ub2Var = null;
            }
            ft5 e2 = et5.e(b2);
            try {
                if (xd3Var2 != ((xd3) ti4Var.getValue())) {
                    ti4Var.setValue(xd3Var2);
                    if (xd3Var.d > 0) {
                        xd3 xd3Var3 = xd3Var.e;
                        if (xd3Var3 != null) {
                            xd3Var3.b();
                        }
                        if (xd3Var2 != null) {
                            xd3Var2.a();
                        } else {
                            xd3Var2 = null;
                        }
                        xd3Var.e = xd3Var2;
                    }
                }
                et5.k(b2, e2, ub2Var);
                boolean f3 = kd2Var.f(xd3Var);
                Object Q2 = kd2Var.Q();
                if (f3 || Q2 == obj2) {
                    Q2 = new lz0(xd3Var, (byte) 23);
                    kd2Var.n0(Q2);
                }
                db.c(xd3Var, (ub2) Q2, kd2Var);
                kb0.b(jw4Var.a(xd3Var), os0Var, kd2Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                et5.k(b2, e2, ub2Var);
                throw th;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new nm(obj, i, yd3Var, os0Var, i2);
        }
    }

    public static final boolean e0(int i) {
        int type;
        if (d0(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }

    public static final void f(int i, kd2 kd2Var) {
        boolean z;
        kd2Var.f0(-253204984);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 K = n77.K(n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 0.0f, 0.0f, 6.0f, 7), n77.d0(kd2Var), 12);
            z75 a2 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 6);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, K);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            ov5.a(kd2Var, ar5.l(vz3Var, 2.0f));
            kd2Var.e0(1767935364);
            Iterator it = te4.I(83, 101, 95, 124).iterator();
            while (it.hasNext()) {
                b90.a(bx7.h(n03.k(ar5.e(ar5.l(vz3Var, ((Number) it.next()).intValue()), 36.0f), tm5.b), ((mp0) kd2Var.j(op0.a)).r, io3.h), kd2Var, 0);
            }
            kd2Var.q(false);
            ov5.a(kd2Var, ar5.l(vz3Var, 2.0f));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ao5(i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean f0(h82 h82Var, bg bgVar) {
        h82[] h82VarArr = new h82[16];
        if (!h82Var.x.K) {
            ez2.b("visitChildren called on an unattached node");
        }
        z44 z44Var = new z44(new xz3[16], 0);
        xz3 xz3Var = h82Var.x;
        xz3 xz3Var2 = xz3Var.C;
        if (xz3Var2 == null) {
            wc7.f(z44Var, xz3Var);
        } else {
            z44Var.b(xz3Var2);
        }
        int i = 0;
        while (true) {
            int i2 = z44Var.z;
            if (i2 == 0) {
                break;
            }
            xz3 xz3Var3 = (xz3) z44Var.m(i2 - 1);
            if ((xz3Var3.A & 1024) == 0) {
                wc7.f(z44Var, xz3Var3);
            } else {
                while (true) {
                    if (xz3Var3 == null) {
                        break;
                    }
                    if ((xz3Var3.z & 1024) != 0) {
                        z44 z44Var2 = null;
                        while (xz3Var3 != null) {
                            if (xz3Var3 instanceof h82) {
                                h82 h82Var2 = (h82) xz3Var3;
                                int i3 = i + 1;
                                if (h82VarArr.length < i3) {
                                    int length = h82VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(h82VarArr, 0, r10, 0, length);
                                    h82VarArr = r10;
                                }
                                h82VarArr[i] = h82Var2;
                                i = i3;
                            } else if ((xz3Var3.z & 1024) != 0 && (xz3Var3 instanceof zc1)) {
                                int i4 = 0;
                                for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                    if ((xz3Var4.z & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            xz3Var3 = xz3Var4;
                                        } else {
                                            if (z44Var2 == null) {
                                                z44Var2 = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var3 != null) {
                                                z44Var2.b(xz3Var3);
                                                xz3Var3 = null;
                                            }
                                            z44Var2.b(xz3Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            xz3Var3 = wc7.J(z44Var2);
                        }
                    } else {
                        xz3Var3 = xz3Var3.C;
                    }
                }
            }
        }
        Arrays.sort(h82VarArr, 0, i, k82.y);
        int i5 = i - 1;
        if (i5 < h82VarArr.length) {
            while (i5 >= 0) {
                h82 h82Var3 = h82VarArr[i5];
                if (bb4.J(h82Var3) && q(h82Var3, bgVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final void g(int i, kd2 kd2Var) {
        boolean z;
        kd2Var.f0(264902516);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 S = n77.S(ar5.c(vz3Var, 1.0f), 12.0f, 5.0f);
            x50 x50Var = pk2.I;
            z75 a2 = y75.a(x97.B, x50Var, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, S);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            yz3 c2 = ar5.c(vz3Var, 0.65f);
            z75 a3 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), x50Var, kd2Var, 54);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, c2);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            yz3 i2 = ar5.i(vz3Var, 40.0f);
            o75 o75Var = tm5.b;
            yz3 k = n03.k(i2, o75Var);
            tq1 tq1Var = op0.a;
            long j = ((mp0) kd2Var.j(tq1Var)).r;
            ao2 ao2Var = io3.h;
            b90.a(bx7.h(k, j, ao2Var), kd2Var, 0);
            xp0 a4 = vp0.a(new vr(6.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 54);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, vz3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a4);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            b90.a(bx7.h(n03.k(ar5.e(ar5.c(vz3Var, 0.5f), 18.0f), o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
            b90.a(bx7.h(n03.k(ar5.e(ar5.c(vz3Var, 0.55f), 10.0f), o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
            kd2Var.q(true);
            kd2Var.q(true);
            b90.a(bx7.h(n03.k(ar5.e(ar5.l(vz3Var, 120.0f), 38.0f), o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ao5(i, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean g0(h82 h82Var, bg bgVar) {
        h82[] h82VarArr = new h82[16];
        if (!h82Var.x.K) {
            ez2.b("visitChildren called on an unattached node");
        }
        z44 z44Var = new z44(new xz3[16], 0);
        xz3 xz3Var = h82Var.x;
        xz3 xz3Var2 = xz3Var.C;
        if (xz3Var2 == null) {
            wc7.f(z44Var, xz3Var);
        } else {
            z44Var.b(xz3Var2);
        }
        int i = 0;
        while (true) {
            int i2 = z44Var.z;
            if (i2 == 0) {
                break;
            }
            xz3 xz3Var3 = (xz3) z44Var.m(i2 - 1);
            if ((xz3Var3.A & 1024) == 0) {
                wc7.f(z44Var, xz3Var3);
            } else {
                while (true) {
                    if (xz3Var3 == null) {
                        break;
                    }
                    if ((xz3Var3.z & 1024) != 0) {
                        z44 z44Var2 = null;
                        while (xz3Var3 != null) {
                            if (xz3Var3 instanceof h82) {
                                h82 h82Var2 = (h82) xz3Var3;
                                int i3 = i + 1;
                                if (h82VarArr.length < i3) {
                                    int length = h82VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(h82VarArr, 0, r10, 0, length);
                                    h82VarArr = r10;
                                }
                                h82VarArr[i] = h82Var2;
                                i = i3;
                            } else if ((xz3Var3.z & 1024) != 0 && (xz3Var3 instanceof zc1)) {
                                int i4 = 0;
                                for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                    if ((xz3Var4.z & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            xz3Var3 = xz3Var4;
                                        } else {
                                            if (z44Var2 == null) {
                                                z44Var2 = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var3 != null) {
                                                z44Var2.b(xz3Var3);
                                                xz3Var3 = null;
                                            }
                                            z44Var2.b(xz3Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            xz3Var3 = wc7.J(z44Var2);
                        }
                    } else {
                        xz3Var3 = xz3Var3.C;
                    }
                }
            }
        }
        Arrays.sort(h82VarArr, 0, i, k82.y);
        for (int i5 = 0; i5 < i; i5++) {
            h82 h82Var3 = h82VarArr[i5];
            if (bb4.J(h82Var3) && G(h82Var3, bgVar)) {
                return true;
            }
        }
        return false;
    }

    public static final void h(int i, kd2 kd2Var) {
        boolean z;
        ys0 ys0Var = p7.D;
        st0 st0Var = p7.G;
        ys0 ys0Var2 = p7.E;
        st0 st0Var2 = p7.F;
        w50 w50Var = pk2.K;
        kd2Var.f0(-2052091727);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            vz3 vz3Var = vz3.x;
            float f2 = 1.0f;
            yz3 T = n77.T(ar5.c(vz3Var, 1.0f), 14.0f, 0.0f, 2);
            byte b2 = 6;
            xp0 a2 = vp0.a(new vr(14.0f, true, new ze0(b2)), w50Var, kd2Var, 6);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, T);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var2, kd2Var, a2);
            ss5.i(ys0Var2, kd2Var, l);
            h11.q(hashCode, kd2Var, st0Var, kd2Var);
            ss5.i(ys0Var, kd2Var, E);
            kd2Var.e0(892248099);
            int i2 = 0;
            while (i2 < b2) {
                yz3 c2 = ar5.c(vz3Var, f2);
                z75 a3 = y75.a(new vr(12.0f, true, new ze0(b2)), pk2.H, kd2Var, 54);
                int hashCode2 = Long.hashCode(kd2Var.T);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, c2);
                tt0.d.getClass();
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var2, kd2Var, a3);
                ss5.i(ys0Var2, kd2Var, l2);
                h11.q(hashCode2, kd2Var, st0Var, kd2Var);
                ss5.i(ys0Var, kd2Var, E2);
                yz3 k = n03.k(ar5.e(ar5.l(vz3Var, 150.0f), 90.0f), ((cn5) kd2Var.j(dn5.a)).b);
                tq1 tq1Var = op0.a;
                long j = ((mp0) kd2Var.j(tq1Var)).r;
                ao2 ao2Var = io3.h;
                b90.a(bx7.h(k, j, ao2Var), kd2Var, 0);
                ob3 ob3Var = new ob3(f2, true);
                int i3 = i2;
                xp0 a4 = vp0.a(new vr(9.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 54);
                int hashCode3 = Long.hashCode(kd2Var.T);
                al4 l3 = kd2Var.l();
                yz3 E3 = o80.E(kd2Var, ob3Var);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var2, kd2Var, a4);
                ss5.i(ys0Var2, kd2Var, l3);
                h11.q(hashCode3, kd2Var, st0Var, kd2Var);
                ss5.i(ys0Var, kd2Var, E3);
                yz3 e2 = ar5.e(ar5.c(vz3Var, 1.0f), 14.0f);
                o75 o75Var = tm5.b;
                b90.a(bx7.h(n03.k(e2, o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
                b90.a(bx7.h(n03.k(ar5.e(ar5.c(vz3Var, 0.8f), 14.0f), o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
                b90.a(bx7.h(n03.k(ar5.e(ar5.c(vz3Var, 0.4f), 10.0f), o75Var), ((mp0) kd2Var.j(tq1Var)).r, ao2Var), kd2Var, 0);
                kd2Var.q(true);
                kd2Var.q(true);
                i2 = i3 + 1;
                f2 = 1.0f;
                b2 = 6;
            }
            kd2Var.q(false);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ao5(i, (byte) 9);
        }
    }

    public static final long h0(uq4 uq4Var, boolean z) {
        long e2 = xc4.e(uq4Var.c, uq4Var.g);
        if (!z && uq4Var.c()) {
            return 0L;
        }
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r32, final java.lang.Integer r33, float r34, defpackage.kd2 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.i(java.lang.String, java.lang.Integer, float, kd2, int, int):void");
    }

    public static final long i0(CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            if (!d0(codePointBefore)) {
                break;
            }
            i2 -= Character.charCount(codePointBefore);
        }
        while (i < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (!d0(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        return fy5.a(i2, i);
    }

    public static final void j(int i, kd2 kd2Var) {
        boolean z;
        ao2 ao2Var = io3.h;
        kd2Var.f0(743368663);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 K = n77.K(n77.V(vz3Var, 14.0f, 0.0f, 8.0f, 10.0f, 2), n77.d0(kd2Var), 12);
            z75 a2 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.I, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, K);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            kd2Var.e0(1783077899);
            Iterator it = te4.I(89, 80, 122).iterator();
            while (it.hasNext()) {
                b90.a(bx7.h(n03.k(ar5.e(ar5.l(vz3Var, ((Number) it.next()).intValue()), 34.0f), tm5.b), ((mp0) kd2Var.j(op0.a)).r, ao2Var), kd2Var, 0);
            }
            kd2Var.q(false);
            b90.a(bx7.h(n03.k(ar5.e(ar5.l(vz3Var, 48.0f), 34.0f), tm5.b), ((mp0) kd2Var.j(op0.a)).r, ao2Var), kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ao5(i, (byte) 10);
        }
    }

    public static final void j0(cv5 cv5Var, ub2 ub2Var) {
        cv5Var.getClass();
        ub2Var.getClass();
        oa0 c2 = cv5Var.c();
        if (!c2.D()) {
            yf5 yf5Var = c2.x;
            yf5Var.getClass();
            byte[] bArr = yf5Var.a;
            int i = yf5Var.b;
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i, yf5Var.c - i);
            wrap.getClass();
            ub2Var.invoke(wrap);
            int position = wrap.position() - i;
            if (position != 0) {
                if (position >= 0) {
                    if (position <= yf5Var.b()) {
                        c2.skip(position);
                        return;
                    } else {
                        ze0.m("Returned too many bytes");
                        return;
                    }
                }
                ze0.m("Returned negative read bytes count");
                return;
            }
            return;
        }
        ze0.k("Buffer is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(boolean z, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        yz3 yz3Var2;
        boolean z3;
        boolean z4;
        kd2Var.f0(2118386599);
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        char c2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            yz3Var2 = vz3.x;
            yz3 i4 = ar5.i(yz3Var2, 30.0f);
            vo3 c3 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, i4);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c3);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            xh4 H = w65.H(R.drawable.forward, kd2Var, 0);
            long b2 = ep0.b(0.45f, ep0.b);
            n90 n90Var = n90.a;
            yz3 b3 = n90Var.b(yz3Var2);
            int i5 = i3 & 14;
            if (i5 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (z3 || Q == q18Var) {
                Q = new gr5(objArr == true ? 1 : 0, z);
                kd2Var.n0(Q);
            }
            yz3 O = io3.O(b3, (ub2) Q);
            if (vm1.b(1.5f, 0.0f) > 0 && vm1.b(1.5f, 0.0f) > 0) {
                final int i6 = 3;
                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                O = io3.O(O, new ub2() { // from class: e70
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        d70 d70Var;
                        p55 p55Var = (p55) obj;
                        float b4 = p55Var.Q.b() * 1.5f;
                        float b5 = p55Var.Q.b() * 1.5f;
                        if (b4 > 0.0f && b5 > 0.0f) {
                            d70Var = new d70(b4, b5, i6);
                        } else {
                            d70Var = null;
                        }
                        p55Var.f(d70Var);
                        p55Var.k(io3.h);
                        p55Var.e(objArr3);
                        return pn6.a;
                    }
                });
            }
            yt2.a(H, null, O, b2, kd2Var, 3128, 0);
            xh4 H2 = w65.H(R.drawable.forward, kd2Var, 0);
            long j = ep0.e;
            yz3 b4 = n90Var.b(yz3Var2);
            if (i5 == 4) {
                c2 = 1;
            }
            Object Q2 = kd2Var.Q();
            if (c2 == 0 && Q2 != q18Var) {
                z4 = true;
            } else {
                z4 = true;
                Q2 = new gr5(1 == true ? 1 : 0, z);
                kd2Var.n0(Q2);
            }
            yt2.a(H2, null, io3.O(b4, (ub2) Q2), j, kd2Var, 3128, 0);
            kd2Var.q(z4);
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ob(z, yz3Var2, i);
        }
    }

    public static Intent k0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static final void l(er5 er5Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        kd2Var.f0(-2097056435);
        if (kd2Var.f(er5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        byte b2 = 0;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            if (er5Var != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            te4.c(z2, ar5.c, dv1.b(null, 3), dv1.c(null, 3), null, nx7.R(2089286181, new fr5(er5Var, b2), kd2Var), kd2Var, 200112, 16);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(er5Var, i, (byte) 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l0(defpackage.h82 r12, defpackage.h82 r13, int r14, defpackage.bg r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.l0(h82, h82, int, bg):boolean");
    }

    public static final void m(String str, Integer num, yz3 yz3Var, boolean z, float f2, float f3, float f4, float f5, float f6, float f7, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        kd2Var.f0(-669458222);
        if (kd2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (kd2Var.f(num)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (kd2Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i13 = i12 | i4;
        if (kd2Var.c(f2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i14 = i13 | i5;
        if (kd2Var.c(f3)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i15 = i14 | i6;
        if (kd2Var.c(f4)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (kd2Var.c(f5)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if (kd2Var.c(f6)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i18 = i17 | i9;
        if (kd2Var.c(f7)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i19 = i18 | i10;
        boolean z3 = false;
        if ((306783379 & i19) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i19 & 1, z2)) {
            if (z && !vm1.c(f2, Float.NaN)) {
                z3 = true;
            }
            l36.a(ar5.c, null, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(249229997, new kx6(z3, yz3Var, f4, f6, f5, f2, f3, f7, str, num), kd2Var), kd2Var, 12582918, 122);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new kx6(str, num, yz3Var, z, f2, f3, f4, f5, f6, f7, i);
        }
    }

    public static final long m0(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final long n(long j, CharSequence charSequence) {
        int i;
        int i2 = nd6.c;
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        int i5 = 10;
        if (i3 > 0) {
            i = Character.codePointBefore(charSequence, i3);
        } else {
            i = 10;
        }
        if (i4 < charSequence.length()) {
            i5 = Character.codePointAt(charSequence, i4);
        }
        if (e0(i) && (d0(i5) || b0(i5))) {
            do {
                i3 -= Character.charCount(i);
                if (i3 == 0) {
                    break;
                }
                i = Character.codePointBefore(charSequence, i3);
            } while (e0(i));
            return fy5.a(i3, i4);
        }
        if (e0(i5)) {
            if (d0(i) || b0(i)) {
                do {
                    i4 += Character.charCount(i5);
                    if (i4 == charSequence.length()) {
                        break;
                    }
                    i5 = Character.codePointAt(charSequence, i4);
                } while (e0(i5));
                return fy5.a(i3, i4);
            }
            return j;
        }
        return j;
    }

    public static void o(bs5 bs5Var, List list, a05 a05Var) {
        Object obj;
        zz4 zz4Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int c2 = bs5Var.c((ed2) list.get(i));
                int O = bs5Var.O(bs5Var.b, bs5Var.q(c2));
                if (O < bs5Var.f(bs5Var.b, bs5Var.q(c2 + 1))) {
                    obj = bs5Var.c[bs5Var.g(O)];
                } else {
                    obj = au0.a;
                }
                if (obj instanceof zz4) {
                    zz4Var = (zz4) obj;
                } else {
                    zz4Var = null;
                }
                if (zz4Var != null) {
                    zz4Var.a = a05Var;
                }
            }
        }
    }

    public static void p(Activity activity) {
        yr0 yr0Var;
        activity.getClass();
        if (activity instanceof yr0) {
            yr0Var = (yr0) activity;
        } else {
            yr0Var = null;
        }
        if (yr0Var != null) {
            tk4 tk4Var = f;
            if (tk4Var == null || !tk4Var.b(yr0Var)) {
                if (tk4Var != null) {
                    tk4Var.a();
                }
                tk4 tk4Var2 = new tk4(yr0Var, new ui((byte) 12));
                f = tk4Var2;
                WeakReference weakReference = tk4Var2.y;
                yr0 yr0Var2 = (yr0) weakReference.get();
                if (yr0Var2 == null) {
                    tk4Var2.a();
                    return;
                }
                yr0Var2.getLifecycle().a(tk4Var2);
                tk4Var2.z.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, tk4Var2);
                tk4Var2.A = true;
                yr0 yr0Var3 = (yr0) weakReference.get();
                if (yr0Var3 == null) {
                    tk4Var2.a();
                } else {
                    if (!iv.E(yr0Var3)) {
                        return;
                    }
                    yr0Var3.setRequestedOrientation(-1);
                    tk4Var2.a();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean q(defpackage.h82 r7, defpackage.bg r8) {
        /*
            d82 r0 = r7.f1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = f0(r7, r8)
            if (r0 != 0) goto L77
            u72 r0 = r7.c1()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.ze0.l()
            return r2
        L35:
            h82 r0 = defpackage.bb4.C(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            d82 r6 = r0.f1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.ze0.l()
            return r2
        L51:
            defpackage.ze0.m(r5)
            return r2
        L55:
            boolean r1 = q(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = H(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            u72 r7 = r0.c1()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = H(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.ze0.m(r5)
            return r2
        L81:
            boolean r7 = f0(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.q(h82, bg):boolean");
    }

    public static final yz3 r(yz3 yz3Var, y90 y90Var) {
        return yz3Var.w(new w90(y90Var));
    }

    public static int s(int i) {
        if (i < 3) {
            io3.t(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static Object t(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(t80.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable u(defpackage.w42 r5, defpackage.x42 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.m52
            if (r0 == 0) goto L13
            r0 = r7
            m52 r0 = (defpackage.m52) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m52 r0 = new m52
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            w05 r5 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r6 = move-exception
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L30:
            defpackage.m37.N(r7)
            w05 r7 = new w05
            r7.<init>()
            ii r1 = new ii     // Catch: java.lang.Throwable -> L4c
            r4 = 2
            r1.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4c
            r0.x = r7     // Catch: java.lang.Throwable -> L4c
            r0.z = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r5.collect(r1, r0)     // Catch: java.lang.Throwable -> L4c
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L4b
            return r6
        L4b:
            return r3
        L4c:
            r6 = move-exception
            r5 = r7
        L4e:
            java.lang.Object r5 = r5.x
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5a
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7c
        L5a:
            l11 r7 = r0.getContext()
            h95 r0 = defpackage.h95.F
            j11 r7 = r7.get(r0)
            h43 r7 = (defpackage.h43) r7
            if (r7 == 0) goto L7d
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L6f
            goto L7d
        L6f:
            java.util.concurrent.CancellationException r7 = r7.I()
            if (r7 == 0) goto L7d
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7c
            goto L7d
        L7c:
            throw r6
        L7d:
            if (r5 != 0) goto L80
            return r6
        L80:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L88
            defpackage.n03.i(r5, r6)
            throw r5
        L88:
            defpackage.n03.i(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t80.u(w42, x42, xz0):java.io.Serializable");
    }

    public static final boolean v(uq4 uq4Var) {
        if (!uq4Var.c() && !uq4Var.h && uq4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean w(uq4 uq4Var) {
        if (!uq4Var.h && uq4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean x(uq4 uq4Var) {
        if (!uq4Var.c() && uq4Var.h && !uq4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean y(uq4 uq4Var) {
        if (uq4Var.h && !uq4Var.d) {
            return true;
        }
        return false;
    }

    public static void z(int i) {
        if (2 <= i && i < 37) {
            return;
        }
        StringBuilder s = qx1.s(i, "radix ", " was not in valid range ");
        s.append(new d13(2, 36, 1));
        throw new IllegalArgumentException(s.toString());
    }
}
