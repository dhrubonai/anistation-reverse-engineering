package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qb7 implements o30, g25, ng7, zd4 {
    public final /* synthetic */ byte x;
    public final Object y;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, so5] */
    public qb7(byte b) {
        this.x = b;
        switch (b) {
            case 11:
                this.y = new ConcurrentHashMap();
                return;
            case 12:
                this.y = new AtomicInteger();
                return;
            default:
                this.y = Collections.synchronizedMap(new so5(0));
                return;
        }
    }

    public static qb7 f(String str) {
        tv7 tv7Var;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            tv7Var = xv7.e(str.charAt(0));
        } else {
            tv7Var = tv7.UNINITIALIZED;
        }
        return new qb7((Object) tv7Var, (byte) 5);
    }

    public i08 a(String str, boolean z) {
        return new i08(str, (yh2) this.y, z);
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        byte b = this.x;
        Object obj3 = this.y;
        p76 p76Var = (p76) obj2;
        switch (b) {
            case 1:
                rb7 rb7Var = (rb7) ((xb7) obj).m();
                x76 x76Var = (x76) obj3;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(rb7Var.g);
                int i = db7.a;
                if (x76Var == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    x76Var.writeToParcel(obtain, 0);
                }
                try {
                    rb7Var.f.transact(1, obtain, null, 1);
                    obtain.recycle();
                    p76Var.b(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            case 2:
            default:
                int i2 = ww7.k;
                kw7 kw7Var = new kw7(p76Var);
                xw7 xw7Var = (xw7) ((yw7) obj).m();
                byte[] a = ((uy7) obj3).a();
                Parcel K = xw7Var.K();
                tm7.c(K, kw7Var);
                K.writeByteArray(a);
                xw7Var.M(K, 31);
                return;
            case 3:
                t98 t98Var = (t98) obj;
                uh7 uh7Var = (uh7) t98Var.m();
                lp i3 = rv5.i();
                pm7 pm7Var = ((sm7) obj3).k;
                Parcel K2 = uh7Var.K();
                nn7.c(K2, pm7Var);
                nn7.b(K2, i3);
                uh7Var.O(K2, 18);
                uh7 uh7Var2 = (uh7) t98Var.m();
                lp i4 = rv5.i();
                Parcel K3 = uh7Var2.K();
                nn7.b(K3, i4);
                uh7Var2.O(K3, 17);
                p76Var.b(null);
                return;
        }
    }

    @Override // defpackage.o30
    public void b(int i) {
        ((sh2) this.y).b(i);
    }

    @Override // defpackage.ng7
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ng7[]) this.y)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ng7
    public wg7 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            ng7 ng7Var = ((ng7[]) this.y)[i];
            if (ng7Var.c(cls)) {
                return ng7Var.d(cls);
            }
        }
        ov3.g("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.o30
    public void e(Bundle bundle) {
        ((sh2) this.y).onConnected();
    }

    public void g(int i, Object obj, pb8 pb8Var) {
        j98 j98Var = (j98) this.y;
        w88 w88Var = (w88) obj;
        j98Var.l(i, 2);
        j98Var.t(w88Var.b(pb8Var));
        pb8Var.h(w88Var, this);
    }

    @Override // defpackage.zd4
    public /* synthetic */ void onComplete(Task task) {
        ((gi0) ((jm7) this.y).g).f("joinApplication", task);
    }

    public /* synthetic */ qb7(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public qb7(kw7 kw7Var, byte[] bArr) {
        this.x = (byte) 6;
        this.y = bArr;
    }

    public qb7(j98 j98Var) {
        this.x = (byte) 14;
        Charset charset = la8.a;
        this.y = j98Var;
        j98Var.a = this;
    }
}
