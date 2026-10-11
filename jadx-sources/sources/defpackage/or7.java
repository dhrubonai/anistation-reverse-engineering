package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class or7 implements a55 {
    public final fr7 x;

    public or7(fr7 fr7Var) {
        this.x = fr7Var;
    }

    @Override // defpackage.a55
    public final Status b() {
        return Status.B;
    }

    public final String toString() {
        fr7 fr7Var = this.x;
        a34.x(fr7Var);
        boolean z = true;
        if (fr7Var.x != 1) {
            z = false;
        }
        return "OptInOptionsResultImpl[" + z + "]";
    }
}
