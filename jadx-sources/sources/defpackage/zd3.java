package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zd3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ be3 c;

    public zd3(be3 be3Var, int i) {
        this.c = be3Var;
        this.a = i;
    }

    public final void a(int i) {
        be3 be3Var = this.c;
        tu tuVar = be3Var.c;
        if (tuVar == null) {
            return;
        }
        this.b.add(new et4(tuVar, i, be3Var.b, null));
    }
}
