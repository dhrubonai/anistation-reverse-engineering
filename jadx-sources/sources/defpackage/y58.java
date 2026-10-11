package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class y58 {
    public static final zk3 a = new zk3("MediaSessionUtils", null);

    public static ArrayList a(ep7 ep7Var) {
        try {
            Parcel L = ep7Var.L(ep7Var.K(), 3);
            ArrayList createTypedArrayList = L.createTypedArrayList(ab4.CREATOR);
            L.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", ep7.class.getSimpleName()};
            zk3 zk3Var = a;
            Log.e(zk3Var.a, zk3Var.c("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(ep7 ep7Var) {
        try {
            Parcel L = ep7Var.L(ep7Var.K(), 4);
            int[] createIntArray = L.createIntArray();
            L.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", ep7.class.getSimpleName()};
            zk3 zk3Var = a;
            Log.e(zk3Var.a, zk3Var.c("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
