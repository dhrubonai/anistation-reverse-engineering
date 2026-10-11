package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j24 extends g33 {
    public final /* synthetic */ l24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j24(l24 l24Var, String[] strArr) {
        super(strArr);
        this.b = l24Var;
    }

    @Override // defpackage.g33
    public final void a(Set set) {
        set.getClass();
        l24 l24Var = this.b;
        if (!l24Var.e.get()) {
            try {
                pt2 pt2Var = l24Var.g;
                if (pt2Var != null) {
                    pt2Var.H(l24Var.f, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot broadcast invalidation", e);
            }
        }
    }
}
