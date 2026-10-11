package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class uw7 implements g25, zd4, ec7, hs7, cb8 {
    public final Object x;

    public /* synthetic */ uw7(Object obj) {
        this.x = obj;
    }

    @Override // defpackage.ec7
    public void a(Bitmap bitmap) {
        ((a58) this.x).c(bitmap, 3);
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        xw7 xw7Var = (xw7) ((yw7) obj).m();
        kw7 kw7Var = new kw7((ww7) this.x, (p76) obj2);
        Parcel K = xw7Var.K();
        tm7.c(K, kw7Var);
        xw7Var.M(K, 27);
    }

    @Override // defpackage.hs7
    public /* synthetic */ void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((z18) this.x).B(str, i, th, bArr, map);
    }

    @Override // defpackage.cb8
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((cb8[]) this.x)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cb8
    public ob8 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            cb8 cb8Var = ((cb8[]) this.x)[i];
            if (cb8Var.c(cls)) {
                return cb8Var.d(cls);
            }
        }
        ov3.g("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.zd4
    public void onComplete(Task task) {
        dx7 dx7Var = (dx7) this.x;
        if (((v78) task).d) {
            dx7Var.cancel(false);
            return;
        }
        if (task.d()) {
            dx7Var.l(task.c());
            return;
        }
        Exception b = task.b();
        if (b != null) {
            dx7Var.m(b);
        } else {
            p65.l();
        }
    }
}
