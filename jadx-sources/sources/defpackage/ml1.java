package defpackage;

import android.content.Context;
import com.anistation.model.download.DownloadSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ml1 {
    public static final r18 d = new r18((byte) 15);
    public static volatile ml1 e;
    public final ok1 a;
    public final vy4 b;
    public final vy4 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ml1(ok1 ok1Var, Context context) {
        this.a = ok1Var;
        q18 q18Var = st3.B;
        st3 st3Var = st3.C;
        if (st3Var == null) {
            synchronized (q18Var) {
                st3Var = st3.C;
                if (st3Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    st3Var = new st3(applicationContext, (byte) 1);
                    st3.C = st3Var;
                }
            }
        }
        ke0 b = db.b(tl7.L(iv5.a(), rh1.a));
        mx0 mx0Var = ((zl1) ok1Var).b;
        y95 y95Var = un5.a;
        vy4 d0 = h41.d0(mx0Var, b, y95Var, new DownloadSettings(true, null, null, 6, null));
        this.b = d0;
        Object[] objArr = 0 == true ? 1 : 0;
        this.c = h41.d0(new l62(d0, (vy4) st3Var.z, new ll1(3, null, (byte) 0)), b, y95Var, new nk1(new DownloadSettings(true, objArr, null, 6, null), ((mk1) ((vy4) st3Var.z).x.getValue()).a, ((mk1) ((vy4) st3Var.z).x.getValue()).b));
    }
}
