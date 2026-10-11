package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r41 implements p60 {
    public static final r26 B = mv5.e(new xw((byte) 1));
    public final int A;
    public final m04 x;
    public final pz2 y;
    public final BitmapFactory.Options z;

    public r41(ad adVar) {
        this.y = new pz2((Context) adVar.z, (byte) 16);
        m04 m04Var = (m04) adVar.A;
        if (m04Var == null) {
            m04Var = (m04) B.get();
            m04Var.getClass();
        }
        this.x = m04Var;
        this.z = (BitmapFactory.Options) adVar.B;
        this.A = adVar.y;
    }

    @Override // defpackage.p60
    public final ii3 F(byte[] bArr) {
        return this.x.a(new tb(this, bArr, (byte) 1));
    }

    @Override // defpackage.p60
    public final ii3 s(Uri uri) {
        return this.x.a(new tb(this, uri, (byte) 2));
    }
}
