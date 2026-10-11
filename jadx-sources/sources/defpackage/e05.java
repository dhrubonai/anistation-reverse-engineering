package defpackage;

import com.anistation.model.backup.BackupFrequency;
import com.anistation.model.backup.BackupResult;
import com.anistation.navigation.Route;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e05 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public boolean y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(cc6 cc6Var, yq4 yq4Var, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 11;
        this.A = cc6Var;
        this.B = yq4Var;
        this.y = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                e05 e05Var = new e05(this.A, obj2, vz0Var, (byte) 0);
                e05Var.z = obj;
                return e05Var;
            case 1:
                e05 e05Var2 = new e05(this.A, obj2, vz0Var, (byte) 1);
                e05Var2.z = obj;
                return e05Var2;
            case 2:
                return new e05((List) this.z, (vm6) this.A, (af3) obj2, vz0Var, (byte) 2);
            case 3:
                e05 e05Var3 = new e05(this.A, obj2, vz0Var, (byte) 3);
                e05Var3.z = obj;
                return e05Var3;
            case 4:
                e05 e05Var4 = new e05(this.A, obj2, vz0Var, (byte) 4);
                e05Var4.z = obj;
                return e05Var4;
            case 5:
                e05 e05Var5 = new e05(this.A, obj2, vz0Var, (byte) 5);
                e05Var5.z = obj;
                return e05Var5;
            case 6:
                return new e05((hm5) this.z, (nj4) this.A, (nl5) obj2, vz0Var, (byte) 6);
            case 7:
                return new e05((hm5) this.z, (BackupFrequency) this.A, (d0) obj2, vz0Var, (byte) 7);
            case 8:
                return new e05((wj) this.z, (tw5) this.A, (sb2) obj2, vz0Var, (byte) 8);
            case 9:
                return new e05((w42) this.z, (Route) this.A, (w44) obj2, vz0Var, (byte) 9);
            case 10:
                return new e05((cc6) this.z, (yq4) this.A, (lb5) obj2, vz0Var, (byte) 10);
            case 11:
                e05 e05Var6 = new e05((cc6) this.A, (yq4) obj2, this.y, vz0Var);
                e05Var6.z = obj;
                return e05Var6;
            case 12:
                return new e05((qt0) obj2, vz0Var);
            case 13:
                return new e05((e9) this.z, (w44) this.A, (pi4) obj2, vz0Var, (byte) 13);
            case 14:
                return new e05((wj) this.z, (v27) this.A, (sb2) obj2, vz0Var, (byte) 14);
            case 15:
                return new e05((do5) this.z, (sb2) this.A, (sb2) obj2, vz0Var, (byte) 15);
            default:
                return new e05((eo3) this.z, (z77) this.A, (ae4) obj2, vz0Var, (byte) 16);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((e05) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((e05) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((e05) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [e9] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v46, types: [t36, kc2] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object y45Var;
        Object value;
        Object value2;
        Object value3;
        Object a;
        Object value4;
        Object value5;
        m54 m54Var;
        byte b = this.x;
        ?? r1 = 10;
        char c = '\n';
        char c2 = '\n';
        byte b2 = 2;
        byte b3 = 4;
        Object obj2 = pn6.a;
        w11 w11Var = w11.x;
        Object obj3 = this.B;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var = (v11) this.z;
                this.y = true;
                ((g05) this.A).invoke(v11Var, (uf) obj3, this);
                return w11Var;
            case 1:
                boolean z2 = this.y;
                try {
                    if (z2) {
                        if (z2) {
                            yq0 yq0Var = (yq0) this.z;
                            m37.N(obj);
                            y45Var = obj;
                            r1 = yq0Var;
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        v11 v11Var2 = (v11) this.z;
                        zq0 zq0Var = (zq0) this.A;
                        ic2 ic2Var = (ic2) obj3;
                        this.z = zq0Var;
                        this.y = true;
                        y45Var = ic2Var.invoke(v11Var2, this);
                        r1 = zq0Var;
                        if (y45Var == w11Var) {
                            return w11Var;
                        }
                    }
                } catch (Throwable th) {
                    y45Var = new y45(th);
                }
                Throwable b4 = z45.b(y45Var);
                zq0 zq0Var2 = (zq0) r1;
                if (b4 == null) {
                    zq0Var2.Q(y45Var);
                    return obj2;
                }
                zq0Var2.g0(b4);
                return obj2;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                int max = Math.max(0, ((List) this.z).indexOf(((vm6) this.A).a));
                this.y = true;
                y23 y23Var = af3.y;
                if (((af3) obj3).f(max, 0, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                pd5 pd5Var = (pd5) this.z;
                l5 l5Var = (l5) this.A;
                r82 r82Var = new r82(pd5Var, (rd5) obj3, (byte) 28);
                this.y = true;
                if (l5Var.invoke(r82Var, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 4:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                wc5 wc5Var = (wc5) this.z;
                rd5 rd5Var = (rd5) this.A;
                rd5Var.k = wc5Var;
                pd5 pd5Var2 = rd5Var.l;
                this.y = true;
                if (((ic2) obj3).invoke(pd5Var2, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 5:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                v11 v11Var3 = (v11) this.z;
                mx0 j = wt5.j(new ci((px5) this.A, (byte) 2));
                ii iiVar = new ii((wj) obj3, v11Var3, c);
                this.y = true;
                if (j.collect(iiVar, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 6:
                hm5 hm5Var = (hm5) this.z;
                sx5 sx5Var = hm5Var.j;
                boolean z7 = this.y;
                try {
                    try {
                        try {
                            if (z7) {
                                if (z7) {
                                    m37.N(obj);
                                    a = obj;
                                } else {
                                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                m37.N(obj);
                                do {
                                    value3 = sx5Var.getValue();
                                } while (!sx5Var.j(value3, xm6.a((xm6) value3, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, true, false, false, 234881023)));
                                w00 w00Var = hm5Var.h;
                                this.y = true;
                                a = ((m10) w00Var).a(this);
                                if (a == w11Var) {
                                    return w11Var;
                                }
                            }
                            BackupResult backupResult = (BackupResult) a;
                            do {
                                value4 = sx5Var.getValue();
                            } while (!sx5Var.j(value4, xm6.a((xm6) value4, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, backupResult.getDisplayPath(), null, false, false, false, false, 264241151)));
                            ((nj4) this.A).invoke();
                            do {
                                value5 = sx5Var.getValue();
                            } while (!sx5Var.j(value5, xm6.a((xm6) value5, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 234881023)));
                            return obj2;
                        } catch (Throwable th2) {
                            do {
                                value2 = sx5Var.getValue();
                            } while (!sx5Var.j(value2, xm6.a((xm6) value2, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 234881023)));
                            throw th2;
                        }
                    } catch (Exception e) {
                        nl5 nl5Var = (nl5) obj3;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Backup failed";
                        }
                        nl5Var.invoke(message);
                        do {
                            value = sx5Var.getValue();
                        } while (!sx5Var.j(value, xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 234881023)));
                        return obj2;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            case 7:
                boolean z8 = this.y;
                try {
                    if (z8) {
                        if (z8) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        w00 w00Var2 = ((hm5) this.z).h;
                        BackupFrequency backupFrequency = (BackupFrequency) this.A;
                        this.y = true;
                        m10 m10Var = (m10) w00Var2;
                        m10Var.getClass();
                        ja1 ja1Var = rh1.a;
                        Object V = tl7.V(j91.y, new c0(backupFrequency, m10Var, vz0Var, c2), this);
                        if (V != w11Var) {
                            V = obj2;
                        }
                        if (V == w11Var) {
                            obj2 = w11Var;
                        }
                    }
                    return obj2;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    d0 d0Var = (d0) obj3;
                    String message2 = e4.getMessage();
                    if (message2 == null) {
                        message2 = "Unable to update the backup schedule";
                    }
                    d0Var.invoke(message2);
                    return obj2;
                }
            case 8:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wj wjVar = (wj) this.z;
                    Float f = new Float(1.0f);
                    tw5 tw5Var = (tw5) this.A;
                    this.y = true;
                    if (wj.a(wjVar, f, tw5Var, null, this, 12) == w11Var) {
                        return w11Var;
                    }
                }
                ((sb2) obj3).invoke();
                return obj2;
            case 9:
                boolean z10 = this.y;
                if (z10) {
                    if (z10) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                w42 w42Var = (w42) this.z;
                ii iiVar2 = new ii((Route) this.A, (w44) obj3, (byte) 12);
                this.y = true;
                if (w42Var.collect(iiVar2, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 10:
                boolean z11 = this.y;
                if (z11) {
                    if (z11) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cc6 cc6Var = (cc6) this.z;
                yq4 yq4Var = (yq4) this.A;
                lb5 lb5Var = (lb5) obj3;
                this.y = true;
                cc6Var.getClass();
                Object m = o80.m(yq4Var, new sb6(cc6Var, lb5Var), new tb6(cc6Var, lb5Var), this);
                if (m != w11Var) {
                    m = obj2;
                }
                if (m != w11Var) {
                    m = obj2;
                }
                if (m != w11Var) {
                    m = obj2;
                }
                if (m == w11Var) {
                    return w11Var;
                }
                return obj2;
            case 11:
                m37.N(obj);
                v11 v11Var4 = (v11) this.z;
                cc6 cc6Var2 = (cc6) this.A;
                yq4 yq4Var2 = (yq4) obj3;
                da6 da6Var = new da6(cc6Var2, yq4Var2, vz0Var, b3);
                y11 y11Var = y11.A;
                tl7.z(v11Var4, null, y11Var, da6Var, 1);
                boolean z12 = this.y;
                tl7.z(v11Var4, null, y11Var, new ac6(yq4Var2, cc6Var2, z12, (vz0) null), 1).l0(new k40(cc6Var2, b2));
                return tl7.z(v11Var4, null, y11Var, new ac6(cc6Var2, yq4Var2, z12, (vz0) null), 1);
            case 12:
                qt0 qt0Var = (qt0) obj3;
                boolean z13 = this.y;
                if (z13) {
                    if (z13) {
                        qt0Var = (qt0) this.A;
                        m54Var = (m54) this.z;
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    sf5 sf5Var = (sf5) qt0Var;
                    eu5 eu5Var = sf5Var.E;
                    if (eu5Var != null) {
                        eu5Var.d(sf5Var, tl7.j, sf5Var.D);
                    }
                    m54Var = sf5Var.H;
                    this.z = m54Var;
                    this.A = qt0Var;
                    this.y = true;
                    if (m54Var.a(this) == w11Var) {
                        return w11Var;
                    }
                }
                m54 m54Var2 = m54Var;
                try {
                    ((sf5) qt0Var).A = ((sf5) qt0Var).y.getValue();
                    qg0 qg0Var = ((sf5) qt0Var).G;
                    if (qg0Var != null) {
                        qg0Var.resumeWith(((sf5) qt0Var).y.getValue());
                    }
                    ((sf5) qt0Var).G = null;
                    m54Var2.l(null);
                    return obj2;
                } catch (Throwable th3) {
                    m54Var2.l(null);
                    throw th3;
                }
            case 13:
                ?? r0 = (e9) this.z;
                boolean z14 = this.y;
                if (z14) {
                    if (z14) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                w44 w44Var = (w44) this.A;
                tw5 tw5Var2 = s07.a;
                h43 h43Var = (h43) w44Var.getValue();
                if (h43Var != null) {
                    h43Var.l(null);
                }
                ((pi4) obj3).i(0.0f);
                if (r0.c.getValue() != xx6.z) {
                    this.y = true;
                    ?? t36Var = new t36(4, null);
                    Object a2 = r0.a(xx6.y, c54.x, t36Var, this);
                    if (a2 != w11Var) {
                        a2 = obj2;
                    }
                    if (a2 == w11Var) {
                        return w11Var;
                    }
                    return obj2;
                }
                return obj2;
            case 14:
                boolean z15 = this.y;
                if (z15) {
                    if (z15) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wj wjVar2 = (wj) this.z;
                    Float f2 = new Float(0.0f);
                    sk6 sk6Var = s07.d;
                    this.y = true;
                    if (wj.a(wjVar2, f2, sk6Var, null, this, 12) == w11Var) {
                        return w11Var;
                    }
                }
                ((v27) this.A).R();
                ((sb2) obj3).invoke();
                return obj2;
            case 15:
                do5 do5Var = (do5) this.z;
                boolean z16 = this.y;
                if (z16) {
                    if (z16) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    this.y = true;
                    if (do5Var.d(this) == w11Var) {
                        return w11Var;
                    }
                }
                if (!do5Var.e()) {
                    ((sb2) this.A).invoke();
                    ((sb2) obj3).invoke();
                    return obj2;
                }
                return obj2;
            default:
                z77 z77Var = (z77) this.A;
                boolean z17 = this.y;
                if (z17) {
                    if (z17) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                w42 z18 = ((eo3) this.z).z(z77Var);
                ii iiVar3 = new ii((ae4) obj3, z77Var, (byte) 14);
                this.y = true;
                if (z18.collect(iiVar3, this) == w11Var) {
                    return w11Var;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(qt0 qt0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 12;
        this.B = qt0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e05(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e05(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
