package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v97 implements ic2 {
    public final /* synthetic */ w05 A;
    public final /* synthetic */ w05 B;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ w05 y;
    public final /* synthetic */ xy4 z;

    public /* synthetic */ v97(xy4 xy4Var, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        this.z = xy4Var;
        this.y = w05Var;
        this.A = w05Var2;
        this.B = w05Var3;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w05 w05Var = this.B;
        w05 w05Var2 = this.A;
        xy4 xy4Var = this.z;
        w05 w05Var3 = this.y;
        switch (b) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    long j = 1;
                    if (longValue >= 1) {
                        byte readByte = xy4Var.readByte();
                        boolean z3 = false;
                        if ((readByte & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((readByte & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z3 = true;
                        }
                        if (z) {
                            j = 5;
                        }
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                w05Var3.x = Integer.valueOf(xy4Var.l());
                            }
                            if (z2) {
                                w05Var2.x = Integer.valueOf(xy4Var.l());
                            }
                            if (z3) {
                                w05Var.x = Integer.valueOf(xy4Var.l());
                                return pn6Var;
                            }
                            return pn6Var;
                        }
                        qi2.k("bad zip: extended timestamp extra too short");
                    } else {
                        qi2.k("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return pn6Var;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (w05Var3.x == null) {
                        if (longValue2 == 24) {
                            w05Var3.x = Long.valueOf(xy4Var.p());
                            w05Var2.x = Long.valueOf(xy4Var.p());
                            w05Var.x = Long.valueOf(xy4Var.p());
                            return pn6Var;
                        }
                        qi2.k("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    } else {
                        qi2.k("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return pn6Var;
        }
    }

    public /* synthetic */ v97(w05 w05Var, xy4 xy4Var, w05 w05Var2, w05 w05Var3) {
        this.y = w05Var;
        this.z = xy4Var;
        this.A = w05Var2;
        this.B = w05Var3;
    }
}
