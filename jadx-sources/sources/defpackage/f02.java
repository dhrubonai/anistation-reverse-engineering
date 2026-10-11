package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f02 implements wd2 {
    public static final f02 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, f02, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.download.runtime.ExternalDownloadRegistry.StoreData", obj, 2);
        kq4Var.j("version", true);
        kq4Var.j("records", true);
        descriptor = kq4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        return new x73[]{i13.a, h02.c[1].getValue()};
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        List list;
        int i;
        int i2;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3[] rb3VarArr = h02.c;
        if (c.decodeSequentially()) {
            i = c.r(aj5Var, 0);
            list = (List) c.p(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), null);
            i2 = 3;
        } else {
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            List list2 = null;
            while (z) {
                int i5 = c.i(aj5Var);
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            list2 = (List) c.p(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), list2);
                            i4 |= 2;
                        } else {
                            qi2.f(i5);
                            return null;
                        }
                    } else {
                        i3 = c.r(aj5Var, 0);
                        i4 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            list = list2;
            i = i3;
            i2 = i4;
        }
        c.a(aj5Var);
        return new h02(list, i2, i);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        h02 h02Var = (h02) obj;
        h02Var.getClass();
        List list = h02Var.b;
        int i = h02Var.a;
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        rb3[] rb3VarArr = h02.c;
        if (c.shouldEncodeElementDefault(aj5Var, 0) || i != 1) {
            ((v0) c).t(0, i, aj5Var);
        }
        if (c.shouldEncodeElementDefault(aj5Var, 1) || !a34.i(list, nt1.x)) {
            ((v0) c).v(aj5Var, 1, (mj5) rb3VarArr[1].getValue(), list);
        }
        c.a(aj5Var);
    }
}
