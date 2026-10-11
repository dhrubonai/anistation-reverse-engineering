package defpackage;

import com.unity3d.ads.adplayer.WebViewAdPlayer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class q37 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ byte[] y;

    public /* synthetic */ q37(byte[] bArr, byte b) {
        this.x = b;
        this.y = bArr;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        byte[] bArr = this.y;
        switch (b) {
            case 0:
                return WebViewAdPlayer.j(bArr);
            case 1:
                return WebViewAdPlayer.c(bArr);
            default:
                return WebViewAdPlayer.e(bArr);
        }
    }
}
