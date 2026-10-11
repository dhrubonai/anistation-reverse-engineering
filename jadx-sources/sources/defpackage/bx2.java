package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bx2 extends yw2 {
    @Override // defpackage.yw2, defpackage.fw2
    public final fw2 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.yw2
    /* renamed from: f */
    public final yw2 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.yw2
    public final yw2 g(Iterable iterable) {
        throw null;
    }

    @Override // defpackage.yw2
    public final /* bridge */ /* synthetic */ zw2 h() {
        throw null;
    }

    public final w15 i() {
        w15 w15Var;
        Object[] objArr = this.a;
        w64 w64Var = w64.y;
        int i = this.b;
        if (i == 0) {
            w15Var = cx2.r(w64Var);
        } else {
            jf7.p(objArr, i);
            Arrays.sort(objArr, 0, i, w64Var);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (w64Var.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            w15Var = new w15(nw2.j(objArr, i2), w64Var);
        }
        this.b = w15Var.D.size();
        this.c = true;
        return w15Var;
    }
}
