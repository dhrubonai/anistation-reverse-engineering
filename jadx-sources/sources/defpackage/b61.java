package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b61 implements ne2 {
    public final ze0 a;
    public final hp0 b;

    public b61(ze0 ze0Var, hp0 hp0Var) {
        this.a = ze0Var;
        this.b = hp0Var;
    }

    @Override // defpackage.ne2
    public final ve2 a(Context context, boolean z) {
        return new d61(context, this.a, this.b);
    }
}
