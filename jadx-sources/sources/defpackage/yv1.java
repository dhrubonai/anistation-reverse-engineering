package defpackage;

import com.anistation.android.R;
import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class yv1 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ EpisodeDownload y;

    public /* synthetic */ yv1(EpisodeDownload episodeDownload, int i) {
        this.x = (byte) 2;
        this.y = episodeDownload;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2;
        byte b = this.x;
        int i2 = R.drawable.pause;
        pn6 pn6Var = pn6.a;
        EpisodeDownload episodeDownload = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(1 & intValue, z)) {
                    if (episodeDownload.isPaused()) {
                        i2 = R.drawable.play;
                    }
                    xh4 H = w65.H(i2, kd2Var, 0);
                    if (episodeDownload.isPaused()) {
                        i = R.string.resume;
                    } else {
                        i = R.string.pause_download;
                    }
                    yt2.a(H, lz5.f(i, kd2Var), null, 0L, kd2Var, 8, 12);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    if (episodeDownload != null && episodeDownload.isCompleted()) {
                        i2 = R.drawable.tick;
                    } else if (episodeDownload == null || !episodeDownload.isPaused()) {
                        i2 = R.drawable.download;
                    }
                    yt2.a(w65.H(i2, kd2Var2, 0), null, ar5.i(vz3.x, 20.0f), 0L, kd2Var2, 440, 8);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                lt5.g(episodeDownload, (kd2) obj, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ yv1(EpisodeDownload episodeDownload, byte b) {
        this.x = b;
        this.y = episodeDownload;
    }
}
