package msr.pistream.app.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Iterator;
import z7.b;
import z7.d;

/* loaded from: classes.dex */
public class DownloadBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (!"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Iterator it = d.a(applicationContext).iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f12101u == 2) {
                    z9 = true;
                    bVar.f12101u = 1;
                    bVar.f12102v = "";
                    d.c(applicationContext, bVar);
                }
            }
            if (z9) {
                PiStreamDownloadService.startAction(applicationContext, PiStreamDownloadService.ACTION_KICK);
            }
        } catch (Exception e10) {
            Log.e("DLBoot", "receive", e10);
        }
    }
}
