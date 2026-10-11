package defpackage;

import android.media.AudioTrack;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rw {
    public final qw a;
    public final int b;
    public final cn7 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public rw(AudioTrack audioTrack, cn7 cn7Var) {
        this.a = new qw(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = cn7Var;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.f = 500000;
                        return;
                    } else {
                        p65.l();
                        return;
                    }
                }
                this.f = 10000000;
                return;
            }
            this.f = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            return;
        }
        this.g = 0L;
        this.h = -1L;
        this.i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    }
}
