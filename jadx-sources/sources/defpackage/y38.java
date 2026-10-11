package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y38 implements a55 {
    public final String A;
    public final boolean B;
    public final Status x;
    public final mr y;
    public final String z;

    public y38(Status status, mr mrVar, String str, String str2, boolean z) {
        this.x = status;
        this.y = mrVar;
        this.z = str;
        this.A = str2;
        this.B = z;
    }

    @Override // defpackage.a55
    public final Status b() {
        return this.x;
    }
}
