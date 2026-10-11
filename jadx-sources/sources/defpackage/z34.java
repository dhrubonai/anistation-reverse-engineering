package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z34 extends dn3 implements m73 {
    public final gl4 A;
    public Object B;

    public z34(gl4 gl4Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.A = gl4Var;
        this.B = obj2;
    }

    @Override // defpackage.dn3, java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // defpackage.dn3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.B;
        this.B = obj;
        el4 el4Var = (el4) this.A.y;
        dl4 dl4Var = el4Var.A;
        Object obj3 = this.y;
        if (!dl4Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = el4Var.z;
        if (z) {
            if (z) {
                pj6 pj6Var = el4Var.x[el4Var.y];
                Object obj4 = pj6Var.x[pj6Var.z];
                dl4Var.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                el4Var.c(i, dl4Var.z, obj4, 0);
            } else {
                qi2.e();
                return null;
            }
        } else {
            dl4Var.put(obj3, obj);
        }
        el4Var.D = dl4Var.B;
        return obj2;
    }
}
