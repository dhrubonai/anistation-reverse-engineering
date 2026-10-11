package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class qs3 {
    public final ps3 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public cs3 u;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public qs3(ps3 ps3Var, String str, String str2, boolean z) {
        this.a = ps3Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public final js3 a() {
        rs3.b();
        return this.a.a;
    }

    public final int b() {
        Bundle bundle;
        if (!this.v.isEmpty()) {
            if (rs3.c != null) {
                us3 us3Var = rs3.c().u;
                if (us3Var != null && (bundle = us3Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        return this.o;
    }

    public final boolean c() {
        rs3.b();
        qs3 qs3Var = rs3.c().v;
        if (qs3Var != null) {
            if (qs3Var != this && this.n != 3) {
                if (!TextUtils.equals(((ComponentName) a().y.y).getPackageName(), AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID) || !h("android.media.intent.category.LIVE_AUDIO") || h("android.media.intent.category.LIVE_VIDEO")) {
                    return false;
                }
                return true;
            }
            return true;
        }
        ze0.m("There is no default route.  The media router has not yet been fully initialized.");
        return false;
    }

    public final boolean d() {
        if (this.u != null && this.g) {
            return true;
        }
        return false;
    }

    public final boolean e(ks3 ks3Var) {
        if (ks3Var != null) {
            rs3.b();
            ks3Var.a();
            if (!ks3Var.b.isEmpty()) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = ks3Var.b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        ze0.k("selector must not be null");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (r5.hasNext() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.cs3 r18) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs3.f(cs3):int");
    }

    public final void g(boolean z) {
        rs3.b();
        rs3.c().j(this, 3, z);
    }

    public final boolean h(String str) {
        rs3.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.y).getPackageName());
        if (!this.v.isEmpty()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((qs3) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
