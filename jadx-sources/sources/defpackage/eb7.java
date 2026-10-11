package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class eb7 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public eb7(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract q12[] a(wa7 wa7Var);

    public abstract boolean b(wa7 wa7Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(y23 y23Var, boolean z);

    public abstract void f(wa7 wa7Var);
}
