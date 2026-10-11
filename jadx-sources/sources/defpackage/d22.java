package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d22 implements lv2 {
    public final AutoCloseable A;
    public final Object B = new Object();
    public boolean C;
    public xy4 D;
    public final qj4 x;
    public final n22 y;
    public final String z;

    public d22(qj4 qj4Var, n22 n22Var, String str, AutoCloseable autoCloseable) {
        this.x = qj4Var;
        this.y = n22Var;
        this.z = str;
        this.A = autoCloseable;
    }

    @Override // defpackage.lv2
    public final t80 H() {
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.B) {
            this.C = true;
            xy4 xy4Var = this.D;
            if (xy4Var != null) {
                try {
                    xy4Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.A;
            if (autoCloseable != null) {
                try {
                    zo5.r(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // defpackage.lv2
    public final qj4 g0() {
        qj4 qj4Var;
        synchronized (this.B) {
            if (!this.C) {
                qj4Var = this.x;
            } else {
                throw new IllegalStateException("closed");
            }
        }
        return qj4Var;
    }

    @Override // defpackage.lv2
    public final n22 getFileSystem() {
        return this.y;
    }

    @Override // defpackage.lv2
    public final db0 o0() {
        synchronized (this.B) {
            if (!this.C) {
                xy4 xy4Var = this.D;
                if (xy4Var != null) {
                    return xy4Var;
                }
                bv5 l0 = this.y.l0(this.x);
                l0.getClass();
                xy4 xy4Var2 = new xy4(l0);
                this.D = xy4Var2;
                return xy4Var2;
            }
            throw new IllegalStateException("closed");
        }
    }
}
