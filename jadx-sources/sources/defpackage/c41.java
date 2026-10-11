package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c41 implements js1 {
    public Context a;

    public c41(rt3 rt3Var) {
        this.a = (Context) rt3Var.y;
    }

    public static oz1 d(ea2 ea2Var, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String ea2Var2 = ea2Var.toString();
        String str2 = ea2Var.p;
        str2.getClass();
        return oz1.c(illegalArgumentException, 3003, new pn0(ea2Var2, qy3.m(str2), true, (String) null));
    }

    @Override // defpackage.js1
    public void a(tl7 tl7Var) {
        fv0 fv0Var = new fv0("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), fv0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ze((Object) this, (Object) tl7Var, (Object) threadPoolExecutor, (byte) 10));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [d41, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kz] */
    public d41 b() {
        Context context = this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.x = ti1.a(o80.f);
            l03 l03Var = new l03(context);
            obj.y = l03Var;
            obj.z = ti1.a(new y23(l03Var, new af2((Object) l03Var, (byte) 13), (byte) 5));
            l03 l03Var2 = obj.y;
            nw4 a = ti1.a(new l33((Object) new eo3((Object) l03Var2, (byte) 14), (Object) new af2((Object) l03Var2, (byte) 20), (byte) 16));
            obj.A = a;
            xb5 xb5Var = new xb5((byte) 0);
            l03 l03Var3 = obj.y;
            dn0 dn0Var = new dn0((Object) l03Var3, (Object) a, (Object) xb5Var, (byte) 27);
            nw4 nw4Var = obj.x;
            nw4 nw4Var2 = obj.z;
            ?? obj2 = new Object();
            obj2.x = nw4Var;
            obj2.y = nw4Var2;
            obj2.z = dn0Var;
            obj2.A = a;
            obj2.B = a;
            obj.B = ti1.a(new xf6(obj2, new ls0(l03Var3, nw4Var2, a, dn0Var, nw4Var, a, a), new zp2(nw4Var, a, dn0Var, a), (byte) 1));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public p71 c(MediaFormat mediaFormat, ea2 ea2Var, Surface surface, boolean z, LogSessionId logSessionId) {
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        ea2Var.p.getClass();
        try {
            ArrayList arrayList = new ArrayList(up3.g(ea2Var, false, false));
            Collections.sort(arrayList, new xq0(new qp3(this.a, ea2Var, (byte) 0), (byte) 1));
            if (!arrayList.isEmpty()) {
                if (z) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        mp3 mp3Var = (mp3) arrayList.get(i);
                        if (!mp3Var.g) {
                            arrayList2.add(mp3Var);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31 && ((mp3) arrayList.get(0)).c.equals("video/dolby-vision")) {
                    mediaFormat.setInteger("color-transfer-request", 7);
                }
                if (i2 >= 35 && logSessionId != null) {
                    nu5.p(mediaFormat, logSessionId);
                }
                ArrayList arrayList3 = new ArrayList();
                Context context = this.a;
                for (mp3 mp3Var2 : arrayList.subList(0, 1)) {
                    mediaFormat.setString("mime", mp3Var2.c);
                    try {
                        p71 p71Var = new p71(context, ea2Var, mediaFormat, mp3Var2.a, true, surface);
                        p71Var.d.getCanonicalName();
                        return p71Var;
                    } catch (oz1 e) {
                        arrayList3.add(e);
                    }
                }
                throw ((oz1) arrayList3.get(0));
            }
            throw d(ea2Var, "No decoders for format");
        } catch (sp3 e2) {
            kb0.t("DefaultDecoderFactory", "Error querying decoders", e2);
            throw d(ea2Var, "Querying codecs failed");
        }
    }
}
