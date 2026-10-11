package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.e;
import r.f;

/* loaded from: classes.dex */
public final class zzaec {
    private static final Map<String, zzaeb> zza = new e();
    private static final Map<String, List<WeakReference<zzaee>>> zzb = new e();

    private static String zza(String str, int i10, boolean z9) {
        if (z9) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }

    public static String zzb(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = f.d("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return g.s(str2, "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = f.d("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return g.s(str2, "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = f.d("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return g.s(str2, "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            return g.s(zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzaee zzaeeVar) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzaeeVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzaeeVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, int i10) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzaeb(str, i10));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(apiKey)) {
                Iterator<WeakReference<zzaee>> it = map2.get(apiKey).iterator();
                boolean z9 = false;
                while (it.hasNext()) {
                    zzaee zzaeeVar = it.next().get();
                    if (zzaeeVar != null) {
                        zzaeeVar.zza();
                        z9 = true;
                    }
                }
                if (!z9) {
                    zza.remove(apiKey);
                }
            }
        }
    }

    public static boolean zza(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }
}
