package defpackage;

import android.os.Build;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fb2 implements o54 {
    public static final String x;

    /* JADX WARN: Type inference failed for: r0v2, types: [ew2, jw2] */
    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        x = sb.toString();
        ?? ew2Var = new ew2(4);
        ew2Var.f(MimeTypes.VIDEO_H264, "video/3gpp", "video/mp4v-es");
        ew2Var.c(MimeTypes.VIDEO_H265);
        if (i >= 33) {
            ew2Var.c("video/dolby-vision");
        }
        if (i >= 34) {
            ew2Var.c(MimeTypes.VIDEO_AV1);
        }
        if (i >= 36) {
            ew2Var.c("video/apv");
        }
        ew2Var.g();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        jf7.p(objArr, 3);
        nw2.j(objArr, 3);
    }
}
