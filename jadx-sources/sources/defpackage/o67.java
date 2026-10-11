package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o67 extends ContentObserver {
    public final /* synthetic */ za0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o67(za0 za0Var, Handler handler) {
        super(handler);
        this.a = za0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.i(pn6.a);
    }
}
