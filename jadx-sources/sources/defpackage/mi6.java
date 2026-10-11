package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mi6 implements zs {
    public final int a;
    public final qr1 b;
    public final ou0 c;
    public final bi6 d;
    public final i18 e;
    public final fc1 f;
    public final kz g;
    public final LogSessionId h;
    public long i;
    public final /* synthetic */ ni6 j;

    public mi6(ni6 ni6Var, int i, ou0 ou0Var, bi6 bi6Var, i18 i18Var, fc1 fc1Var, kz kzVar, LogSessionId logSessionId) {
        this.j = ni6Var;
        this.a = i;
        this.b = (qr1) ((rr1) ou0Var.b.get(i)).a.get(0);
        this.c = ou0Var;
        this.d = bi6Var;
        this.e = i18Var;
        this.f = fc1Var;
        this.g = kzVar;
        this.h = logSessionId;
    }

    public final void a(ea2 ea2Var) {
        boolean z;
        boolean z2;
        ea2 ea2Var2;
        long j;
        int i;
        boolean z3;
        boolean z4;
        String str = ea2Var.p;
        int g = yu5.g(str);
        ni6 ni6Var = this.j;
        dn0 dn0Var = ni6Var.d;
        zp2 zp2Var = ni6Var.l;
        if (((c95) ((SparseArray) zp2Var.y).get(g)) == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        SparseArray sparseArray = ((ji6) ((ArrayList) zp2Var.x).get(this.a)).a;
        String str2 = eq6.a;
        if (sparseArray.indexOfKey(g) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.B(z2);
        ea2 ea2Var3 = (ea2) sparseArray.get(g);
        boolean i2 = qy3.i(str);
        kz kzVar = this.g;
        ou0 ou0Var = this.c;
        if (i2) {
            zp2Var.F(1, new jw(ea2Var3, ea2Var, this.d, this.b, ou0Var.d.a, this.e, dn0Var, ni6Var.n, kzVar, this.h));
            return;
        }
        if (qy3.m(str)) {
            if (this.d.d == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            hp0 hp0Var = ea2Var3.H;
            if (hp0Var == null || !hp0Var.f()) {
                hp0Var = hp0.h;
            }
            if (z4 && hp0.h(hp0Var)) {
                hp0Var = hp0.h;
            }
            da2 a = ea2Var3.a();
            a.G = hp0Var;
            ea2Var2 = new ea2(a);
        } else if (qy3.k(str)) {
            da2 a2 = ea2Var.a();
            hp0 hp0Var2 = ea2Var.H;
            if (hp0Var2 == null || !hp0Var2.f()) {
                hp0Var2 = hp0.h;
            }
            a2.G = hp0Var2;
            ea2Var2 = new ea2(a2);
        } else {
            throw oz1.d(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
        }
        Context context = ni6Var.a;
        l68 l68Var = ou0Var.c;
        nw2 nw2Var = ou0Var.d.b;
        t54 t54Var = ni6Var.n;
        xv3 xv3Var = new xv3(this, (byte) 16);
        ea2 ea2Var4 = ea2Var2;
        long j2 = ni6Var.g;
        ArrayList arrayList = (ArrayList) zp2Var.x;
        if (arrayList.size() < 2) {
            j = j2;
            i = 2;
        } else {
            int i3 = 0;
            int i4 = 0;
            while (i3 < arrayList.size()) {
                long j3 = j2;
                if (((ji6) arrayList.get(i3)).a.indexOfKey(2) >= 0) {
                    i4++;
                }
                i3++;
                j2 = j3;
            }
            j = j2;
            i = 2;
            if (i4 > 1) {
                z3 = true;
                zp2Var.F(i, new nt6(context, ea2Var4, this.d, l68Var, nw2Var, this.f, dn0Var, t54Var, xv3Var, kzVar, j, z3, ni6Var.t, this.h));
            }
        }
        z3 = false;
        zp2Var.F(i, new nt6(context, ea2Var4, this.d, l68Var, nw2Var, this.f, dn0Var, t54Var, xv3Var, kzVar, j, z3, ni6Var.t, this.h));
    }

    @Override // defpackage.zs
    public final void b(oz1 oz1Var) {
        this.j.d(oz1Var);
    }

    @Override // defpackage.zs
    public final void c(int i) {
        if (i <= 0) {
            b(oz1.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), 1001));
            return;
        }
        synchronized (this.j.k) {
            zp2 zp2Var = this.j.l;
            ((ji6) ((ArrayList) zp2Var.x).get(this.a)).b = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:12:0x002e, B:14:0x0037, B:15:0x0049, B:17:0x004f, B:24:0x0067, B:26:0x006b, B:27:0x0072, B:29:0x0082, B:31:0x0084, B:36:0x00a8, B:39:0x00b8, B:41:0x00d2, B:42:0x00d9, B:43:0x00e6, B:45:0x00ec, B:49:0x00ff, B:51:0x0101, B:55:0x0104, B:57:0x010e, B:58:0x011e, B:21:0x0063, B:66:0x006f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:12:0x002e, B:14:0x0037, B:15:0x0049, B:17:0x004f, B:24:0x0067, B:26:0x006b, B:27:0x0072, B:29:0x0082, B:31:0x0084, B:36:0x00a8, B:39:0x00b8, B:41:0x00d2, B:42:0x00d9, B:43:0x00e6, B:45:0x00ec, B:49:0x00ff, B:51:0x0101, B:55:0x0104, B:57:0x010e, B:58:0x011e, B:21:0x0063, B:66:0x006f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0005, B:6:0x0010, B:9:0x0015, B:12:0x002e, B:14:0x0037, B:15:0x0049, B:17:0x004f, B:24:0x0067, B:26:0x006b, B:27:0x0072, B:29:0x0082, B:31:0x0084, B:36:0x00a8, B:39:0x00b8, B:41:0x00d2, B:42:0x00d9, B:43:0x00e6, B:45:0x00ec, B:49:0x00ff, B:51:0x0101, B:55:0x0104, B:57:0x010e, B:58:0x011e, B:21:0x0063, B:66:0x006f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    @Override // defpackage.zs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b95 d(defpackage.ea2 r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi6.d(ea2):b95");
    }

    public final void e(int i) {
        boolean z;
        ni6 ni6Var = this.j;
        zp2 zp2Var = ni6Var.l;
        boolean z2 = false;
        if (((c95) ((SparseArray) zp2Var.y).get(i)) == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        nw2 nw2Var = this.c.b;
        int i2 = this.a;
        io3.m("Gaps can not be transmuxed.", !((rr1) nw2Var.get(i2)).a());
        SparseArray sparseArray = ((ji6) ((ArrayList) zp2Var.x).get(i2)).a;
        String str = eq6.a;
        if (sparseArray.indexOfKey(i) >= 0) {
            z2 = true;
        }
        io3.B(z2);
        zp2Var.F(i, new vt1((ea2) sparseArray.get(i), this.d, ni6Var.n, this.g, ni6Var.g));
    }

    @Override // defpackage.zs
    public final boolean g(int i, ea2 ea2Var) {
        boolean z;
        boolean h;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int g = yu5.g(ea2Var.p);
        synchronized (this.j.k) {
            try {
                zp2 zp2Var = this.j.l;
                int i2 = this.a;
                zp2Var.getClass();
                int g2 = yu5.g(ea2Var.p);
                SparseArray sparseArray = ((ji6) ((ArrayList) zp2Var.x).get(i2)).a;
                boolean z6 = false;
                if (sparseArray.indexOfKey(g2) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(!z);
                sparseArray.put(g2, ea2Var);
                if (this.j.l.A()) {
                    ArrayList arrayList = (ArrayList) this.j.l.x;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        SparseArray sparseArray2 = ((ji6) arrayList.get(i5)).a;
                        if (sparseArray2.indexOfKey(1) >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            i3 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i4 = 1;
                        }
                    }
                    int i6 = i3 + i4;
                    t54 t54Var = this.j.n;
                    if (t54Var.m != 2) {
                        if (t54Var.d.size() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        io3.A("The track count cannot be changed after adding track formats.", z4);
                        t54Var.s = i6;
                    }
                    ((AtomicInteger) this.g.A).set(i6);
                }
                h = h(i, ea2Var);
                if (!h && yu5.g(ea2Var.p) == 2) {
                    t54 t54Var2 = this.j.n;
                    float j = yu5.j(ea2Var, this.b.f.b);
                    if (j == 90.0f || j == 180.0f || j == 270.0f) {
                        int round = 360 - Math.round(j);
                        if (t54Var2.d.size() != 0 && t54Var2.r != round) {
                            z3 = false;
                            io3.A("The additional rotation cannot be changed after adding track formats.", z3);
                            t54Var2.r = round;
                        }
                        z3 = true;
                        io3.A("The additional rotation cannot be changed after adding track formats.", z3);
                        t54Var2.r = round;
                    }
                }
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.j.l.z;
                if (sparseBooleanArray.indexOfKey(g) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (h == sparseBooleanArray.get(g)) {
                        z6 = true;
                    }
                    io3.B(z6);
                } else {
                    sparseBooleanArray.put(g, h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014f, code lost:
    
        if (r9.g == false) goto L90;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [ew2, jw2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10, defpackage.ea2 r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi6.h(int, ea2):boolean");
    }

    @Override // defpackage.zs
    public final void f(long j) {
    }
}
