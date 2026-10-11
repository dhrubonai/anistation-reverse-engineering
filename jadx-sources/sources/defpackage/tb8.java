package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tb8 extends pc7 {
    public final rv5 b;
    public final rv5 c;
    public final int[] d;
    public final int e;

    public tb8(rv5 rv5Var, rv5 rv5Var2) {
        boolean z;
        int i;
        this.b = rv5Var;
        this.c = rv5Var2;
        int h = rv5Var2.h();
        if (h <= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = new int[h];
            this.d = iArr;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < h) {
                ia8 d = d(i2);
                long j2 = d.e | j;
                if (j2 == j) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            if (d.equals(d(iArr[i4] & 31))) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 != -1) {
                        if (d.c) {
                            i = iArr[i4] | (1 << (i2 + 4));
                        } else {
                            i = i2;
                        }
                        iArr[i4] = i;
                        i2++;
                        j = j2;
                    }
                }
                iArr[i3] = i2;
                i3++;
                i2++;
                j = j2;
            }
            this.e = i3;
            return;
        }
        ze0.k("metadata size too large");
        throw null;
    }

    @Override // defpackage.pc7
    public final void a(jb8 jb8Var, ab8 ab8Var) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            ia8 d = d(i2 & 31);
            if (!d.c) {
                rv5 rv5Var = this.b;
                int h = rv5Var.h();
                if (i2 >= h) {
                    rv5Var = this.c;
                    i2 -= h;
                }
                jb8Var.a(d, d.b.cast(rv5Var.k(i2)), ab8Var);
            } else {
                jb8Var.b(d, new sb8(this, d, i2), ab8Var);
            }
        }
    }

    @Override // defpackage.pc7
    public final int b() {
        return this.e;
    }

    @Override // defpackage.pc7
    public final Set c() {
        return new es(this, (byte) 4);
    }

    public final ia8 d(int i) {
        rv5 rv5Var = this.b;
        int h = rv5Var.h();
        if (i >= h) {
            return this.c.j(i - h);
        }
        return rv5Var.j(i);
    }
}
