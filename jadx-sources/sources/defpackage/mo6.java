package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mo6 implements rb3, Serializable {
    public sb2 x;
    public Object y;

    @Override // defpackage.rb3
    public final Object getValue() {
        Object obj = this.y;
        if (obj == pk2.i0) {
            sb2 sb2Var = this.x;
            sb2Var.getClass();
            Object invoke = sb2Var.invoke();
            this.y = invoke;
            this.x = null;
            return invoke;
        }
        return obj;
    }

    @Override // defpackage.rb3
    public final boolean isInitialized() {
        if (this.y != pk2.i0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
