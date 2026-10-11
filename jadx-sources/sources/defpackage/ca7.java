package defpackage;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ca7 extends WebViewClient {
    public final /* synthetic */ ea7 a;

    public ca7(ea7 ea7Var) {
        this.a = ea7Var;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [d37, java.lang.ref.WeakReference] */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
        ea7 ea7Var = this.a;
        if (ea7Var.e() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            ea7Var.b = new WeakReference(null);
        }
        webView.destroy();
        return true;
    }
}
