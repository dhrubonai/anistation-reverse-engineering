package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rv1 extends kq4 {
    public final gj5 l;
    public final d46 m;

    public rv1(final String str, final int i) {
        super(str, null, i);
        this.l = gj5.a;
        this.m = new d46(new sb2() { // from class: qv1
            @Override // defpackage.sb2
            public final Object invoke() {
                aj5 buildSerialDescriptor;
                int i2 = i;
                aj5[] aj5VarArr = new aj5[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    buildSerialDescriptor = dj5.buildSerialDescriptor(str + '.' + this.e[i3], f06.d, new aj5[0], new tg5((byte) 4));
                    aj5VarArr[i3] = buildSerialDescriptor;
                }
                return aj5VarArr;
            }
        });
    }

    @Override // defpackage.kq4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof aj5)) {
                aj5 aj5Var = (aj5) obj;
                if (aj5Var.getKind() != gj5.a || !this.a.equals(aj5Var.a()) || !a34.i(db.s(this), db.s(aj5Var))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kq4, defpackage.aj5
    public final hj5 getKind() {
        return this.l;
    }

    @Override // defpackage.kq4, defpackage.aj5
    public final aj5 h(int i) {
        return ((aj5[]) this.m.getValue())[i];
    }

    @Override // defpackage.kq4
    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        o1 o1Var = new o1(this);
        int i2 = 1;
        while (o1Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) o1Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.kq4
    public final String toString() {
        return yo0.q0(new ns(this, (byte) 3), ", ", this.a.concat("("), ")", null, 56);
    }
}
