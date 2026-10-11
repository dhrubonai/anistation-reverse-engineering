package f1;

import android.media.AudioRouting;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ AudioRouting.OnRoutingChangedListener c(Object obj) {
        return (AudioRouting.OnRoutingChangedListener) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e(int i10, int i11) {
        return new MediaCodec.CryptoInfo.Pattern(i10, i11);
    }

    public static /* synthetic */ void k() {
    }
}
