package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d25 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d25(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.D = obj6;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.D;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (b) {
            case 0:
                i95 i95Var = (i95) obj6;
                ja5 ja5Var = (ja5) obj5;
                n95 n95Var = (n95) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (i95Var.y != n95Var) {
                    i95Var.y = n95Var;
                    z = true;
                } else {
                    z = false;
                }
                if (!a34.i(i95Var.z, str)) {
                    i95Var.z = str;
                } else {
                    z2 = z;
                }
                i95Var.x = ja5Var;
                i95Var.A = obj2;
                i95Var.B = objArr;
                m95 m95Var = i95Var.C;
                if (m95Var != null && z2) {
                    ((st3) m95Var).L();
                    i95Var.C = null;
                    i95Var.d();
                }
                return pn6Var;
            default:
                v11 v11Var = (v11) obj6;
                w44 w44Var = (w44) obj5;
                w44 w44Var2 = (w44) obj4;
                wj wjVar = (wj) obj3;
                v27 v27Var = (v27) obj2;
                sb2 sb2Var = (sb2) obj;
                if (!s07.d(w44Var)) {
                    w44Var.setValue(Boolean.TRUE);
                    h43 h43Var = (h43) w44Var2.getValue();
                    vz0 vz0Var = null;
                    if (h43Var != null) {
                        h43Var.l(null);
                    }
                    tl7.z(v11Var, null, null, new e05(wjVar, v27Var, sb2Var, vz0Var, (byte) 14), 3);
                }
                return pn6Var;
        }
    }
}
