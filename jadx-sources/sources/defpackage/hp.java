package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class hp {
    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(f37 f37Var) {
        String str = f37Var.b;
        eo3[] eo3VarArr = f37Var.a;
        WebMessagePort[] webMessagePortArr = null;
        if (eo3VarArr != null) {
            int length = eo3VarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                eo3 eo3Var = eo3VarArr[i];
                WebMessagePort webMessagePort = (WebMessagePort) eo3Var.y;
                if (webMessagePort == null) {
                    fq3 fq3Var = v37.a;
                    webMessagePort = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) fq3Var.y).convertWebMessagePort(Proxy.getInvocationHandler(null));
                    eo3Var.y = webMessagePort;
                }
                webMessagePortArr2[i] = webMessagePort;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static f37 d(WebMessage webMessage) {
        eo3[] eo3VarArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            eo3VarArr = null;
        } else {
            eo3[] eo3VarArr2 = new eo3[ports.length];
            for (int i = 0; i < ports.length; i++) {
                WebMessagePort webMessagePort = ports[i];
                eo3 eo3Var = new eo3((byte) 27, false);
                eo3Var.y = webMessagePort;
                eo3VarArr2[i] = eo3Var;
            }
            eo3VarArr = eo3VarArr2;
        }
        return new f37(data, eo3VarArr);
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j, t37 t37Var) {
        webView.postVisualStateCallback(j, new WebView.VisualStateCallback());
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static void l(WebMessagePort webMessagePort, g37 g37Var) {
        webMessagePort.setWebMessageCallback(new fp((byte) 0));
    }

    public static void m(WebMessagePort webMessagePort, g37 g37Var, Handler handler) {
        webMessagePort.setWebMessageCallback(new fp((byte) 1), handler);
    }
}
