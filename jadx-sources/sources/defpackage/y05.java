package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class y05 extends xo0 {
    public final e73 b;
    public final zr c;

    public y05(e73 e73Var, x73 x73Var) {
        super(x73Var);
        this.b = e73Var;
        aj5 descriptor = x73Var.getDescriptor();
        descriptor.getClass();
        this.c = new zr(descriptor, (byte) 0, false);
    }

    @Override // defpackage.n0
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.n0
    public final void c(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.ensureCapacity(-1);
    }

    @Override // defpackage.n0
    public final Iterator d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new o1(objArr);
    }

    @Override // defpackage.n0
    public final int e(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.n0
    public final Object h(Object obj) {
        List asList = Arrays.asList((Object[]) obj);
        asList.getClass();
        return new ArrayList(asList);
    }

    @Override // defpackage.n0
    public final Object i(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance((Class<?>) t80.M(this.b), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.xo0
    public final void j(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
