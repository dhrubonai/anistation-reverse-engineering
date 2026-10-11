package defpackage;

import android.view.MotionEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pz3 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pz3(m54 m54Var, l54 l54Var) {
        this.x = (byte) 2;
        this.y = m54Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        float f = 1.0f;
        boolean z = false;
        boolean z2 = true;
        CancellationException cancellationException = null;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                p55 p55Var = (p55) obj;
                float floatValue = ((Number) ((wj) obj2).d()).floatValue();
                float d = rz3.d(p55Var, floatValue);
                float e = rz3.e(p55Var, floatValue);
                if (e != 0.0f) {
                    f = d / e;
                }
                p55Var.i(f);
                p55Var.m(rz3.a);
                return pn6.a;
            case 1:
                dz3 dz3Var = (dz3) obj2;
                dz3Var.show();
                return new i5(dz3Var, (byte) 12);
            case 2:
                ((m54) obj2).l(null);
                return pn6.a;
            case 3:
                ((w74) obj2).a.setValue((z74) obj);
                return pn6.a;
            case 4:
                if (((a84) obj).b == ((k14) obj2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ((f44) obj2).a((wz3) obj);
                return Boolean.TRUE;
            case 6:
                jm0 jm0Var = (jm0) obj;
                jm0Var.getClass();
                List list = ((hc4) obj2).b;
                list.getClass();
                jm0Var.b = list;
                return pn6.a;
            case 7:
                aj5 aj5Var = (aj5) obj2;
                int intValue = ((Integer) obj).intValue();
                return aj5Var.f(intValue) + ": " + aj5Var.h(intValue).a();
            case 8:
                ((dg) ((ar4) obj2).a()).invoke((MotionEvent) obj);
                return pn6.a;
            case 9:
                jm0 jm0Var2 = (jm0) obj;
                jm0Var2.getClass();
                jm0.a(jm0Var2, HandleInvocationsFromAdViewer.KEY_AD_TYPE, mz5.b);
                jm0.a(jm0Var2, "value", dj5.b("kotlinx.serialization.Polymorphic<" + ((im0) ((fr4) obj2).a).f() + '>', fj5.a, new aj5[0]));
                jm0Var2.b = nt1.x;
                return pn6.a;
            case 10:
                bx4 bx4Var = (bx4) obj2;
                bi5 bi5Var = (bi5) obj;
                if (bx4Var.a.a() > 0.0f) {
                    zu4 zu4Var = new zu4(bx4Var.a.a(), new do0(0.0f, 1.0f), 0);
                    w73[] w73VarArr = zh5.a;
                    ai5 ai5Var = yh5.c;
                    w73 w73Var = zh5.a[1];
                    ai5Var.getClass();
                    bi5Var.b(ai5Var, zu4Var);
                }
                return pn6.a;
            case 11:
                ky4 ky4Var = (ky4) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (th instanceof CancellationException) {
                        cancellationException = (CancellationException) th;
                    }
                    if (cancellationException == null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "Channel was cancelled";
                        }
                        cancellationException = z51.b(message, th);
                    }
                    if (ky4Var.c == null) {
                        ky4Var.c = new zn0(cancellationException);
                        ky4Var.b.close();
                    }
                }
                return pn6.a;
            case 12:
                ((vu0) obj2).b(obj);
                return pn6.a;
            case 13:
                h05 h05Var = (h05) obj2;
                Throwable th2 = (Throwable) obj;
                CancellationException b2 = z51.b("Recomposer effect job completed", th2);
                synchronized (h05Var.c) {
                    try {
                        h43 h43Var = h05Var.d;
                        if (h43Var != null) {
                            sx5 sx5Var = h05Var.u;
                            d05 d05Var = d05.y;
                            sx5Var.getClass();
                            sx5Var.l(null, d05Var);
                            h43Var.l(b2);
                            h05Var.r = null;
                            h43Var.l0(new r82(h05Var, th2, (byte) 23));
                        } else {
                            h05Var.e = b2;
                            sx5 sx5Var2 = h05Var.u;
                            d05 d05Var2 = d05.x;
                            sx5Var2.getClass();
                            sx5Var2.l(null, d05Var2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return pn6.a;
            case 14:
                ((k05) obj2).a((or1) obj);
                return pn6.a;
            case 15:
                x26 x26Var = (x26) obj;
                x26Var.getClass();
                ((o65) obj2).h = x26Var;
                return pn6.a;
            case 16:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                return ((v65) obj2).createOpenHelper(r51Var);
            case 17:
                m85 m85Var = (m85) obj;
                m85Var.getClass();
                ((pz3) obj2).invoke(new g60(m85Var, (byte) 0));
                return pn6.a;
            case 18:
                c75 c75Var = (c75) obj2;
                m85 m85Var2 = (m85) obj;
                m85Var2.getClass();
                int i = c75Var.D;
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = c75Var.C[i2];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 == 5) {
                                            byte[] bArr = c75Var.B[i2];
                                            if (bArr != null) {
                                                m85Var2.f(i2, bArr);
                                            } else {
                                                ze0.k("Required value was null.");
                                                return null;
                                            }
                                        }
                                    } else {
                                        String str = c75Var.A[i2];
                                        if (str != null) {
                                            m85Var2.J(i2, str);
                                        } else {
                                            ze0.k("Required value was null.");
                                            return null;
                                        }
                                    }
                                } else {
                                    m85Var2.b(i2, c75Var.z[i2]);
                                }
                            } else {
                                m85Var2.e(i2, c75Var.y[i2]);
                            }
                        } else {
                            m85Var2.h(i2);
                        }
                        if (i2 != i) {
                            i2++;
                        }
                    }
                }
                return pn6.a;
            case 19:
                n95 n95Var = ((k95) obj2).z;
                if (n95Var != null) {
                    z2 = n95Var.b(obj);
                }
                return Boolean.valueOf(z2);
            case 20:
                ((j95) obj2).f(obj);
                return pn6.a;
            case 21:
                ((bu5) obj2).remove(obj);
                return pn6.a;
            case 22:
                yc5 yc5Var = (yc5) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                qi4 qi4Var = yc5Var.a;
                float h = qi4Var.h() + floatValue2 + yc5Var.g;
                float B = db.B(h, 0.0f, yc5Var.f.h());
                if (h == B) {
                    z = true;
                }
                float h2 = B - qi4Var.h();
                int round = Math.round(h2);
                qi4Var.i(qi4Var.h() + round);
                yc5Var.g = h2 - round;
                if (!z) {
                    floatValue2 = h2;
                }
                return Float.valueOf(floatValue2);
            case 23:
                rd5 rd5Var = (rd5) obj2;
                return new xc4(rd5Var.d(rd5Var.k, ((xc4) obj).a, rd5Var.j));
            case 24:
                uq4 uq4Var = (uq4) obj;
                if (((b14) obj2).c(uq4Var.c)) {
                    uq4Var.a();
                }
                return pn6.a;
            case 25:
                zh5.f((bi5) obj, ((m65) obj2).a);
                return pn6.a;
            case 26:
                ((List) obj).add((Float) ((ke3) obj2).invoke());
                return true;
            case 27:
                obj.getClass();
                return ((t) obj2).invoke();
            case 28:
                hm5 hm5Var = (hm5) obj2;
                String str2 = (String) obj;
                str2.getClass();
                tg5 tg5Var = new tg5((byte) 10);
                tg5 tg5Var2 = new tg5((byte) 11);
                String obj3 = uz5.w0(str2).toString();
                xm6 xm6Var = (xm6) hm5Var.j.getValue();
                if (uz5.V(obj3)) {
                    tg5Var2.invoke("Username is required");
                } else if (xm6Var.p.isEmpty()) {
                    tg5Var2.invoke("Select at least one status");
                } else {
                    tl7.z(zz.J(hm5Var), null, null, new cl1(xm6Var, hm5Var, obj3, tg5Var2, tg5Var, null), 3);
                }
                return pn6.a;
            default:
                lm5 lm5Var = (lm5) obj2;
                p55 p55Var2 = (p55) obj;
                p55Var2.j(p55Var2.Q.b() * lm5Var.x);
                p55Var2.k(lm5Var.y);
                p55Var2.e(lm5Var.z);
                p55Var2.d(lm5Var.A);
                p55Var2.l(lm5Var.B);
                return pn6.a;
        }
    }

    public /* synthetic */ pz3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
