package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.m24;
import defpackage.n24;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int x;
    public final LinkedHashMap y = new LinkedHashMap();
    public final n24 z = new n24(this);
    public final m24 A = new m24(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.A;
    }
}
