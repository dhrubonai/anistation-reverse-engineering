package defpackage;

import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class b9 extends t36 implements jc2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(rt3 rt3Var, l5 l5Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.x = (byte) 0;
        this.z = rt3Var;
        this.A = l5Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        byte b2 = 3;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return new b9((rt3) this.z, (l5) this.A, (vz0) obj3).invokeSuspend(pn6Var);
            case 1:
                b9 b9Var = new b9((int) b2, (vz0) obj3, (byte) 1);
                b9Var.z = (yl4) obj;
                b9Var.A = obj2;
                return b9Var.invokeSuspend(pn6Var);
            case 2:
                b9 b9Var2 = new b9((int) b2, (vz0) obj3, (byte) 2);
                b9Var2.z = (yl4) obj;
                b9Var2.A = (as2) obj2;
                return b9Var2.invokeSuspend(pn6Var);
            case 3:
                b9 b9Var3 = new b9((wp2) this.A, (vz0) obj3, b2);
                b9Var3.z = (yl4) obj;
                return b9Var3.invokeSuspend(pn6Var);
            case 4:
                long j = ((xc4) obj2).a;
                b9 b9Var4 = new b9(this.A, (vz0) obj3, (byte) 4);
                b9Var4.z = (ot4) obj;
                return b9Var4.invokeSuspend(pn6Var);
            case 5:
                b9 b9Var5 = new b9(this.A, (vz0) obj3, (byte) 5);
                b9Var5.z = (yl4) obj;
                return b9Var5.invokeSuspend(pn6Var);
            case 6:
                b9 b9Var6 = new b9(this.A, (vz0) obj3, (byte) 6);
                b9Var6.z = (yl4) obj;
                return b9Var6.invokeSuspend(pn6Var);
            case 7:
                b9 b9Var7 = new b9(this.A, (vz0) obj3, (byte) 7);
                b9Var7.z = (yl4) obj;
                return b9Var7.invokeSuspend(pn6Var);
            default:
                b9 b9Var8 = new b9((int) b2, (vz0) obj3, (byte) 8);
                b9Var8.z = (x42) obj;
                b9Var8.A = (Object[]) obj2;
                return b9Var8.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        yg4 yg4Var;
        jz0 jz0Var;
        xx0 xx0Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        xx0 xx0Var2 = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                c9 c9Var = (c9) ((rt3) this.z).y;
                l5 l5Var = (l5) this.A;
                this.y = true;
                if (l5Var.invoke(c9Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                yl4 yl4Var = (yl4) this.z;
                Object obj2 = this.A;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                Object obj3 = yl4Var.x;
                if (((or2) obj3).c.r("Accept") == null) {
                    ((or2) obj3).c.h("Accept", "*/*");
                }
                or2 or2Var = (or2) obj3;
                jz0 B = n77.B(or2Var);
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (B == null) {
                        B = iz0.a;
                    }
                    yg4Var = new m86(str, B);
                } else if (obj2 instanceof byte[]) {
                    yg4Var = new nb1(B, obj2);
                } else if (obj2 instanceof wc0) {
                    yg4Var = new ob1(yl4Var, B, obj2);
                } else if (obj2 instanceof yg4) {
                    yg4Var = (yg4) obj2;
                } else {
                    or2Var.getClass();
                    obj2.getClass();
                    if (obj2 instanceof InputStream) {
                        yg4Var = new ob1(or2Var, B, obj2);
                    } else {
                        yg4Var = null;
                    }
                }
                if (yg4Var != null) {
                    jz0Var = yg4Var.b();
                } else {
                    jz0Var = null;
                }
                if (jz0Var != null) {
                    ((Map) or2Var.c.x).remove("Content-Type");
                    yk3 yk3Var = qb1.a;
                    if (nx7.N(yk3Var)) {
                        yk3Var.h("Transformed with default transformers request body for " + or2Var.a + " from " + z05.a(obj2.getClass()));
                    }
                    this.z = null;
                    this.A = null;
                    this.y = true;
                    if (yl4Var.d(this, yg4Var) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            case 2:
                yl4 yl4Var2 = (yl4) this.z;
                as2 as2Var = (as2) this.A;
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                vk6 vk6Var = as2Var.a;
                Object obj4 = as2Var.b;
                if ((obj4 instanceof wc0) && vk6Var.a.equals(z05.a(InputStream.class))) {
                    as2 as2Var2 = new as2(vk6Var, new oc0((wc0) obj4, h98.w(((yp2) yl4Var2.x).getCoroutineContext())));
                    this.z = null;
                    this.A = null;
                    this.y = true;
                    if (yl4Var2.d(this, as2Var2) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            case 3:
                yl4 yl4Var3 = (yl4) this.z;
                boolean z4 = this.y;
                try {
                    if (z4) {
                        if (z4) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        this.z = yl4Var3;
                        this.y = true;
                        obj = yl4Var3.c(this);
                        if (obj == w11Var) {
                            return w11Var;
                        }
                    }
                    return pn6Var;
                } catch (Throwable th) {
                    cn7 cn7Var = ((wp2) this.A).F;
                    q18 q18Var = a34.e;
                    ((yp2) yl4Var3.x).d();
                    cn7Var.getClass();
                    h11.v(((k01) cn7Var.x).a(q18Var));
                    throw th;
                }
            case 4:
                ot4 ot4Var = (ot4) this.z;
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ((sb2) ((w44) this.A).getValue()).invoke();
                this.z = null;
                this.y = true;
                if (ot4Var.e(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 5:
                yl4 yl4Var4 = (yl4) this.z;
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                kc2 kc2Var = (kc2) this.A;
                Object obj5 = new Object();
                Object obj6 = yl4Var4.x;
                Object b2 = yl4Var4.b();
                this.z = null;
                this.y = true;
                if (kc2Var.e(obj5, obj6, b2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 6:
                yl4 yl4Var5 = (yl4) this.z;
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ic2 ic2Var = (ic2) this.A;
                Object obj7 = yl4Var5.x;
                this.z = null;
                this.y = true;
                if (ic2Var.invoke(obj7, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 7:
                yl4 yl4Var6 = (yl4) this.z;
                boolean z8 = this.y;
                if (z8) {
                    if (z8) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                jc2 jc2Var = (jc2) this.A;
                Object obj8 = yl4Var6.x;
                ic5 ic5Var = new ic5(1, yl4Var6, yl4.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, (byte) 1);
                this.z = null;
                this.y = true;
                if (jc2Var.invoke(obj8, ic5Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                x42 x42Var = (x42) this.z;
                xx0[] xx0VarArr = (xx0[]) ((Object[]) this.A);
                int length = xx0VarArr.length;
                int i = 0;
                while (true) {
                    xx0Var = vx0.a;
                    if (i < length) {
                        xx0 xx0Var3 = xx0VarArr[i];
                        if (!a34.i(xx0Var3, xx0Var)) {
                            xx0Var2 = xx0Var3;
                        } else {
                            i++;
                        }
                    }
                }
                if (xx0Var2 != null) {
                    xx0Var = xx0Var2;
                }
                this.y = true;
                if (x42Var.emit(xx0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(Object obj, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.A = obj;
    }
}
