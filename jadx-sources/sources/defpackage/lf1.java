package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lf1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ pf1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf1(pf1 pf1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = pf1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        pf1 pf1Var = this.z;
        switch (b) {
            case 0:
                return new lf1(pf1Var, vz0Var, (byte) 0);
            case 1:
                return new lf1(pf1Var, vz0Var, (byte) 1);
            case 2:
                return new lf1(pf1Var, vz0Var, (byte) 2);
            case 3:
                lf1 lf1Var = new lf1(pf1Var, vz0Var, (byte) 3);
                lf1Var.y = ((Boolean) obj).booleanValue();
                return lf1Var;
            default:
                return new lf1(pf1Var, vz0Var, (byte) 4);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((lf1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((lf1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((lf1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((lf1) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((lf1) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        byte b2 = 3;
        int i = 0;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        pf1 pf1Var = this.z;
        vz0 vz0Var = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    cy6 cy6Var = pf1Var.c;
                    String str = pf1Var.e;
                    Integer K = b06.K(str);
                    if (K != null) {
                        i = K.intValue();
                    }
                    ny6 ny6Var = (ny6) cy6Var;
                    ny6Var.getClass();
                    vz0 vz0Var2 = null;
                    mx0 mx0Var = new mx0(new iy6(ny6Var, str, i, vz0Var2, (byte) 0), (byte) 5);
                    ja1 ja1Var = rh1.a;
                    w42 D = zz.D(mx0Var, j91.y);
                    jf1 jf1Var = new jf1(pf1Var, vz0Var2, b3);
                    this.y = true;
                    if (iv.q(D, jf1Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    cy6 cy6Var2 = pf1Var.c;
                    String str2 = pf1Var.e;
                    Integer K2 = b06.K(str2);
                    if (K2 != null) {
                        i = K2.intValue();
                    }
                    ny6 ny6Var2 = (ny6) cy6Var2;
                    ny6Var2.getClass();
                    vz0 vz0Var3 = null;
                    mx0 mx0Var2 = new mx0(new iy6(ny6Var2, str2, i, vz0Var3, (byte) 1), (byte) 5);
                    ja1 ja1Var2 = rh1.a;
                    w42 D2 = zz.D(mx0Var2, j91.y);
                    jf1 jf1Var2 = new jf1(pf1Var, vz0Var3, (byte) 2);
                    this.y = true;
                    if (iv.q(D2, jf1Var2, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    cn cnVar = pf1Var.d;
                    String str3 = pf1Var.e;
                    on onVar = (on) cnVar;
                    onVar.getClass();
                    str3.getClass();
                    tm tmVar = onVar.b;
                    Integer J = b06.J(10, str3);
                    if (J != null) {
                        i = J.intValue();
                    }
                    in inVar = new in(tmVar.observeByIdentity(str3, i), (byte) 1);
                    jf1 jf1Var3 = new jf1(pf1Var, vz0Var, b2);
                    this.y = true;
                    if (iv.q(inVar, jf1Var3, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 3:
                boolean z4 = this.y;
                m37.N(obj);
                sx5 sx5Var = pf1Var.f;
                while (true) {
                    Object value = sx5Var.getValue();
                    boolean z5 = z4;
                    if (sx5Var.j(value, zm6.a((zm6) value, null, null, null, null, null, null, z5, 63))) {
                        return pn6Var;
                    }
                    z4 = z5;
                }
            default:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    cn cnVar2 = pf1Var.d;
                    String str4 = pf1Var.e;
                    on onVar2 = (on) cnVar2;
                    onVar2.getClass();
                    str4.getClass();
                    tm tmVar2 = onVar2.b;
                    Integer J2 = b06.J(10, str4);
                    if (J2 != null) {
                        i = J2.intValue();
                    }
                    w42 observeIsSaved = tmVar2.observeIsSaved(str4, i);
                    lf1 lf1Var = new lf1(pf1Var, vz0Var, b2);
                    this.y = true;
                    if (iv.q(observeIsSaved, lf1Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
