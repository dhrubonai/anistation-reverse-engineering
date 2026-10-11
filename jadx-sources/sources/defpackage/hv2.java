package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class hv2 {
    public static final w4 a = new w4(nt1.x);
    public static final w4 b;
    public static final w4 c;
    public static final w4 d;

    static {
        kg1.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        kg1 kg1Var = new kg1(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        kg1.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        b = new w4(new tq5(kg1Var, new kg1(CodedOutputStream.DEFAULT_BUFFER_SIZE)));
        c = new w4(Boolean.FALSE);
        d = new w4(Boolean.TRUE);
    }

    public static final void a(bv2 bv2Var, boolean z) {
        int i;
        Object obj;
        f12 f12Var;
        if (z) {
            i = 200;
        } else {
            i = 0;
        }
        w4 w4Var = jv2.a;
        if (i > 0) {
            obj = new v21(i);
        } else {
            obj = ri6.a;
        }
        Object obj2 = bv2Var.l;
        if (obj2 instanceof f12) {
            f12Var = (f12) obj2;
        } else if (obj2 instanceof g12) {
            f12 f12Var2 = new f12((g12) obj2);
            bv2Var.l = f12Var2;
            f12Var = f12Var2;
        } else {
            p65.o();
            return;
        }
        f12Var.a.put(jv2.a, obj);
    }
}
