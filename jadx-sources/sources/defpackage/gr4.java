package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class gr4 {
    public static final <T> mj5 findPolymorphicSerializer(p2 p2Var, wt1 wt1Var, T t) {
        p2Var.getClass();
        wt1Var.getClass();
        t.getClass();
        mj5 findPolymorphicSerializerOrNull = p2Var.findPolymorphicSerializerOrNull(wt1Var, t);
        if (findPolymorphicSerializerOrNull == null) {
            im0 a = z05.a(t.getClass());
            e73 a2 = p2Var.a();
            a2.getClass();
            String f = a.f();
            if (f == null) {
                f = String.valueOf(a);
            }
            iv.P(f, a2);
            throw null;
        }
        return findPolymorphicSerializerOrNull;
    }

    public static final <T> ne1 findPolymorphicSerializer(p2 p2Var, gu0 gu0Var, String str) {
        p2Var.getClass();
        gu0Var.getClass();
        ne1 findPolymorphicSerializerOrNull = p2Var.findPolymorphicSerializerOrNull(gu0Var, str);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        iv.P(str, p2Var.a());
        throw null;
    }
}
