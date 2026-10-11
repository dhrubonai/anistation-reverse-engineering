package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rg3 extends fg3 {
    public final boolean b;
    public dn0 c;
    public final fq3 d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public eg3 i;
    public final sx5 j;

    public rg3(og3 og3Var, boolean z) {
        this.a = new cn7((byte) 7);
        this.b = z;
        this.c = new dn0((byte) 18);
        this.d = new fq3(og3Var);
        this.h = new ArrayList();
        eg3 eg3Var = eg3.y;
        this.i = eg3Var;
        this.j = tx5.a(eg3Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qg3] */
    @Override // defpackage.fg3
    public final void a(ng3 ng3Var) {
        lg3 o91Var;
        qg3 qg3Var;
        og3 og3Var;
        dg3 dg3Var;
        ng3Var.getClass();
        d("addObserver");
        eg3 eg3Var = this.i;
        eg3 eg3Var2 = eg3.x;
        if (eg3Var != eg3Var2) {
            eg3Var2 = eg3.y;
        }
        ?? obj = new Object();
        obj.a = eg3Var2;
        HashMap hashMap = ah3.a;
        boolean z = ng3Var instanceof lg3;
        boolean z2 = ng3Var instanceof m91;
        byte b = 2;
        Object obj2 = null;
        byte b2 = 0;
        if (z && z2) {
            o91Var = new o91((m91) ng3Var, (lg3) ng3Var, b2);
        } else if (z2) {
            o91Var = new o91((m91) ng3Var, obj2, b2);
        } else if (z) {
            o91Var = (lg3) ng3Var;
        } else {
            Class<?> cls = ng3Var.getClass();
            if (ah3.b(cls) == 2) {
                Object obj3 = ah3.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    qd2[] qd2VarArr = new qd2[size];
                    if (size <= 0) {
                        o91Var = new m05(qd2VarArr, b);
                    } else {
                        ah3.a((Constructor) list.get(0), ng3Var);
                        throw null;
                    }
                } else {
                    ah3.a((Constructor) list.get(0), ng3Var);
                    throw null;
                }
            } else {
                o91Var = new o91(ng3Var);
            }
        }
        obj.b = o91Var;
        dn0 dn0Var = this.c;
        dn0Var.getClass();
        p44 p44Var = (p44) dn0Var.y;
        o12 o12Var = (o12) p44Var.g(ng3Var);
        if (o12Var != null) {
            qg3Var = o12Var.y;
        } else {
            o12 o12Var2 = new o12(ng3Var, obj);
            p44Var.n(ng3Var, o12Var2);
            o12 o12Var3 = (o12) dn0Var.A;
            if (o12Var3 == null) {
                dn0Var.z = o12Var2;
                dn0Var.A = o12Var2;
            } else {
                o12Var3.z = o12Var2;
                o12Var2.A = o12Var3;
                dn0Var.A = o12Var2;
            }
            qg3Var = null;
        }
        if (qg3Var != null || (og3Var = (og3) ((WeakReference) this.d.y).get()) == null) {
            return;
        }
        if (this.e != 0 || this.f) {
            b2 = 1;
        }
        eg3 c = c(ng3Var);
        this.e++;
        while (obj.a.compareTo(c) < 0) {
            dn0 dn0Var2 = this.c;
            dn0Var2.getClass();
            if (!((p44) dn0Var2.y).c(ng3Var)) {
                break;
            }
            eg3 eg3Var3 = obj.a;
            ArrayList arrayList = this.h;
            arrayList.add(eg3Var3);
            bg3 bg3Var = dg3.Companion;
            eg3 eg3Var4 = obj.a;
            bg3Var.getClass();
            eg3Var4.getClass();
            int ordinal = eg3Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        dg3Var = null;
                    } else {
                        dg3Var = dg3.ON_RESUME;
                    }
                } else {
                    dg3Var = dg3.ON_START;
                }
            } else {
                dg3Var = dg3.ON_CREATE;
            }
            if (dg3Var != null) {
                obj.a(og3Var, dg3Var);
                dp0.c0(arrayList);
                c = c(ng3Var);
            } else {
                ze0.f(obj.a, "no event up from ");
                return;
            }
        }
        if (b2 == 0) {
            g();
        }
        this.e--;
    }

    @Override // defpackage.fg3
    public final void b(ng3 ng3Var) {
        ng3Var.getClass();
        d("removeObserver");
        dn0 dn0Var = this.c;
        dn0Var.getClass();
        o12 o12Var = (o12) ((p44) dn0Var.y).l(ng3Var);
        if (o12Var == null) {
            return;
        }
        o12 o12Var2 = o12Var.A;
        o12 o12Var3 = o12Var.z;
        if (o12Var2 == null) {
            dn0Var.z = o12Var3;
        } else {
            o12Var2.z = o12Var3;
        }
        o12 o12Var4 = o12Var.z;
        if (o12Var4 == null) {
            dn0Var.A = o12Var2;
        } else {
            o12Var4.A = o12Var2;
        }
        o12Var.B = true;
    }

    public final eg3 c(ng3 ng3Var) {
        o12 o12Var;
        eg3 eg3Var;
        dn0 dn0Var = this.c;
        dn0Var.getClass();
        ng3Var.getClass();
        o12 o12Var2 = (o12) ((p44) dn0Var.y).g(ng3Var);
        eg3 eg3Var2 = null;
        if (o12Var2 != null) {
            o12Var = o12Var2.A;
        } else {
            o12Var = null;
        }
        if (o12Var != null) {
            eg3Var = o12Var.y.a;
        } else {
            eg3Var = null;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            eg3Var2 = (eg3) arrayList.get(arrayList.size() - 1);
        }
        eg3 eg3Var3 = this.i;
        if (eg3Var == null || eg3Var.compareTo(eg3Var3) >= 0) {
            eg3Var = eg3Var3;
        }
        if (eg3Var2 != null && eg3Var2.compareTo(eg3Var) < 0) {
            return eg3Var2;
        }
        return eg3Var;
    }

    public final void d(String str) {
        if (this.b) {
            ta1 ta1Var = rr.n().a;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            p65.f(qx1.m("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(dg3 dg3Var) {
        dg3Var.getClass();
        d("handleLifecycleEvent");
        f(dg3Var.a());
    }

    public final void f(eg3 eg3Var) {
        if (this.i != eg3Var) {
            og3 og3Var = (og3) ((WeakReference) this.d.y).get();
            eg3 eg3Var2 = this.i;
            eg3 eg3Var3 = eg3.y;
            eg3 eg3Var4 = eg3.x;
            if (eg3Var2 == eg3Var3 && eg3Var == eg3Var4) {
                throw new IllegalStateException(("State must be at least '" + eg3.z + "' to be moved to '" + eg3Var + "' in component " + og3Var).toString());
            }
            if (eg3Var2 == eg3Var4 && eg3Var2 != eg3Var) {
                throw new IllegalStateException(("State is '" + eg3Var4 + "' and cannot be moved to `" + eg3Var + "` in component " + og3Var).toString());
            }
            this.i = eg3Var;
            if (!this.f && this.e == 0) {
                this.f = true;
                g();
                this.f = false;
                if (this.i == eg3Var4) {
                    this.c = new dn0((byte) 18);
                    return;
                }
                return;
            }
            this.g = true;
        }
    }

    public final void g() {
        Object obj = ((WeakReference) this.d.y).get();
        if (obj != null) {
            final og3 og3Var = (og3) obj;
            while (true) {
                dn0 dn0Var = this.c;
                final byte b = 0;
                if (((p44) dn0Var.y).e == 0) {
                    break;
                }
                o12 o12Var = (o12) dn0Var.z;
                if (o12Var != null) {
                    eg3 eg3Var = o12Var.y.a;
                    o12 o12Var2 = (o12) dn0Var.A;
                    if (o12Var2 != null) {
                        eg3 eg3Var2 = o12Var2.y.a;
                        if (eg3Var == eg3Var2 && this.i == eg3Var2) {
                            break;
                        }
                        this.g = false;
                        eg3 eg3Var3 = this.i;
                        if (o12Var != null) {
                            if (eg3Var3.compareTo(eg3Var) < 0) {
                                dn0 dn0Var2 = this.c;
                                ub2 ub2Var = new ub2(this) { // from class: pg3
                                    public final /* synthetic */ rg3 y;

                                    {
                                        this.y = this;
                                    }

                                    @Override // defpackage.ub2
                                    public final Object invoke(Object obj2) {
                                        dg3 dg3Var;
                                        byte b2 = b;
                                        pn6 pn6Var = pn6.a;
                                        og3 og3Var2 = og3Var;
                                        rg3 rg3Var = this.y;
                                        Map.Entry entry = (Map.Entry) obj2;
                                        switch (b2) {
                                            case 0:
                                                entry.getClass();
                                                ng3 ng3Var = (ng3) entry.getKey();
                                                qg3 qg3Var = (qg3) entry.getValue();
                                                while (true) {
                                                    eg3 eg3Var4 = qg3Var.a;
                                                    eg3 eg3Var5 = rg3Var.i;
                                                    ArrayList arrayList = rg3Var.h;
                                                    if (eg3Var4.compareTo(eg3Var5) > 0 && !rg3Var.g) {
                                                        dn0 dn0Var3 = rg3Var.c;
                                                        dn0Var3.getClass();
                                                        ng3Var.getClass();
                                                        if (((p44) dn0Var3.y).c(ng3Var)) {
                                                            bg3 bg3Var = dg3.Companion;
                                                            eg3 eg3Var6 = qg3Var.a;
                                                            bg3Var.getClass();
                                                            dg3 a = bg3.a(eg3Var6);
                                                            if (a != null) {
                                                                arrayList.add(a.a());
                                                                qg3Var.a(og3Var2, a);
                                                                dp0.c0(arrayList);
                                                            } else {
                                                                ov3.l(qg3Var.a, "no event down from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pn6Var;
                                                        }
                                                    } else {
                                                        return pn6Var;
                                                    }
                                                }
                                                break;
                                            default:
                                                entry.getClass();
                                                ng3 ng3Var2 = (ng3) entry.getKey();
                                                qg3 qg3Var2 = (qg3) entry.getValue();
                                                while (true) {
                                                    eg3 eg3Var7 = qg3Var2.a;
                                                    eg3 eg3Var8 = rg3Var.i;
                                                    ArrayList arrayList2 = rg3Var.h;
                                                    if (eg3Var7.compareTo(eg3Var8) < 0 && !rg3Var.g) {
                                                        dn0 dn0Var4 = rg3Var.c;
                                                        dn0Var4.getClass();
                                                        ng3Var2.getClass();
                                                        if (((p44) dn0Var4.y).c(ng3Var2)) {
                                                            arrayList2.add(qg3Var2.a);
                                                            bg3 bg3Var2 = dg3.Companion;
                                                            eg3 eg3Var9 = qg3Var2.a;
                                                            bg3Var2.getClass();
                                                            eg3Var9.getClass();
                                                            int ordinal = eg3Var9.ordinal();
                                                            if (ordinal != 1) {
                                                                if (ordinal != 2) {
                                                                    if (ordinal != 3) {
                                                                        dg3Var = null;
                                                                    } else {
                                                                        dg3Var = dg3.ON_RESUME;
                                                                    }
                                                                } else {
                                                                    dg3Var = dg3.ON_START;
                                                                }
                                                            } else {
                                                                dg3Var = dg3.ON_CREATE;
                                                            }
                                                            if (dg3Var != null) {
                                                                qg3Var2.a(og3Var2, dg3Var);
                                                                dp0.c0(arrayList2);
                                                            } else {
                                                                ov3.l(qg3Var2.a, "no event up from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pn6Var;
                                                        }
                                                    } else {
                                                        return pn6Var;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                dn0Var2.getClass();
                                for (o12 o12Var3 = (o12) dn0Var2.A; o12Var3 != null; o12Var3 = o12Var3.A) {
                                    if (!o12Var3.B) {
                                        ub2Var.invoke(o12Var3);
                                    }
                                }
                            }
                            o12 o12Var4 = (o12) this.c.A;
                            if (!this.g && o12Var4 != null && this.i.compareTo(o12Var4.y.a) > 0) {
                                dn0 dn0Var3 = this.c;
                                final byte b2 = 1;
                                ub2 ub2Var2 = new ub2(this) { // from class: pg3
                                    public final /* synthetic */ rg3 y;

                                    {
                                        this.y = this;
                                    }

                                    @Override // defpackage.ub2
                                    public final Object invoke(Object obj2) {
                                        dg3 dg3Var;
                                        byte b22 = b2;
                                        pn6 pn6Var = pn6.a;
                                        og3 og3Var2 = og3Var;
                                        rg3 rg3Var = this.y;
                                        Map.Entry entry = (Map.Entry) obj2;
                                        switch (b22) {
                                            case 0:
                                                entry.getClass();
                                                ng3 ng3Var = (ng3) entry.getKey();
                                                qg3 qg3Var = (qg3) entry.getValue();
                                                while (true) {
                                                    eg3 eg3Var4 = qg3Var.a;
                                                    eg3 eg3Var5 = rg3Var.i;
                                                    ArrayList arrayList = rg3Var.h;
                                                    if (eg3Var4.compareTo(eg3Var5) > 0 && !rg3Var.g) {
                                                        dn0 dn0Var32 = rg3Var.c;
                                                        dn0Var32.getClass();
                                                        ng3Var.getClass();
                                                        if (((p44) dn0Var32.y).c(ng3Var)) {
                                                            bg3 bg3Var = dg3.Companion;
                                                            eg3 eg3Var6 = qg3Var.a;
                                                            bg3Var.getClass();
                                                            dg3 a = bg3.a(eg3Var6);
                                                            if (a != null) {
                                                                arrayList.add(a.a());
                                                                qg3Var.a(og3Var2, a);
                                                                dp0.c0(arrayList);
                                                            } else {
                                                                ov3.l(qg3Var.a, "no event down from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pn6Var;
                                                        }
                                                    } else {
                                                        return pn6Var;
                                                    }
                                                }
                                                break;
                                            default:
                                                entry.getClass();
                                                ng3 ng3Var2 = (ng3) entry.getKey();
                                                qg3 qg3Var2 = (qg3) entry.getValue();
                                                while (true) {
                                                    eg3 eg3Var7 = qg3Var2.a;
                                                    eg3 eg3Var8 = rg3Var.i;
                                                    ArrayList arrayList2 = rg3Var.h;
                                                    if (eg3Var7.compareTo(eg3Var8) < 0 && !rg3Var.g) {
                                                        dn0 dn0Var4 = rg3Var.c;
                                                        dn0Var4.getClass();
                                                        ng3Var2.getClass();
                                                        if (((p44) dn0Var4.y).c(ng3Var2)) {
                                                            arrayList2.add(qg3Var2.a);
                                                            bg3 bg3Var2 = dg3.Companion;
                                                            eg3 eg3Var9 = qg3Var2.a;
                                                            bg3Var2.getClass();
                                                            eg3Var9.getClass();
                                                            int ordinal = eg3Var9.ordinal();
                                                            if (ordinal != 1) {
                                                                if (ordinal != 2) {
                                                                    if (ordinal != 3) {
                                                                        dg3Var = null;
                                                                    } else {
                                                                        dg3Var = dg3.ON_RESUME;
                                                                    }
                                                                } else {
                                                                    dg3Var = dg3.ON_START;
                                                                }
                                                            } else {
                                                                dg3Var = dg3.ON_CREATE;
                                                            }
                                                            if (dg3Var != null) {
                                                                qg3Var2.a(og3Var2, dg3Var);
                                                                dp0.c0(arrayList2);
                                                            } else {
                                                                ov3.l(qg3Var2.a, "no event up from ");
                                                                return null;
                                                            }
                                                        } else {
                                                            return pn6Var;
                                                        }
                                                    } else {
                                                        return pn6Var;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                dn0Var3.getClass();
                                for (o12 o12Var5 = (o12) dn0Var3.z; o12Var5 != null; o12Var5 = o12Var5.z) {
                                    if (!o12Var5.B) {
                                        ub2Var2.invoke(o12Var5);
                                    }
                                }
                            }
                        } else {
                            p65.h("Collection is empty.");
                            return;
                        }
                    } else {
                        p65.h("Collection is empty.");
                        return;
                    }
                } else {
                    p65.h("Collection is empty.");
                    return;
                }
            }
            this.g = false;
            this.j.k(this.i);
            return;
        }
        ze0.m("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
