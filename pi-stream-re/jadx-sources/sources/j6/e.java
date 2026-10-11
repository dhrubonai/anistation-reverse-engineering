package j6;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import j.b0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import r6.h0;
import s1.a0;
import s1.x;

/* loaded from: classes.dex */
public class e implements b0, z1.q, q1.p, x, s1.j {

    /* renamed from: a, reason: collision with root package name */
    public static e f6173a;

    public /* synthetic */ e(int i10) {
    }

    public static v1.i f(ArrayList arrayList, AbstractList abstractList) {
        return new v1.i(arrayList, abstractList);
    }

    public static MediaCodec k(s1.i iVar) {
        iVar.f9795a.getClass();
        String str = iVar.f9795a.f9801a;
        com.bumptech.glide.d.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        com.bumptech.glide.d.s();
        return createByCodecName;
    }

    public static o0 l(Bundle bundle, Bundle bundle2) {
        boolean z9;
        if (bundle == null) {
            if (bundle2 == null) {
                return new o0();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                h0.s(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new o0(hashMap);
        }
        ClassLoader classLoader = o0.class.getClassLoader();
        h0.q(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                h0.r(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new o0(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(Activity activity, androidx.lifecycle.n nVar) {
        h0.u(activity, "activity");
        h0.u(nVar, "event");
        if (activity instanceof androidx.lifecycle.u) {
            androidx.lifecycle.p lifecycle = ((androidx.lifecycle.u) activity).getLifecycle();
            if (lifecycle instanceof w) {
                ((w) lifecycle).e(nVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:
    
        if (r11 != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.r(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void s(Activity activity) {
        h0.u(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            l0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new l0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new m0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // j.b0
    public final void a(j.o oVar, boolean z9) {
    }

    @Override // s1.x
    public final MediaCodecInfo b(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // s1.x
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // s1.x
    public final int d() {
        return MediaCodecList.getCodecCount();
    }

    @Override // s1.j
    public final s1.k e(s1.i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = k(iVar);
            com.bumptech.glide.d.c("configureCodec");
            mediaCodec.configure(iVar.f9796b, iVar.f9798d, iVar.f9799e, 0);
            com.bumptech.glide.d.s();
            com.bumptech.glide.d.c("startCodec");
            mediaCodec.start();
            com.bumptech.glide.d.s();
            return new a0(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override // s1.x
    public final boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // z1.q
    public final Object h(Uri uri, h1.j jVar) {
        return Long.valueOf(f1.b0.R(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // s1.x
    public final boolean i() {
        return false;
    }

    @Override // q1.p
    public final z1.q j(q1.l lVar, q1.i iVar) {
        return new q1.o(lVar, iVar);
    }

    @Override // j.b0
    public final boolean m(j.o oVar) {
        return false;
    }

    public InputFilter[] o(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener p(KeyListener keyListener) {
        return keyListener;
    }

    public Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean t(Spannable spannable) {
        return false;
    }

    public InputConnection u(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    @Override // q1.p
    public final z1.q v() {
        return new q1.o(q1.l.f9035n, null);
    }

    public void w(boolean z9) {
    }

    public void x(boolean z9) {
    }

    public void y(boolean z9) {
    }

    public void z(boolean z9) {
    }

    public /* synthetic */ e(a3.g gVar) {
    }

    public /* synthetic */ e(Object obj) {
    }
}
