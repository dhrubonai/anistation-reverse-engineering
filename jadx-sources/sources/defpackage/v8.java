package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v8 extends t36 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new v8((d9) obj2, (jc2) obj, vz0Var, (byte) 0);
            case 1:
                return new v8((e9) obj2, (jc2) obj, vz0Var, (byte) 1);
            case 2:
                return new v8((af) obj2, (q86) obj, vz0Var, (byte) 2);
            case 3:
                return new v8((f40) obj2, (e40) obj, vz0Var, (byte) 3);
            default:
                return new v8((x42) obj2, (w05) obj, vz0Var, (byte) 4);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((v8) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((v8) create(vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((v8) create(vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((v8) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((v8) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Looper myLooper;
        Handler handler;
        Looper looper;
        Looper looper2;
        xe xeVar;
        Looper looper3;
        byte b = this.x;
        byte b2 = 2;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.A;
        w11 w11Var = w11.x;
        Object obj3 = this.z;
        byte b3 = 1;
        vz0 vz0Var = null;
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
                d9 d9Var = (d9) obj2;
                s8 s8Var = new s8(d9Var, b2);
                e0 e0Var = new e0((jc2) obj3, d9Var, vz0Var, b3);
                this.y = true;
                if (h41.Y(s8Var, e0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                e9 e9Var = (e9) obj2;
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
                    t8 t8Var = new t8(e9Var, b3);
                    e0 e0Var2 = new e0((jc2) obj3, e9Var, vz0Var, b2);
                    this.y = true;
                    if (z51.J(t8Var, e0Var2, this) == w11Var) {
                        return w11Var;
                    }
                }
                y71 b4 = e9Var.b();
                pi4 pi4Var = e9Var.f;
                Object a = b4.a(pi4Var.h());
                if (a != null) {
                    if (Math.abs(pi4Var.h() - e9Var.b().c(a)) < 0.5f) {
                        e9Var.d.setValue(a);
                        e9Var.c.setValue(a);
                        return pn6Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            case 2:
                af afVar = (af) obj2;
                eu5 eu5Var = afVar.e;
                View view = afVar.a;
                boolean z3 = this.y;
                byte b5 = 3;
                try {
                    if (z3) {
                        if (z3) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        ye yeVar = new ye();
                        q86 q86Var = (q86) obj3;
                        byte b6 = 0;
                        xe xeVar2 = new xe(yeVar, new ve(afVar, q86Var, (byte) 0), new ve(afVar, q86Var, (byte) 1), view);
                        ub2 ub2Var = afVar.b;
                        if (ub2Var != null && (xeVar = (xe) ub2Var.invoke(xeVar2)) != null) {
                            xeVar2 = xeVar;
                        }
                        Looper myLooper2 = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (handler2 != null) {
                            looper2 = handler2.getLooper();
                        } else {
                            looper2 = null;
                        }
                        if (myLooper2 != looper2) {
                            ze zeVar = afVar.i;
                            if (zeVar == null) {
                                zeVar = new ze(afVar, xeVar2, yeVar, b6);
                                afVar.i = zeVar;
                            }
                            view.post(zeVar);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new v42(xeVar2), 1);
                            if (startActionMode != null) {
                                afVar.h = startActionMode;
                            } else {
                                return pn6Var;
                            }
                        }
                        this.y = true;
                        Object g = yeVar.a.g(this);
                        if (g != w11Var) {
                            g = pn6Var;
                        }
                        if (g == w11Var) {
                            return w11Var;
                        }
                    }
                    if (handler != null) {
                        looper3 = handler.getLooper();
                    } else {
                        looper3 = null;
                    }
                    if (myLooper != looper3) {
                        Runnable runnable = afVar.j;
                        if (runnable == null) {
                            runnable = new p0(afVar, b5);
                            afVar.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = afVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    ze zeVar2 = afVar.i;
                    if (zeVar2 != null) {
                        view.removeCallbacks(zeVar2);
                    }
                    afVar.h = null;
                    return pn6Var;
                } finally {
                    eu5Var.a();
                    myLooper = Looper.myLooper();
                    handler = view.getHandler();
                    if (handler != null) {
                        looper = handler.getLooper();
                    } else {
                        looper = null;
                    }
                    if (myLooper != looper) {
                        Runnable runnable2 = afVar.j;
                        if (runnable2 == null) {
                            runnable2 = new p0(afVar, b5);
                            afVar.j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = afVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    ze zeVar3 = afVar.i;
                    if (zeVar3 != null) {
                        view.removeCallbacks(zeVar3);
                    }
                    afVar.h = null;
                }
            case 3:
                e40 e40Var = (e40) obj3;
                ti4 ti4Var = ((f40) obj2).c;
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
                        ti4Var.setValue(e40Var);
                        this.y = true;
                        Object g2 = e40Var.b.g(this);
                        if (g2 != w11Var) {
                            g2 = pn6Var;
                        }
                        if (g2 == w11Var) {
                            return w11Var;
                        }
                    }
                    return pn6Var;
                } finally {
                    ti4Var.setValue(null);
                }
            default:
                w05 w05Var = (w05) obj3;
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    x42 x42Var = (x42) obj2;
                    Object obj4 = w05Var.x;
                    if (obj4 == tb4.a) {
                        obj4 = null;
                    }
                    this.y = true;
                    if (x42Var.emit(obj4, this) == w11Var) {
                        return w11Var;
                    }
                }
                w05Var.x = null;
                return pn6Var;
        }
    }
}
