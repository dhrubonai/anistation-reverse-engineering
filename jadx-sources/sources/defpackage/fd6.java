package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fd6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd6(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return new fd6((wh3) obj2, vz0Var, (byte) 0);
            case 1:
                return new fd6((id0) obj2, vz0Var, (byte) 1);
            case 2:
                return new fd6((ak6) obj2, vz0Var, (byte) 2);
            case 3:
                fd6 fd6Var = new fd6((Context) obj2, vz0Var, (byte) 3);
                fd6Var.y = ((Boolean) obj).booleanValue();
                return fd6Var;
            default:
                return new fd6((pi4) obj2, vz0Var, (byte) 4);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((fd6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((fd6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((fd6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((fd6) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((fd6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
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
                wh3 wh3Var = (wh3) obj2;
                this.y = true;
                wh3Var.getClass();
                wh3Var.a.a.collect(new ii(new f44(), wh3Var, (byte) 7), this);
                return w11Var;
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
                    this.y = true;
                    if (((id0) obj2).invoke(this) == w11Var) {
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
                    this.y = true;
                    if (((ak6) obj2).h(this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 3:
                m37.N(obj);
                boolean z4 = this.y;
                Context context = (Context) obj2;
                String str = ph4.a;
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                ph4.a(packageManager, new ComponentName(context, (Class<?>) RescheduleReceiver.class), z4, nh4.x);
                return pn6Var;
            default:
                pi4 pi4Var = (pi4) obj2;
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
                    tw5 tw5Var = s07.a;
                    float h = pi4Var.h();
                    tw5 tw5Var2 = s07.a;
                    yz6 yz6Var = new yz6(pi4Var, (byte) 0);
                    this.y = true;
                    if (nv5.c(h, 0.0f, tw5Var2, yz6Var, this, 4) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
