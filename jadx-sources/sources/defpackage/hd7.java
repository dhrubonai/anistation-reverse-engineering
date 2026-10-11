package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hd7 extends qt0 {
    public final Set y;
    public final jb8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd7(String str) {
        super(str);
        Level level = Level.ALL;
        this.y = id7.C;
        this.z = id7.D;
    }

    @Override // defpackage.qt0
    public final void J(l98 l98Var) {
        String str = (String) l98Var.d().l(ta8.a);
        if (str == null) {
            str = (String) this.x;
        }
        if (str == null) {
            z98 z98Var = l98Var.d;
            if (z98Var != null) {
                str = z98Var.a();
                int indexOf = str.indexOf(36, str.lastIndexOf(46));
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
            } else {
                ze0.m("cannot request log site information prior to postProcess()");
                return;
            }
        }
        id7.M(l98Var, et5.n(str), Level.ALL, this.y, this.z);
    }
}
