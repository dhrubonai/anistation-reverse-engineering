package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class su3 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ fq4 g;

    public su3(int i, int i2, int i3, String str, Handler handler, fq4 fq4Var) {
        this.f = handler;
        this.g = fq4Var;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        su3 su3Var;
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                su3Var = this;
                su3Var.e = new ww6(su3Var, this.a, this.b, this.d, this.c, (byte) 0);
            } else {
                su3Var = this;
                su3Var.e = new xw6(su3Var, su3Var.a, su3Var.b, su3Var.d, (byte) 0);
            }
        } else {
            su3Var = this;
        }
        return su3Var.e;
    }
}
