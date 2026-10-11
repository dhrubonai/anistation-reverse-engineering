package defpackage;

import android.media.VolumeProvider;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ww6 extends VolumeProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww6(Object obj, int i, int i2, int i3, String str, byte b) {
        super(i, i2, i3, str);
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                su3 su3Var = (su3) obj;
                eq6.a0(su3Var.f, new ru3(su3Var.g, i, b2));
                return;
            default:
                df2 df2Var = (df2) obj;
                ((ff2) ((st3) df2Var.g).z).a.post(new cf2(df2Var, i, b2));
                return;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                su3 su3Var = (su3) obj;
                eq6.a0(su3Var.f, new ru3(su3Var.g, i, b2));
                return;
            default:
                df2 df2Var = (df2) obj;
                ((ff2) ((st3) df2Var.g).z).a.post(new cf2(df2Var, i, b2));
                return;
        }
    }
}
