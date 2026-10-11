package o1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l1.t0;
import r6.h0;
import r6.s1;

/* loaded from: classes.dex */
public final class d0 implements p4.f, i4.q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8137a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8138b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8140d;

    public d0() {
        this.f8138b = new float[16];
        this.f8139c = new float[16];
        this.f8140d = new c.j();
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #4 {all -> 0x004b, blocks: (B:5:0x0035, B:6:0x0040, B:8:0x0047, B:10:0x0050, B:23:0x005a, B:32:0x008b, B:41:0x00d3, B:42:0x006d, B:44:0x0071, B:46:0x007b, B:48:0x0081), top: B:22:0x005a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(h1.g r38, java.lang.String r39, byte[] r40, java.util.Map r41) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d0.h(h1.g, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // i4.q
    public final boolean a() {
        boolean z9;
        if (((ConnectivityManager) ((p4.f) this.f8139c).get()).getActiveNetwork() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8137a = z9;
        try {
            ((ConnectivityManager) ((p4.f) this.f8139c).get()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) this.f8140d);
            return true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e10);
            }
            return false;
        }
    }

    @Override // i4.q
    public final void b() {
        ((ConnectivityManager) ((p4.f) this.f8139c).get()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f8140d);
    }

    public final void c() {
        t3.e.a((t3.e) this.f8140d, this, false);
    }

    public final boolean d(c1.g gVar, c1.v vVar) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(vVar.f1935m);
        int i10 = vVar.f1947z;
        if (equals && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(f1.b0.q(i10));
        int i11 = vVar.A;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = ((Spatializer) this.f8138b).canBeSpatialized((AudioAttributes) gVar.a().f3762b, channelMask.build());
        return canBeSpatialized;
    }

    public final void f(y1.p pVar, Looper looper) {
        if (((Spatializer$OnSpatializerStateChangedListener) this.f8140d) == null && ((Handler) this.f8139c) == null) {
            this.f8140d = new y1.k(pVar);
            Handler handler = new Handler(looper);
            this.f8139c = handler;
            ((Spatializer) this.f8138b).addOnSpatializerStateChangedListener(new t0(handler, 1), (Spatializer$OnSpatializerStateChangedListener) this.f8140d);
        }
    }

    public final byte[] g(UUID uuid, w wVar) {
        String str;
        String str2 = wVar.f8169b;
        if (this.f8137a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f8139c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = c1.j.f1727e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (c1.j.f1725c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((Map) this.f8140d)) {
                hashMap.putAll((Map) this.f8140d);
            }
            return h((h1.g) this.f8138b, str2, wVar.f8168a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        w7.b.x(uri, "The uri must be set.");
        throw new f0(new h1.l(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, s1.f9531x, 0L, new IllegalStateException("No license URL"));
    }

    @Override // p4.f
    public final Object get() {
        if (!this.f8137a) {
            Trace.beginSection("Glide registry");
            this.f8137a = true;
            try {
                return p7.a0.l((com.bumptech.glide.b) this.f8138b, (List) this.f8139c);
            } finally {
                this.f8137a = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public final byte[] i(x xVar) {
        return h((h1.g) this.f8138b, xVar.f8171b + "&signedRequest=" + f1.b0.n(xVar.f8170a), null, Collections.emptyMap());
    }

    public final File j() {
        File file;
        synchronized (((t3.e) this.f8140d)) {
            Object obj = this.f8138b;
            if (((t3.c) obj).f10002f == this) {
                if (!((t3.c) obj).f10001e) {
                    ((boolean[]) this.f8139c)[0] = true;
                }
                file = ((t3.c) obj).f10000d[0];
                ((t3.e) this.f8140d).f10010a.mkdirs();
            } else {
                throw new IllegalStateException();
            }
        }
        return file;
    }

    public final void k() {
        TextView textView = ((n8.a) this.f8138b).f8024b.f7762m0;
        if (textView == null) {
            return;
        }
        Iterator it = ((List) this.f8140d).iterator();
        if (!it.hasNext()) {
            textView.setVisibility(8);
        } else {
            a3.g.z(it.next());
            throw null;
        }
    }

    public final void l() {
        long max;
        int i10;
        n8.a aVar = (n8.a) this.f8138b;
        u8.a aVar2 = aVar.f8024b.f7764o0;
        if (aVar2 == null) {
            return;
        }
        j1.p f10 = aVar.f();
        if (f10 == null) {
            max = 0;
        } else {
            max = Math.max(0L, ((j1.d0) f10).D());
        }
        List list = (List) this.f8140d;
        ArrayList arrayList = aVar2.f10335a;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        aVar2.f10336b = max;
        aVar2.invalidate();
        if (!((List) this.f8140d).isEmpty() && max > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        aVar2.setVisibility(i10);
    }

    public d0(n8.a aVar) {
        this.f8140d = new ArrayList();
        this.f8139c = "";
        this.f8138b = aVar;
    }

    public d0(String str, boolean z9, h1.g gVar) {
        w7.b.g((z9 && TextUtils.isEmpty(str)) ? false : true);
        this.f8138b = gVar;
        this.f8139c = str;
        this.f8137a = z9;
        this.f8140d = new HashMap();
    }

    public d0(Context context) {
        this.f8138b = context;
    }

    public d0(com.bumptech.glide.b bVar, ArrayList arrayList, h0 h0Var) {
        this.f8138b = bVar;
        this.f8139c = arrayList;
        this.f8140d = h0Var;
    }

    public d0(x3.p pVar, i4.p pVar2) {
        this.f8140d = new i4.s(this, 0);
        this.f8139c = pVar;
        this.f8138b = pVar2;
    }

    public d0(t3.e eVar, t3.c cVar) {
        this.f8140d = eVar;
        this.f8138b = cVar;
        this.f8139c = cVar.f10001e ? null : new boolean[eVar.f10016x];
    }

    public d0(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f8138b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f8137a = immersiveAudioLevel != 0;
    }
}
