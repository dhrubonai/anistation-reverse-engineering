package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class mt3 {
    public final MediaSession a;
    public final lt3 b;
    public final qt3 c;
    public final Bundle e;
    public wn4 g;
    public List h;
    public kr3 i;
    public int j;
    public int k;
    public jt3 l;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public mt3(Context context, String str, Bundle bundle) {
        MediaSession a = a(context, str, bundle);
        this.a = a;
        lt3 lt3Var = new lt3(this);
        this.b = lt3Var;
        this.c = new qt3(a.getSessionToken(), lt3Var);
        this.e = bundle;
        a.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }
}
