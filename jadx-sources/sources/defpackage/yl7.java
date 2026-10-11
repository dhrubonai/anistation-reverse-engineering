package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yl7 extends sa7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [dl7] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final dl7 P(String str, String str2, jm7 jm7Var) {
        ?? sa7Var;
        Parcel K = K();
        K.writeString(str);
        K.writeString(str2);
        nn7.c(K, jm7Var);
        Parcel L = L(K, 2);
        IBinder readStrongBinder = L.readStrongBinder();
        int i = zk7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof dl7) {
                sa7Var = (dl7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [xj7] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final xj7 Q(di0 di0Var, tt2 tt2Var, jm7 jm7Var) {
        ?? sa7Var;
        Parcel K = K();
        nn7.b(K, di0Var);
        nn7.c(K, tt2Var);
        nn7.c(K, jm7Var);
        Parcel L = L(K, 3);
        IBinder readStrongBinder = L.readStrongBinder();
        int i = wj7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof xj7) {
                sa7Var = (xj7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [sk7] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final sk7 R(ic4 ic4Var, tt2 tt2Var, tt2 tt2Var2) {
        ?? sa7Var;
        Parcel K = K();
        nn7.c(K, ic4Var);
        nn7.c(K, tt2Var);
        nn7.c(K, tt2Var2);
        Parcel L = L(K, 5);
        IBinder readStrongBinder = L.readStrongBinder();
        int i = pk7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof sk7) {
                sa7Var = (sk7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [ar7] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final ar7 S(ic4 ic4Var, jm7 jm7Var, int i, int i2) {
        ?? sa7Var;
        Parcel K = K();
        nn7.c(K, ic4Var);
        nn7.c(K, jm7Var);
        K.writeInt(i);
        K.writeInt(i2);
        K.writeInt(0);
        K.writeLong(2097152L);
        K.writeInt(5);
        K.writeInt(333);
        K.writeInt(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        Parcel L = L(K, 6);
        IBinder readStrongBinder = L.readStrongBinder();
        int i3 = wp7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof ar7) {
                sa7Var = (ar7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [ar7] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final ar7 T(ic4 ic4Var, ic4 ic4Var2, jm7 jm7Var, int i, int i2) {
        ?? sa7Var;
        Parcel K = K();
        nn7.c(K, ic4Var);
        nn7.c(K, ic4Var2);
        nn7.c(K, jm7Var);
        K.writeInt(i);
        K.writeInt(i2);
        K.writeInt(0);
        K.writeLong(2097152L);
        K.writeInt(5);
        K.writeInt(333);
        K.writeInt(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        Parcel L = L(K, 7);
        IBinder readStrongBinder = L.readStrongBinder();
        int i3 = wp7.f;
        if (readStrongBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof ar7) {
                sa7Var = (ar7) queryLocalInterface;
            } else {
                sa7Var = new sa7(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 1);
            }
        }
        L.recycle();
        return sa7Var;
    }
}
