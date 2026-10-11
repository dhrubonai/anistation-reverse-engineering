package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u53 implements x73 {
    public static final u53 a = new Object();
    public static final aj5 b = dj5.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", er4.b, new aj5[0], new p03(1));

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        return db.p(l61Var).k();
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        q53 q53Var = (q53) obj;
        q53Var.getClass();
        db.q(wt1Var);
        if (q53Var instanceof l63) {
            wt1Var.j(n63.a, q53Var);
            return;
        }
        if (q53Var instanceof h63) {
            wt1Var.j(j63.a, q53Var);
        } else if (q53Var instanceof a53) {
            wt1Var.j(c53.a, q53Var);
        } else {
            ze0.l();
        }
    }
}
