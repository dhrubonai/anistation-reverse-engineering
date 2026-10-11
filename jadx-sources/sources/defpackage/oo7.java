package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class oo7 extends ml7 implements hp7 {
    public static hp7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof hp7) {
            return (hp7) queryLocalInterface;
        }
        return new ln7(iBinder);
    }
}
