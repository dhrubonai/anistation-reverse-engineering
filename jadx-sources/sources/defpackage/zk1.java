package defpackage;

import com.anistation.download.data.model.DownloadRequest;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.external.ExternalSubtitleRequest;
import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk1 extends xz0 {
    public String A;
    public String B;
    public String C;
    public cj1 D;
    public Map E;
    public w05 F;
    public ExternalSubtitleRequest G;
    public DownloadSettings H;
    public hb1 I;
    public lj1 J;
    public /* synthetic */ Object K;
    public final /* synthetic */ fl1 L;
    public int M;
    public DownloadRequest x;
    public fl1 y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk1(fl1 fl1Var, xz0 xz0Var) {
        super(xz0Var);
        this.L = fl1Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        Serializable e = this.L.e(null, null, this);
        if (e == w11.x) {
            return e;
        }
        return new z45(e);
    }
}
