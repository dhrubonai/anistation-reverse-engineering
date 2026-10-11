package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lj1 {
    public static final hb1 p;
    public final vq3 a;
    public final lw3 b;
    public final int c;
    public final mb1 d;
    public final w25 e;
    public final SparseIntArray f;
    public final Handler g;
    public boolean h;
    public boolean i;
    public cn7 j;
    public kj1 k;
    public zg6[] l;
    public nn3[] m;
    public List[][] n;
    public List[][] o;

    static {
        hb1 hb1Var = hb1.F0;
        hb1Var.getClass();
        gb1 gb1Var = new gb1(hb1Var);
        gb1Var.G = true;
        gb1Var.N = false;
        p = new hb1(gb1Var);
    }

    public lj1(ar3 ar3Var, lw3 lw3Var, hh6 hh6Var, w25 w25Var) {
        int i;
        vq3 vq3Var = ar3Var.b;
        vq3Var.getClass();
        this.a = vq3Var;
        this.b = lw3Var;
        if (lw3Var == null) {
            i = 0;
        } else if (lw3Var instanceof qv4) {
            i = 1;
        } else {
            i = 2;
        }
        this.c = i;
        mb1 mb1Var = new mb1(hh6Var, new p18((byte) 15), null);
        this.d = mb1Var;
        this.e = w25Var;
        this.f = new SparseIntArray();
        h5 h5Var = new h5(mb1Var, (byte) 14);
        io3.B(mb1Var.a == null);
        mb1Var.a = h5Var;
        mb1Var.b = z20.a;
        mb1Var.f = mb1Var.e;
        this.g = eq6.q(null);
    }

    public final void a() {
        boolean z;
        if (this.c == 2) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        io3.B(this.h);
        io3.B(this.i);
    }

    public final il1 b(String str, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        vq3 vq3Var = this.a;
        Uri uri = vq3Var.a;
        String n = qy3.n(vq3Var.b);
        sq3 sq3Var = vq3Var.c;
        ArrayList arrayList = null;
        if (sq3Var != null) {
            byte[] bArr4 = sq3Var.h;
            if (bArr4 != null) {
                bArr3 = Arrays.copyOf(bArr4, bArr4.length);
            } else {
                bArr3 = null;
            }
            bArr2 = bArr3;
        } else {
            bArr2 = null;
        }
        String str2 = vq3Var.f;
        if (this.c == 2) {
            a();
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = this.n.length;
            for (int i = 0; i < length; i++) {
                arrayList2.clear();
                int length2 = this.n[i].length;
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList2.addAll(this.n[i][i2]);
                }
                arrayList.addAll(this.k.G[i].m(arrayList2));
            }
        }
        List list = arrayList;
        if (arrayList == null) {
            z62 z62Var = nw2.y;
            list = o15.B;
        }
        return new il1(str, uri, n, list, bArr2, str2, bArr, null, null);
    }

    public final void c() {
        boolean z;
        this.k.getClass();
        this.k.G.getClass();
        this.k.E.getClass();
        boolean z2 = false;
        int i = this.c;
        if (i == 2) {
            int length = this.k.G.length;
            int size = this.e.size();
            this.n = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            this.o = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < size; i3++) {
                    this.n[i2][i3] = new ArrayList();
                    this.o[i2][i3] = Collections.unmodifiableList(this.n[i2][i3]);
                }
            }
            this.l = new zg6[length];
            this.m = new nn3[length];
            for (int i4 = 0; i4 < length; i4++) {
                this.l[i4] = this.k.G[i4].p();
                nn3 nn3Var = (nn3) f(i4).B;
                nn3[] nn3VarArr = this.m;
                nn3Var.getClass();
                nn3VarArr[i4] = nn3Var;
            }
            this.h = true;
            this.i = true;
            z2 = true;
        } else {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            this.k.F.getClass();
            this.h = true;
        }
        this.g.post(new p0(this, z2));
    }

    public final void d() {
        kj1 kj1Var = this.k;
        if (kj1Var != null && !kj1Var.H) {
            kj1Var.H = true;
            kj1Var.D.sendEmptyMessage(4);
        }
        this.d.j();
        this.e.release();
    }

    public final void e(int i, hb1 hb1Var) {
        try {
            a();
            a();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                this.n[i][i2].clear();
            }
            mb1 mb1Var = this.d;
            mb1Var.o(hb1Var);
            f(i);
            ho6 it = hb1Var.H.values().iterator();
            while (it.hasNext()) {
                dh6 dh6Var = (dh6) it.next();
                gb1 gb1Var = new gb1(hb1Var);
                gb1Var.g(dh6Var);
                mb1Var.o(gb1Var.b());
                f(i);
            }
        } catch (yx1 e) {
            throw new IllegalStateException(e);
        }
    }

    public final jh6 f(int i) {
        jh6 m = this.d.m(this.e.c(), this.l[i], new jw3(this.k.E.l(i)), this.k.E);
        for (int i2 = 0; i2 < m.x; i2++) {
            jz1 jz1Var = ((jz1[]) m.z)[i2];
            if (jz1Var != null) {
                List list = this.n[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        jz1 jz1Var2 = (jz1) list.get(i3);
                        if (jz1Var2.c().equals(jz1Var.c())) {
                            SparseIntArray sparseIntArray = this.f;
                            sparseIntArray.clear();
                            for (int i4 = 0; i4 < jz1Var2.length(); i4++) {
                                sparseIntArray.put(jz1Var2.j(i4), 0);
                            }
                            for (int i5 = 0; i5 < jz1Var.length(); i5++) {
                                sparseIntArray.put(jz1Var.j(i5), 0);
                            }
                            int[] iArr = new int[sparseIntArray.size()];
                            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                                iArr[i6] = sparseIntArray.keyAt(i6);
                            }
                            list.set(i3, new ij1(jz1Var2.c(), iArr, null, (byte) 0));
                        } else {
                            i3++;
                        }
                    } else {
                        list.add(jz1Var);
                        break;
                    }
                }
            }
        }
        return m;
    }
}
