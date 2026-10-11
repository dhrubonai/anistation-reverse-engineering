package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eh7 implements ik7 {
    public final ik7 x;
    public final String y;

    public eh7(String str) {
        this.x = ik7.p;
        this.y = str;
    }

    @Override // defpackage.ik7
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.ik7
    public final String d() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof eh7) {
                eh7 eh7Var = (eh7) obj;
                if (this.y.equals(eh7Var.y) && this.x.equals(eh7Var.x)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ik7
    public final Iterator f() {
        return null;
    }

    @Override // defpackage.ik7
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.x.hashCode() + (this.y.hashCode() * 31);
    }

    @Override // defpackage.ik7
    public final ik7 i(String str, vs7 vs7Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.ik7
    public final ik7 m() {
        return new eh7(this.y, this.x.m());
    }

    public eh7(String str, ik7 ik7Var) {
        this.x = ik7Var;
        this.y = str;
    }
}
