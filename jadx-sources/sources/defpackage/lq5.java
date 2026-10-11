package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lq5 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final kz4 a(Context context) {
        kz4 kz4Var;
        kz4 kz4Var2;
        kz4 kz4Var3;
        kq5 kq5Var;
        kq5 kq5Var2;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        if (obj instanceof kz4) {
            kz4Var = (kz4) obj;
        } else {
            kz4Var = null;
        }
        if (kz4Var == null) {
            kz4 kz4Var4 = null;
            while (true) {
                Object obj2 = atomicReference.get();
                if (obj2 instanceof kz4) {
                    kz4Var2 = (kz4) obj2;
                    kz4Var3 = kz4Var4;
                } else {
                    if (kz4Var4 == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (obj2 instanceof kq5) {
                            kq5Var = (kq5) obj2;
                        } else {
                            kq5Var = null;
                        }
                        if (kq5Var != null) {
                            kz4Var4 = kq5Var.a(applicationContext);
                        } else {
                            if (applicationContext instanceof kq5) {
                                kq5Var2 = (kq5) applicationContext;
                            } else {
                                kq5Var2 = null;
                            }
                            if (kq5Var2 != null) {
                                kz4Var4 = kq5Var2.a(applicationContext);
                            } else {
                                kz4Var4 = nq5.a.a(applicationContext);
                            }
                        }
                    }
                    kz4Var2 = kz4Var4;
                    kz4Var3 = kz4Var2;
                }
                while (!atomicReference.compareAndSet(obj2, kz4Var2)) {
                    if (atomicReference.get() != obj2) {
                        break;
                    }
                }
                return kz4Var2;
                kz4Var4 = kz4Var3;
            }
        } else {
            return kz4Var;
        }
    }
}
