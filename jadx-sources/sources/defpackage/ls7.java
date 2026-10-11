package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ls7 extends j18 {
    public final /* synthetic */ byte A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls7(z18 z18Var, byte b) {
        super(z18Var);
        this.A = b;
    }

    @Override // defpackage.j18
    public final void O() {
        byte b = this.A;
    }

    public boolean P() {
        M();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((gu7) this.x).x.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public void S(String str, l18 l18Var, eu7 eu7Var, hs7 hs7Var) {
        String str2;
        URL url;
        byte[] a;
        au7 au7Var;
        Map map;
        String str3 = l18Var.a;
        gu7 gu7Var = (gu7) this.x;
        L();
        M();
        try {
            url = new URI(str3).toURL();
            this.y.j0();
            a = eu7Var.a();
            au7Var = gu7Var.D;
            gu7.l(au7Var);
            map = l18Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            au7Var.X(new js7(this, str2, url, a, map, hs7Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.c("Failed to parse URL. Not uploading MeasurementBatch. appId", es7.P(str2), str3);
        }
    }

    private final void Q() {
    }

    private final void R() {
    }
}
