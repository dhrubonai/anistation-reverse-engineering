package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.HandwritingGesture;
import androidx.work.impl.WorkDatabase;
import com.anistation.model.Recommendation;
import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class o80 {
    public static final b3 a = new b3(0);
    public static final os0 b = new os0(-945394328, false, new qs0(16));
    public static final os0 c = new os0(-831767446, false, new qs0(17));
    public static final os0 d = new os0(-718140564, false, new qs0(18));
    public static final os0 e = new os0(77547540, false, new qs0(19));
    public static final i18 f = new i18(18);
    public static final p18 g = new p18(23);
    public static final z95 h = new z95(8);

    public static void A(gi6 gi6Var, long j, int i) {
        boolean d2 = nd6.d(j);
        ia6 ia6Var = ia6.x;
        if (d2) {
            ic6 ic6Var = gi6Var.a;
            ic6Var.b.a().n();
            o96 o96Var = ic6Var.b;
            o96Var.F = null;
            gi6Var.l(o96Var);
            ic6Var.b(true, ia6Var);
            ic6Var.f(true);
            ic6Var.e(ic6Var.b.A);
            return;
        }
        long e2 = gi6Var.e(j);
        ic6 ic6Var2 = gi6Var.a;
        ic6Var2.b.a().n();
        o96 o96Var2 = ic6Var2.b;
        int i2 = (int) (e2 >> 32);
        int i3 = (int) (e2 & 4294967295L);
        kk0 kk0Var = o96Var2.y;
        if (i2 < i3) {
            o96Var2.F = new ai4(new pc6(i), new nd6(fy5.a(db.C(i2, 0, kk0Var.length()), db.C(i3, 0, kk0Var.length()))));
            ic6Var2.b(true, ia6Var);
            ic6Var2.f(true);
            ic6Var2.e(ic6Var2.b.A);
            return;
        }
        ze0.k(zo5.m("Do not set reversed or empty range: ", " > ", i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.ue6 r4, defpackage.jc2 r5, java.lang.Throwable r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.g52
            if (r0 == 0) goto L13
            r0 = r7
            g52 r0 = (defpackage.g52) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            g52 r0 = new g52
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.m37.N(r7)
            r0.x = r6     // Catch: java.lang.Throwable -> L27
            r0.z = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L40
            return r5
        L40:
            pn6 r4 = defpackage.pn6.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.n03.i(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.B(ue6, jc2, java.lang.Throwable, xz0):java.lang.Object");
    }

    public static final boolean C(b31 b31Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        if (b31Var.d == null && b31Var.a != null && b31Var.p == Integer.MIN_VALUE) {
            float f2 = b31Var.e;
            if (f2 == -3.4028235E38f || ((i = b31Var.f) != 0 ? !(i != 1 || f2 >= 0.0f) : f2 >= 0.7f)) {
                z = true;
            } else {
                z = false;
            }
            float f3 = b31Var.h;
            if (f3 == -3.4028235E38f || (Math.abs(f3 - 0.5f) <= 0.15f && ((i2 = b31Var.i) == 1 || i2 == Integer.MIN_VALUE))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public static final yz3 D(kd2 kd2Var, yz3 yz3Var) {
        if (yz3Var.d(new hi0((byte) 25))) {
            return yz3Var;
        }
        kd2Var.Z(1219399079, 0, null, null);
        yz3 yz3Var2 = (yz3) yz3Var.i(vz3.x, new o0((Object) kd2Var, (byte) 7));
        kd2Var.q(false);
        return yz3Var2;
    }

    public static final yz3 E(kd2 kd2Var, yz3 yz3Var) {
        kd2Var.e0(439770924);
        yz3 D = D(kd2Var, yz3Var);
        kd2Var.q(false);
        return D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00e2, B:15:0x00ea, B:17:0x00ee, B:19:0x00fa, B:21:0x0106, B:62:0x00bd), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:34:0x0040, B:35:0x0079, B:37:0x0081, B:39:0x008d, B:41:0x0099, B:52:0x0062), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r12v3, types: [r05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.z36 r10, defpackage.b14 r11, defpackage.eb2 r12, defpackage.nq4 r13, defpackage.h30 r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.F(z36, b14, eb2, nq4, h30):java.lang.Object");
    }

    public static void G(long j, ko koVar, boolean z, pz3 pz3Var) {
        if (z) {
            j = t80.n(j, koVar);
        }
        int i = (int) (4294967295L & j);
        pz3Var.invoke(new pj2(new or1[]{new zk5(i, i), new nd1(nd6.e(j), 0)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.wc0 r4, java.nio.ByteBuffer r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.md0
            if (r0 == 0) goto L13
            r0 = r6
            md0 r0 = (defpackage.md0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            md0 r0 = new md0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.z
            int r1 = r0.A
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L2a
            java.nio.ByteBuffer r5 = r0.y
            wc0 r4 = r0.x
            defpackage.m37.N(r6)
            goto L59
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L31:
            defpackage.m37.N(r6)
            boolean r6 = r4.h()
            if (r6 == 0) goto L40
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L40:
            oa0 r6 = r4.g()
            boolean r6 = r6.D()
            if (r6 == 0) goto L59
            r0.x = r4
            r0.y = r5
            r0.A = r3
            java.lang.Object r6 = r4.c(r3, r0)
            w11 r0 = defpackage.w11.x
            if (r6 != r0) goto L59
            return r0
        L59:
            boolean r6 = r4.h()
            if (r6 == 0) goto L65
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L65:
            oa0 r4 = r4.g()
            int r4 = defpackage.mv5.f(r4, r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.H(wc0, java.nio.ByteBuffer, xz0):java.lang.Object");
    }

    public static final void I(pe3 pe3Var, String str, List list, int i, float f2, float f3, vm1 vm1Var, boolean z, ub2 ub2Var) {
        int i2;
        List<String> genres;
        list.getClass();
        ub2Var.getClass();
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Recommendation recommendation = (Recommendation) obj;
                if (!recommendation.getAdult() && (genres = recommendation.getGenres()) != null && !genres.contains("Ecchi")) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Recommendation recommendation2 = (Recommendation) obj2;
            if (vc2.b(recommendation2.getFormat(), recommendation2.getStatus())) {
                arrayList2.add(obj2);
            }
        }
        byte b2 = 1;
        if (arrayList2.isEmpty()) {
            pe3.A0(pe3Var, str.concat("-empty"), new os0(1944745541, true, new dw1(vm1Var, (byte) 2)), 2);
            return;
        }
        if (i < 1) {
            i2 = 1;
        } else {
            i2 = i;
        }
        pe3.A0(pe3Var, null, new os0(1525249770, true, new xz4(f3, (byte) 0)), 3);
        ArrayList d0 = yo0.d0(i2, arrayList2);
        pe3Var.B0(d0.size(), new od(new zg(str, (byte) 18), d0, (byte) 19), new zd(d0, b2), new os0(802480018, true, new yz4(d0, i2, f2, ub2Var, (byte) 0)));
    }

    public static final n80 J(do5 do5Var, kd2 kd2Var, int i) {
        kd2 kd2Var2;
        int i2 = i & 1;
        q18 q18Var = au0.a;
        if (i2 != 0) {
            Object Q = kd2Var.Q();
            if (Q == q18Var) {
                Q = new ui((byte) 22);
                kd2Var.n0(Q);
            }
            kd2Var2 = kd2Var;
            do5Var = zn5.b(false, (ub2) Q, eo5.z, kd2Var2, 0, 49);
        } else {
            kd2Var2 = kd2Var;
        }
        Object Q2 = kd2Var2.Q();
        if (Q2 == q18Var) {
            Q2 = new rs5();
            kd2Var2.n0(Q2);
        }
        rs5 rs5Var = (rs5) Q2;
        boolean f2 = kd2Var2.f(do5Var) | kd2Var2.f(rs5Var);
        Object Q3 = kd2Var2.Q();
        if (f2 || Q3 == q18Var) {
            Q3 = new n80(do5Var, rs5Var);
            kd2Var2.n0(Q3);
        }
        return (n80) Q3;
    }

    public static final String K(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return qx1.m(simpleName, "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final String L(aj5 aj5Var) {
        return yo0.q0(db.r0(0, aj5Var.e()), ", ", aj5Var.a() + '(', ")", new pz3((Object) aj5Var, (byte) 7), 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(defpackage.z36 r12, defpackage.k96 r13, defpackage.nq4 r14, defpackage.h30 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.M(z36, k96, nq4, h30):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, v05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.z36 r11, defpackage.k96 r12, defpackage.nq4 r13, int r14, defpackage.h30 r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.N(z36, k96, nq4, int, h30):java.lang.Object");
    }

    public static final float O(b31 b31Var) {
        float f2 = b31Var.e;
        if (f2 == -3.4028235E38f) {
            return 0.95f;
        }
        int i = b31Var.f;
        if (i != 0 && i == 1 && f2 < 0.0f) {
            return (f2 * 0.053f) + 1.0f;
        }
        return f2;
    }

    public static final z77 P(List list, z77 z77Var) {
        list.getClass();
        boolean b2 = z77Var.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean b3 = z77Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean b4 = z77Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!b2 && b3 && b4) {
            String str = z77Var.c;
            i75 i75Var = new i75((byte) 13);
            e41 e41Var = z77Var.e;
            e41Var.getClass();
            i75Var.s(e41Var.a);
            ((LinkedHashMap) i75Var.y).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            return z77.b(z77Var, null, null, i75Var.f(), 0, 0L, 0, 0, 0L, 0, 33554411);
        }
        return z77Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r41, final defpackage.ub2 r42, defpackage.yz3 r43, final java.lang.String r44, final java.lang.String r45, defpackage.om5 r46, int r47, defpackage.o83 r48, defpackage.m83 r49, defpackage.ic2 r50, defpackage.ic2 r51, boolean r52, defpackage.kd2 r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.a(java.lang.String, ub2, yz3, java.lang.String, java.lang.String, om5, int, o83, m83, ic2, ic2, boolean, kd2, int, int, int):void");
    }

    public static final void b(final ic6 ic6Var, yz3 yz3Var, final String str, om5 om5Var, int i, final o83 o83Var, final he5 he5Var, final ic2 ic2Var, final ic2 ic2Var2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        om5 om5Var2;
        int i8;
        om5 om5Var3;
        int i9;
        kd2Var.f0(-896505361);
        if (kd2Var.f(ic6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4 | 384;
        if (kd2Var.f(str)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5 | 204800;
        if (kd2Var.f(o83Var)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i13 = i12 | i6;
        if (kd2Var.f(he5Var)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i14 = i13 | i7;
        if ((306783379 & i14) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (kd2Var.V(i14 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                om5Var3 = om5Var;
                i9 = i;
            } else {
                om5Var3 = tm5.b;
                i9 = 1;
            }
            kd2Var.r();
            tq1 tq1Var = op0.a;
            long j = ((mp0) kd2Var.j(tq1Var)).o;
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new qd6(j, ep0.b(0.25f, j));
                kd2Var.n0(Q);
            }
            final qd6 qd6Var = (qd6) Q;
            vr vrVar = new vr(10.0f, true, new ze0((byte) 6));
            yz3 c2 = ar5.c(yz3Var, 1.0f);
            xp0 a2 = vp0.a(vrVar, pk2.K, kd2Var, 6);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = E(kd2Var, c2);
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
            kd2Var.e0(1955901089);
            kd2Var.q(false);
            om5Var2 = om5Var3;
            l36.a(ar5.e(ar5.c(vz3.x, 1.0f), 55.0f), om5Var2, ((mp0) kd2Var.j(tq1Var)).p, 0L, 0.0f, 0.0f, null, nx7.R(-774846146, new ic2() { // from class: vh
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    st0 st0Var;
                    st0 st0Var2;
                    boolean z3;
                    kd2 kd2Var2 = (kd2) obj;
                    int intValue = ((Integer) obj2).intValue();
                    y50 y50Var = pk2.C;
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z2)) {
                        x50 x50Var = pk2.I;
                        p18 p18Var = x97.B;
                        vz3 vz3Var = vz3.x;
                        yz3 S = n77.S(ar5.c(vz3Var, 1.0f), 15.0f, 12.0f);
                        z75 a3 = y75.a(p18Var, x50Var, kd2Var2, 54);
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, S);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z4 = kd2Var2.S;
                        t53 t53Var = za3.p0;
                        if (z4) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        st0 st0Var3 = p7.F;
                        ss5.i(st0Var3, kd2Var2, a3);
                        ys0 ys0Var = p7.E;
                        ss5.i(ys0Var, kd2Var2, l2);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        st0 st0Var4 = p7.G;
                        ss5.i(st0Var4, kd2Var2, valueOf);
                        ss5.h(kd2Var2);
                        ys0 ys0Var2 = p7.D;
                        ss5.i(ys0Var2, kd2Var2, E2);
                        ic2 ic2Var3 = ic2.this;
                        if (ic2Var3 == null) {
                            kd2Var2.e0(18987056);
                            kd2Var2.q(false);
                            st0Var2 = st0Var4;
                            st0Var = st0Var3;
                        } else {
                            kd2Var2.e0(18987057);
                            st0Var = st0Var3;
                            st0Var2 = st0Var4;
                            yz3 V = n77.V(vz3Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                            vo3 c3 = b90.c(y50Var, false);
                            int hashCode3 = Long.hashCode(kd2Var2.T);
                            al4 l3 = kd2Var2.l();
                            yz3 E3 = o80.E(kd2Var2, V);
                            kd2Var2.h0();
                            if (kd2Var2.S) {
                                kd2Var2.k(t53Var);
                            } else {
                                kd2Var2.q0();
                            }
                            ss5.i(st0Var, kd2Var2, c3);
                            ss5.i(ys0Var, kd2Var2, l3);
                            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                            ss5.i(ys0Var2, kd2Var2, E3);
                            ic2Var3.invoke(kd2Var2, 0);
                            kd2Var2.q(true);
                            kd2Var2.q(false);
                        }
                        kb0.b(rd6.a.a(qd6Var), nx7.R(1243711074, new fj(ic6Var, o83Var, he5Var, str), kd2Var2), kd2Var2, 56);
                        ic2 ic2Var4 = ic2Var2;
                        if (ic2Var4 == null) {
                            kd2Var2.e0(21134798);
                            kd2Var2.q(false);
                            z3 = true;
                        } else {
                            kd2Var2.e0(21134799);
                            yz3 V2 = n77.V(vz3Var, 5.0f, 0.0f, 0.0f, 0.0f, 14);
                            vo3 c4 = b90.c(y50Var, false);
                            int hashCode4 = Long.hashCode(kd2Var2.T);
                            al4 l4 = kd2Var2.l();
                            yz3 E4 = o80.E(kd2Var2, V2);
                            kd2Var2.h0();
                            if (kd2Var2.S) {
                                kd2Var2.k(t53Var);
                            } else {
                                kd2Var2.q0();
                            }
                            ss5.i(st0Var, kd2Var2, c4);
                            ss5.i(ys0Var, kd2Var2, l4);
                            h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
                            ss5.i(ys0Var2, kd2Var2, E4);
                            ic2Var4.invoke(kd2Var2, 0);
                            z3 = true;
                            kd2Var2.q(true);
                            kd2Var2.q(false);
                        }
                        kd2Var2.q(z3);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, 12582912, 120);
            kd2Var.q(true);
            i8 = i9;
        } else {
            kd2Var.Y();
            om5Var2 = om5Var;
            i8 = i;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new wh(ic6Var, yz3Var, str, om5Var2, i8, o83Var, he5Var, ic2Var, ic2Var2, i2);
        }
    }

    public static final void c(final os0 os0Var, final yz3 yz3Var, final n80 n80Var, final float f2, float f3, final om5 om5Var, final long j, long j2, float f4, final os0 os0Var2, boolean z, jc2 jc2Var, final long j3, long j4, final os0 os0Var3, kd2 kd2Var, final int i, final int i2) {
        int i3;
        int i4;
        float f5;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        kd2 kd2Var2;
        final long j5;
        final float f6;
        final boolean z3;
        final jc2 jc2Var2;
        final long j6;
        float f7;
        jc2 jc2Var3;
        long a2;
        long j7;
        float f8;
        boolean z4;
        int i9;
        kd2Var.f0(920075480);
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 = i | i9;
        } else {
            i3 = i;
        }
        if (kd2Var.f(n80Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i3 | i4;
        int i11 = i2 & 16;
        if (i11 != 0) {
            i6 = i10 | 24576;
            f5 = f3;
        } else {
            f5 = f3;
            if (kd2Var.c(f5)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i10 | i5;
        }
        if (kd2Var.f(om5Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i12 = i6 | i7;
        if (kd2Var.e(j)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i13 = i12 | i8 | 910163968;
        if ((306783379 & i13) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var.V(i13 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                j7 = j2;
                z4 = z;
                jc2Var3 = jc2Var;
                a2 = j4;
                f8 = f4;
            } else {
                if (i11 != 0) {
                    f7 = x70.c;
                } else {
                    f7 = f5;
                }
                long a3 = op0.a(j, kd2Var);
                float f9 = x70.b;
                jc2Var3 = ss0.a;
                a2 = op0.a(j3, kd2Var);
                j7 = a3;
                f5 = f7;
                f8 = f9;
                z4 = true;
            }
            kd2Var.r();
            yz3 h2 = bx7.h(yz3Var.w(ar5.c), j3, io3.h);
            vo3 c2 = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            long j8 = a2;
            mw4 a4 = ey0.a.a(new ep0(j8));
            kd2Var2 = kd2Var;
            long j9 = j7;
            kb0.b(a4, nx7.R(999829022, new e80(n80Var, os0Var3, f2, f5, z4, om5Var, j, j9, f8, os0Var2, os0Var, jc2Var3), kd2Var2), kd2Var2, 56);
            kd2Var2.q(true);
            j5 = j9;
            f6 = f8;
            jc2Var2 = jc2Var3;
            j6 = j8;
            z3 = z4;
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
            j5 = j2;
            f6 = f4;
            z3 = z;
            jc2Var2 = jc2Var;
            j6 = j4;
        }
        final float f10 = f5;
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: z70
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i | 1);
                    o80.c(os0.this, yz3Var, n80Var, f2, f10, om5Var, j, j5, f6, os0Var2, z3, jc2Var2, j3, j6, os0Var3, (kd2) obj, N, i2);
                    return pn6.a;
                }
            };
        }
    }

    public static final void d(os0 os0Var, os0 os0Var2, os0 os0Var3, sb2 sb2Var, do5 do5Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        kd2Var.f0(-1217723575);
        if (kd2Var.h(null)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (kd2Var.h(sb2Var)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i6 = i5 | i3;
        if (kd2Var.f(do5Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i7 = i6 | i4;
        byte b2 = 0;
        if ((74899 & i7) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            List I = te4.I(ss0.b, os0Var, os0Var2, os0Var3);
            if ((458752 & i7) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (z4 || Q == obj) {
                Q = new g80(do5Var, sb2Var);
                kd2Var.n0(Q);
            }
            f24 f24Var = (f24) Q;
            os0 os0Var4 = new os0(1271844412, true, new oa3(I, b2));
            boolean f2 = kd2Var.f(f24Var);
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == obj) {
                Q2 = new g24(f24Var);
                kd2Var.n0(Q2);
            }
            vo3 vo3Var = (vo3) Q2;
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = E(kd2Var, vz3.x);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, vo3Var);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            os0Var4.invoke(kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ni(os0Var, os0Var2, os0Var3, sb2Var, do5Var, i, (byte) 1);
        }
    }

    public static final void e(sb2 sb2Var, yz3 yz3Var, be3 be3Var, td3 td3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        kd2Var.f0(1055276397);
        if (kd2Var.h(sb2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (kd2Var.f(yz3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.f(be3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.f(td3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            n03.f(nx7.R(-933153643, new sd3(be3Var, yz3Var, td3Var, xt5.h(sb2Var, kd2Var), (byte) 0), kd2Var), kd2Var, 6);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new fj(sb2Var, yz3Var, be3Var, td3Var, i, (byte) 7);
        }
    }

    public static final void f(final boolean z, final List list, final SubtitleStyleSettings subtitleStyleSettings, final yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        final List list2;
        final SubtitleStyleSettings subtitleStyleSettings2;
        final yz3 yz3Var2;
        final int i3;
        int i4;
        int i5;
        boolean h2;
        int i6;
        int i7;
        list.getClass();
        subtitleStyleSettings.getClass();
        kd2Var.f0(1718694297);
        if ((i & 6) == 0) {
            if (kd2Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h2 = kd2Var.f(list);
            } else {
                h2 = kd2Var.h(list);
            }
            if (h2) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(subtitleStyleSettings)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            if (!z) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    final byte b2 = 0;
                    u.d = new ic2() { // from class: pp4
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b2;
                            pn6 pn6Var = pn6.a;
                            int i8 = i;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int N = kb0.N(i8 | 1);
                                    o80.f(z, list, subtitleStyleSettings, yz3Var, (kd2) obj, N);
                                    return pn6Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int N2 = kb0.N(i8 | 1);
                                    o80.f(z, list, subtitleStyleSettings, yz3Var, (kd2) obj, N2);
                                    return pn6Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z;
            list2 = list;
            i3 = i;
            boolean z4 = false;
            subtitleStyleSettings2 = subtitleStyleSettings;
            yz3Var2 = yz3Var;
            yz3 w = yz3Var2.w(ar5.c);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new c94((byte) 26);
                kd2Var.n0(Q);
            }
            ub2 ub2Var = (ub2) Q;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && kd2Var.h(list2))) {
                z4 = true;
            }
            boolean h3 = z4 | kd2Var.h(subtitleStyleSettings2);
            Object Q2 = kd2Var.Q();
            if (h3 || Q2 == q18Var) {
                Q2 = new r82(list2, subtitleStyleSettings2, (byte) 18);
                kd2Var.n0(Q2);
            }
            a34.b(ub2Var, w, (ub2) Q2, kd2Var, 6);
        } else {
            z3 = z;
            list2 = list;
            subtitleStyleSettings2 = subtitleStyleSettings;
            yz3Var2 = yz3Var;
            i3 = i;
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            final boolean z5 = z3;
            final byte b3 = 1;
            u2.d = new ic2() { // from class: pp4
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    byte b32 = b3;
                    pn6 pn6Var = pn6.a;
                    int i8 = i3;
                    switch (b32) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int N = kb0.N(i8 | 1);
                            o80.f(z5, list2, subtitleStyleSettings2, yz3Var2, (kd2) obj, N);
                            return pn6Var;
                        default:
                            ((Integer) obj2).getClass();
                            int N2 = kb0.N(i8 | 1);
                            o80.f(z5, list2, subtitleStyleSettings2, yz3Var2, (kd2) obj, N2);
                            return pn6Var;
                    }
                }
            };
        }
    }

    public static final void g(final sb2 sb2Var, final yz3 yz3Var, long j, long j2, kd2 kd2Var, final int i) {
        int i2;
        boolean z;
        final long j3;
        final long j4;
        long j5;
        int i3;
        boolean z2;
        int i4;
        sb2Var.getClass();
        kd2Var.f0(-1589543565);
        if (kd2Var.h(sb2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        int i6 = i5 | 1152;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i3 = i6 & (-8065);
                j5 = j;
                j4 = j2;
            } else {
                tq1 tq1Var = op0.a;
                j5 = ((mp0) kd2Var.j(tq1Var)).o;
                j4 = ((mp0) kd2Var.j(tq1Var)).r;
                i3 = i6 & (-8065);
            }
            kd2Var.r();
            o75 o75Var = tm5.b;
            yz3 k = n03.k(yz3Var, o75Var);
            ao2 ao2Var = io3.h;
            yz3 h2 = bx7.h(k, j4, ao2Var);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            yz3 g2 = oi4.g(bx7.h(n03.k(ar5.b, o75Var), j5, ao2Var));
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = kd2Var.Q();
            if (z2 || Q == au0.a) {
                Q = new sm0(sb2Var, (byte) 3);
                kd2Var.n0(Q);
            }
            b90.a(tl7.A(g2, (jc2) Q), kd2Var, 0);
            kd2Var.q(true);
            j3 = j5;
        } else {
            kd2Var.Y();
            j3 = j;
            j4 = j2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: rp5
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o80.g(sb2.this, yz3Var, j3, j4, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final do5 do5Var, final float f2, final float f3, final boolean z, final om5 om5Var, final long j, final long j2, final float f4, final os0 os0Var, final os0 os0Var2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        boolean z2;
        boolean z3;
        Object a80Var;
        Object obj;
        float f5;
        do5 do5Var2;
        byte b2;
        yz3 yz3Var;
        byte b3;
        boolean z4;
        kd2Var.f0(-2108849428);
        if (kd2Var.f(do5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (kd2Var.c(f2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (kd2Var.c(f3)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i14 = i13 | i4;
        if (kd2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (kd2Var.f(om5Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (kd2Var.e(j)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i17 = i16 | i7;
        if (kd2Var.e(j2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (kd2Var.c(0.0f)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (kd2Var.c(f4)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10;
        if (kd2Var.h(os0Var)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i21 = i20 | i11;
        if (kd2Var.h(os0Var2)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if ((i21 & 306783379) == 306783378 && (c2 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var.V(i21 & 1, z2)) {
            z04 z04Var = z04.x;
            tw5 N = sw0.N(z04Var, kd2Var);
            tw5 N2 = sw0.N(z04Var, kd2Var);
            tw5 N3 = sw0.N(z04.A, kd2Var);
            int i22 = i21 & 14;
            if (i22 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z3 | kd2Var.h(N2) | kd2Var.h(N3) | kd2Var.h(N);
            Object Q = kd2Var.Q();
            Object obj2 = au0.a;
            if (!h2 && Q != obj2) {
                do5Var2 = do5Var;
                a80Var = Q;
                f5 = 0.0f;
                obj = obj2;
            } else {
                obj = obj2;
                f5 = 0.0f;
                a80Var = new a80(do5Var, N2, N3, N, (byte) 0);
                do5Var2 = do5Var;
                kd2Var.n0(a80Var);
            }
            db.m((sb2) a80Var, kd2Var);
            Object Q2 = kd2Var.Q();
            if (Q2 == obj) {
                Q2 = db.L(kd2Var);
                kd2Var.n0(Q2);
            }
            v11 v11Var = (v11) Q2;
            float g0 = ((ud1) kd2Var.j(bv0.h)).g0(f2);
            vz3 vz3Var = vz3.x;
            if (z) {
                kd2Var.e0(2049456610);
                boolean f6 = kd2Var.f(do5Var2.e);
                Object Q3 = kd2Var.Q();
                if (f6 || Q3 == obj) {
                    b0 b0Var = new b0(v11Var, do5Var2, (byte) 20);
                    sk6 sk6Var = zn5.a;
                    Q3 = new yn5(do5Var2, b0Var);
                    kd2Var.n0(Q3);
                }
                yz3Var = v94.C(vz3Var, (d84) Q3, null);
                b2 = 0;
                kd2Var.q(false);
            } else {
                b2 = 0;
                kd2Var.e0(2049851798);
                kd2Var.q(false);
                yz3Var = vz3Var;
            }
            byte b4 = b2;
            yz3 w = ar5.c(ar5.n(vz3Var, 0.0f, f3, 1), 1.0f).w(new zq5(0.0f, f2, 0.0f, Float.NaN, false, 5)).w(yz3Var);
            d9 d9Var = do5Var2.e;
            if (i22 == 4) {
                b3 = 1;
            } else {
                b3 = b4;
            }
            boolean z5 = (kd2Var.c(g0) ? 1 : 0) | b3;
            Object Q4 = kd2Var.Q();
            if (z5 != 0 || Q4 == obj) {
                Q4 = new a30(do5Var2, g0);
                kd2Var.n0(Q4);
            }
            yz3 y = h41.y(w, d9Var, (ic2) Q4);
            d9 d9Var2 = do5Var2.e;
            rt3 rt3Var = d9Var2.f;
            if (d9Var2.k.getValue() != null) {
                z4 = 1;
            } else {
                z4 = b4;
            }
            a8 a8Var = new a8(d9Var2, null);
            int i23 = i21 >> 9;
            l36.a(io3.O(ro1.a(y, rt3Var, rg4.x, z, null, z4, a8Var, false, 32), new y70(do5Var, b4)), om5Var, j, j2, f5, f4, null, nx7.R(1508311921, new l80(do5Var, os0Var, os0Var2, v11Var, z), kd2Var), kd2Var, (i23 & 458752) | (i23 & 112) | 12582912 | (i23 & 896) | (i23 & 7168) | (57344 & i23), 64);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(f2, f3, z, om5Var, j, j2, f4, os0Var, os0Var2, i) { // from class: b80
                public final /* synthetic */ boolean A;
                public final /* synthetic */ om5 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ float E;
                public final /* synthetic */ os0 F;
                public final /* synthetic */ os0 G;
                public final /* synthetic */ float y;
                public final /* synthetic */ float z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int N4 = kb0.N(1);
                    o80.h(do5.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (kd2) obj3, N4);
                    return pn6.a;
                }
            };
        }
    }

    public static final Context j(dc5 dc5Var) {
        try {
            return (Context) dc5Var.d(z05.a(Context.class), null, null);
        } catch (w94 unused) {
            throw new y0("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", (byte) 4);
        }
    }

    public static final xh4 k(mu2 mu2Var, Context context) {
        if (mu2Var instanceof o60) {
            q60 q60Var = new q60(new pc(((o60) mu2Var).a), (r8.getWidth() << 32) | (r8.getHeight() & 4294967295L));
            q60Var.E = true;
            return q60Var;
        }
        if (mu2Var instanceof gp1) {
            Drawable mutate = sw0.f(mu2Var, context.getResources()).mutate();
            mutate.setFilterBitmap(true);
            return new ip1(mutate);
        }
        return new yu2(mu2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.z36 r6, defpackage.h30 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ah5
            if (r0 == 0) goto L13
            r0 = r7
            ah5 r0 = (defpackage.ah5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ah5 r0 = new ah5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            z36 r6 = r0.x
            defpackage.m37.N(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.m37.N(r7)
        L31:
            r0.x = r6
            r0.z = r2
            oq4 r7 = defpackage.oq4.y
            java.lang.Object r7 = r6.d(r7, r0)
            w11 r1 = defpackage.w11.x
            if (r7 != r1) goto L40
            return r1
        L40:
            nq4 r7 = (defpackage.nq4) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            uq4 r5 = (defpackage.uq4) r5
            boolean r5 = defpackage.t80.v(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.l(z36, h30):java.lang.Object");
    }

    public static final Object m(yq4 yq4Var, b14 b14Var, k96 k96Var, vz0 vz0Var) {
        a46 a46Var = (a46) yq4Var;
        a46Var.getClass();
        Object t = n77.t(yq4Var, new lt4(new eb2(wc7.O(a46Var).X), b14Var, k96Var, null), vz0Var);
        if (t == w11.x) {
            return t;
        }
        return pn6.a;
    }

    public static final void n(ub2 ub2Var, Object obj, l11 l11Var) {
        er0 o = o(ub2Var, obj, null);
        if (o != null) {
            h98.z(l11Var, o);
        }
    }

    public static final er0 o(ub2 ub2Var, Object obj, er0 er0Var) {
        try {
            ub2Var.invoke(obj);
            return er0Var;
        } catch (Throwable th) {
            if (er0Var != null && er0Var.getCause() != th) {
                n03.i(er0Var, th);
                return er0Var;
            }
            return new er0("Exception in undelivered element handler for " + obj, th, (byte) 7);
        }
    }

    public static final void p(vz4 vz4Var, Throwable th) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            cancellationException = z51.b("Channel was consumed, consumer had failed", th);
        }
        vz4Var.l(cancellationException);
    }

    public static final void q(WorkDatabase workDatabase, pv0 pv0Var, c77 c77Var) {
        int i;
        workDatabase.getClass();
        pv0Var.getClass();
        ArrayList J = te4.J(c77Var);
        int i2 = 0;
        while (!J.isEmpty()) {
            List list = ((c77) dp0.b0(J)).d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((w77) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 != 0) {
            int countNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
            if (countNonFinishedContentUriTriggerWorkers + i2 <= 8) {
                return;
            }
            ze0.k(qx1.l("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", countNonFinishedContentUriTriggerWorkers, ";\ncurrent enqueue operation count: ", i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }

    public static final void r(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    p65.b();
                    return;
                }
            }
            try {
                zo5.v(autoCloseable);
            } catch (Throwable th2) {
                n03.i(th, th2);
            }
        }
    }

    public static yz3 s(yz3 yz3Var, jc2 jc2Var) {
        return yz3Var.w(new zt0(jc2Var));
    }

    public static int t(gi6 gi6Var, HandwritingGesture handwritingGesture) {
        String fallbackText;
        ic6 ic6Var = gi6Var.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        o96Var.F = null;
        gi6Var.l(o96Var);
        ic6Var.b(true, ia6.x);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        gi6.h(gi6Var, fallbackText, false, false, 28);
        return 5;
    }

    public static int u(HandwritingGesture handwritingGesture, pz3 pz3Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        pz3Var.invoke(new mq0(fallbackText, 1));
        return 5;
    }

    public static final long v(g85 g85Var) {
        if (y(g85Var) == 0) {
            return -1L;
        }
        m85 s0 = g85Var.s0("SELECT last_insert_rowid()");
        try {
            s0.p0();
            long j = s0.getLong(0);
            r(s0, null);
            return j;
        } finally {
        }
    }

    public static final am3 w(am3 am3Var) {
        za3 za3Var;
        za3 za3Var2 = am3Var.R.R;
        while (true) {
            za3 v = za3Var2.v();
            za3 za3Var3 = null;
            if (v != null) {
                za3Var = v.E;
            } else {
                za3Var = null;
            }
            if (za3Var != null) {
                za3 v2 = za3Var2.v();
                if (v2 != null) {
                    za3Var3 = v2.E;
                }
                za3Var3.getClass();
                za3 v3 = za3Var2.v();
                v3.getClass();
                za3Var2 = v3.E;
                za3Var2.getClass();
            } else {
                am3 W0 = ((fa4) za3Var2.c0.B).W0();
                W0.getClass();
                return W0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.n75 x(android.view.Display r3, int r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = defpackage.sh1.k(r3, r4)
            if (r3 == 0) goto L36
            n75 r4 = new n75
            int r0 = defpackage.lr3.a(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = defpackage.qx1.h(r0, r3)
            defpackage.ze0.k(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = defpackage.lr3.A(r3)
            android.graphics.Point r3 = defpackage.lr3.b(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o80.x(android.view.Display, int):n75");
    }

    public static final int y(g85 g85Var) {
        m85 s0 = g85Var.s0("SELECT changes()");
        try {
            s0.p0();
            int i = (int) s0.getLong(0);
            r(s0, null);
            return i;
        } finally {
        }
    }

    public static final int z(aj5 aj5Var, aj5[] aj5VarArr) {
        boolean z;
        boolean z2;
        int i;
        aj5VarArr.getClass();
        int hashCode = (aj5Var.a().hashCode() * 31) + Arrays.hashCode(aj5VarArr);
        int e2 = aj5Var.e();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (e2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = e2 - 1;
            int i5 = i2 * 31;
            String a2 = aj5Var.h(aj5Var.e() - e2).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i5 + i3;
            e2 = i4;
        }
        int e3 = aj5Var.e();
        int i6 = 1;
        while (true) {
            if (e3 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = e3 - 1;
                int i8 = i6 * 31;
                hj5 kind = aj5Var.h(aj5Var.e() - e3).getKind();
                if (kind != null) {
                    i = kind.hashCode();
                } else {
                    i = 0;
                }
                i6 = i8 + i;
                e3 = i7;
            } else {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
        }
    }

    public int i(int i, int i2, ia3 ia3Var) {
        return Math.round((1.0f - 1.0f) * ((i - i2) / 2.0f));
    }
}
