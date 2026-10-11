package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class f63 implements x73 {
    public static final f63 a = new Object();
    public static final aj5 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [f63, java.lang.Object] */
    static {
        aj5 buildSerialDescriptor;
        buildSerialDescriptor = dj5.buildSerialDescriptor("kotlinx.serialization.json.JsonNull", gj5.a, new aj5[0], new tg5((byte) 4));
        b = buildSerialDescriptor;
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        db.p(l61Var);
        if (!l61Var.decodeNotNullMark()) {
            l61Var.decodeNull();
            return e63.INSTANCE;
        }
        throw new o53(iv.v(-1, "Expected 'null' literal", null, null, null));
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        ((e63) obj).getClass();
        db.q(wt1Var);
        wt1Var.encodeNull();
    }
}
