package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xp implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ xp(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                ((TextView) this.z).setTypeface((Typeface) this.A, this.y);
                return;
            default:
                dn7 dn7Var = (dn7) this.z;
                ks3 ks3Var = (ks3) this.A;
                int i = this.y;
                synchronized (dn7Var.h) {
                    dn7Var.O(ks3Var, i);
                }
                return;
        }
    }
}
