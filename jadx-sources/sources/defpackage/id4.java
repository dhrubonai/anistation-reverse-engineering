package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class id4 {
    public nh1 a = new nh1();
    public cn7 b = new cn7((byte) 13);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public p65 e = new p65((byte) 24);
    public boolean f = true;
    public l68 g;
    public boolean h;
    public boolean i;
    public l68 j;
    public l68 k;
    public ProxySelector l;
    public l68 m;
    public SocketFactory n;
    public SSLSocketFactory o;
    public X509TrustManager p;
    public List q;
    public List r;
    public HostnameVerifier s;
    public ej0 t;
    public nx7 u;
    public int v;
    public int w;
    public int x;
    public short y;
    public sn3 z;

    public id4() {
        l68 l68Var = l68.z;
        this.g = l68Var;
        this.h = true;
        this.i = true;
        this.j = l68.B;
        this.k = l68.C;
        this.m = l68Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.n = socketFactory;
        this.q = jd4.Y;
        this.r = jd4.X;
        this.s = hd4.a;
        this.t = ej0.c;
        this.v = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.w = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.x = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.y = (short) 1024;
    }
}
