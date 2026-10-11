package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qr2 extends t36 implements jc2 {
    public Object A;
    public /* synthetic */ ec2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public /* synthetic */ or2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(jc2 jc2Var, wp2 wp2Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.B = jc2Var;
        this.C = wp2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj4 = this.C;
        switch (b) {
            case 0:
                qr2 qr2Var = new qr2((cn0) obj4, (vz0) obj3);
                qr2Var.z = (or2) obj;
                qr2Var.B = (ub2) obj2;
                return qr2Var.invokeSuspend(pn6Var);
            default:
                qr2 qr2Var2 = new qr2((jc2) this.B, (wp2) obj4, (vz0) obj3);
                qr2Var2.A = (li5) obj;
                qr2Var2.z = (or2) obj2;
                return qr2Var2.invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t43, q26, j43, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        q26 q26Var;
        byte b = this.x;
        Object obj2 = this.C;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                or2 or2Var = this.z;
                ub2 ub2Var = (ub2) this.B;
                boolean z = this.y;
                if (z) {
                    if (z) {
                        q26Var = (q26) this.A;
                        try {
                            m37.N(obj);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                q26Var.getClass();
                                q26Var.Q(new dr0(th, false));
                                throw th;
                            } catch (Throwable th2) {
                                q26Var.g0();
                                throw th2;
                            }
                        }
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ?? j43Var = new j43(or2Var.e);
                    j11 j11Var = ((cn0) obj2).a.z.get(h95.F);
                    j11Var.getClass();
                    yk3 yk3Var = rr2.a;
                    j43Var.l0(new lz0(((h43) j11Var).l0(new lz0(j43Var, (byte) 16)), (byte) 17));
                    try {
                        or2Var.e = j43Var;
                        this.z = null;
                        this.B = null;
                        this.A = j43Var;
                        this.y = true;
                        if (ub2Var.invoke(this) != w11Var) {
                            q26Var = j43Var;
                        } else {
                            return w11Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        q26Var = j43Var;
                        q26Var.getClass();
                        q26Var.Q(new dr0(th, false));
                        throw th;
                    }
                }
                q26Var.g0();
                return pn6.a;
            default:
                li5 li5Var = (li5) this.A;
                or2 or2Var2 = this.z;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                jc2 jc2Var = (jc2) this.B;
                ji5 ji5Var = new ji5(li5Var, ((wp2) obj2).z);
                this.A = null;
                this.z = null;
                this.y = true;
                Object invoke = jc2Var.invoke(ji5Var, or2Var2, this);
                if (invoke == w11Var) {
                    return w11Var;
                }
                return invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(cn0 cn0Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.C = cn0Var;
    }
}
