package defpackage;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jj1 implements Handler.Callback {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ jj1(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                kj1 kj1Var = (kj1) obj;
                lj1 lj1Var = kj1Var.y;
                boolean z = kj1Var.H;
                if (!z) {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 2) {
                            if (!z) {
                                kj1Var.H = true;
                                kj1Var.D.sendEmptyMessage(4);
                            }
                            Object obj2 = message.obj;
                            String str = eq6.a;
                            lj1Var.g.post(new gb(lj1Var, (IOException) obj2, (byte) 24));
                            return true;
                        }
                    } else {
                        try {
                            lj1Var.c();
                            return true;
                        } catch (yx1 e) {
                            kj1Var.B.obtainMessage(2, new IOException(e)).sendToTarget();
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                ik1 ik1Var = (ik1) obj;
                CopyOnWriteArraySet copyOnWriteArraySet = ik1Var.d;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ek1 ek1Var = (ek1) message.obj;
                            ik1Var.m = Collections.unmodifiableList(ek1Var.c);
                            cj1 cj1Var = ek1Var.a;
                            boolean e2 = ik1Var.e();
                            if (ek1Var.b) {
                                Iterator it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    ((gk1) it.next()).f(ik1Var, cj1Var);
                                }
                            } else {
                                Iterator it2 = copyOnWriteArraySet.iterator();
                                while (it2.hasNext()) {
                                    ((gk1) it2.next()).b(ik1Var, cj1Var);
                                }
                            }
                            if (!e2) {
                                return true;
                            }
                            ik1Var.a();
                            return true;
                        }
                        p65.l();
                        return false;
                    }
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = ik1Var.e - i3;
                    ik1Var.e = i5;
                    ik1Var.f = i4;
                    if (i4 != 0 || i5 != 0) {
                        return true;
                    }
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        ((gk1) it3.next()).d();
                    }
                    return true;
                }
                List list = (List) message.obj;
                ik1Var.g = true;
                ik1Var.m = Collections.unmodifiableList(list);
                boolean e3 = ik1Var.e();
                Iterator it4 = copyOnWriteArraySet.iterator();
                while (it4.hasNext()) {
                    ((gk1) it4.next()).a(ik1Var);
                }
                if (!e3) {
                    return true;
                }
                ik1Var.a();
                return true;
            case 2:
                ui3 ui3Var = (ui3) obj;
                si3 si3Var = (si3) ui3Var.e;
                si3Var.getClass();
                Iterator it5 = ((CopyOnWriteArraySet) ui3Var.f).iterator();
                while (it5.hasNext()) {
                    ti3 ti3Var = (ti3) it5.next();
                    if (!ti3Var.d && ti3Var.c) {
                        g42 d = ti3Var.b.d();
                        ti3Var.b = new mn0();
                        ti3Var.c = false;
                        si3Var.c(ti3Var.a, d);
                    }
                    k46 k46Var = (k46) ui3Var.d;
                    k46Var.getClass();
                    if (k46Var.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                kf kfVar = (kf) obj;
                int i6 = message.what;
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                return false;
                            }
                            ((k06) kfVar.H).a();
                            return true;
                        }
                        ((j06) kfVar.G).a();
                        return true;
                    }
                    ((i06) kfVar.F).a();
                    return true;
                }
                ((h06) kfVar.E).a();
                return true;
            default:
                ni6 ni6Var = (ni6) obj;
                if (ni6Var.B && message.what != 4) {
                    return true;
                }
                try {
                    int i7 = message.what;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    return false;
                                }
                                ni6Var.c(message.arg1, (oz1) message.obj);
                                return true;
                            }
                            ni6Var.b();
                            return true;
                        }
                        ni6Var.m.add((c95) message.obj);
                        if (ni6Var.v) {
                            return true;
                        }
                        ni6Var.i.j(3);
                        ni6Var.v = true;
                        return true;
                    }
                    ArrayList arrayList = ni6Var.j;
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        ((qi5) arrayList.get(i8)).start();
                    }
                    return true;
                } catch (RuntimeException e4) {
                    ni6Var.c(2, oz1.d(e4));
                    return true;
                } catch (oz1 e5) {
                    ni6Var.c(2, e5);
                    return true;
                }
        }
    }
}
