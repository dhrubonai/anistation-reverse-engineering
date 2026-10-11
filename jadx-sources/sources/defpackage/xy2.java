package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xy2 implements rb3, Serializable {
    public final Object x;

    public xy2(Object obj) {
        this.x = obj;
    }

    @Override // defpackage.rb3
    public final Object getValue() {
        return this.x;
    }

    @Override // defpackage.rb3
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.x);
    }
}
