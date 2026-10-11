package defpackage;

import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vc2 {
    public static final Set a = ms.U0(new MediaFormat[]{MediaFormat.TV, MediaFormat.TV_SHORT, MediaFormat.MOVIE, MediaFormat.SPECIAL, MediaFormat.OVA, MediaFormat.ONA});
    public static final Set b = ms.U0(new MediaStatus[]{MediaStatus.RELEASING, MediaStatus.FINISHED, MediaStatus.NOT_YET_RELEASED});

    public static final String a(int i, String str) {
        String obj;
        if (str != null && (obj = uz5.w0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return String.valueOf(i);
    }

    public static final boolean b(MediaFormat mediaFormat, MediaStatus mediaStatus) {
        if (yo0.e0(a, mediaFormat) && yo0.e0(b, mediaStatus)) {
            return true;
        }
        return false;
    }
}
