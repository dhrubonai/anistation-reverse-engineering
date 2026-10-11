package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakk;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
class zzml<PrimitiveT, KeyProtoT extends zzakk> implements zzbt<PrimitiveT> {
    private final zznb<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzml(zznb<KeyProtoT> zznbVar, Class<PrimitiveT> cls) {
        if (!zznbVar.zzg().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zznbVar.toString(), cls.getName()));
        }
        this.zza = zznbVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final zzux zza(zzahm zzahmVar) {
        try {
            return (zzux) ((zzaja) zzux.zza().zza(this.zza.zzd()).zza(new zzmo(this.zza.zzb()).zza(zzahmVar).zzi()).zza(this.zza.zzc()).zzf());
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final PrimitiveT zzb(zzahm zzahmVar) {
        try {
            KeyProtoT zza = this.zza.zza(zzahmVar);
            if (!Void.class.equals(this.zzb)) {
                this.zza.zzb(zza);
                return (PrimitiveT) this.zza.zza(zza, this.zzb);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzf().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final String zzb() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Class<PrimitiveT> zza() {
        return this.zzb;
    }
}
