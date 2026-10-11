package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gn3 implements x73 {
    public final x73 a;
    public final x73 b;
    public final /* synthetic */ byte c;
    public final aj5 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gn3(x73 x73Var, x73 x73Var2, byte b) {
        this(x73Var, x73Var2, (char) 0);
        this.c = b;
        switch (b) {
            case 1:
                this(x73Var, x73Var2, (char) 0);
                aj5[] aj5VarArr = new aj5[0];
                if (!uz5.V("kotlin.Pair")) {
                    jm0 jm0Var = new jm0("kotlin.Pair");
                    jm0.a(jm0Var, "first", x73Var.getDescriptor());
                    jm0.a(jm0Var, "second", x73Var2.getDescriptor());
                    this.d = new cj5("kotlin.Pair", f06.a, jm0Var.c.size(), ms.S0(aj5VarArr), jm0Var);
                    return;
                }
                ze0.k("Blank serial names are prohibited");
                throw null;
            default:
                this.d = dj5.buildSerialDescriptor("kotlin.collections.Map.Entry", f06.c, new aj5[0], new r82(x73Var, x73Var2, (byte) 9));
                return;
        }
    }

    public final Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return new fn3(obj, obj2);
            default:
                return new ai4(obj, obj2);
        }
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        Object a;
        Object obj = bx7.h;
        aj5 descriptor = getDescriptor();
        gu0 c = l61Var.c(descriptor);
        boolean decodeSequentially = c.decodeSequentially();
        x73 x73Var = this.b;
        x73 x73Var2 = this.a;
        if (decodeSequentially) {
            a = a(c.p(getDescriptor(), 0, x73Var2, null), c.p(getDescriptor(), 1, x73Var, null));
        } else {
            Object obj2 = obj;
            Object obj3 = obj2;
            while (true) {
                int i = c.i(getDescriptor());
                if (i != -1) {
                    if (i != 0) {
                        if (i == 1) {
                            obj3 = c.p(getDescriptor(), 1, x73Var, null);
                        } else {
                            throw new IllegalArgumentException(qx1.h(i, "Invalid index: "));
                        }
                    } else {
                        obj2 = c.p(getDescriptor(), 0, x73Var2, null);
                    }
                } else if (obj2 != obj) {
                    if (obj3 != obj) {
                        a = a(obj2, obj3);
                    } else {
                        throw new IllegalArgumentException("Element 'value' is missing");
                    }
                } else {
                    throw new IllegalArgumentException("Element 'key' is missing");
                }
            }
        }
        c.a(descriptor);
        return a;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        byte b = this.c;
        aj5 aj5Var = this.d;
        switch (b) {
            case 0:
                return aj5Var;
            default:
                return (cj5) aj5Var;
        }
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        Object key;
        Object value;
        hu0 c = wt1Var.c(getDescriptor());
        aj5 descriptor = getDescriptor();
        x73 x73Var = this.a;
        byte b = this.c;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                ai4 ai4Var = (ai4) obj;
                ai4Var.getClass();
                key = ai4Var.x;
                break;
        }
        v0 v0Var = (v0) c;
        v0Var.v(descriptor, 0, x73Var, key);
        aj5 descriptor2 = getDescriptor();
        x73 x73Var2 = this.b;
        switch (b) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                ai4 ai4Var2 = (ai4) obj;
                ai4Var2.getClass();
                value = ai4Var2.y;
                break;
        }
        v0Var.v(descriptor2, 1, x73Var2, value);
        v0Var.a(getDescriptor());
    }

    public gn3(x73 x73Var, x73 x73Var2, char c) {
        this.a = x73Var;
        this.b = x73Var2;
    }
}
