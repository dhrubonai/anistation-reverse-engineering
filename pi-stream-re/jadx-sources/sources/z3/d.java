package z3;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f12041a = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final e f12042b;

    public d(e eVar) {
        this.f12042b = eVar;
    }

    public final t3.d a() {
        e eVar = this.f12042b;
        File cacheDir = ((Context) eVar.f12044b).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) eVar.f12045c) != null) {
            cacheDir = new File(cacheDir, (String) eVar.f12045c);
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.isDirectory() && !cacheDir.mkdirs()) {
            return null;
        }
        return new t3.d(cacheDir, this.f12041a);
    }
}
