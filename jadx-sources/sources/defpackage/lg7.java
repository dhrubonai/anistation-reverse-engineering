package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lg7 implements ik7 {
    public final boolean x;

    public lg7(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.x = booleanValue;
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        return Boolean.valueOf(this.x);
    }

    @Override // defpackage.ik7
    public final String d() {
        return Boolean.toString(this.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lg7) && this.x == ((lg7) obj).x) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return null;
    }

    @Override // defpackage.ik7
    public final Double h() {
        double d;
        if (true != this.x) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.x).hashCode();
    }

    @Override // defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.x;
        if (equals) {
            return new tk7(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        return new lg7(Boolean.valueOf(this.x));
    }

    public final String toString() {
        return String.valueOf(this.x);
    }
}
