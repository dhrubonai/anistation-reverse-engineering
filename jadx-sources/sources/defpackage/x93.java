package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class x93 implements sc2, Serializable {
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    public x93(int i) {
        this.x = i;
    }

    @Override // defpackage.sc2
    public final int getArity() {
        return this.x;
    }

    public final String toString() {
        z05.a.getClass();
        return a15.a(this);
    }
}
