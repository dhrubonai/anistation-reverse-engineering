package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fv5 implements lv2 {
    public boolean A;
    public final db0 B;
    public final n22 x;
    public final t80 y;
    public final Object z = new Object();

    public fv5(db0 db0Var, n22 n22Var, t80 t80Var) {
        this.x = n22Var;
        this.y = t80Var;
        this.B = db0Var;
    }

    @Override // defpackage.lv2
    public final t80 H() {
        return this.y;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.z) {
            this.A = true;
            db0 db0Var = this.B;
            if (db0Var != null) {
                try {
                    db0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.lv2
    public final qj4 g0() {
        synchronized (this.z) {
            if (this.A) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.lv2
    public final n22 getFileSystem() {
        return this.x;
    }

    @Override // defpackage.lv2
    public final db0 o0() {
        db0 db0Var;
        synchronized (this.z) {
            try {
                if (!this.A) {
                    db0Var = this.B;
                    if (db0Var == null) {
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return db0Var;
    }
}
