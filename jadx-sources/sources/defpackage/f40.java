package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f40 implements y86 {
    public final os0 a;
    public final i54 b = new i54();
    public final ti4 c = xt5.g(null);

    public f40(os0 os0Var) {
        this.a = os0Var;
    }

    @Override // defpackage.y86
    public final Object a(q86 q86Var, t36 t36Var) {
        vz0 vz0Var = null;
        Object K = db.K(new d23(c54.x, this.b, new v8(this, new e40(q86Var), vz0Var, (byte) 3), vz0Var, (byte) 1), t36Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    public final void b(final sb2 sb2Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z;
        final sb2 sb2Var2;
        kd2 kd2Var2;
        kd2Var.f0(723898654);
        if (kd2Var.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        final byte b = 0;
        final byte b2 = 1;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            e40 e40Var = (e40) this.c.getValue();
            if (e40Var == null) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    u.d = new ic2(this, sb2Var, i, b) { // from class: d40
                        public final /* synthetic */ byte x;
                        public final /* synthetic */ f40 y;
                        public final /* synthetic */ sb2 z;

                        {
                            this.x = b;
                            this.y = this;
                        }

                        @Override // defpackage.ic2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.x;
                            pn6 pn6Var = pn6.a;
                            sb2 sb2Var3 = this.z;
                            f40 f40Var = this.y;
                            kd2 kd2Var3 = (kd2) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    f40Var.b(sb2Var3, kd2Var3, kb0.N(7));
                                    return pn6Var;
                                default:
                                    f40Var.b(sb2Var3, kd2Var3, kb0.N(7));
                                    return pn6Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            sb2Var2 = sb2Var;
            kd2Var2 = kd2Var;
            this.a.g(e40Var, e40Var.a, sb2Var2, kd2Var2, 384);
        } else {
            sb2Var2 = sb2Var;
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u2 = kd2Var2.u();
        if (u2 != null) {
            u2.d = new ic2(this, sb2Var2, i, b2) { // from class: d40
                public final /* synthetic */ byte x;
                public final /* synthetic */ f40 y;
                public final /* synthetic */ sb2 z;

                {
                    this.x = b2;
                    this.y = this;
                }

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.x;
                    pn6 pn6Var = pn6.a;
                    sb2 sb2Var3 = this.z;
                    f40 f40Var = this.y;
                    kd2 kd2Var3 = (kd2) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            f40Var.b(sb2Var3, kd2Var3, kb0.N(7));
                            return pn6Var;
                        default:
                            f40Var.b(sb2Var3, kd2Var3, kb0.N(7));
                            return pn6Var;
                    }
                }
            };
        }
    }
}
