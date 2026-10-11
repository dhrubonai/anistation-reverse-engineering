package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class j63 implements x73 {
    public static final j63 a = new Object();
    public static final i63 b = i63.b;

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        db.p(l61Var);
        return new h63((Map) new yj2(mz5.a, u53.a, (byte) 1).merge(l61Var, null));
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        h63 h63Var = (h63) obj;
        h63Var.getClass();
        db.q(wt1Var);
        new yj2(mz5.a, u53.a, (byte) 1).serialize(wt1Var, h63Var);
    }
}
