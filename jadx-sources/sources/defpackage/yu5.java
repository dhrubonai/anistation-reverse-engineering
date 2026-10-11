package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yu5 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r27, final java.lang.String r28, final float r29, final defpackage.do0 r30, final defpackage.ub2 r31, final defpackage.sb2 r32, int r33, defpackage.kd2 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu5.a(java.lang.String, java.lang.String, float, do0, ub2, sb2, int, kd2, int, int):void");
    }

    public static boolean b(xr1 xr1Var) {
        int i = 0;
        while (true) {
            nw2 nw2Var = xr1Var.a;
            nw2 nw2Var2 = xr1Var.b;
            if (i < nw2Var.size()) {
                if ((nw2Var.get(i) instanceof ew5) || ((zv) nw2Var.get(i)).j(1000000000L) != 1000000000) {
                    return true;
                }
                i++;
            } else {
                for (int i2 = 0; i2 < nw2Var2.size(); i2++) {
                }
                return false;
            }
        }
    }

    public static final List e(nd6 nd6Var, z44 z44Var) {
        if (z44Var != null && z44Var.z != 0) {
            return yo0.I0(z44Var.g());
        }
        if (nd6Var != null) {
            long j = nd6Var.a;
            if (!nd6.d(j)) {
                return te4.H(new jo(nd6.g(j), nd6.f(j), new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, g96.c, (km5) null, 61439)));
            }
        }
        return nt1.x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0165, code lost:
    
        if (r4.equals("bmp") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r4, defpackage.ar3 r5) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu5.f(android.content.Context, ar3):java.lang.String");
    }

    public static int g(String str) {
        int h = qy3.h(str);
        if (h == 4) {
            return 2;
        }
        return h;
    }

    public static final lc6 h(o96 o96Var) {
        yd6 yd6Var = o96Var.z;
        if (yd6Var != null) {
            return new lc6(new yd6(yd6Var, false), o96Var.y.length());
        }
        return null;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = w64.y;
            }
        } else if (collection instanceof cx2) {
            obj = ((cx2) collection).A;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static float j(ea2 ea2Var, nw2 nw2Var) {
        int i;
        int i2;
        int i3 = ea2Var.C;
        int i4 = ea2Var.x;
        int i5 = ea2Var.w;
        int i6 = i3 % 180;
        if (i6 == 0) {
            i = i5;
        } else {
            i = i4;
        }
        if (i6 == 0) {
            i2 = i4;
        } else {
            i2 = i5;
        }
        float f = 0.0f;
        for (int i7 = 0; i7 < nw2Var.size(); i7++) {
            wr1 wr1Var = (wr1) nw2Var.get(i7);
            if (wr1Var instanceof ne2) {
                ne2 ne2Var = (ne2) wr1Var;
                if (wr1Var instanceof za5) {
                    float f2 = ((za5) wr1Var).a;
                    if (f2 % 90.0f == 0.0f) {
                        f += f2;
                        float f3 = f % 180.0f;
                        if (f3 == 0.0f) {
                            i = i5;
                        } else {
                            i = i4;
                        }
                        if (f3 == 0.0f) {
                            i2 = i4;
                        } else {
                            i2 = i5;
                        }
                    } else {
                        return -1.0f;
                    }
                } else if (!ne2Var.d(i, i2)) {
                    return -1.0f;
                }
            } else {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static void k(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            c4.h(window, z);
            return;
        }
        if (i2 >= 30) {
            c4.g(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-1793);
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }

    public static final void l(ic6 ic6Var, String str) {
        o96 g = ic6Var.g();
        ti4 ti4Var = ic6Var.c;
        try {
            g.c(str, 0, g.y.length());
            ss5.g(g);
            ic6Var.a(g);
        } finally {
            ti4Var.setValue(Boolean.FALSE);
            ic6Var.f(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:28:0x00bc->B:34:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00ba, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(defpackage.es7 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu5.m(es7, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void o(es7 es7Var, SQLiteDatabase sQLiteDatabase) {
        if (es7Var != null) {
            bs7 bs7Var = es7Var.F;
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                bs7Var.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                bs7Var.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                bs7Var.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                bs7Var.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        ze0.k("Monitor must not be null");
    }

    public abstract String c(byte[] bArr, int i, int i2);

    public abstract int d(String str, byte[] bArr, int i, int i2);

    public void n(e88 e88Var, Thread thread) {
        b88.a.lazySet(e88Var, thread);
    }

    public void p(e88 e88Var, e88 e88Var2) {
        b88.b.lazySet(e88Var, e88Var2);
    }

    public boolean q(f88 f88Var, e88 e88Var, e88 e88Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b88.c;
        while (!atomicReferenceFieldUpdater.compareAndSet(f88Var, e88Var, e88Var2)) {
            if (atomicReferenceFieldUpdater.get(f88Var) != e88Var) {
                return false;
            }
        }
        return true;
    }

    public boolean r(f88 f88Var, z78 z78Var, z78 z78Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b88.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(f88Var, z78Var, z78Var2)) {
            if (atomicReferenceFieldUpdater.get(f88Var) != z78Var) {
                return false;
            }
        }
        return true;
    }

    public e88 s(f88 f88Var) {
        return (e88) b88.c.getAndSet(f88Var, e88.c);
    }

    public z78 t(f88 f88Var) {
        return (z78) b88.d.getAndSet(f88Var, z78.d);
    }

    public boolean u(f88 f88Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b88.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(f88Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f88Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
