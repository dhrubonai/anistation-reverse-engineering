package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class il7 {
    public static final zk3 a = new zk3("CastDynamiteModule", null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ui7] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static ui7 a(Context context, di0 di0Var, dn7 dn7Var, HashMap hashMap) {
        ?? sa7Var;
        yl7 b = b(context);
        ic4 ic4Var = new ic4(context.getApplicationContext());
        Parcel K = b.K();
        nn7.c(K, ic4Var);
        nn7.b(K, di0Var);
        nn7.c(K, dn7Var);
        K.writeMap(hashMap);
        Parcel L = b.L(K, 1);
        IBinder readStrongBinder = L.readStrongBinder();
        int i = zh7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof ui7) {
                sa7Var = (ui7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [yl7, sa7] */
    public static yl7 b(Context context) {
        try {
            IBinder b = yq1.c(context, yq1.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof yl7) {
                return (yl7) queryLocalInterface;
            }
            return new sa7(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 1);
        } catch (vq1 e) {
            throw new Exception(e);
        }
    }
}
