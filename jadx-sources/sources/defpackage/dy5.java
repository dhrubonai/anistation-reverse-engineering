package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dy5 implements j61 {
    public final gi5 a;

    public dy5(gi5 gi5Var) {
        this.a = gi5Var;
    }

    @Override // defpackage.j61
    public final k61 a(ev5 ev5Var, mg4 mg4Var) {
        ImageDecoder.Source i;
        Bitmap.Config a = jv2.a(mg4Var);
        if ((a != Bitmap.Config.ARGB_8888 && a != Bitmap.Config.HARDWARE) || (i = fy5.i(ev5Var.a, mg4Var, false)) == null) {
            return null;
        }
        return new k60(i, ev5Var.a, mg4Var, this.a);
    }
}
