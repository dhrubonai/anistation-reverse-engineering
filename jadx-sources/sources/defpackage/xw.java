package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xw implements r26 {
    public final /* synthetic */ byte x;

    public /* synthetic */ xw(byte b) {
        this.x = b;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 5 */
    @Override // defpackage.r26
    public final Object get() {
        boolean z;
        switch (this.x) {
            case 0:
                if (Build.VERSION.SDK_INT > 37 && Objects.equals(eq6.I("persist.audio.compressed_offload_implicit_aac"), "false")) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return kb0.D(Executors.newSingleThreadExecutor());
            case 2:
                byte[] bArr = new byte[12];
                da1.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new r91(new fm0((byte) 2), 50000, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 50000, 50000, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 2000, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, -1, true, t15.D);
            case 4:
                String I = eq6.I("ro.vendor.api_level");
                if (I == null) {
                    I = "";
                }
                return jf7.N(I);
            case 5:
                Resources system = Resources.getSystem();
                int i = system.getDisplayMetrics().widthPixels;
                try {
                    i = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i);
            case 6:
                return fc1.class;
            default:
                throw new IllegalStateException();
        }
    }
}
