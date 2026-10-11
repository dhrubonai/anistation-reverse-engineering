package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class p2 implements x73 {
    public abstract e73 a();

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        Object obj;
        aj5 descriptor = getDescriptor();
        gu0 c = l61Var.c(descriptor);
        if (c.decodeSequentially()) {
            obj = c.p(getDescriptor(), 1, gr4.findPolymorphicSerializer(this, c, c.m(getDescriptor(), 0)), null);
        } else {
            Object obj2 = null;
            String str = null;
            while (true) {
                int i = c.i(getDescriptor());
                if (i != -1) {
                    if (i != 0) {
                        if (i != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(i);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (str != null) {
                            obj2 = c.p(getDescriptor(), i, gr4.findPolymorphicSerializer(this, c, str), null);
                        } else {
                            ze0.k("Cannot read polymorphic value before its type token");
                            return null;
                        }
                    } else {
                        str = c.m(getDescriptor(), i);
                    }
                } else if (obj2 != null) {
                    obj = obj2;
                } else {
                    ze0.e(zo5.l("Polymorphic value has not been read for class ", str));
                    return null;
                }
            }
        }
        c.a(descriptor);
        return obj;
    }

    public mj5 findPolymorphicSerializerOrNull(wt1 wt1Var, Object obj) {
        wt1Var.getClass();
        obj.getClass();
        wt1Var.b().getPolymorphic(a(), obj);
        return null;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        obj.getClass();
        mj5 findPolymorphicSerializer = gr4.findPolymorphicSerializer(this, wt1Var, obj);
        aj5 descriptor = getDescriptor();
        v0 v0Var = (v0) wt1Var.c(descriptor);
        v0Var.w(getDescriptor(), 0, findPolymorphicSerializer.getDescriptor().a());
        v0Var.v(getDescriptor(), 1, findPolymorphicSerializer, obj);
        v0Var.a(descriptor);
    }

    public ne1 findPolymorphicSerializerOrNull(gu0 gu0Var, String str) {
        gu0Var.getClass();
        gu0Var.b().getPolymorphic(a(), str);
        return null;
    }
}
