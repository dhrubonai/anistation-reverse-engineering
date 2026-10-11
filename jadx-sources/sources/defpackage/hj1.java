package defpackage;

import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hj1 extends uc2 implements ic2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(v27 v27Var) {
        super(2, v27Var, v27.class, "setDownloadPaused", "setDownloadPaused(Ljava/lang/String;Z)V", 0);
        this.x = (byte) 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r15v9, types: [n13, k72, java.lang.Object] */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean a;
        boolean a2;
        Object value;
        byte b = this.x;
        boolean z = true;
        xd3 xd3Var = null;
        Object[] objArr = 0;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                tm1 tm1Var = (tm1) this.receiver;
                tm1Var.getClass();
                qk1 qk1Var = tm1Var.b;
                if (booleanValue) {
                    ((fl1) qk1Var).l(str);
                } else {
                    ((fl1) qk1Var).q(str);
                }
                return pn6Var;
            case 1:
                d82 d82Var = (d82) obj;
                d82 d82Var2 = (d82) obj2;
                f82 f82Var = (f82) this.receiver;
                if (f82Var.K && (a = d82Var2.a()) != d82Var.a()) {
                    if (a) {
                        ?? obj3 = new Object();
                        h98.I(f82Var, new va1(obj3, f82Var, (byte) 6));
                        xd3 xd3Var2 = (xd3) obj3.x;
                        if (xd3Var2 != null) {
                            xd3Var2.a();
                            xd3Var = xd3Var2;
                        }
                        f82Var.O = xd3Var;
                    } else {
                        xd3 xd3Var3 = f82Var.O;
                        if (xd3Var3 != null) {
                            xd3Var3.b();
                        }
                        f82Var.O = null;
                    }
                }
                return pn6Var;
            case 2:
                d82 d82Var3 = (d82) obj;
                d82 d82Var4 = (d82) obj2;
                m82 m82Var = (m82) this.receiver;
                if (m82Var.K && (a2 = d82Var4.a()) != d82Var3.a()) {
                    ub2 ub2Var = m82Var.O;
                    if (ub2Var != null) {
                        ub2Var.invoke(Boolean.valueOf(a2));
                    }
                    if (a2) {
                        tl7.z(m82Var.O0(), null, y11.A, new hu1(m82Var, objArr == true ? 1 : 0, (byte) 10), 1);
                        ?? obj4 = new Object();
                        h98.I(m82Var, new va1(obj4, m82Var, (byte) 8));
                        xd3 xd3Var4 = (xd3) obj4.x;
                        if (xd3Var4 != null) {
                            xd3Var4.a();
                        } else {
                            xd3Var4 = null;
                        }
                        m82Var.Q = xd3Var4;
                        fa4 fa4Var = m82Var.R;
                        if (fa4Var != null && fa4Var.Y0().K) {
                            m82Var.e1();
                        }
                    } else {
                        xd3 xd3Var5 = m82Var.Q;
                        if (xd3Var5 != null) {
                            xd3Var5.b();
                        }
                        m82Var.Q = null;
                        m82Var.e1();
                    }
                    z51.w(m82Var);
                    u34 u34Var = m82Var.N;
                    if (u34Var != null) {
                        k72 k72Var = m82Var.P;
                        if (a2) {
                            if (k72Var != null) {
                                m82Var.d1(u34Var, new l72(k72Var));
                                m82Var.P = null;
                            }
                            ?? obj5 = new Object();
                            m82Var.d1(u34Var, obj5);
                            m82Var.P = obj5;
                        } else if (k72Var != null) {
                            m82Var.d1(u34Var, new l72(k72Var));
                            m82Var.P = null;
                        }
                    }
                }
                return pn6Var;
            case 3:
                String str2 = (String) obj;
                int intValue = ((Number) obj2).intValue();
                str2.getClass();
                rn2 rn2Var = (rn2) this.receiver;
                rn2Var.getClass();
                sx5 sx5Var = rn2Var.e;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, tm6.a((tm6) value, null, null, intValue, str2, null, false, 51)));
                if (!(((Resource) ((tm6) sx5Var.getValue()).a.get(str2)) instanceof Resource.Success)) {
                    rn2Var.f(str2, new nn2(rn2Var, str2, null));
                }
                return pn6Var;
            case 4:
                aj5 aj5Var = (aj5) obj;
                int intValue2 = ((Number) obj2).intValue();
                aj5Var.getClass();
                s53 s53Var = (s53) this.receiver;
                s53Var.getClass();
                if (aj5Var.i(intValue2) || !aj5Var.h(intValue2).c()) {
                    z = false;
                }
                s53Var.b = z;
                return Boolean.valueOf(z);
            case 5:
                return w65.s((vz0) obj2, (ub2) obj, (v65) this.receiver);
            case 6:
                return w65.s((vz0) obj2, (ub2) obj, (v65) this.receiver);
            case 7:
                Object e = ((af5) this.receiver).e((String) obj, (vz0) obj2);
                if (e == w11.x) {
                    return e;
                }
                return pn6Var;
            default:
                String str3 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                str3.getClass();
                v27 v27Var = (v27) this.receiver;
                v27Var.getClass();
                qk1 qk1Var2 = v27Var.g;
                if (booleanValue2) {
                    ((fl1) qk1Var2).l(str3);
                } else {
                    ((fl1) qk1Var2).q(str3);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }
}
