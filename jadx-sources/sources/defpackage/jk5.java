package defpackage;

import android.os.StatFs;
import com.anistation.model.settings.HoldAction;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.shiro.ShiroPlaybackPlan;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jk5 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ jk5(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        VolumeChange initialize$lambda$246$lambda$188;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                initialize$lambda$246$lambda$188 = ServiceProvider.initialize$lambda$246$lambda$188();
                return initialize$lambda$246$lambda$188;
            case 1:
                return new cn5(rm5.a, rm5.b, rm5.c, rm5.d, rm5.f);
            case 2:
                return null;
            case 3:
                return pn6Var;
            case 4:
                return ShiroPlaybackPlan.a();
            case 5:
                throw null;
            case 6:
                return SourcesResponse.a();
            case 7:
                return SourcesResponse.c();
            case 8:
                return SourcesResponse.d();
            case 9:
                return SourcesResponse.b();
            case 10:
                return pn6Var;
            case 11:
                return new vm1(0.0f);
            case 12:
                return jt1.y;
            case 13:
            case 14:
                return null;
            case 15:
                return rl6.a;
            case 16:
                return new c13(0L);
            case 17:
                return new c13(0L);
            case 18:
                return ya1.a;
            case 19:
                return Boolean.TRUE;
            case 20:
                return Boolean.FALSE;
            case 21:
                return HoldAction.FAST_FORWARD;
            case 22:
                return new nl6(null, null, null, null, null, null, null, null, null, null, 32767);
            case 23:
                return xt5.g(Boolean.FALSE);
            case 24:
            case 25:
                return pn6Var;
            case 26:
                b73 b73Var = n22.x;
                qj4 e = n22.y.e("coil3_disk_cache");
                long j = 10485760;
                try {
                    File file = e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = db.D((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new gz4(j, b73Var, e);
            case 27:
                int[] iArr = s51.a;
                return Long.valueOf(System.currentTimeMillis());
            case 28:
                return pn6Var;
            default:
                return xt5.g(Boolean.FALSE);
        }
    }
}
