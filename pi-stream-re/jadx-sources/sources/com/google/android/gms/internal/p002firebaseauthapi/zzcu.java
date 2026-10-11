package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import r.f;

/* loaded from: classes.dex */
public final class zzcu {
    private static final Logger zza = Logger.getLogger(zzcu.class.getName());
    private static final ConcurrentMap<String, Object> zzb = new ConcurrentHashMap();
    private static final Set<Class<?>> zzc;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzbh.class);
        hashSet.add(zzbq.class);
        hashSet.add(zzcw.class);
        hashSet.add(zzbs.class);
        hashSet.add(zzbp.class);
        hashSet.add(zzcf.class);
        hashSet.add(zzrv.class);
        hashSet.add(zzcs.class);
        hashSet.add(zzcr.class);
        zzc = Collections.unmodifiableSet(hashSet);
    }

    private zzcu() {
    }

    public static zzux zza(String str, zzahm zzahmVar) {
        zzbt<?> zza2 = zzmn.zza().zza(str);
        if (zza2 instanceof zzcp) {
            return ((zzcp) zza2).zzc(zzahmVar);
        }
        throw new GeneralSecurityException(f.e("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static synchronized zzux zza(zzvd zzvdVar) {
        zzux zza2;
        synchronized (zzcu.class) {
            zzbt<?> zza3 = zzmn.zza().zza(zzvdVar.zzf());
            if (zzmn.zza().zzb(zzvdVar.zzf())) {
                zza2 = zza3.zza(zzvdVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + zzvdVar.zzf());
            }
        }
        return zza2;
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zzns.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzux zzuxVar, Class<P> cls) {
        return (P) zza(zzuxVar.zzf(), zzuxVar.zze(), cls);
    }

    public static <P> P zza(String str, zzahm zzahmVar, Class<P> cls) {
        return zzmn.zza().zza(str, cls).zzb(zzahmVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) {
        return (P) zza(str, zzahm.zza(bArr), cls);
    }

    public static <B, P> P zza(zzch<B> zzchVar, Class<P> cls) {
        return (P) zzns.zza().zza(zzchVar, cls);
    }

    public static synchronized <KeyProtoT extends zzakk, PublicKeyProtoT extends zzakk> void zza(zzoq<KeyProtoT, PublicKeyProtoT> zzoqVar, zznb<PublicKeyProtoT> zznbVar, boolean z9) {
        synchronized (zzcu.class) {
            zzmn.zza().zza((zzoq) zzoqVar, (zznb) zznbVar, true);
        }
    }

    public static synchronized <P> void zza(zzbt<P> zzbtVar, boolean z9) {
        synchronized (zzcu.class) {
            try {
                if (zzbtVar != null) {
                    if (zzc.contains(zzbtVar.zza())) {
                        if (zzic.zza.zza.zza()) {
                            zzmn.zza().zza((zzbt) zzbtVar, true);
                        } else {
                            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                        }
                    } else {
                        throw new GeneralSecurityException("Registration of key managers for class " + String.valueOf(zzbtVar.zza()) + " has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <KeyProtoT extends zzakk> void zza(zznb<KeyProtoT> zznbVar, boolean z9) {
        synchronized (zzcu.class) {
            zzmn.zza().zza((zznb) zznbVar, true);
        }
    }

    public static synchronized <B, P> void zza(zzcq<B, P> zzcqVar) {
        synchronized (zzcu.class) {
            zzns.zza().zza(zzcqVar);
        }
    }
}
