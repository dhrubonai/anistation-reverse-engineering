package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d46 implements rb3, Serializable {
    public sb2 x;
    public volatile Object y;
    public final Object z;

    public d46(sb2 sb2Var) {
        sb2Var.getClass();
        this.x = sb2Var;
        this.y = pk2.i0;
        this.z = this;
    }

    @Override // defpackage.rb3
    public final Object getValue() {
        Object obj;
        Object obj2 = this.y;
        pk2 pk2Var = pk2.i0;
        if (obj2 != pk2Var) {
            return obj2;
        }
        synchronized (this.z) {
            obj = this.y;
            if (obj == pk2Var) {
                sb2 sb2Var = this.x;
                sb2Var.getClass();
                obj = sb2Var.invoke();
                this.y = obj;
                this.x = null;
            }
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
