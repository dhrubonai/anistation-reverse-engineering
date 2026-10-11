package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q81 implements e12 {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final pz2 i = new pz2(new v71((byte) 1));
    public static final pz2 j = new pz2(new v71((byte) 2));
    public boolean b;
    public boolean c;
    public o15 d;
    public w16 e = new p18((byte) 14);
    public boolean f;
    public boolean g;

    @Override // defpackage.e12
    public final void a() {
        synchronized (this) {
        }
    }

    @Override // defpackage.e12
    public final void b(w16 w16Var) {
        synchronized (this) {
            this.e = w16Var;
        }
    }

    @Override // defpackage.e12
    public final synchronized b12[] c() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // defpackage.e12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.b12[] d(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f
            int[] r1 = defpackage.q81.h     // Catch: java.lang.Throwable -> L2f
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2f
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = defpackage.wc7.x(r8)     // Catch: java.lang.Throwable -> L2f
            r4 = -1
            if (r8 == r4) goto L31
            r6.f(r8, r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r7 = move-exception
            goto L55
        L31:
            int r7 = defpackage.wc7.y(r7)     // Catch: java.lang.Throwable -> L2f
            if (r7 == r4) goto L3c
            if (r7 == r8) goto L3c
            r6.f(r7, r0)     // Catch: java.lang.Throwable -> L2f
        L3c:
            r4 = r3
        L3d:
            if (r4 >= r2) goto L4b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2f
            if (r5 == r8) goto L48
            if (r5 == r7) goto L48
            r6.f(r5, r0)     // Catch: java.lang.Throwable -> L2f
        L48:
            int r4 = r4 + 1
            goto L3d
        L4b:
            b12[] r7 = new defpackage.b12[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r7 = r0.toArray(r7)     // Catch: java.lang.Throwable -> L2f
            b12[] r7 = (defpackage.b12[]) r7     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r6)
            return r7
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q81.d(android.net.Uri, java.util.Map):b12[]");
    }

    @Override // defpackage.e12
    public final void e() {
        synchronized (this) {
        }
    }

    public final void f(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new j3());
                return;
            case 1:
                arrayList.add(new l3());
                return;
            case 2:
                arrayList.add(new v6(this.b ? 1 : 0));
                return;
            case 3:
                arrayList.add(new n7(this.c ? 1 : 0));
                return;
            case 4:
                b12 t = i.t(0);
                if (t != null) {
                    arrayList.add(t);
                    return;
                } else {
                    arrayList.add(new c42());
                    return;
                }
            case 5:
                arrayList.add(new c72());
                return;
            case 6:
                arrayList.add(new po3(0, this.e));
                return;
            case 7:
                arrayList.add(new l14(0));
                return;
            case 8:
                w16 w16Var = this.e;
                z62 z62Var = nw2.y;
                arrayList.add(new ya2(w16Var, 704, null, o15.B));
                arrayList.add(new t14(0 | 160, this.e));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new tw4());
                return;
            case 11:
                if (this.d == null) {
                    z62 z62Var2 = nw2.y;
                    this.d = o15.B;
                }
                arrayList.add(new jk6(1, 0, this.e, new tf6(0L), new rb1(0, this.d)));
                return;
            case 12:
                arrayList.add(new z27());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new vk2(this.f ? 1 : 0, (byte) 1));
                return;
            case 15:
                b12 t2 = j.t(new Object[0]);
                if (t2 != null) {
                    arrayList.add(t2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new az(0, this.e));
                return;
            case 17:
                arrayList.add(new f70((byte) 1));
                return;
            case 18:
                arrayList.add(new dz((byte) 1));
                return;
            case 19:
                arrayList.add(new f70((byte) 0));
                return;
            case 20:
                arrayList.add(new vk2(this.g ? 1 : 0, (byte) 0));
                return;
            case 21:
                arrayList.add(new dz((byte) 0));
                return;
        }
    }
}
