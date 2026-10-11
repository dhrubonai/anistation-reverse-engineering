package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class du0 extends mn0 {
    public final boolean z;

    public du0(b23 b23Var, boolean z) {
        super(b23Var);
        this.z = z;
    }

    @Override // defpackage.mn0
    public final void j(byte b) {
        if (this.z) {
            r(String.valueOf(b & 255));
            return;
        }
        String valueOf = String.valueOf(b & 255);
        valueOf.getClass();
        ((b23) this.y).i(valueOf);
    }

    @Override // defpackage.mn0
    public final void m(int i) {
        boolean z = this.z;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            r(unsignedString);
        } else {
            unsignedString.getClass();
            ((b23) this.y).i(unsignedString);
        }
    }

    @Override // defpackage.mn0
    public final void o(long j) {
        boolean z = this.z;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            r(unsignedString);
        } else {
            unsignedString.getClass();
            ((b23) this.y).i(unsignedString);
        }
    }

    @Override // defpackage.mn0
    public final void p(short s) {
        if (this.z) {
            r(String.valueOf(s & 65535));
            return;
        }
        String valueOf = String.valueOf(s & 65535);
        valueOf.getClass();
        ((b23) this.y).i(valueOf);
    }
}
