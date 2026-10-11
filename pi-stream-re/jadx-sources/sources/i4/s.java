package i4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import msr.pistream.app.download.PiStreamDownloadService;

/* loaded from: classes.dex */
public final class s extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5368b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f5367a = i10;
        this.f5368b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f5367a) {
            case 0:
                p4.m.e().post(new r(0, this, true));
                return;
            default:
                Object obj = this.f5368b;
                try {
                    z7.f.o().A((Context) obj);
                    PiStreamDownloadService.refresh((Context) obj);
                    return;
                } catch (Exception e10) {
                    Log.e("DLNet", "available", e10);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r1.hasTransport(3) != false) goto L24;
     */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLost(android.net.Network r5) {
        /*
            r4 = this;
            int r5 = r4.f5367a
            r0 = 0
            switch(r5) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L14
        L7:
            i4.r r5 = new i4.r
            r5.<init>(r0, r4, r0)
            android.os.Handler r0 = p4.m.e()
            r0.post(r5)
            return
        L14:
            java.lang.Object r5 = r4.f5368b
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L62
            android.content.SharedPreferences r1 = com.bumptech.glide.c.b0(r1)     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "download_wifi_only"
            boolean r1 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L62
            if (r1 != 0) goto L26
            goto L6a
        L26:
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L62
            r2 = 1
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Exception -> L4e
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L4e
            android.net.Network r3 = r1.getActiveNetwork()     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L3b
            goto L4f
        L3b:
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r3)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L4f
            boolean r3 = r1.hasTransport(r2)     // Catch: java.lang.Exception -> L4e
            if (r3 != 0) goto L4e
            r3 = 3
            boolean r1 = r1.hasTransport(r3)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 == 0) goto L52
            goto L6a
        L52:
            z7.f r0 = z7.f.o()     // Catch: java.lang.Exception -> L62
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L62
            r0.u(r1)     // Catch: java.lang.Exception -> L62
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Exception -> L62
            msr.pistream.app.download.PiStreamDownloadService.refresh(r5)     // Catch: java.lang.Exception -> L62
            goto L6a
        L62:
            r5 = move-exception
            java.lang.String r0 = "DLNet"
            java.lang.String r1 = "lost"
            android.util.Log.e(r0, r1, r5)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.s.onLost(android.net.Network):void");
    }
}
