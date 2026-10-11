package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o8 implements wc5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static int b(o8 o8Var, int i) {
        Object obj;
        af3 af3Var = (af3) o8Var.c;
        ue3 j = af3Var.j();
        if (!j.l.isEmpty()) {
            int h = af3Var.h();
            if (i <= o8Var.c() && h <= i) {
                List list = j.l;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((ve3) obj).a == i) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                ve3 ve3Var = (ve3) obj;
                if (ve3Var != null) {
                    return ve3Var.o;
                }
            } else {
                return ((i - af3Var.h()) * z51.W(j)) - af3Var.i();
            }
        }
        return 0;
    }

    @Override // defpackage.wc5
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                r8 r8Var = (r8) obj2;
                float c = r8Var.g0.c(f);
                float h = c - r8Var.g0.f.h();
                ((a9) obj).a(c, 0.0f);
                return h;
            case 1:
                return ((wc5) obj2).a(f);
            default:
                rd5 rd5Var = (rd5) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) rd5Var.h.invoke()).booleanValue()) {
                    return rd5Var.e(rd5Var.h(((pd5) obj).a(2, rd5Var.f(rd5Var.i(f)))));
                }
                throw new tm4("The fling animation was cancelled", (byte) 0);
        }
    }

    public int c() {
        ve3 ve3Var = (ve3) yo0.s0(((af3) this.c).j().l);
        if (ve3Var != null) {
            return ve3Var.a;
        }
        return 0;
    }
}
