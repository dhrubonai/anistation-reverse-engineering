package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements v4, ke4, nd4, zd4, ri3, k81, es0, rs6, ih6, d60, b35, o41, au3, dw3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ h5(lk5 lk5Var) {
        this.x = (byte) 27;
        Bundle bundle = Bundle.EMPTY;
        this.y = lk5Var;
    }

    @Override // defpackage.o41
    public q41 H() {
        return ((o41) ((i75) this.y).y).H();
    }

    @Override // defpackage.rs6
    public void a(ns6 ns6Var) {
        l34 l34Var = (l34) ((fq3) this.y).y;
        l34Var.e.execute(new f32((Object) l34Var, (Object) ns6Var, (byte) 17));
    }

    @Override // defpackage.k81
    public int b(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.y;
        cs csVar = zt1.a;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities();
        encoderCapabilities.getClass();
        if (encoderCapabilities.isBitrateModeSupported(1)) {
            return 0;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.v4
    public void c(Object obj) {
        ((ub2) ((w44) this.y).getValue()).invoke(obj);
    }

    @Override // defpackage.au3
    public void d(ct3 ct3Var, int i) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 27:
                Bundle bundle = Bundle.EMPTY;
                ct3Var.a(i, (lk5) obj);
                return;
            default:
                ct3Var.e(i, (go4) obj);
                return;
        }
    }

    @Override // defpackage.b35
    public void e(long j, zi4 zi4Var) {
        bx7.o(j, zi4Var, ((ya2) this.y).J);
    }

    @Override // defpackage.ih6
    public void f(hh6 hh6Var) {
        ((mb1) this.y).i(hh6Var);
    }

    @Override // defpackage.d60
    public long g(long j) {
        return eq6.k((j * r8.e) / 1000000, 0L, ((f42) this.y).j - 1);
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        return new w81((Context) kzVar.b(Context.class), ((n32) kzVar.b(n32.class)).c(), kzVar.d(px4.a(pk2.class)), kzVar.f(sb1.class), (Executor) kzVar.l((px4) this.y));
    }

    @Override // defpackage.nd4
    public v57 i(View view, v57 v57Var) {
        return AndroidWebViewContainer.b((AndroidWebViewContainer) this.y, view, v57Var);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 7:
                n61 n61Var = (n61) obj2;
                mr3 mr3Var = (mr3) ((r7) obj);
                mr3Var.y += n61Var.g;
                mr3Var.z += n61Var.e;
                return;
            case 8:
                ((mr3) ((r7) obj)).o = (yx1) obj2;
                return;
            case 9:
                mr3 mr3Var2 = (mr3) ((r7) obj);
                mr3Var2.getClass();
                mr3Var2.w = ((fr3) obj2).a;
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                ((kz) obj2).getClass();
                ((s02) obj).getClass();
                return;
            case 16:
                ((io4) obj).E((jr3) obj2);
                return;
            case 17:
                ((io4) obj).n((ru) obj2);
                return;
            case 18:
                ((io4) obj).b((c31) obj2);
                return;
            case 19:
                ((io4) obj).E(((py1) obj2).x.S);
                return;
            case 20:
                ((io4) obj).f((fy3) obj2);
                return;
        }
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        aw2 aw2Var = aw2.y;
        aw3 aw3Var = (aw3) this.y;
        if (bu3Var.i()) {
            return aw2Var;
        }
        bu3Var.t();
        aw3Var.b(bu3Var.t, dt3Var);
        gw3.V(bu3Var, dt3Var, i, new tk5(0));
        return aw2Var;
    }

    public ri0 k(st3 st3Var) {
        InputStream inputStream;
        si0 si0Var = (si0) this.y;
        URL url = (URL) st3Var.x;
        h98.n(url, "CctTransportBackend", "Making request to: %s");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(40000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) st3Var.z;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cn7 cn7Var = si0Var.a;
                    tx txVar = (tx) st3Var.y;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    l53 l53Var = (l53) cn7Var.x;
                    x63 x63Var = new x63(bufferedWriter, l53Var.a, l53Var.b, l53Var.c, l53Var.d);
                    x63Var.e(txVar);
                    x63Var.g();
                    x63Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.i("TransportRuntime.CctTransportBackend", "Status Code: " + responseCode);
                    Log.i("TransportRuntime.CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    Log.i("TransportRuntime.CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new ri0(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                ri0 ri0Var = new ri0(responseCode, null, fy.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return ri0Var;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new ri0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (bu1 | IOException e) {
            Log.e("TransportRuntime.CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ri0(CommonGatewayClient.CODE_400, null, 0L);
        } catch (ConnectException | UnknownHostException e2) {
            Log.e("TransportRuntime.CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new ri0(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, null, 0L);
        }
    }

    @Override // defpackage.zd4
    public void onComplete(Task task) {
        kh0 kh0Var = (kh0) this.y;
        HashSet hashSet = (HashSet) kh0Var.z;
        int i = 0;
        if (task.d()) {
            xh0 xh0Var = (xh0) task.c();
            tl7.U();
            kh0Var.x = false;
            kh0Var.B = xh0Var;
            xh0Var.getClass();
            a34.s();
            pk5 pk5Var = xh0Var.c;
            ArrayList arrayList = (ArrayList) kh0Var.y;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                pk5Var.a((qk5) obj);
            }
            gi0 c = pk5Var.c();
            String str = null;
            if (c != null) {
                a34.s();
                dl7 dl7Var = c.a;
                if (dl7Var != null) {
                    try {
                        uk7 uk7Var = (uk7) dl7Var;
                        Parcel L = uk7Var.L(uk7Var.K(), 3);
                        String readString = L.readString();
                        L.recycle();
                        str = readString;
                    } catch (RemoteException e) {
                        kk5.b.a(e, "Unable to call %s on %s.", "getSessionId", dl7.class.getSimpleName());
                    }
                }
            }
            if (c != null && c.a() && str != null) {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((qk5) obj2).f(c, str);
                }
            }
            arrayList.clear();
            if (xh0Var.a() == null) {
                ks3 ks3Var = ks3.c;
            }
            Iterator it = hashSet.iterator();
            if (!it.hasNext()) {
                hashSet.clear();
                return;
            }
            throw qx1.f(it);
        }
        Throwable b = task.b();
        kh0Var.x = false;
        if (b == null) {
            b = new UnknownError("Cast context load failed with a null exception.");
        }
        kh0Var.C = b;
        kb0.t("Cast", "Failed to load CastContext", b);
        ks3 ks3Var2 = ks3.c;
        Iterator it2 = hashSet.iterator();
        if (!it2.hasNext()) {
            hashSet.clear();
            return;
        }
        throw qx1.f(it2);
    }

    @Override // defpackage.ke4
    public void onSuccess(Object obj) {
        AndroidAppSetIdDataSource.a((l9) this.y, obj);
    }

    public /* synthetic */ h5(q7 q7Var, Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public /* synthetic */ h5(kz kzVar, bi6 bi6Var) {
        this.x = (byte) 22;
        this.y = kzVar;
    }

    public /* synthetic */ h5(q7 q7Var, ij3 ij3Var, fr3 fr3Var, IOException iOException, boolean z) {
        this.x = (byte) 9;
        this.y = fr3Var;
    }

    public /* synthetic */ h5(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
