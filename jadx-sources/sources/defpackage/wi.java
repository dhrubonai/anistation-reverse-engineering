package defpackage;

import android.content.Context;
import android.view.View;
import com.anistation.model.library.WatchProgress;
import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wi implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;

    public /* synthetic */ wi(ub2 ub2Var, byte b) {
        this.x = b;
        this.y = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ub2Var.invoke(Float.valueOf((int) (((k13) obj).a & 4294967295L)));
                return pn6.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ub2Var.invoke(bool);
                return pn6.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                ub2Var.invoke(bw1.valueOf(str));
                return pn6.a;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ub2Var.invoke(bw1.valueOf(str2));
                return pn6.a;
            case 4:
                jj6 jj6Var = (jj6) obj;
                if (jj6Var instanceof ee2) {
                    return Boolean.valueOf(((Boolean) ub2Var.invoke(((ee2) jj6Var).L)).booleanValue());
                }
                ze0.m("Node is not a GestureNode instance");
                return null;
            case 5:
                WatchProgress watchProgress = (WatchProgress) obj;
                watchProgress.getClass();
                int anilistId = watchProgress.getAnilistId();
                ub2Var.invoke(new WatchSession(watchProgress.getAnistationId(), anilistId, Integer.valueOf(watchProgress.getMalId()), watchProgress.getEpisodeTitle(), nt1.x, watchProgress.getEpisodeNumber(), null, null, 192, null));
                return pn6.a;
            case 6:
                ((String) obj).getClass();
                ub2Var.invoke(null);
                return pn6.a;
            case 7:
                Context context = (Context) obj;
                context.getClass();
                return (View) ub2Var.invoke(context);
            case 8:
                ft5 ft5Var = (ft5) ub2Var.invoke((kt5) obj);
                synchronized (mt5.c) {
                    mt5.d = mt5.d.g(ft5Var.g());
                }
                return ft5Var;
            case 9:
                Long l = (Long) obj;
                l.getClass();
                return ub2Var.invoke(l);
            case 10:
                ub2Var.invoke(Float.valueOf(io3.h0(((Float) obj).floatValue() * 20.0f) / 20.0f));
                return pn6.a;
            case 11:
                ((String) obj).getClass();
                ub2Var.invoke(kk1.x);
                return pn6.a;
            default:
                ((String) obj).getClass();
                ub2Var.invoke(kk1.y);
                return pn6.a;
        }
    }
}
