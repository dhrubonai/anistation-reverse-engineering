package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.inputmethod.BaseInputConnection;
import androidx.work.Worker;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class e96 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ e96(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        WebViewEvent sendOfferwallEvent$lambda$15;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.y;
        switch (b) {
            case 0:
                f96 f96Var = (f96) obj;
                if (f96Var.K) {
                    return nz5.b(f96Var);
                }
                return p86.b;
            case 1:
                va6 va6Var = (va6) obj;
                return new xc4(wt5.e(va6Var.N, va6Var.O, va6Var.P, ((k13) va6Var.R.getValue()).a));
            case 2:
                return new BaseInputConnection(((uc6) obj).a, false);
            case 3:
                return new c13(((g13) obj).c());
            case 4:
                vd6 vd6Var = (vd6) obj;
                vd6Var.V = null;
                z51.w(vd6Var);
                w65.E(vd6Var);
                v94.y(vd6Var);
                return Boolean.TRUE;
            case 5:
                return UniversalRequestDataStoreProvider.a((UniversalRequestDataStoreProvider) obj);
            case 6:
                ((ir6) obj).F.setValue(pn6Var);
                return pn6Var;
            case 7:
                kw6 kw6Var = (kw6) obj;
                cw6 cw6Var = kw6Var.a;
                if (cw6Var != null) {
                    Long l = kw6Var.b;
                    LinkedHashMap linkedHashMap = cw6Var.a;
                    Object obj2 = linkedHashMap.get(l);
                    if (obj2 == null) {
                        obj2 = new jw6();
                        linkedHashMap.put(l, obj2);
                    }
                    return (jw6) ((vv6) obj2);
                }
                return new jw6();
            case 8:
                Application application = (Application) obj;
                Intent launchIntentForPackage = application.getPackageManager().getLaunchIntentForPackage(application.getPackageName());
                if (launchIntentForPackage == null) {
                    return null;
                }
                launchIntentForPackage.setFlags(603979776);
                return PendingIntent.getActivity(application, 0, launchIntentForPackage, 201326592);
            case 9:
                sendOfferwallEvent$lambda$15 = WebViewAdPlayer.sendOfferwallEvent$lambda$15((OfferwallEvent) obj);
                return sendOfferwallEvent$lambda$15;
            case 10:
                su1.a((c77) obj);
                return pn6Var;
            default:
                return ((Worker) obj).a();
        }
    }
}
