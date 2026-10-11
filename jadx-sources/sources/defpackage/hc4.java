package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class hc4 implements x73 {
    public final Object a;
    public final List b;
    public final rb3 c;

    public hc4(Object obj, String str) {
        obj.getClass();
        this.a = obj;
        this.b = nt1.x;
        this.c = bx7.B(jf3.y, new va1(str, this, (byte) 22));
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        int i;
        aj5 descriptor = getDescriptor();
        gu0 c = l61Var.c(descriptor);
        if (c.decodeSequentially() || (i = c.i(getDescriptor())) == -1) {
            c.a(descriptor);
            return this.a;
        }
        throw new IllegalArgumentException(qx1.h(i, "Unexpected index "));
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return (aj5) this.c.getValue();
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        obj.getClass();
        wt1Var.c(getDescriptor()).a(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hc4(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
