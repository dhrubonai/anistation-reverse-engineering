package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lr4 implements m85 {
    public final m85 x;
    public final long y;
    public final /* synthetic */ rr4 z;

    public lr4(rr4 rr4Var, m85 m85Var) {
        m85Var.getClass();
        this.z = rr4Var;
        this.x = m85Var;
        this.y = lz5.b();
    }

    @Override // defpackage.m85
    public final void J(int i, String str) {
        str.getClass();
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.J(i, str);
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void b(int i, double d) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.b(i, d);
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final String c0(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.c0(i);
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.close();
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void e(int i, long j) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.e(i, j);
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void f(int i, byte[] bArr) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.f(i, bArr);
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final byte[] getBlob(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.getBlob(i);
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final int getColumnCount() {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.getColumnCount();
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final String getColumnName(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.getColumnName(i);
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final long getLong(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.getLong(i);
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void h(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.h(i);
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final boolean isNull(int i) {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.isNull(i);
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void k() {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.k();
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final boolean p0() {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                return this.x.p0();
            }
            zz.c0(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.m85
    public final void reset() {
        if (!this.z.e) {
            if (this.y == lz5.b()) {
                this.x.reset();
                return;
            } else {
                zz.c0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zz.c0(21, "Statement is recycled");
        throw null;
    }
}
