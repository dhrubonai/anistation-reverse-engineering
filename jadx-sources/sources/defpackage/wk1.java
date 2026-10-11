package defpackage;

import com.anistation.download.data.model.DownloadRequest;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.watch.Track;
import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wk1 extends xz0 {
    public Object A;
    public String B;
    public String C;
    public Map D;
    public Track E;
    public OfflineDownloadMetadata F;
    public hb1 G;
    public lj1 H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ fl1 K;
    public int L;
    public DownloadRequest x;
    public fl1 y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(fl1 fl1Var, xz0 xz0Var) {
        super(xz0Var);
        this.K = fl1Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        Serializable d = this.K.d(null, null, this);
        if (d == w11.x) {
            return d;
        }
        return new z45(d);
    }
}
