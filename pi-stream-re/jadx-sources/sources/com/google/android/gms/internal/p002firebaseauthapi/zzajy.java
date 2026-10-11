package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajy implements zzalf {
    private static final zzakl zza = new zzakb();
    private final zzakl zzb;

    public zzajy() {
        this(new zzakd(zzajb.zza(), zza()));
    }

    private static zzakl zza() {
        try {
            return (zzakl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private zzajy(zzakl zzaklVar) {
        this.zzb = (zzakl) zzajc.zza(zzaklVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    public final <T> zzalc<T> zza(Class<T> cls) {
        zzale.zza((Class<?>) cls);
        zzaki zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            if (zzaja.class.isAssignableFrom(cls)) {
                return zzakq.zza(zzale.zzb(), zzait.zzb(), zza2.zza());
            }
            return zzakq.zza(zzale.zza(), zzait.zza(), zza2.zza());
        }
        if (zzaja.class.isAssignableFrom(cls)) {
            if (zza(zza2)) {
                return zzako.zza(cls, zza2, zzaku.zzb(), zzajt.zzb(), zzale.zzb(), zzait.zzb(), zzakj.zzb());
            }
            return zzako.zza(cls, zza2, zzaku.zzb(), zzajt.zzb(), zzale.zzb(), (zzair<?>) null, zzakj.zzb());
        }
        if (zza(zza2)) {
            return zzako.zza(cls, zza2, zzaku.zza(), zzajt.zza(), zzale.zza(), zzait.zza(), zzakj.zza());
        }
        return zzako.zza(cls, zza2, zzaku.zza(), zzajt.zza(), zzale.zza(), (zzair<?>) null, zzakj.zza());
    }

    private static boolean zza(zzaki zzakiVar) {
        return zzaka.zza[zzakiVar.zzb().ordinal()] != 1;
    }
}
