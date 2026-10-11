package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f38 extends BroadcastReceiver {
    public static volatile uw7 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ f38(byte b2) {
        this.a = b2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                if (stringExtra != null) {
                    if (!stringExtra.contains("../") && !stringExtra.contains("/..")) {
                        uw7 uw7Var = b;
                        if (uw7Var == null) {
                            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                            return;
                        }
                        f18 f18Var = (f18) ((ConcurrentHashMap) ((qb7) uw7Var.x).y).get(stringExtra);
                        if (f18Var != null) {
                            f18Var.a.b();
                            return;
                        }
                        return;
                    }
                    StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
                    sb.append("Got an invalid config package for P/H that includes '..': ");
                    sb.append(stringExtra);
                    sb.append(". Exiting.");
                    Log.w("PhUpdateBroadcastRecv", sb.toString());
                    return;
                }
                return;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        rz5.a = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            rz5.a = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
