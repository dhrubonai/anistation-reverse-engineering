package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fp extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ byte a;

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        switch (this.a) {
            case 0:
                hp.d(webMessage);
                throw null;
            default:
                hp.d(webMessage);
                throw null;
        }
    }
}
