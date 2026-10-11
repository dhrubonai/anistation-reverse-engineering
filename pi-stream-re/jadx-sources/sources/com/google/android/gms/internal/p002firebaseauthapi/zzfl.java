package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.internal.p002firebaseauthapi.zzfo;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r.f;

/* loaded from: classes.dex */
public final class zzfl extends zzda {
    private final zzfo zza;
    private final zzxt zzb;
    private final zzxr zzc;
    private final Integer zzd;

    private zzfl(zzfo zzfoVar, zzxt zzxtVar, zzxr zzxrVar, Integer num) {
        this.zza = zzfoVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }

    public static zzfl zza(zzfo.zza zzaVar, zzxt zzxtVar, Integer num) {
        zzxr l10;
        zzfo.zza zzaVar2 = zzfo.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(f.e("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzxtVar.zza() == 32) {
            zzfo zza = zzfo.zza(zzaVar);
            if (zza.zzb() == zzaVar2) {
                l10 = zzxr.zza(new byte[0]);
            } else if (zza.zzb() == zzfo.zza.zzb) {
                l10 = g.l(num, ByteBuffer.allocate(5).put((byte) 0));
            } else if (zza.zzb() == zzfo.zza.zza) {
                l10 = g.l(num, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza.zzb())));
            }
            return new zzfl(zza, zzxtVar, l10, num);
        }
        throw new GeneralSecurityException(g.n("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzxtVar.zza()));
    }

    public final zzfo zzb() {
        return this.zza;
    }

    public final zzxr zzc() {
        return this.zzc;
    }

    public final zzxt zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzd;
    }
}
