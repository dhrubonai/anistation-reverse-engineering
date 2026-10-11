package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvh;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class zzck<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzcl, List<zzcm<P>>> zzb;
    private final List<zzcm<P>> zzc;
    private zzcm<P> zzd;
    private zzrl zze;

    public final zzck<P> zza(P p3, P p9, zzvh.zza zzaVar) {
        return zza(p3, p9, zzaVar, false);
    }

    public final zzck<P> zzb(P p3, P p9, zzvh.zza zzaVar) {
        return zza(p3, p9, zzaVar, true);
    }

    private zzck(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrl.zza;
    }

    private final zzck<P> zza(P p3, P p9, zzvh.zza zzaVar, boolean z9) {
        byte[] array;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (p3 == null && p9 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (zzaVar.zzc() == zzvb.ENABLED) {
            Integer valueOf = Integer.valueOf(zzaVar.zza());
            if (zzaVar.zzf() == zzvt.RAW) {
                valueOf = null;
            }
            zzbu zza = zznv.zza().zza(zzot.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), valueOf), zzct.zza());
            int i10 = zzbn.zza[zzaVar.zzf().ordinal()];
            if (i10 == 1 || i10 == 2) {
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzaVar.zza()).array();
            } else if (i10 == 3) {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzaVar.zza()).array();
            } else if (i10 == 4) {
                array = zzbo.zza;
            } else {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzcm<P> zzcmVar = new zzcm<>(p3, p9, array, zzaVar.zzc(), zzaVar.zzf(), zzaVar.zza(), zzaVar.zzb().zzf(), zza);
            ConcurrentMap<zzcl, List<zzcm<P>>> concurrentMap = this.zzb;
            List<zzcm<P>> list = this.zzc;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzcmVar);
            zzcl zzclVar = new zzcl(zzcmVar.zzh());
            List<zzcm<P>> put = concurrentMap.put(zzclVar, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(zzcmVar);
                concurrentMap.put(zzclVar, Collections.unmodifiableList(arrayList2));
            }
            list.add(zzcmVar);
            if (z9) {
                if (this.zzd == null) {
                    this.zzd = zzcmVar;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final zzck<P> zza(zzrl zzrlVar) {
        if (this.zzb != null) {
            this.zze = zzrlVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzch<P> zza() {
        ConcurrentMap<zzcl, List<zzcm<P>>> concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzch<P> zzchVar = new zzch<>(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
            this.zzb = null;
            return zzchVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
