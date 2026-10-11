package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iy5 implements q41 {
    public Map A;
    public final q41 x;
    public long y;
    public Uri z;

    public iy5(q41 q41Var) {
        q41Var.getClass();
        this.x = q41Var;
        this.z = Uri.EMPTY;
        this.A = Collections.EMPTY_MAP;
    }

    @Override // defpackage.q41
    public final void close() {
        this.x.close();
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        q41 q41Var = this.x;
        this.z = v41Var.a;
        this.A = Collections.EMPTY_MAP;
        try {
            return q41Var.h(v41Var);
        } finally {
            Uri y = q41Var.y();
            if (y != null) {
                this.z = y;
            }
            this.A = q41Var.s();
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.x.read(bArr, i, i2);
        if (read != -1) {
            this.y += read;
        }
        return read;
    }

    @Override // defpackage.q41
    public final Map s() {
        return this.x.s();
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.x.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.x.z(n71Var);
    }
}
