package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class yw2 extends ew2 {
    @Override // defpackage.fw2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public yw2 a(Object obj) {
        obj.getClass();
        c(obj);
        return this;
    }

    public yw2 g(Iterable iterable) {
        iterable.getClass();
        d(iterable);
        return this;
    }

    public zw2 h() {
        int i = this.b;
        if (i != 0) {
            Object[] objArr = this.a;
            if (i != 1) {
                zw2 k = zw2.k(objArr, i);
                this.b = k.size();
                this.c = true;
                return k;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i2 = zw2.z;
            return new oq5(obj);
        }
        int i3 = zw2.z;
        return v15.G;
    }
}
