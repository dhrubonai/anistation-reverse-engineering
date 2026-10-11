package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.c7;
import defpackage.du4;
import defpackage.hj6;
import defpackage.kp6;
import defpackage.oy;
import defpackage.rv3;
import defpackage.st3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        hj6.b(context);
        st3 a2 = oy.a();
        a2.G(queryParameter);
        a2.z = du4.b(intValue);
        if (queryParameter2 != null) {
            a2.y = Base64.decode(queryParameter2, 0);
        }
        kp6 kp6Var = hj6.a().d;
        kp6Var.e.execute(new rv3((byte) 2, i, kp6Var, a2.f(), new c7((byte) 0)));
    }
}
