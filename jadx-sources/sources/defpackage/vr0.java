package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ vr0(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.y = obj;
        this.z = i;
        this.A = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4 v4Var;
        byte b = this.x;
        Object obj = this.A;
        int i = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                wr0 wr0Var = (wr0) obj2;
                Object obj3 = ((w4) obj).a;
                String str = (String) wr0Var.a.get(Integer.valueOf(i));
                if (str != null) {
                    c5 c5Var = (c5) wr0Var.e.get(str);
                    if (c5Var != null) {
                        v4Var = c5Var.a;
                    } else {
                        v4Var = null;
                    }
                    if (v4Var == null) {
                        wr0Var.g.remove(str);
                        wr0Var.f.put(str, obj3);
                        return;
                    } else {
                        v4 v4Var2 = c5Var.a;
                        if (wr0Var.d.remove(str)) {
                            v4Var2.c(obj3);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                ((wr0) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 2:
                ri3 ri3Var = (ri3) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    ti3 ti3Var = (ti3) it.next();
                    if (!ti3Var.d) {
                        if (i != -1) {
                            ti3Var.b.a(i);
                        }
                        ti3Var.c = true;
                        ri3Var.invoke(ti3Var.a);
                    }
                }
                return;
            default:
                SdkProperties.lambda$notifyInitializationFailed$3((InitializationListener) obj2, i, (String) obj);
                return;
        }
    }
}
