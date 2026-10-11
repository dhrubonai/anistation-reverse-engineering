package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eq3 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final qt3 e;

    public eq3(Context context, qt3 qt3Var) {
        kt2 kt2Var;
        this.e = qt3Var;
        MediaController mediaController = new MediaController(context, qt3Var.y);
        this.a = mediaController;
        synchronized (qt3Var.x) {
            kt2Var = qt3Var.z;
        }
        if (kt2Var == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new dq3(this));
        }
    }

    public final void a() {
        kt2 kt2Var;
        ArrayList arrayList = this.c;
        qt3 qt3Var = this.e;
        synchronized (qt3Var.x) {
            kt2Var = qt3Var.z;
        }
        if (kt2Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() != null) {
            ov3.d();
        } else {
            this.d.put(null, new bq3());
            throw null;
        }
    }
}
